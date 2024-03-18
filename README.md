**README**

*Spring AOP（アスペクト指向プログラミング）*

Spring AOPを使用すると、特定のメソッドが呼び出される前と後に特定のコードを実行することができる。

→「アドバイス」と呼ぶものを定義可能。


主な使用用途としてはメソッドの実行時間を計測したり、メソッドの呼び出しをログに記録したりするなど。

使用する目的としてはControllerクラスの各メソッドがいつ呼び出され、どのように動作しているかを追跡し、

アプリケーションの動作を理解しやすくすることにある。


**【実装内容】**

このプロジェクトは、以下のクラスで構成されています：

*FirstController*と*SecondController*

それぞれ/firstと/secondエンドポイントを提供。

http://localhost:8081 + エンドポイントで対応するメソッドが実行される。


*LoggingAspect*

Controllerクラスのメソッド実行前後(メソッドが呼び出される前と後)にログを出力。

*StudyApplication*

Spring BootアプリケーションのMainとなるクラス。これを実行。


**【実行方法】**

①`StudyApplication.java`を起動

②ブラウザのURLに「http://localhost:8081/first」を入力

③コンソールに以下が出力される。

	`Controllerの動作開始(実行前)：メソッド名【firstMethod】`
	
	`Controllerの動作終了(実行後)：メソッド名【firstMethod】`




④ブラウザのURLに「http://localhost:8081/second」を入力

⑤コンソールに以下が出力される。

	`Controllerの動作開始(実行前)：メソッド名【secondMethod】`
	
	`Controllerの動作終了(実行後)：メソッド名【secondMethod】`

↓実際の出力ログ↓
```


  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::                (v2.5.4)

2024-03-18 19:57:08.891 [main] INFO  com.study.StudyApplication - Starting StudyApplication using Java 1.8.0_392 on Gram with PID 4776 (C:\Users\bow_w\Downloads\Study\Study\target\classes started by bow_w in C:\Users\bow_w\Downloads\Study\Study)
2024-03-18 19:57:08.892 [main] DEBUG com.study.StudyApplication - Running with Spring Boot v2.5.4, Spring v5.3.9
2024-03-18 19:57:08.892 [main] INFO  com.study.StudyApplication - No active profile set, falling back to default profiles: default
2024-03-18 19:57:11.712 [main] INFO  o.s.b.w.e.tomcat.TomcatWebServer - Tomcat initialized with port(s): 8081 (http)
2024-03-18 19:57:11.727 [main] INFO  o.a.coyote.http11.Http11NioProtocol - Initializing ProtocolHandler ["http-nio-8081"]
2024-03-18 19:57:11.727 [main] INFO  o.a.catalina.core.StandardService - Starting service [Tomcat]
2024-03-18 19:57:11.728 [main] INFO  o.a.catalina.core.StandardEngine - Starting Servlet engine: [Apache Tomcat/9.0.52]
2024-03-18 19:57:11.798 [main] INFO  o.a.c.c.C.[Tomcat].[localhost].[/] - Initializing Spring embedded WebApplicationContext
2024-03-18 19:57:11.799 [main] INFO  o.s.b.w.s.c.ServletWebServerApplicationContext - Root WebApplicationContext: initialization completed in 2868 ms
2024-03-18 19:57:12.512 [main] INFO  o.a.coyote.http11.Http11NioProtocol - Starting ProtocolHandler ["http-nio-8081"]
2024-03-18 19:57:12.573 [main] INFO  o.s.b.w.e.tomcat.TomcatWebServer - Tomcat started on port(s): 8081 (http) with context path ''
2024-03-18 19:57:12.583 [main] INFO  com.study.StudyApplication - Started StudyApplication in 4.041 seconds (JVM running for 4.573)
2024-03-18 19:58:11.474 [http-nio-8081-exec-1] INFO  o.a.c.c.C.[Tomcat].[localhost].[/] - Initializing Spring DispatcherServlet 'dispatcherServlet'
2024-03-18 19:58:11.474 [http-nio-8081-exec-1] INFO  o.s.web.servlet.DispatcherServlet - Initializing Servlet 'dispatcherServlet'
2024-03-18 19:58:11.475 [http-nio-8081-exec-1] INFO  o.s.web.servlet.DispatcherServlet - Completed initialization in 1 ms
Controllerの動作開始(実行前)：メソッド名【firstMethod】
Controllerの動作終了(実行後)：メソッド名【firstMethod】
Controllerの動作開始(実行前)：メソッド名【secondMethod】
Controllerの動作終了(実行後)：メソッド名【secondMethod】

```


