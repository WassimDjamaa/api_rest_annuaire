package com.example.phoneBook.service;

import com.example.phoneBook.dto.PersonDTO;
import com.example.phoneBook.mapper.IPersonMapper;
import com.example.phoneBook.model.PersonDO;
import com.example.phoneBook.repository.IPersonRepository;

import com.example.phoneBook.exception.NotFoundException;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Slf4j
//@Primary
//@Profile("development")
@Service("PersonService")
public class PersonService implements IPersonService {

    @Autowired
    private IPersonMapper personMapper;

    @Autowired
    private IPersonRepository personRepository;

    @Override
    public List<PersonDTO> getAll() {
        System.out.println(personRepository.count());
        return personRepository.findAll().stream()
                .map(PersonDO::toPersonDTO)
                .collect(Collectors.toList());
    }

    @Override
    public PersonDTO findById(Integer id) {
        return personRepository.findById(id)
                .map(PersonDO::toPersonDTO)
                .orElseThrow(NotFoundException::new);
    }

    @Override
    public PersonDTO save(PersonDTO personDTO) {

        final PersonDO personToCreate = personMapper.toPersonDO(personDTO);
        final PersonDO createdDoctor = personRepository.save(personToCreate);

        return personMapper.toPersonDTO(createdDoctor);
    }

    @Override
    public void deleteAll() {
        personRepository.deleteAll();
    }

    @Override
    public void deleteById(Integer id) {
        personRepository.deleteById(id);
    }

    @Override
    public void updateOne(PersonDTO personDTO, Integer id) {

        findById(id);
        PersonDO personToUpdate = personMapper.toPersonDO(personDTO);
        personToUpdate.setId(id);
        personRepository.save(personToUpdate);
    }
}
