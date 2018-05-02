package com.github.fsk.producer.producer

import com.github.fsk.producer.data.Flight
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.beans.factory.annotation.Value
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Component
import javax.annotation.PostConstruct

@Component
class KafkaProducer {

	@Autowired
	lateinit var kafkaTemplate: KafkaTemplate<String, String>

	@Value("\${spring.kafka.producer.topic}")
	lateinit var topic: String

	//todo remove after testing
	@PostConstruct
	fun send() {
		val dummyFlight = Flight(origin = "DUMMY1", destination = "DUMMY2", operator = "DUMMY3")
		kafkaTemplate.send(topic, dummyFlight.toString())
	}

	fun send(flight: Flight) {
		kafkaTemplate.send(topic, flight.toString())
	}
}
