package com.enlighten.mint.xbuserapp.repo;

import com.enlighten.mint.xbuserapp.model.XbgTimeZone;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XbgTimeZoneRepository extends JpaRepository<XbgTimeZone, Integer> {
}
