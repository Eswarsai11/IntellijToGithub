package com.enlighten.mint.xbuserapp.controller;

import com.enlighten.mint.xbuserapp.model.XbgCountry;
import com.enlighten.mint.xbuserapp.model.XbgCurrency;
import com.enlighten.mint.xbuserapp.service.XbgCountryService;
import com.enlighten.mint.xbuserapp.service.XbgCurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/countries")
public class XbgCountryController {




    @Autowired
    private XbgCountryService xbgCountryService;

    @GetMapping
    public ResponseEntity<List<XbgCountry>> getAllXbgCountries() {
        List<XbgCountry> xbgCountries = xbgCountryService.getAllXbgCountries();
        return ResponseEntity.ok(xbgCountries);
    }

    @GetMapping("/{id}")
    public ResponseEntity<XbgCountry> getXbgCountryById(@PathVariable Integer id) {
        Optional<XbgCountry> xbgCountry = xbgCountryService.getXbgCountryById(id);
        return xbgCountry.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<XbgCountry> createXbgCountry(@RequestBody XbgCountry xbgCountry) {
        XbgCountry createdXbgCountry = xbgCountryService.createOrUpdateXbgCountry(xbgCountry);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdXbgCountry);
    }

}
