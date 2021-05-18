package com.example.phoneBook.service;

import com.example.phoneBook.dto.PersonDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface IPersonService {
    List<PersonDTO> getAll();
    PersonDTO findById(Integer id);

    PersonDTO save(PersonDTO personDTO);
    void updateOne(PersonDTO personDTO, Integer id);

    void deleteById(Integer id);
    void deleteAll();

}
