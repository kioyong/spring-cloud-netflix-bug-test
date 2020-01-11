# spring-cloud-netflix-bug-test
### 重现bug步骤

启动两个 greeting-service, 然后启动 greeting-api
如果api 配置里面 spring.main.lazy-initialzation=true 的话， 那么不能正确的负载均衡，
如果为false 就可以正确的负载均衡


api 的配置
```
spring:
  application:
    name: arch-greeting-api
  main:
    lazy-initialization: true
```
调用 http://localhost:8084/api/greeting 返回错误的响应

```
{"timestamp":"2020-01-11T11:45:30.379+0000","status":500,"error":"Internal Server Error","message":"com.netflix.client.ClientException: Load balancer does not have available server for client: arch-greeting-service","path":"/api/greeting"}
```

改为false
```
spring:
  application:
    name: arch-greeting-api
  main:
    lazy-initialization: false
```

调用 http://localhost:8084/api/greeting 返回正确的响应

```
Hello Microservice, Message from service: arch-greeting-service-instance-one
Hello Microservice, Message from service: arch-greeting-service-instance-two
```
