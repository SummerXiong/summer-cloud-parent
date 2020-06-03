#### 本项目的技术选型,  [SpringCloud & SpringBoot版本选择](https://start.spring.io/actuator/info)

- SpringCloud  Hoxton.SR1 [官方文档](https://cloud.spring.io/spring-cloud-static/Hoxton.SR1/reference/htmlsingle/)
- SpringBoot  2.2.2.RELEASE
- SpringCloudAlibaba  2.1.0.RELEASE

| 注册中心  | 服务调用      | 服务降级     | 服务网关    | 服务配置  | 服务总线  |
| --------- | ------------- | ------------ | ----------- | --------- | --------- |
| Eureka    | Ribbon        | Hystrix      | Zuul        | Config    | Bus       |
| Zookeeper | Feign         | **sentinel** | **Gateway** | **Nacos** | **Nacos** |
| Consul    | **OpenFeign** |              |             |           |           |
| **Nacos** | LoadBalancer  |              |             |           |           |

