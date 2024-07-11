package com.enlighten.mint.xbuserapp.controller;

import com.enlighten.mint.xbuserapp.model.XbmAdminGroup;
import com.enlighten.mint.xbuserapp.service.XbmAdminGroupService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/admin-groups")
public class XbmAdminGroupController {

    @Autowired
    private XbmAdminGroupService xbmAdminGroupService;

    @GetMapping
    public List<XbmAdminGroup> getAllAdminGroups() {
        return xbmAdminGroupService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<XbmAdminGroup> getAdminGroupById(@PathVariable int id) {
        Optional<XbmAdminGroup> adminGroup = xbmAdminGroupService.findById(id);
        return adminGroup.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public XbmAdminGroup createAdminGroup(@RequestBody XbmAdminGroup adminGroup) {
        return xbmAdminGroupService.save(adminGroup);
    }

    @PutMapping("/{id}")
    public ResponseEntity<XbmAdminGroup> updateAdminGroup(@PathVariable int id, @RequestBody XbmAdminGroup adminGroupDetails) {
        Optional<XbmAdminGroup> optionalAdminGroup = xbmAdminGroupService.findById(id);

        if (optionalAdminGroup.isPresent()) {
            XbmAdminGroup adminGroup = optionalAdminGroup.get();
            adminGroup.setWhiteLabelID(adminGroupDetails.getWhiteLabelID());
            adminGroup.setAdminGroupName(adminGroupDetails.getAdminGroupName());
            adminGroup.setStatusID(adminGroupDetails.getStatusID());
            adminGroup.setRemarks(adminGroupDetails.getRemarks());
            adminGroup.setCreatedByID(adminGroupDetails.getCreatedByID());
            adminGroup.setCreatedDateTime(adminGroupDetails.getCreatedDateTime());
            adminGroup.setModifiedByID(adminGroupDetails.getModifiedByID());
            adminGroup.setModifiedDateTime(adminGroupDetails.getModifiedDateTime());
            return ResponseEntity.ok(xbmAdminGroupService.save(adminGroup));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAdminGroup(@PathVariable int id) {
        if (xbmAdminGroupService.findById(id).isPresent()) {
            xbmAdminGroupService.deleteById(id);
            return ResponseEntity.noContent().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
