package com.handBookRestApiExample.handBook.controller;

import com.handBookRestApiExample.handBook.model.HandBookOfRegions;
import com.handBookRestApiExample.handBook.service.HandBookOfRegionsServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/handBooks")
public class HandBookController {

    private final HandBookOfRegionsServiceImpl handbookService;

    @Autowired
    public HandBookController(HandBookOfRegionsServiceImpl handbookService) {
        this.handbookService = handbookService;
    }


    @GetMapping
    public List<HandBookOfRegions> getAllHandbooks(){
        return handbookService.getAllHandBook();
    }

    @GetMapping("/{id}")
    public HandBookOfRegions getHandBookById(@PathVariable("id") int id){
        return handbookService.getHandBookById(id);
    }

    @PostMapping("/{id}")
    public void updateHandBookById(@PathVariable("id") int id,
                                   @RequestBody HandBookOfRegions updatedHandBook){
        handbookService.updateHandBookById(id, updatedHandBook);
    }
}
