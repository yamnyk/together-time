package com.danit.togethertime.repository;

import com.danit.togethertime.entity.MeetingEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MeetingsRepository extends JpaRepository<MeetingEntity, Long> {
}
