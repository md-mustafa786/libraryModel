package com.example.library.controller;

import com.example.library.model.LibraryModel;
import com.example.library.service.LibraryService;
import jakarta.annotation.Nullable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

@RequestMapping("/api/library")
public class LibraryController {
    @Autowired
    private  LibraryService libraryService;

    @GetMapping("/libraries")
    public List<LibraryModel> getAllLib(){
        return libraryService.getlibraries();
    }

    @GetMapping("/libraries/get-by")
    public LibraryModel getlibrariesname(@Nullable @RequestParam String name){
        return libraryService.getbyname(name);
    }
    @PostMapping("/add-library")
    public void addlibrary(@RequestBody LibraryModel libraryModel){
        libraryService.add(libraryModel);
    }

    @PutMapping("/update-library/by-name/{name}")
    public void updateLib(@RequestBody LibraryModel libraryModel, @PathVariable String name){
        libraryService.update(libraryModel, name);
    }

    @DeleteMapping("/delete-library/by-name/{name}")
    public void deleteLib(@PathVariable String name){
        libraryService.deletel(name);
    }
}
