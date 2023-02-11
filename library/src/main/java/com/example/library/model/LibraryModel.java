package com.example.library.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LibraryModel {
    private String name;
    private String libraryAdd;
    private Integer number;
    private List<String> facilities;

    private List<String> books;

}





