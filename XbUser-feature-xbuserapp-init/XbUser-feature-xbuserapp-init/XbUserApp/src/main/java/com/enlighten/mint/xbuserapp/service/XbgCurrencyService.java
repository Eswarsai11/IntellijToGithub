package com.enlighten.mint.xbuserapp.service;


import com.enlighten.mint.xbuserapp.model.XbgCurrency;
import com.enlighten.mint.xbuserapp.repo.XbgCurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Currency;
import java.util.List;

@Service
public class XbgCurrencyService {

    @Autowired
    private XbgCurrencyRepository xbgCurrencyRepository;

    public XbgCurrency saveXbgCurrency(XbgCurrency xbgCurrency) {
        return xbgCurrencyRepository.save(xbgCurrency);
    }


    public XbgCurrency getXbgCurrencyById(Integer id) {
        return xbgCurrencyRepository.findById(id)

                .orElseThrow(() -> new RuntimeException("Currency not found with id " + id));
    }

    public List<XbgCurrency> getAllCurrency() {
        return xbgCurrencyRepository.findAll();
    }

}
