package com.fastcourier.courier.repository;

import com.fastcourier.courier.model.Fights;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface FightRepository extends JpaRepository<Fights, Long> {
    @Override
    List<Fights> findAllById(Iterable<Long> iterable);

    List<Fights> findAllByEventId(Long eventId);
}
