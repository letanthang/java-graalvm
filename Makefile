IMAGE := letanthang/java-demo3
MAIN := src/main/java/vn/act/demo

install:
	mvn clean install
run:
	mvn clean install
	./target/app-java25-native
run/manual:
	javac -d out src/main/java/vn/act/demo/Main.java && native-image -cp out vn.act.demo.Main out/main  && ./out/main
r:
	java src/main/java/vn/act/demo/Main.java
up:
	docker run $(IMAGE)

buildx:
	docker buildx create --use

build:
	docker buildx build \
	--platform linux/arm64 \
	-t $(IMAGE) \
	--load \
	.