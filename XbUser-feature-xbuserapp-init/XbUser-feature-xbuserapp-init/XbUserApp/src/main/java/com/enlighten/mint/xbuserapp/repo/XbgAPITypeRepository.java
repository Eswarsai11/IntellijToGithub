package com.enlighten.mint.xbuserapp.repo;

import com.enlighten.mint.xbuserapp.model.XbgAPIType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XbgAPITypeRepository extends JpaRepository<XbgAPIType,Integer> {
}
