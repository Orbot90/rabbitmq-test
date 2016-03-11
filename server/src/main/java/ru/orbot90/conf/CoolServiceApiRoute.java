package ru.orbot90.conf;

import org.apache.camel.LoggingLevel;
import org.apache.camel.builder.RouteBuilder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.orbot90.service.SomeCoolService;

/**
 * Created by plevako on 11.03.2016.
 */
@Component
public class CoolServiceApiRoute extends RouteBuilder {
    @Autowired
    private SomeCoolService someCoolService;

    @Override
    public void configure() throws Exception {
        errorHandler(loggingErrorHandler().level(LoggingLevel.ERROR));
        from("spring-amqp:" + SomeCoolService.COOL_SERVICE_QUEUE + ":"
                + SomeCoolService.COOL_SERVICE_QUEUE + "Q:*?type=topic&durable=true&autodelete=false")
                .routeId("coolServiceApiRoute")
                .bean(someCoolService);
    }
}
