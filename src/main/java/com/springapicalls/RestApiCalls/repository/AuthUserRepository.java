package com.springapicalls.RestApiCalls.repository;

import com.springapicalls.RestApiCalls.model.AuthUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthUserRepository extends JpaRepository<AuthUser,Long> {
    <optional> AuthUser findByEmail(String email);

    boolean existsByEmail(String email);
}