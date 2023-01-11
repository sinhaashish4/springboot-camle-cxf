package com.example.demo.camel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

import com.example.demo.service.SimpleTimer;

@Component
public class SimpleRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("timer://foo?fixedRate=true&period=1000").tracing().bean(SimpleTimer.class).end();
	}
}
