package com.course.kafka.broker.producer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import com.course.kafka.broker.message.BasicDataCountryMessage;
import com.course.kafka.broker.message.BasicDataFiveMessage;
import com.course.kafka.broker.message.BasicDataFourMessage;
import com.course.kafka.broker.message.BasicDataOneMessage;
import com.course.kafka.broker.message.BasicDataPersonMessage;
import com.course.kafka.broker.message.BasicDataThreeMessage;
import com.course.kafka.broker.message.BasicDataTwoMessage;

@Service
public class BasicDataProducer {

	@Autowired
	private KafkaTemplate<Object, Object> kafkaTemplate;

	public void sendBasicDataCountry(BasicDataCountryMessage message) {
		kafkaTemplate.send("t-ksql-basic-data-country", message);
	}

	public void sendBasicDataCountryWithNullValue(String countryName) {
		kafkaTemplate.send("t-ksql-basic-data-country", countryName, null);
		kafkaTemplate.send("tbl-basic-data-country", countryName, null);
	}

	public void sendBasicDataFive(BasicDataFiveMessage message) {
		kafkaTemplate.send("t-ksql-basic-data-five", message);
	}

	public void sendBasicDataFour(BasicDataFourMessage message) {
		kafkaTemplate.send("t-ksql-basic-data-four", message);
	}

	public void sendBasicDataOne(BasicDataOneMessage message) {
		kafkaTemplate.send("t-ksql-basic-data-one", message);
	}

	public void sendBasicDataPerson(BasicDataPersonMessage message) {
		kafkaTemplate.send("t-ksql-basic-data-person", message);
	}

	public void sendBasicDataThree(BasicDataThreeMessage message) {
		kafkaTemplate.send("t-ksql-basic-data-three", message);
	}

	public void sendBasicDataTwo(BasicDataTwoMessage message) {
		kafkaTemplate.send("t-ksql-basic-data-two", message);
	}

}
