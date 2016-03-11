package ru.orbot90.conf;

import org.apache.camel.CamelContext;
import org.apache.camel.builder.ProxyBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.orbot90.service.SomeCoolService;

/**
 * Created by plevako on 11.03.2016.
 */
@Configuration
public class ProxyConf {
    @Bean
    public SomeCoolService someCoolService(CamelContext camelContext) throws Exception {
        ProxyBuilder proxyBuilder = new ProxyBuilder(camelContext);
        proxyBuilder.endpoint("spring-amqp:" + SomeCoolService.COOL_SERVICE_QUEUE + ":NEW?type=topic&durable=true&autodelete=false");
        return proxyBuilder.build(SomeCoolService.class);
    }
}
