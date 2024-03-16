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


