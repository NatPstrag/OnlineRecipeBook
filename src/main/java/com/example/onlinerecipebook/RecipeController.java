package com.example.onlinerecipebook;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class RecipeController {


    private final RecipeService service;

    @Autowired
    public RecipeController(RecipeService service) {
        this.service = service;
    }


    @GetMapping("/recipe")
    public List<Recipe> find() {
        return service.find();
    }

    @PostMapping("/recipe")
    @ResponseStatus(HttpStatus.CREATED)
    public Recipe create(@RequestBody Recipe recipe){
        return service.create(recipe);
    }

    @PutMapping("/recipe/{recipe_id}")
    public Recipe update(@PathVariable Long recipe_id, @RequestBody Map<String, Object> payload) {
        return service.update(recipe_id, (String) payload.get("Name"));
    }

    @DeleteMapping("/recipe/{recipe_id}")
    @ResponseStatus(HttpStatus.OK)
    public void delete(@PathVariable Long recipe_id){
        service.delete(recipe_id);
    }
}
