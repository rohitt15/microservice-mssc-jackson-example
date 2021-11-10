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

        String json="{\"id\":\"525a5a28-2ba8-4412-8253-3abcedf28eac\",\"beer_name\":\"BeerName\",\"beer_style\":\"ALA\",\"upc\":123123123123,\"created_date\":\"2021-11-10T12:41:07.456+05:30\",\"last_updated_date\":\"2021-11-10T12:41:07.456+05:30\",\"local_date\":\"20211110\"}";

        BeerDto dto=objectMapper.readValue(json,BeerDto.class);

        System.out.println(dto);

    }
}