package com.handBookRestApiExample.handBook.mapper;

import com.handBookRestApiExample.handBook.model.HandBookOfRegions;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface HandBookOfRegionsMapper {

    @Select("SELECT id, full_name_of_region, abbreviation_of_region FROM Handbooks")
    List<HandBookOfRegions> findAll();

    @Select("SELECT id, full_name_of_region, abbreviation_of_region FROM Handbooks WHERE id = #{id}")
    HandBookOfRegions findById(@Param("id") int id);

    @Update("UPDATE handbooks SET full_name_of_region = #{full_name_of_region}, " +
            "abbreviation_of_region = #{abbreviation_of_region} WHERE id = #{id}")
    void updateById(@Param("id") int id,
                    @Param("full_name_of_region") String full_name_of_region,
                    @Param("abbreviation_of_region") String abbreviation_of_region);

}
