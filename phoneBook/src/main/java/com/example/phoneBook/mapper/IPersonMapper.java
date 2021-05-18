package com.example.phoneBook.mapper;

import com.example.phoneBook.dto.PersonDTO;
import com.example.phoneBook.model.PersonDO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface IPersonMapper {

    PersonDTO toPersonDTO(PersonDO personDO);
    PersonDO toPersonDO(PersonDTO personDTO);
}