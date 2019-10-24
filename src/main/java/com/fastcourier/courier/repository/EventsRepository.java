package com.fastcourier.courier.repository;

import com.fastcourier.courier.model.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EventsRepository extends JpaRepository<Event, Long> {
    @Override
    List<Event> findAll();
}
