FROM clojure:temurin-21-tools-deps-1.11.1.1435-alpine

mkdir /build
WORKDIR /build
COPY . /build

CMD script/run
