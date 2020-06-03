### Swagger-UI 使用

##### 依赖引用

```xml
<dependency>
	<groupId>io.springfox</groupId>
	<artifactId>springfox-swagger2</artifactId>
	<version>2.9.2</version>
</dependency>

<dependency>
	<groupId>com.github.xiaoymin</groupId>
	<artifactId>swagger-bootstrap-ui</artifactId>
	<version>1.9.0</version>
</dependency>
```

##### 编写SwaggerUI配置

```java
package com.summer.consumer.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 * @date: 2020/3/27 16:51
 */
@Configuration
public class Swagger2Config {

    @Bean
    public Docket createRestApi(){
        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.summer.consumer.*"))
                .paths(PathSelectors.any())
                .build();
    }


    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()
                .title("summer-eureka-demo")
                .description("Restful-API-Doc")
                .version("1.0.0")
                .build();
    }

}
```



##### 开启SwaggerUI服务

@EnableSwagger2 && @EnableSwaggerBootstrapUI



##### 使用注解开始SwaggerUI旅途

| 注解名称          | 注解属性    | 作用域   | 属性作用       |
| ----------------- | ----------- | -------- | -------------- |
| @Api              | tags        | 类       | 说明该类的作用 |
|                   | values      | 类       | 说明该类的作用 |
| @ApiOperation     | tags        | 方法     | 分组           |
|                   | values      | 方法     | 描述方法作用   |
|                   | notes       | 方法     | 提示内容       |
| @ApiParam         | name        | 方法参数 | 参数名         |
|                   | value       | 方法参数 | 参数说明       |
|                   | required    | 方法参数 | 是否必填       |
| @ApiModel         | value       | 类       | 对象名         |
|                   | description | 类       | 描述           |
| @ApiModelProperty | value       | 方法     | 字段说明       |
|                   | name        | 方法     | 属性名         |
|                   | dataType    | 方法     | 属性类型       |
|                   | required    | 方法     | 是否必填       |
|                   | example     | 方法     | 举例           |
|                   | hidden      | 方法     | 隐藏           |
| @ApilmplicitParam | value       | 方法     | 参数说明       |
|                   | name        | 方法     | 参数名         |
|                   | dataType    | 方法     | 数据类型       |
|                   | paramType   | 方法     | 参数类型       |
|                   | example     | 方法     | 举例           |
| @ApiResponse      | response    | 方法     | 返回类         |
|                   | code        | 方法     | 返回码         |
|                   | message     | 方法     | 返回信息       |
|                   | example     | 方法     | 例子           |

其中`@ApilmplicitParam `可以单个用于方法之上,多个参数的话，可以把`@ApilmplicitParam`方到`@ApilmplicitParams`中

其中`@ApiResponse` 可以单个用于方法之上, 多个参数的话，可以把`@ApiResponse`方到`@ApiResponses`中