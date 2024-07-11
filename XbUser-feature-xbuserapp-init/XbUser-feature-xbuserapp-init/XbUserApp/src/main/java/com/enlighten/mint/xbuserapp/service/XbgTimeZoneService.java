package com.enlighten.mint.xbuserapp.service;

import com.enlighten.mint.xbuserapp.model.XbgTimeZone;
import com.enlighten.mint.xbuserapp.repo.XbgTimeZoneRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;


@Service
public class XbgTimeZoneService {

    @Autowired
    private XbgTimeZoneRepository xbgTimeZoneRepository;



    public List<XbgTimeZone> getAllXbgTimeZones() {
        return xbgTimeZoneRepository.findAll();
    }

    public Optional<XbgTimeZone> getXbgTimeZoneById(Integer id) {
        return xbgTimeZoneRepository.findById(id);
    }

    public XbgTimeZone createOrUpdateXbgTimeZone(XbgTimeZone xbgTimeZone) {
        return xbgTimeZoneRepository.save(xbgTimeZone);
    }




    }










