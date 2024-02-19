FROM clojure:temurin-21-tools-deps-1.11.1.1435-jammy

RUN mkdir /build
WORKDIR /build
COPY . /build

CMD script/run
