package com.example.onlinerecipebook.Recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin( origins = "*", allowedHeaders = "*")
public class RecipeController {

    @Autowired
    private  RecipeService service;

//
//    @GetMapping("/recipe")
//    public List<Recipe> find(){
//        return service.find();
//    }
//
//    @GetMapping("/recipe")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Recipe create(@RequestBody Recipe recipe){
//        return service.create(recipe);
//    }
//
//    @PutMapping("/recipe/{id}")
//    public Recipe update(@PathVariable Long id, @RequestBody Map<String, Object> payload){
//        return service.update(id, (String) payload.get("name"));
//    }
}
