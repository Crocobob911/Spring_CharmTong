package com.crocobob.RestAPI_CharmTong.RestAPI_CharmTong.Domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@Getter
@ToString
public class Course {
    private int id;
    private String name;
    private String author;
}
