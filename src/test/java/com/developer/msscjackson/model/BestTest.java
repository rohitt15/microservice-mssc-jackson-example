package com.developer.msscjackson.model;

import javax.xml.crypto.Data;
import java.time.LocalDate;
import java.time.OffsetDateTime;
import java.util.UUID;

public class BestTest {

    BeerDto getDto(){
        return BeerDto.builder()
                .beerName("BeerName")
                .beerStyle("ALA")
                .upc(123123123123L)
                .id(UUID.randomUUID())
                .createdDate(OffsetDateTime.now())
                .lastUpdatedDate(OffsetDateTime.now())
                .localDate(LocalDate.now())
                .build();
    }
}
