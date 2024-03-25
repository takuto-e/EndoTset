**README**




**【実装内容】**

【条件】
[○]Dockerを使ってMySQLを用意する
→「Dockerfile」、「init.sql」

[○]SQLを実行するための適当なテーブルを1つ用意する
→「customers」顧客情報管理テーブル

[  ]DBに対してSQLを実行する直前にAOPで実行するSQLのログを出力すること
→ 一通りのCRUDが正常に動作した後に実装予定

[  ]readmeに実装内容の説明と実行結果（ログの出力内容）を記載すること
→ 未

3/24時点
・[検索]OK→登録後にIDで検索
・[登録]OK
・[更新]エラー
・[削除]未

実行後
http://localhost:8080/customers

TODO
・application.propertiesのddl-auto=updateだとうまくいかないのでcreate-dropでDBが起動ごとにリセットされる問題
・顧客IDが見つからない場合にメッセージが表示されない問題