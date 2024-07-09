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

@RestController
@RequestMapping("/api/XbmWhiteLable/v1")
public class XbmWhiteLableController {

    @Autowired
    private XbmWhiteLableService xbmWhiteLableService;


    @GetMapping
    public ResponseEntity<List<XbmwhiteLabel>> getAllXbmWL(){

        List<XbmwhiteLabel> xbmwhiteLabelList = xbmWhiteLableService.getAllXbmWhiteLabels();

        return ResponseEntity.ok(xbmwhiteLabelList);

    }


    @PostMapping
    public ResponseEntity<XbmwhiteLabel> saveXbmWhiteLable(@RequestBody XbmwhiteLabel xbmwhiteLabel){
        XbmwhiteLabel xbmwhiteLabel1 = xbmWhiteLableService.createXbmWhiteLabel(xbmwhiteLabel);

        return ResponseEntity.status(HttpStatus.CREATED).body(xbmwhiteLabel1);
    }



      @PutMapping("/{id}")
      public ResponseEntity<XbmwhiteLabel> getWithXbmWhiteLableId(@PathVariable Integer id){

        XbmwhiteLabel xbmwhiteLabel = xbmWhiteLableService.getXbmWhiteLabelById(id);

        return ResponseEntity.ok(xbmwhiteLabel);

    }


    @DeleteMapping("/{id}")
    public ResponseEntity<XbmwhiteLabel> deleteXbmWhiteLableById(@PathVariable Integer id){

        xbmWhiteLableService.deleteXbmWhiteLabel(id);
        return  ResponseEntity.ok().build();

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
