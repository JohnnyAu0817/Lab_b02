package com.fsse2305.Lab_b02.service;

import com.fsse2305.Lab_b02.data.CreatePersonData;
import com.fsse2305.Lab_b02.data.CreatedPersonData;
import com.fsse2305.Lab_b02.data.GetAllPerosn;
import com.fsse2305.Lab_b02.data.dto.GetAllPerosnData;
import com.fsse2305.Lab_b02.data.entity.PersonEntity;
import com.fsse2305.Lab_b02.service.impl.PersonServiceImpl;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PersonService implements PersonServiceImpl {
    //mock database
    private static List<PersonEntity> personEntityList = new ArrayList<PersonEntity>();

    public CreatedPersonData createPerson(CreatePersonData createPersonData){

        )


        PersonEntity personEntity = new PersonEntity(createPersonData);
        personEntity.setFirstName(createPersonData.getFirstName());
        personEntity.setLastName(createPersonData.getLastName());
        personEntity.setHkid(createPersonData.getHkid());

        // add the personEntity to the mock database
        personEntityList.add(personEntity);

        CreatedPersonData createdPersonData = new CreatedPersonData(personEntity);
        createdPersonData.setFirstName(personEntity.getFirstName());
        createdPersonData.setLastName(personEntity.getLastName());
        createdPersonData.setHkid(personEntity.getHkid());

        return createdPersonData;


    public void getAllPerson(){
        List<GetAllPerosnData> getAllPerosnDataList = new ArrayList<GetAllPerosnData>();
        for(PersonEntity personEntity: people)
        }

    }

}
