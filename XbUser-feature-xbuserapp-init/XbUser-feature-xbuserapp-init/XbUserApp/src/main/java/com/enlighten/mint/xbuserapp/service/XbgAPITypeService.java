package com.enlighten.mint.xbuserapp.service;


import com.enlighten.mint.xbuserapp.model.XbgAPIType;
import com.enlighten.mint.xbuserapp.repo.XbgAPITypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class XbgAPITypeService {

    @Autowired
    private XbgAPITypeRepository xbgAPITypeRepository;

    public List<XbgAPIType> getAllXbgAPITypes() {
        return xbgAPITypeRepository.findAll();
    }

    public Optional<XbgAPIType> getXbgAPITypeById(Integer id) {
        return xbgAPITypeRepository.findById(id);
    }

    public XbgAPIType createOrUpdateXbgAPIType(XbgAPIType xbgAPIType) {
        return xbgAPITypeRepository.save(xbgAPIType);
    }

    public void deleteXbgAPIType(Integer id) {
        xbgAPITypeRepository.deleteById(id);
    }
}

