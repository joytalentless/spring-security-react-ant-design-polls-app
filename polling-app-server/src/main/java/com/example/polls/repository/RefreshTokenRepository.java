package com.example.polls.repository;

import com.example.polls.model.JwtRefreshToken;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RefreshTokenRepository extends JpaRepository<JwtRefreshToken, String> {

}
