package com.summer.gateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.http.HttpStatus;
import org.springframework.http.server.reactive.ServerHttpRequest;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

/**
 * @author: create by Summer.Xiong
 * @version: v1.0
 * @description:
 *  全局日志过滤器
 * @date: 2020/4/14 10:40
 */
@Slf4j
@Order(0)
@Component
public class ClobalLogFilter implements GlobalFilter{

    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("全局日志处理过滤器...");
        ServerHttpRequest httpRequest = exchange.getRequest();
        log.info("【请求的路径】: {}" , httpRequest.getURI().getRawPath());
        //如果存在不然通过的请求
        /*if(httpRequest.getQueryParams().getFirst("username") == null){
            exchange.getResponse().setStatusCode(HttpStatus.NOT_ACCEPTABLE);
            return exchange.getResponse().setComplete();
        }*/
        return chain.filter(exchange);
    }

}
