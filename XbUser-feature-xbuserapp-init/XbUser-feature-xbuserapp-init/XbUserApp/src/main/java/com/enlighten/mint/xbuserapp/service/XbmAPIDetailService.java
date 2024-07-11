package com.enlighten.mint.xbuserapp.service;

import com.enlighten.mint.xbuserapp.model.XbmAPIDetail;
import com.enlighten.mint.xbuserapp.repo.XbmAPIDetailRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class XbmAPIDetailService {

    @Autowired
    private XbmAPIDetailRepository xbmAPIDetailRepository;

    public List<XbmAPIDetail> getAllXbmAPIDetails() {
        return xbmAPIDetailRepository.findAll();
    }

    public Optional<XbmAPIDetail> getXbmAPIDetailById(Integer id) {
        return xbmAPIDetailRepository.findById(id);
    }

    public XbmAPIDetail createOrUpdateXbmAPIDetail(XbmAPIDetail xbmAPIDetail) {
        return xbmAPIDetailRepository.save(xbmAPIDetail);
    }

    public void deleteXbmAPIDetail(Integer id) {
        xbmAPIDetailRepository.deleteById(id);
    }
}
