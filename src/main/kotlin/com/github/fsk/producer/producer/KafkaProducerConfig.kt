package com.github.fsk.producer.producer

//import com.github.fsk.producer.producer.KafkaProducerConstants.Companion.KAFKA_PRODUCER_BOOTSTRAP_KEY
//import org.apache.kafka.clients.producer.ProducerConfig
//import org.springframework.context.support.beans
//import org.springframework.kafka.core.DefaultKafkaProducerFactory
//import org.springframework.kafka.core.KafkaTemplate
//
//class KafkaProducerConstants {
//  companion object {
//    const val KAFKA_PRODUCER_BOOTSTRAP_KEY = "spring.kafka.producer.bootstrap-servers"
//  }
//}
//
//fun beans() = beans {
//	bean("producerConfigs") {
//		hashMapOf(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG to env.getProperty(KAFKA_PRODUCER_BOOTSTRAP_KEY))
//	}
//	bean("producerFactory") {
//		DefaultKafkaProducerFactory<String, String>(ref("producerConfigs"))
//	}
//	bean<KafkaTemplate<String, String>> {
//		KafkaTemplate(ref("producerFactory"))
//	}
//}
