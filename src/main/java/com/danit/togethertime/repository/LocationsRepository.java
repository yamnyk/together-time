package com.danit.togethertime.repository;

import com.danit.togethertime.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LocationsRepository extends JpaRepository<Location, Long> {
}
