package io.javabrains.springbootstarter.events;

public interface SubscriptionEvent {
	
	void emit(Sub sub);
	
}
