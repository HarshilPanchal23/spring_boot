package com.example.springSecurity.repository;


import com.example.springSecurity.entity.UserEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.swing.text.html.Option;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, Long> {


    Optional<UserEntity> findByIdAndStatusAndDeactivate(Long id, Boolean statusTrue, Boolean statusFalse);

    Page<UserEntity> findByFirstNameLike(String firstName, Pageable pageable);

    Optional<UserEntity> findByFirstName(String firstName);
}


