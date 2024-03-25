package com.Customer.controller;
import java.util.Optional;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.Customer.Customer;
import com.Customer.CustomerRepository;

@Controller
public class CustomerController {

    private final CustomerRepository repository;

    public CustomerController(CustomerRepository repository) {
        this.repository = repository;
    }

    @GetMapping("/customers")
    public String showForm(Model model) {
        model.addAttribute("customers", repository.findAll());
        model.addAttribute("customer", new Customer());
        return "customers";
    }

    @PostMapping("/customers")
    public String submitForm(Customer customer, Model model) {
        repository.save(customer);
        model.addAttribute("message", "登録が完了しました");
        model.addAttribute("customers", repository.findAll());
        return "customers";
    }
    
    @PostMapping("/update")
    public String updateForm(@RequestParam String customerId, Customer customer, Model model) {
        // 顧客情報の更新処理を実装します。
        Optional<Customer> existingCustomer = repository.findById(Integer.valueOf(customerId));
        if (existingCustomer.isPresent()) {
            Customer updatedCustomer = existingCustomer.get();
            updatedCustomer.setLastName(customer.getLastName());
            updatedCustomer.setFirstName(customer.getFirstName());
            updatedCustomer.setEmail(customer.getEmail());
            updatedCustomer.setPhoneNumber(customer.getPhoneNumber());
            updatedCustomer.setCountry(customer.getCountry());
            updatedCustomer.setPostalCode(customer.getPostalCode());
            updatedCustomer.setCity(customer.getCity());
            updatedCustomer.setAddress(customer.getAddress());
            repository.save(updatedCustomer);
            model.addAttribute("message", "更新が完了しました");
        } else {
            model.addAttribute("message", "顧客IDが見つかりませんでした");
        }
        model.addAttribute("customers", repository.findAll());
        return "customers";
    }

    @PostMapping("/delete")
    public String deleteForm(@RequestParam String customerId, Model model) {
        // 顧客情報の削除処理を実装します。
        Optional<Customer> existingCustomer = repository.findById(Integer.valueOf(customerId));
        if (existingCustomer.isPresent()) {
            repository.delete(existingCustomer.get());
            model.addAttribute("message", "削除が完了しました");
        } else {
            model.addAttribute("message", "顧客IDが見つかりませんでした");
        }
        model.addAttribute("customers", repository.findAll());
        return "customers";
    }



    @GetMapping("/search")
    public String search(@RequestParam String customerId, Model model) {
        Customer customer = repository.findById(Integer.valueOf(customerId)).orElse(null);
        if (customer != null) {
            model.addAttribute("customer", customer);
        } else {
            model.addAttribute("message", "顧客IDが見つかりませんでした");
        }
        model.addAttribute("customers", repository.findAll());
        return "customers";
    }
}
