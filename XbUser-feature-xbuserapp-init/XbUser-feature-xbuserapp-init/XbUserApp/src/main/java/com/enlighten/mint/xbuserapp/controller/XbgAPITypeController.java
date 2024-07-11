package com.enlighten.mint.xbuserapp.controller;



import com.enlighten.mint.xbuserapp.model.XbgAPIType;
import com.enlighten.mint.xbuserapp.service.XbgAPITypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/apitypes")
public class XbgAPITypeController {

    @Autowired
    private XbgAPITypeService xbgAPITypeService;

    @GetMapping
    public ResponseEntity<List<XbgAPIType>> getAllXbgAPITypes() {
        List<XbgAPIType> xbgAPITypeList = xbgAPITypeService.getAllXbgAPITypes();
        return ResponseEntity.ok(xbgAPITypeList);
    }

    @GetMapping("/{id}")
    public ResponseEntity<XbgAPIType> getXbgAPITypeById(@PathVariable Integer id) {
        Optional<XbgAPIType> xbgAPIType = xbgAPITypeService.getXbgAPITypeById(id);
        return xbgAPIType.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<XbgAPIType> createXbgAPIType(@RequestBody XbgAPIType xbgAPIType) {
        XbgAPIType createdXbgAPIType = xbgAPITypeService.createOrUpdateXbgAPIType(xbgAPIType);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdXbgAPIType);
    }


}
