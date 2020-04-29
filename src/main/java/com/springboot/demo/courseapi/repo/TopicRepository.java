package com.springboot.demo.courseapi.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.demo.courseapi.model.Topic;

@Repository
public interface TopicRepository extends JpaRepository<Topic, String> {

}
