IMAGE := letanthang/java-demo3

install:
	mvn clean install

run:
	mvn clean install
	java -jar target/demo-1.0.jar

buildx:
	docker buildx create --use

build:
	docker buildx build \
	--platform linux/arm64 \
	-t $(IMAGE) \
	--load \
	.