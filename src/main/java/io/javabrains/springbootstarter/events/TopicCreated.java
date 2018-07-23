package io.javabrains.springbootstarter.events;

import org.hibernate.event.spi.AbstractEvent;
import org.hibernate.event.spi.EventSource;

public class TopicCreated extends AbstractEvent {
	
	public static final String TYPE = "TopicCreated";

	
	public TopicCreated(EventSource source) {
		super(source);
		// TODO Auto-generated constructor stub
	}

}
