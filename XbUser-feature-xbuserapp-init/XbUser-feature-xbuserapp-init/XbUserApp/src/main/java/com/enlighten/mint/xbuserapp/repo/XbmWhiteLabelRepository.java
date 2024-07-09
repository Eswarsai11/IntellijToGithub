package com.enlighten.mint.xbuserapp.repo;

import com.enlighten.mint.xbuserapp.model.XbmwhiteLabel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XbmWhiteLabelRepository extends JpaRepository<XbmwhiteLabel, Integer> {



}