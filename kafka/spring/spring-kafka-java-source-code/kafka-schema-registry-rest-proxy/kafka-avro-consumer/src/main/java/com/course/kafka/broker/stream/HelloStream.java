package com.course.kafka.broker.stream;

import java.util.Collections;

import org.apache.kafka.common.serialization.Serdes;
import org.apache.kafka.streams.StreamsBuilder;
import org.apache.kafka.streams.kstream.Consumed;
import org.apache.kafka.streams.kstream.KStream;
import org.apache.kafka.streams.kstream.Printed;
import org.springframework.context.annotation.Bean;

import com.course.avro.data.Hello;
import com.course.kafka.broker.message.HelloPositiveUppercase;
import com.course.kafka.config.KafkaStreamConfig;

import io.confluent.kafka.streams.serdes.avro.SpecificAvroSerde;

//@Configuration
public class HelloStream {

	@Bean
	public KStream<String, HelloPositiveUppercase> kstreamHello(StreamsBuilder builder) {
		var helloSerde = new SpecificAvroSerde<Hello>();
		final var serdeConfig = Collections.singletonMap("schema.registry.url", KafkaStreamConfig.SCHEMA_REGISTRY_URL);
		helloSerde.configure(serdeConfig, false);

		var helloStream = builder.stream("sc-hello", Consumed.with(Serdes.String(), helloSerde))
				.mapValues(this::mapHello);
		
		helloStream.print(Printed.toSysOut());
		
		return helloStream;
	}

	private HelloPositiveUppercase mapHello(Hello original) {
		var result = new HelloPositiveUppercase();
		result.setPositiveInt(Math.abs(original.getMyIntField()));
		result.setUppercaseString(original.getMyStringField().toUpperCase());
		
		return result;
	}

}
