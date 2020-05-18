package com.example.democamel;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class Route01MoveCSVtoXML extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:D:/ApacheCamel/Demo1/IN")
		.process(new TransformCSVtoXML())
		.to("file://D:/ApacheCamel/Demo1/OUT/?filename=${file:onlyname.noext}.xml");
	}

}
