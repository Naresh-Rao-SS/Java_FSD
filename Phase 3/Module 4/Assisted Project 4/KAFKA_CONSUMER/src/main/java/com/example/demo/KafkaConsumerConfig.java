package com.example.demo;

import java.util.HashMap;
import java.util.Map;

import org.apache.kafka.clients.consumer.ConsumerConfig;
import org.apache.kafka.common.serialization.StringDeserializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.ConcurrentKafkaListenerContainerFactory;
import org.springframework.kafka.core.ConsumerFactory;
import org.springframework.kafka.core.DefaultKafkaConsumerFactory;
import org.springframework.kafka.support.serializer.JsonDeserializer;

@Configuration
public class KafkaConsumerConfig {

	//<String -topic , String -data>
	@Bean
	public ConsumerFactory<String, String> consumefactory(){
		Map<String,Object> config=new HashMap<>();
		config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
		config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
		config.put(ConsumerConfig.GROUP_ID_CONFIG, "group1");
		return new DefaultKafkaConsumerFactory<>(config);
	}
	
	@Bean
	public ConcurrentKafkaListenerContainerFactory<String, String> kafkalistenerfactory(){
		ConcurrentKafkaListenerContainerFactory<String, String> factory=new ConcurrentKafkaListenerContainerFactory();
		factory.setConsumerFactory(consumefactory());
		return factory;
	}
	
	
	
	//<String -topic , Object -data>
		@Bean
		public ConsumerFactory<String,User> consumeUserfactory(){
			Map<String,Object> config=new HashMap<>();
			config.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG,"localhost:9092");
			config.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
			config.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, JsonDeserializer.class);
			config.put(ConsumerConfig.GROUP_ID_CONFIG, "group2");
			return new DefaultKafkaConsumerFactory<>(config,new StringDeserializer(),new JsonDeserializer<>(User.class));
		}

		@Bean
		public ConcurrentKafkaListenerContainerFactory<String, User> kafkaObjectlistenerfactory(){
			ConcurrentKafkaListenerContainerFactory<String, User> factory=new ConcurrentKafkaListenerContainerFactory();
			factory.setConsumerFactory(consumeUserfactory());
			return factory;
		}
	
}
