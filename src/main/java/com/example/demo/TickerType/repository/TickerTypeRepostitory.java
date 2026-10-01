package com.example.demo.TickerType.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.TickerType.domain.TickerType;

public interface TickerTypeRepostitory extends JpaRepository<TickerType, Long> {

}
