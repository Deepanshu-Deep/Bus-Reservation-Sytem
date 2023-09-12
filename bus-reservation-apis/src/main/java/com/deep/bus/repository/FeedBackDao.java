package com.deep.bus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.deep.bus.entities.*;
@Repository
public interface FeedBackDao extends JpaRepository<Feedback, Integer> {

}
