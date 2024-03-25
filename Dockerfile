# ベースとなるイメージを指定
FROM mysql:8.0

# 環境変数を設定
ENV MYSQL_ROOT_PASSWORD=admin

# 初期化スクリプトをコピー
COPY init.sql /docker-entrypoint-initdb.d/
