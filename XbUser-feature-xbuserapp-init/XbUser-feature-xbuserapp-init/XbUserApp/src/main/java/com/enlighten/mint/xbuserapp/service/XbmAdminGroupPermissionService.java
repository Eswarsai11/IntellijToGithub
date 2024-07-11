package com.enlighten.mint.xbuserapp.service;

import com.enlighten.mint.xbuserapp.model.XbmAdminGroupPermission;
import com.enlighten.mint.xbuserapp.repo.XbmAdminGroupPermissionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class XbmAdminGroupPermissionService {

    @Autowired
    private XbmAdminGroupPermissionRepository repository;

    public List<XbmAdminGroupPermission> findAll() {
        return repository.findAll();
    }

    public Optional<XbmAdminGroupPermission> findById(int id) {
        return repository.findById(id);
    }

    public XbmAdminGroupPermission save(XbmAdminGroupPermission adminGroupPermission) {
        return repository.save(adminGroupPermission);
    }

    public void deleteById(int id) {
        repository.deleteById(id);
    }
}
