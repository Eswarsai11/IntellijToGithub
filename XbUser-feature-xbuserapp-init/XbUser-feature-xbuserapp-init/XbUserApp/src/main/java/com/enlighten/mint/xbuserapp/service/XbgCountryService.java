package com.enlighten.mint.xbuserapp.service;

import com.enlighten.mint.xbuserapp.model.XbgCountry;
import com.enlighten.mint.xbuserapp.model.XbmwhiteLabel;
import com.enlighten.mint.xbuserapp.repo.XbgCountryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class XbgCountryService {




        @Autowired
        private XbgCountryRepository xbgCountryRepository;




        public List<XbgCountry> getAllXbgCountries() {
            return xbgCountryRepository.findAll();
        }

        public Optional<XbgCountry> getXbgCountryById(Integer id) {
            return xbgCountryRepository.findById(id);
        }

        public XbgCountry createOrUpdateXbgCountry(XbgCountry xbgCountry) {
            return xbgCountryRepository.save(xbgCountry);
        }

        public void deleteXbgCountry(Integer id) {
            xbgCountryRepository.deleteById(id);
        }
    }


