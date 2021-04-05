package com.handBookRestApiExample.handBook.repository;

import com.handBookRestApiExample.handBook.mapper.HandBookOfRegionsMapper;
import com.handBookRestApiExample.handBook.model.HandBookOfRegions;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HandBookOfRegionsRepoImpl implements HandBookOfRegionsRepository{

    private final HandBookOfRegionsMapper handBookMapper;

    public HandBookOfRegionsRepoImpl(HandBookOfRegionsMapper handBookMapper) {
        this.handBookMapper = handBookMapper;
    }

    @Override
    public List<HandBookOfRegions> getAllHandBook() {
        return handBookMapper.findAll();
    }

    @Override
    public HandBookOfRegions getHandBookById(int id) {
        return handBookMapper.findById(id);
    }

    @Override
    public void updateHandBookById(int id, HandBookOfRegions updatedHandBook) {
        handBookMapper.updateById(id,
                updatedHandBook.getFull_name_of_region(),
                updatedHandBook.getAbbreviation_of_region());
    }
}
