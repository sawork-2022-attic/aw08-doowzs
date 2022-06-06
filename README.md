# aw08

使用`spring-integration-webflux`实现了集成，主要文件为`pos-gateway/src/main/java/edu/nju/sa2022/micropos/gateway/GatewayConfiguration.java`，具体实现方法如下：

- 删除gateway中的转发
- 添加接收请求地址`/api/deliveries/order/{orderId}`，从请求中提取`orderId`作为消息负载
- 消耗消息负载，向delivery service发送请求，将请求结果返回给用户

实现效果与使用gateway直接转发请求相同。

优点：

- 可以与已有的各类服务进行集成，通过文件、http或其他协议与其他平台进行对接
- 不同的服务之间解耦合，不需要使用同种技术栈进行开发

缺点（个人体验）：

- 在已有HTTP服务的情况下，使用集成不如网关方便
- Gateway不支持和MVC混用，只能用Webflux

> Run the project with `mvn spring-boot:run` and send request to `http://localhost:8080/check`. You should see an reponses in json format like the following.
>
>```json
>{
>    "icon_url": "https://assets.chucknorris.host/img/avatar/chuck-norris.png",
>    "id": "kswv7NIaTCaIIErlBzODaA",
>    "url": "https://api.chucknorris.io/jokes/kswv7NIaTCaIIErlBzODaA",
>    "value": "Chuck Norris's shadow weighs 250 pounds and can kick your ass ."
>}
>```
>
>Try to understand the provided code which demonstrates spring integration between a spring boot application with an externel http service (https://api.chucknorris.io/jokes/random).
>
>Please implement delivery as an standalone service (just like the random joke service). Refer the sample code to integrate your Micropos system with delivery service so that user can check delivery status on Miropos which actually forwards user request to delivery service on demand.
>
>![](Micropos.svg)
>
>Consider the advantage by doing so and write it down in your readme file.