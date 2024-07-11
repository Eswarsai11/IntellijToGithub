package com.enlighten.mint.xbuserapp.service;


import com.enlighten.mint.xbuserapp.model.XbgCurrency;
import com.enlighten.mint.xbuserapp.repo.XbgCurrencyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Currency;
import java.util.List;
import java.util.Optional;

@Service
public class XbgCurrencyService {

    @Autowired
    private XbgCurrencyRepository xbgCurrencyRepository;

    public List<XbgCurrency> findAll() {
        return xbgCurrencyRepository.findAll();
    }

    public Optional<XbgCurrency> findById(Integer id) {
        return xbgCurrencyRepository.findById(id);
    }

    public XbgCurrency save(XbgCurrency currency) {
        return xbgCurrencyRepository.save(currency);
    }

    public void deleteById(Integer id) {
        xbgCurrencyRepository.deleteById(id);
    }

}
