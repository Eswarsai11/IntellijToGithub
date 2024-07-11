package com.enlighten.mint.xbuserapp.controller;

import com.enlighten.mint.xbuserapp.model.XbgCurrency;

import com.enlighten.mint.xbuserapp.service.XbgCurrencyService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/currencies")
public class XbgCurrencyController {

    @Autowired
    private XbgCurrencyService xbgCurrencyService;

    @GetMapping
    public List<XbgCurrency> getAllCurrencies() {
        return xbgCurrencyService.findAll();
    }

    @GetMapping("/{id}")
    public ResponseEntity<XbgCurrency> getCurrencyById(@PathVariable Integer id) {
        Optional<XbgCurrency> xbgcurrency = xbgCurrencyService.findById(id);
        return xbgcurrency.map(ResponseEntity::ok)
                .orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public XbgCurrency createCurrency(@RequestBody XbgCurrency xbgcurrency) {
        return xbgCurrencyService.save(xbgcurrency);
    }
}
