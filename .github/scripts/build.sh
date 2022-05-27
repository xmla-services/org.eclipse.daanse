set -ev

./mvnw --batch-mode --version
./mvnw --batch-mode --no-transfer-progress install "$@"