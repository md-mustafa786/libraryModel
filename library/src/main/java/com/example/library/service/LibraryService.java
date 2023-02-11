package com.example.library.service;

import com.example.library.model.LibraryModel;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

@Service
public class LibraryService {
private static List<LibraryModel> libraryModels = new ArrayList<>();

         static {
             LibraryModel l1 = new LibraryModel("Alma","Lucknow",786786, List.of("Seprate reading hall with seating capicity of 300","Digital library and internet Facility","open Access for all students"),List.of("Java","C++","Paython","Php"));
             libraryModels.add(l1);
         }

         public List<LibraryModel> getlibraries(){
             return libraryModels;
         }
    public void add(LibraryModel library) {
     libraryModels.add(library);
    }

    public LibraryModel getbyname(String name){
        Predicate<? super LibraryModel> predicate = obj -> obj.getName().equals(name);
        LibraryModel l1 = libraryModels.stream().filter(predicate).findFirst().get();
        return l1;
    }

    public void update(LibraryModel library,String name){
             LibraryModel l = getbyname(name);
             l.setName(library.getName());
             l.setLibraryAdd(library.getLibraryAdd());
             l.setNumber(library.getNumber());
             l.setBooks(library.getBooks());
             l.setFacilities(library.getFacilities());
    }

    public void deletel(String name){
             Predicate<? super LibraryModel> predicate = obj -> obj.getName().equals(name);
             libraryModels.remove(predicate);
    }
}
