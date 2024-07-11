package com.enlighten.mint.xbuserapp.controller;

import com.enlighten.mint.xbuserapp.model.XbgTimeZone;
import com.enlighten.mint.xbuserapp.service.XbgTimeZoneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/timezones")
public class XbgTimeZoneController {


    @Autowired
    private XbgTimeZoneService xbgTimeZoneService;

    @GetMapping
    public ResponseEntity<List<XbgTimeZone>> getAllXbgTimeZones() {
        List<XbgTimeZone> xbgTimeZones = xbgTimeZoneService.getAllXbgTimeZones();
        return ResponseEntity.ok(xbgTimeZones);
    }

    @GetMapping("/{id}")
    public ResponseEntity<XbgTimeZone> getXbgTimeZoneById(@PathVariable Integer id) {
        Optional<XbgTimeZone> xbgTimeZone = xbgTimeZoneService.getXbgTimeZoneById(id);
        return xbgTimeZone.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<XbgTimeZone> createXbgTimeZone(@RequestBody XbgTimeZone xbgTimeZone) {
        XbgTimeZone createdXbgTimeZone = xbgTimeZoneService.createOrUpdateXbgTimeZone(xbgTimeZone);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdXbgTimeZone);
    }

}
