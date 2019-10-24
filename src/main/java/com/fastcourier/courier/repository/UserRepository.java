package com.fastcourier.courier.repository;

import com.fastcourier.courier.model.Event;
import com.fastcourier.courier.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<Users, Long> {
    @Override
    Optional<Users> findById(Long aLong);
}
