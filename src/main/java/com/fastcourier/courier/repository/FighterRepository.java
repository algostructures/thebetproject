package com.fastcourier.courier.repository;


import com.fastcourier.courier.model.Fighter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface FighterRepository extends JpaRepository<Fighter, Long> {
    @Override
    Optional<Fighter> findById(Long aLong);

    @Override
    List<Fighter> findAll();
}
