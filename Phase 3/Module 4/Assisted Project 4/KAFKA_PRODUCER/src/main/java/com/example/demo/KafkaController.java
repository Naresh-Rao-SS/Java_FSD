package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class KafkaController {
private String topic="kafkatopics";

@Autowired
			//type of the topic  type of the data sending to the topic
KafkaTemplate<String, Object> temp;

//send a string data to a topic
@GetMapping("/publishstring/{name}")
public String publishMessage(@PathVariable String name) {
	temp.send(topic,"hi welcome "+name);
	return "String data has been published to the topic "+topic;
}

//send an object json data to the topic 

@GetMapping("/publishObject")	
	public String publishObjectmsg() {
	User user=new User(1,"Naresh");
	temp.send(topic,user);
	return "object data is published to the topic "+topic;
}
}
