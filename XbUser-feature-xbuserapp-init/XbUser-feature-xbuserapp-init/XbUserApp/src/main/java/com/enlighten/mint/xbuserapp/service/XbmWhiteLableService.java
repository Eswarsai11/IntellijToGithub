package com.enlighten.mint.xbuserapp.service;


import com.enlighten.mint.xbuserapp.model.XbmwhiteLabel;
import com.enlighten.mint.xbuserapp.repo.XbmWhiteLabelRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class XbmWhiteLableService {

    @Autowired
    private XbmWhiteLabelRepository xbmWhiteLabelRepository;

    // Get all white labels
    public List<XbmwhiteLabel> getAllXbmWhiteLabels() {
        return xbmWhiteLabelRepository.findAll();
    }

    // Create a new white label
    public XbmwhiteLabel createXbmWhiteLabel( XbmwhiteLabel xbmwhiteLabel) {
        return xbmWhiteLabelRepository.save(xbmwhiteLabel);
    }

    // Get a single white label by ID

    public XbmwhiteLabel getXbmWhiteLabelById( Integer id) {
        return xbmWhiteLabelRepository.findById(id)

                .orElseThrow(() -> new RuntimeException("WhiteLabel not found with id " + id));
    }

    // Update a white label

    public XbmwhiteLabel updateXbmWhiteLabel( XbmwhiteLabel xbmwhiteLabel) {
        return xbmWhiteLabelRepository.save(xbmwhiteLabel);
    }


    // Delete a white label

    public String deleteXbmWhiteLabel(Integer id) {
        xbmWhiteLabelRepository.deleteById(id);

        return "Deleted white label with id: " + id;
    }
}
