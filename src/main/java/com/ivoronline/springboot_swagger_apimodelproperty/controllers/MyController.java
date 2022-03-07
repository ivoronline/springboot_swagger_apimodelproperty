package com.ivoronline.springboot_swagger_apimodelproperty.controllers;

import com.ivoronline.springboot_swagger_apimodelproperty.DTO.PersonDTO;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2
public class MyController {

  //=========================================================================
  // ADD PERSON
  //=========================================================================
  @PostMapping("AddPerson")
  PersonDTO addPerson(@RequestBody PersonDTO personDTO) {

    //EDIT & RETURN DATA
    personDTO.name = personDTO.name + " Returned";
    personDTO.age  = personDTO.age  + 100;

    //RETURN SOMETHING
    return personDTO;

  }

}


