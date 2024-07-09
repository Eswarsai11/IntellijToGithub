package com.enlighten.mint.xbuserapp.controller;

import com.enlighten.mint.xbuserapp.model.XbgCurrency;
import com.enlighten.mint.xbuserapp.model.XbmwhiteLabel;
import com.enlighten.mint.xbuserapp.service.XbgCurrencyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/currencies")
public class XbgCurrencyController {

    @Autowired
    private XbgCurrencyService xbgCurrencyService;

    @PostMapping
    public ResponseEntity<XbgCurrency> createXbgCurrency(@RequestBody XbgCurrency xbgCurrency) {
         XbgCurrency xbgCurrency1=xbgCurrencyService.saveXbgCurrency(xbgCurrency);
         return ResponseEntity.status(HttpStatus.CREATED).body(xbgCurrency1);
    }

    @GetMapping
    public ResponseEntity<List<XbgCurrency>> getAllXbgCurrencies(){

        List<XbgCurrency> xbgCurrencyList = xbgCurrencyService.getAllCurrency();

        return ResponseEntity.ok(xbgCurrencyList);

    }


    @PutMapping("/{id}")
    public ResponseEntity<XbgCurrency> getWithXbgCurrencyId(@PathVariable Integer id){

        XbgCurrency xbgCurrency = xbgCurrencyService.getXbgCurrencyById(id);

        return ResponseEntity.ok(xbgCurrency);

    }
}
