package com.study.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

// Aspectクラスの定義
@Aspect
@Component
public class LoggingAspect {

    // Controllerクラスのメソッド実行前にログを出力
    @Before("execution(* com.study.controller.*.*(..))")
    public void beforeController(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Controllerの動作開始(実行前)：メソッド名【" + methodName + "】");
    }

    // Controllerクラスのメソッド実行後にログを出力
    @After("execution(* com.study.controller.*.*(..))")
    public void afterController(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("Controllerの動作終了(実行後)：メソッド名【" + methodName + "】");
    }
}
