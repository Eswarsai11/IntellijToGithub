package com.enlighten.mint.xbuserapp.controller;


import com.enlighten.mint.xbuserapp.exception.ResourceNotFoundException;
import com.enlighten.mint.xbuserapp.model.XbmAPIDetail;
import com.enlighten.mint.xbuserapp.service.XbmAPIDetailService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/xbmapidetails/v1")
public class XbmAPIDetailController {

    @Autowired
    private XbmAPIDetailService xbmAPIDetailService;

    @GetMapping
    public ResponseEntity<List<XbmAPIDetail>> getAllXbmAPIDetails() {
        List<XbmAPIDetail> xbmAPIDetails = xbmAPIDetailService.getAllXbmAPIDetails();
        return ResponseEntity.ok(xbmAPIDetails);
    }

    @GetMapping("/{id}")
    public ResponseEntity<XbmAPIDetail> getXbmAPIDetailById(@PathVariable Integer id) {
        Optional<XbmAPIDetail> xbmAPIDetail = xbmAPIDetailService.getXbmAPIDetailById(id);
        return xbmAPIDetail.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<XbmAPIDetail> createXbmAPIDetail(@RequestBody XbmAPIDetail xbmAPIDetail) {

        XbmAPIDetail createdXbmAPIDetail = xbmAPIDetailService.createOrUpdateXbmAPIDetail(xbmAPIDetail);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdXbmAPIDetail);
    }

    @PutMapping("/{id}")
    public ResponseEntity<XbmAPIDetail> updateAPIDetail(@PathVariable int id, @RequestBody XbmAPIDetail apiDetailDetails) {
        Optional<XbmAPIDetail> optionalAPIDetail = xbmAPIDetailService.getXbmAPIDetailById(id);

        if (optionalAPIDetail.isPresent()) {
            XbmAPIDetail apiDetail = optionalAPIDetail.get();
            apiDetail.setWhiteLabelID(apiDetailDetails.getWhiteLabelID());
            apiDetail.setApiTypeID(apiDetailDetails.getApiTypeID());
            apiDetail.setApiName(apiDetailDetails.getApiName());
            apiDetail.setApiUserName(apiDetailDetails.getApiUserName());
            apiDetail.setApiPassword(apiDetailDetails.getApiPassword());
            apiDetail.setApiKey(apiDetailDetails.getApiKey());
            apiDetail.setApiSessionToken(apiDetailDetails.getApiSessionToken());
            apiDetail.setApiDescription(apiDetailDetails.getApiDescription());
            apiDetail.setCreatedByID(apiDetailDetails.getCreatedByID());
            apiDetail.setCreatedDateTime(apiDetailDetails.getCreatedDateTime());
            apiDetail.setModifiedByID(apiDetailDetails.getModifiedByID());
            apiDetail.setModifiedDateTime(apiDetailDetails.getModifiedDateTime());
            return ResponseEntity.ok(xbmAPIDetailService.createOrUpdateXbmAPIDetail(apiDetail));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteXbmAPIDetail(@PathVariable Integer id) {
        if (!xbmAPIDetailService.getXbmAPIDetailById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        else {
            xbmAPIDetailService.deleteXbmAPIDetail(id);
            return ResponseEntity.noContent().build();
        }
    }
    @ExceptionHandler(BadRequestException.class)
    public ResponseEntity<?> handleBadRequestException(BadRequestException ex){
        return ResponseEntity.badRequest().body(ex.getMessage());
    }


    @ExceptionHandler(ResourceNotFoundException.class)
    public ResponseEntity<?> handleResourceNotFoundException(ResourceNotFoundException ex){
        return ResponseEntity.notFound().build();
    }
}

