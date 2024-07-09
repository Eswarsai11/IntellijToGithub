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

@RestController
@RequestMapping("/countries")
public class XbgCountryController {




    @Autowired
    private XbgCountryService xbgCountryService;

    @PostMapping
    public ResponseEntity<XbgCountry> createXbgContry(@RequestBody XbgCountry xbgCountry) {
        XbgCountry xbgCountry1=xbgCountryService.saveCountry(xbgCountry);
        return ResponseEntity.status(HttpStatus.CREATED).body(xbgCountry1);
    }

    @GetMapping
    public ResponseEntity<List<XbgCountry>> getAllXbgAvailableCountries(){

        List<XbgCountry> xbgCountryList = xbgCountryService.getAllXbgCountries();

        return ResponseEntity.ok(xbgCountryList);

    }


    @PutMapping("/{id}")
    public ResponseEntity<XbgCountry> getWithXbgContryWithId(@PathVariable Integer id){

        XbgCountry xbgCountry = xbgCountryService.getXbmCountryById(id);

        return ResponseEntity.ok(xbgCountry);

    }
}
