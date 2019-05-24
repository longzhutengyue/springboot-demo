package com.neo.mapper;

import com.neo.model.Person;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PersonMapper {

    void insertMaxId(Person person);
}
