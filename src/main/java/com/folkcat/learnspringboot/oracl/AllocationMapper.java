package com.folkcat.learnspringboot.oracl;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by Tamas on 2017/10/16.
 */

//@Mapper
public interface AllocationMapper {

    //@Select("select * from MOV_CKCOUNTERALLOCATION where flightId=#{flightId}")
    List<Allocation> getAllocationList(@Param("flightId")String flightId);
}
