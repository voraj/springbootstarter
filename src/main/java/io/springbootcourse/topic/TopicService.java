package io.springbootcourse.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	private List<Topic> topics = Arrays.asList(
			new Topic("spring","Spring Framework","Spring description"),
			new Topic("java","Core Java","Core Java description"),
			new Topic("javascript","JavaScript","JavaScript Description")
			);
	

	public List<Topic> getAllTopics(){
		return topics;
	}
}
