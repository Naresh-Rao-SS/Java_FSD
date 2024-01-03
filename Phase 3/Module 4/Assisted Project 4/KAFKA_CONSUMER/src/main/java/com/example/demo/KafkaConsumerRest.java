package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaConsumerRest {

	List<String> msg=new ArrayList<>();
	
	@GetMapping("/consumeString")
	public List<String> consumeMsg(){
		return msg;
	}
	
	@KafkaListener(groupId = "group1",topics = "kafkaTopic",containerFactory = "kafkalistenerfactory")
	public List<String> getMsgfromTopic(String data){
		msg.add(data);
		return msg;
	}
	
	User userfromtopic=null;
	@GetMapping("/consumejsonMsg")
	public User consumejsonMsg(){
		return userfromtopic;
	}
	
	@KafkaListener(groupId = "group2",topics = "kafkaTopic",containerFactory = "kafkaObjectlistenerfactory")
	public User getMsgfromTopic(User user){
		userfromtopic=user;
		return userfromtopic;
	}
	
}
