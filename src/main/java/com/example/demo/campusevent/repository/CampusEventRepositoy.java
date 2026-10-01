package com.example.demo.campusevent.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.campusevent.domain.CampusEvent;

public interface CampusEventRepositoy extends JpaRepository<CampusEvent, Long> {

}
