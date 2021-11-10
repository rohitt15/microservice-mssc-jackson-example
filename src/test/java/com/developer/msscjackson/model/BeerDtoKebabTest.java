package com.developer.msscjackson.model;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.test.context.ActiveProfiles;
/*
created by rohit on 09-11-21
 */
@ActiveProfiles("kebab")
@JsonTest
public class BeerDtoKebabTest extends BestTest{

    @Autowired
    ObjectMapper objectMapper;

    @Test
    void testKebab() throws JsonProcessingException {
        BeerDto beerDto=getDto();
        String json=objectMapper.writeValueAsString(beerDto);

        System.out.println(json);
    }

}
