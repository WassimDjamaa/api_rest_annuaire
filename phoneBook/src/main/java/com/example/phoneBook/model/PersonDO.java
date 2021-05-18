package com.example.phoneBook.model;

import com.example.phoneBook.dto.PersonDTO;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Transient;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@Entity
@Table(name = "person")
public class PersonDO {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "firstname")
    private String firstname;

    @Column(name = "lastname")
    private String lastname;

    @Column(name = "birthOfDay")
    private Date birthOfDay;

    @Column(name = "cp")
    private String  cp;

    @Column(name = "email")
    private String email;

    @Column(name = "phone")
    private String phone;

    @Transient
    public PersonDTO toPersonDTO() {
        PersonDTO personDTO = new PersonDTO();
        personDTO.setId(id);
        personDTO.setFirstname(firstname);
        personDTO.setLastname(lastname);
        personDTO.setBirthOfDay(birthOfDay);
        personDTO.setCp(cp);
        personDTO.setEmail(email);
        personDTO.setPhone(phone);

        return personDTO;
    }
}
