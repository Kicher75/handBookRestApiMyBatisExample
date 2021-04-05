package com.handBookRestApiExample.handBook.service;

import com.handBookRestApiExample.handBook.model.HandBookOfRegions;
import com.handBookRestApiExample.handBook.repository.HandBookOfRegionsRepoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class HandBookOfRegionsServiceImpl implements HandBookOfRegionsService{

    private final HandBookOfRegionsRepoImpl handBookRepo;

    @Autowired
    public HandBookOfRegionsServiceImpl(HandBookOfRegionsRepoImpl handBookRepo) {
        this.handBookRepo = handBookRepo;
    }

    @Override
    public List<HandBookOfRegions> getAllHandBook() {
        return handBookRepo.getAllHandBook();
    }

    @Override
    @Cacheable(value = "handbooks", key = "#id")
    public HandBookOfRegions getHandBookById(int id) {
        return handBookRepo.getHandBookById(id);
    }

    @Override
    @CacheEvict(value = "handbooks", key = "#id")
    public void updateHandBookById(int id, HandBookOfRegions updatedHandBook) {
        handBookRepo.updateHandBookById(id, updatedHandBook);
    }
}
