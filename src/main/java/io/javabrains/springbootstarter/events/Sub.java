package io.javabrains.springbootstarter.events;

import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class Sub {

	UUID eventId = UUID.randomUUID();
	String topicId;
	Long subscriberId;

	public Sub(UUID eventId, String topicId, Long subscriberId) {
		super();
		this.eventId = eventId;
		this.topicId = topicId;
		this.subscriberId = subscriberId;
	}

	public Sub() {
		super();
		this.eventId = eventId;
		this.topicId = topicId;
		this.subscriberId = subscriberId;
	}

	public UUID getEventId() {
		return eventId;
	}

	public void setEventId(UUID eventId) {
		this.eventId = eventId;
	}

	public String getTopicId() {
		return topicId;
	}

	public void setTopicId(String topicId) {
		this.topicId = topicId;
	}

	public Long getSubscriberId() {
		return subscriberId;
	}

	public void setSubscriberId(Long subscriberId) {
		this.subscriberId = subscriberId;
	}

}
