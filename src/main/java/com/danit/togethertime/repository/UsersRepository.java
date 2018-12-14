package com.danit.togethertime.repository;

import com.danit.togethertime.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<User, Long> {
}
