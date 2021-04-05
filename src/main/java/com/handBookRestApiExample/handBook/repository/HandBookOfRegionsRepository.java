package com.handBookRestApiExample.handBook.repository;

import com.handBookRestApiExample.handBook.model.HandBookOfRegions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HandBookOfRegionsRepository {

    List<HandBookOfRegions> getAllHandBook();
    HandBookOfRegions getHandBookById(int id);
    void updateHandBookById(int id, HandBookOfRegions updatedHandBook);

}
