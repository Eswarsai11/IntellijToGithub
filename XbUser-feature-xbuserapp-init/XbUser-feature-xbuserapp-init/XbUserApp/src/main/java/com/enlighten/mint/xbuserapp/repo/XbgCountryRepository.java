package com.enlighten.mint.xbuserapp.repo;

import com.enlighten.mint.xbuserapp.model.XbgCountry;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface XbgCountryRepository extends JpaRepository<XbgCountry,Integer> {


}
