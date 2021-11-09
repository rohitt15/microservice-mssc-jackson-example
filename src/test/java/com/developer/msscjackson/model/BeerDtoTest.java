package com.developer.msscjackson.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;

@JsonTest
class BeerDtoTest extends BestTest{

    @Autowired
    ObjectMapper objectMapper;

    //this is the seriailzation of java object to json string
    @Test
    void testSerializeDto() throws JsonProcessingException {
        BeerDto beerDto=getDto();

        String json=objectMapper.writeValueAsString(beerDto);

        System.out.println(json);
    }

    //this is the de-serialization of json string to java object

    @Test
    void testDeSerialize() throws JsonProcessingException {

        String json="{\"id\":\"6aebe84e-a1ff-498e-ab3c-ca6bb5f8b907\",\"beerName\":\"BeerName\",\"beerStyle\":\"ALA\",\"upc\":123123123123,\"createdDate\":\"2021-11-09T17:35:47.28+05:30\",\"lastUpdatedDate\":\"2021-11-09T17:35:47.28+05:30\"}";

        BeerDto dto=objectMapper.readValue(json,BeerDto.class);

        System.out.println(dto);

    }
}