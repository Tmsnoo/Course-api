package io.javabrains.springbootstarter.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.javabrains.springbootstarter.entity.Topic;
import io.javabrains.springbootstarter.events.Sub;
import io.javabrains.springbootstarter.events.SubscriptionPublisher;
import io.javabrains.springbootstarter.repository.TopicsRepository;

@RestController
public class TopicController {
	
	@Autowired
	TopicsRepository topicsRepo;
	
	@Autowired
	SubscriptionPublisher subscriptionPublisher; 
	
	@Autowired
	Sub sub;

	@RequestMapping("/topics")
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring", "Spring Framework","Spring Framework Description"),
				new Topic("java", "Java Framework","Java Framework Description"),
				new Topic("javascript", "JavaScript","JavaScript Description")
				);
	}
	
	@GetMapping("/save")
	public List<Topic> saveTopic(){
		Topic topics = new Topic();
		topics.setDescription("none");
		topics.setName("Title");
		topicsRepo.saveAndFlush(topics);
		subscriptionPublisher.emit(sub);
		return Arrays.asList(topics);
	}
	
}
