package com.enlighten.mint.xbuserapp.service;

import com.enlighten.mint.xbuserapp.model.XbmAdminGroup;
import com.enlighten.mint.xbuserapp.repo.XbmAdminGroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class XbmAdminGroupService {


    @Autowired
    private XbmAdminGroupRepository repository;

    public List<XbmAdminGroup> findAll() {
        return repository.findAll();
    }

    public Optional<XbmAdminGroup> findById(int id) {
        return repository.findById(id);
    }

    public XbmAdminGroup save(XbmAdminGroup adminGroup) {
        return repository.save(adminGroup);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
