package com.enlighten.mint.xbuserapp.service;


import com.enlighten.mint.xbuserapp.model.XbmAdmin;
import com.enlighten.mint.xbuserapp.repo.XbmAdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class XbmAdminService {

    @Autowired
    private XbmAdminRepository xbmAdminRepository;

    public List<XbmAdmin> findAll() {
        return xbmAdminRepository.findAll();
    }

    public Optional<XbmAdmin> findById(int id) {
        return xbmAdminRepository.findById(id);
    }

    public XbmAdmin save(XbmAdmin admin) {
        return xbmAdminRepository.save(admin);
    }

    public void deleteById(int id) {
        xbmAdminRepository.deleteById(id);
    }
}
