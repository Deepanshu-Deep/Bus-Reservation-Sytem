package com.deep.bus.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;


@Repository
public interface AdminDao extends JpaRepository<com.deep.bus.entities.Admin, Integer> {

	public Optional<com.deep.bus.entities.Admin> findByName(String name );
}
