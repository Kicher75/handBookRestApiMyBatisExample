package com.handBookRestApiExample.handBook.service;

import com.handBookRestApiExample.handBook.model.HandBookOfRegions;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface HandBookOfRegionsService {

    List<HandBookOfRegions> getAllHandBook();
    HandBookOfRegions getHandBookById(int id);
    void updateHandBookById(int id, HandBookOfRegions updatedHandBook);


}
