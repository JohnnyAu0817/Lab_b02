package com.fsse2305.Lab_b02.api;

import com.fsse2305.Lab_b02.data.CreatePersonData;
import com.fsse2305.Lab_b02.data.CreatedPersonData;
import com.fsse2305.Lab_b02.data.dto.CreatePersonRequestDto;
import com.fsse2305.Lab_b02.data.dto.CreatePersonResponseDto;
import com.fsse2305.Lab_b02.service.PersonService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonApi {
    private PersonService personService;

    public PersonApi(PersonService personService){
        this.personService = personService;
    }

    @PostMapping("person")
    public CreatePersonResponseDto createPerson(@RequestBody CreatePersonRequestDto createPersonRequestDto){
        //Lv1
        //CreatePersonData createPersonData = new CreatePersonData();
        //createPersonData.setFirstName(createPersonRequestDto.getFirstName());
        //createPersonData.setLastName(createPersonRequestDto.getLastName());
        //createPersonData.setHkid(createPersonRequestDto.getHkid());

        //Lv2
        CreatePersonData createPersonData = new CreatePersonData(createPersonRequestDto);

        CreatedPersonData createdPerson = personService.createPerson(createPersonData);

        CreatePersonResponseDto createPersonResponseDto = new CreatePersonResponseDto();
        createPersonResponseDto.setFirstName(createdPerson.getFirstName());
        createPersonResponseDto.setLastName(createdPerson.getLastName());
        createPersonResponseDto.setHkid(createdPerson.getHkid());

        return createPersonResponseDto;
    }

    @GetMapping("person")
    public void getAllPerson(){
        List<getAllPersondata> getAllPersondataList = personService.getAllPerson();



    }
}
