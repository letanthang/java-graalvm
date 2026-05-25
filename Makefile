IMAGE := letanthang/java-demo3

r:
	java src/main/java/vn/act/demo/Main.java

install:
	mvn clean install
run:
	mvn clean install
	java -jar target/demo-1.0.jar

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