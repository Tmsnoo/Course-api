package io.javabrains.springbootstarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.springbootstarter.entity.Topic;

public interface TopicsRepository extends JpaRepository<Topic, String>{

	
}
