package com.example.onlinerecipebook.Recipe;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
@RequestMapping("/recipes")
public class RecipeController {

    @Autowired
    RecipeService recipeService;

    @GetMapping("/get/all")
    public List<Recipe> getAll() {
        return recipeService.getAll();
    }
//
//    @GetMapping("/recipes/{id}")
//    public ResponseEntity fetchRecipesByID(@PathVariable("id") String id) {
//        return new ResponseEntity(HttpStatus.OK);
//    }

    @PostMapping("/add")
    @ResponseStatus(HttpStatus.CREATED)
    public String add(@RequestBody Recipe recipe) {
        return recipeService.add(recipe);
    }

    @PutMapping("/edit")
    public String edit(@RequestBody Recipe recipe) {
        return recipeService.edit(recipe);
    }

    @DeleteMapping("/recipe/{id}/")
    public ResponseEntity deleteRecipe(@PathVariable("id") String id){
        return new ResponseEntity(HttpStatus.OK);
    }
}

