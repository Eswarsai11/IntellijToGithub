package com.enlighten.mint.xbuserapp.service;


import com.enlighten.mint.xbuserapp.model.XbmwhiteLabel;
import com.enlighten.mint.xbuserapp.repo.XbmWhiteLabelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class XbmWhiteLableService {

    @Autowired
    private XbmWhiteLabelRepository xbmWhiteLabelRepository;




        public List<XbmwhiteLabel> getAllXbmWhiteLabels() {
            return xbmWhiteLabelRepository.findAll();
        }

        public Optional<XbmwhiteLabel> getXbmWhiteLabelById(Integer id) {
            return xbmWhiteLabelRepository.findById(id);
        }

        public XbmwhiteLabel createOrUpdateXbmWhiteLabel(XbmwhiteLabel xbmWhiteLabel) {
            return xbmWhiteLabelRepository.save(xbmWhiteLabel);
        }

        public void deleteXbmWhiteLabel(Integer id) {
            xbmWhiteLabelRepository.deleteById(id);
        }
    }




