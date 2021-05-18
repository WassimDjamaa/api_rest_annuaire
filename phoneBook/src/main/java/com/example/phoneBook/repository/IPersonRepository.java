package com.example.phoneBook.repository;

import com.example.phoneBook.model.PersonDO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IPersonRepository extends JpaRepository<PersonDO, Integer> {
}
