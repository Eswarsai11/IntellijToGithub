package com.enlighten.mint.xbuserapp.controller;

import com.enlighten.mint.xbuserapp.exception.ResourceNotFoundException;
import com.enlighten.mint.xbuserapp.model.XbmwhiteLabel;
import com.enlighten.mint.xbuserapp.service.XbmWhiteLableService;
import org.apache.coyote.BadRequestException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/XbmWhiteLable/v1")
public class XbmWhiteLableController {

    @Autowired
    private XbmWhiteLableService xbmWhiteLableService;

    @GetMapping
    public ResponseEntity<List<XbmwhiteLabel>> getAllXbmWhiteLabels() {
        List<XbmwhiteLabel> xbmWhiteLabels = xbmWhiteLableService.getAllXbmWhiteLabels();
        return ResponseEntity.ok(xbmWhiteLabels);
    }

    @GetMapping("/{id}")
    public ResponseEntity<XbmwhiteLabel> getXbmWhiteLabelById(@PathVariable Integer id) {
        Optional<XbmwhiteLabel> xbmWhiteLabel = xbmWhiteLableService.getXbmWhiteLabelById(id);
        return xbmWhiteLabel.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<XbmwhiteLabel> createXbmWhiteLabel(@RequestBody XbmwhiteLabel xbmWhiteLabel) {
        XbmwhiteLabel createdXbmWhiteLabel = xbmWhiteLableService.createOrUpdateXbmWhiteLabel(xbmWhiteLabel);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdXbmWhiteLabel);
    }

    @PutMapping("/{id}")
    public ResponseEntity<XbmwhiteLabel> updateXbmWhiteLabel(@PathVariable int id, @RequestBody XbmwhiteLabel whiteLabelDetails) {
        Optional<XbmwhiteLabel> optionalWhiteLabel = xbmWhiteLableService.getXbmWhiteLabelById(id);

        if (optionalWhiteLabel.isPresent()) {
            XbmwhiteLabel whiteLabel = optionalWhiteLabel.get();
            whiteLabel.setWhiteLabelCode(whiteLabelDetails.getWhiteLabelCode());
            whiteLabel.setCurrencyID(whiteLabelDetails.getCurrencyID());
            whiteLabel.setCountryID(whiteLabelDetails.getCountryID());
            whiteLabel.setTimeZoneID(whiteLabelDetails.getTimeZoneID());
            whiteLabel.setWhiteLabelName(whiteLabelDetails.getWhiteLabelName());
            whiteLabel.setContactNumber1(whiteLabelDetails.getContactNumber1());
            whiteLabel.setContactNumber2(whiteLabelDetails.getContactNumber2());
            whiteLabel.setContactEmail(whiteLabelDetails.getContactEmail());
            whiteLabel.setOfficialAddress(whiteLabelDetails.getOfficialAddress());
            whiteLabel.setOfficialWebsite(whiteLabelDetails.getOfficialWebsite());
            whiteLabel.setRegistrationDate(whiteLabelDetails.getRegistrationDate());
            whiteLabel.setExpirationDate(whiteLabelDetails.getExpirationDate());
            whiteLabel.setIsDeactivated(whiteLabelDetails.getIsDeactivated());
            whiteLabel.setIsPTEntabled(whiteLabelDetails.getIsPTEntabled());
            whiteLabel.setProviderPT(whiteLabelDetails.getProviderPT());
            whiteLabel.setWhiteLabelPT(whiteLabelDetails.getWhiteLabelPT());
            whiteLabel.setProviderCom(whiteLabelDetails.getProviderCom());
            whiteLabel.setWhiteLabelCom(whiteLabelDetails.getWhiteLabelCom());
            whiteLabel.setCreatedDateTime(whiteLabelDetails.getCreatedDateTime());
            whiteLabel.setModifiedDateTime(whiteLabelDetails.getModifiedDateTime());
            return ResponseEntity.ok(xbmWhiteLableService.createOrUpdateXbmWhiteLabel(whiteLabel));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteXbmWhiteLabel(@PathVariable Integer id) {
        if (!xbmWhiteLableService.getXbmWhiteLabelById(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }
        xbmWhiteLableService.deleteXbmWhiteLabel(id);
        return ResponseEntity.noContent().build();
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
