package com.enlighten.mint.xbuserapp.controller;

import com.enlighten.mint.xbuserapp.model.XbmAdminGroupPermission;
import com.enlighten.mint.xbuserapp.service.XbmAdminGroupPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin-group-permissions")
public class XbmAdminGroupPermissionController {

    @Autowired
    private XbmAdminGroupPermissionService service;

    @GetMapping
    public List<XbmAdminGroupPermission> getAllAdminGroupPermissions() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<XbmAdminGroupPermission> getAdminGroupPermissionById(@PathVariable int id) {
        Optional<XbmAdminGroupPermission> adminGroupPermission = service.findById(id);
        return adminGroupPermission.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public XbmAdminGroupPermission createAdminGroupPermission(@RequestBody XbmAdminGroupPermission adminGroupPermission) {
        return service.save(adminGroupPermission);
    }

    @PutMapping("/{id}")
    public ResponseEntity<XbmAdminGroupPermission> updateAdminGroupPermission(@PathVariable int id, @RequestBody XbmAdminGroupPermission adminGroupPermissionDetails) {
        Optional<XbmAdminGroupPermission> adminGroupPermission = service.findById(id);

        if (adminGroupPermission.isPresent()) {
            XbmAdminGroupPermission adminGroupPermission1 = adminGroupPermission.get();
            adminGroupPermission1.setModuleID(adminGroupPermissionDetails.getModuleID());
            adminGroupPermission1.setModuleFunctionIDs(adminGroupPermissionDetails.getModuleFunctionIDs());
            return ResponseEntity.ok(service.save(adminGroupPermission1));
        }
            return ResponseEntity.notFound().build();

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdminGroupPermission(@PathVariable int id) {
        if (service.findById(id).isPresent()) {
            service.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
