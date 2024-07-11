package com.enlighten.mint.xbuserapp.controller;

import com.enlighten.mint.xbuserapp.model.XbmAdmin;
import com.enlighten.mint.xbuserapp.service.XbmAdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admins")
public class XbmAdminController {

    @Autowired
    private XbmAdminService xbmAdminService;

    @GetMapping
    public List<XbmAdmin> getAllAdmins() {
        return xbmAdminService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<XbmAdmin> getAdminById(@PathVariable int id) {
        Optional<XbmAdmin> admin = xbmAdminService.findById(id);
        return admin.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public XbmAdmin createAdmin(@RequestBody XbmAdmin admin) {
        return xbmAdminService.save(admin);
    }

    @PutMapping("/{id}")
    public ResponseEntity<XbmAdmin> updateAdmin(@PathVariable int id, @RequestBody XbmAdmin adminDetails) {
        Optional<XbmAdmin> optionalAdmin = xbmAdminService.findById(id);

        if (optionalAdmin.isPresent()) {
            XbmAdmin admin = optionalAdmin.get();
            admin.setAdminGroupID(adminDetails.getAdminGroupID());
            admin.setUserTypeID(adminDetails.getUserTypeID());
            admin.setAdminName(adminDetails.getAdminName());
            admin.setAdminLoginCode(adminDetails.getAdminLoginCode());
            admin.setAdminPassword(adminDetails.getAdminPassword());
            admin.setAdminEmail(adminDetails.getAdminEmail());
            admin.setStatusID(adminDetails.getStatusID());
            admin.setRemarks(adminDetails.getRemarks());
            admin.setLastSessionID(adminDetails.getLastSessionID());
            admin.setLastLoginDateTime(adminDetails.getLastLoginDateTime());
            admin.setLastLoginIP(adminDetails.getLastLoginIP());
            admin.setMultipleLoginEnabled(adminDetails.getMultipleLoginEnabled());
            admin.setCreatedByID(adminDetails.getCreatedByID());
            admin.setCreatedDateTime(adminDetails.getCreatedDateTime());
            admin.setModifiedByID(adminDetails.getModifiedByID());
            admin.setModifiedDateTime(adminDetails.getModifiedDateTime());
            return ResponseEntity.ok(xbmAdminService.save(admin));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdmin(@PathVariable int id) {
        if (xbmAdminService.findById(id).isPresent()) {
            xbmAdminService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
