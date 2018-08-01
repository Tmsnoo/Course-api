package io.javabrains.springbootstarter.events;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class SubscriptionPublisher implements SubscriptionEvent {

	private static final Logger LOGGER = LoggerFactory.getLogger(SubscriptionPublisher.class);

	private final ApplicationEventPublisher publisher;

	public SubscriptionPublisher(ApplicationEventPublisher publisher) {
		this.publisher = publisher;
	}

	@Override
	public void emit(Sub event) {
		LOGGER.info("MOJE INFO ", event);
		publisher.publishEvent(event);
	}

}
