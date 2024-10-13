# Kafka Consumer and Producer

In this project, you will learn that how can implement Kafka Consumer and Producer API in a single application.

Prerequirements:
- Java 21
- Docker

To run the project, Kafka Cluster must first be active. For achive of it, you can use docker-compose.yaml file in the project. It enough to run the command in the below where yaml file is located.

```
docker compose up
```

Then you should run the java project in any IDE. At the end of all this, we call the "Order" API to publish and consume the message.

http://localhost:8081/swagger-ui/index.html#/

```
curl -X 'POST' \
  'http://localhost:8081/order/' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "productName": "string",
  "amount": 0
}'
```