package io.javabrains.springbootstarter.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import io.javabrains.springbootstarter.entity.Subscriber;

public interface SubsrciberRepository extends JpaRepository<Subscriber, Long> {

}
