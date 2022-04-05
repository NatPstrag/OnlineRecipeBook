package com.example.onlinerecipebook.Recipe;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
public class RecipeController {

    @RequestMapping("/")
    public String index(){
        return "start";
    }


    @GetMapping("/recipes")
    public ResponseEntity fetchAllRecipes() {
        return new ResponseEntity(HttpStatus.OK);
    }

    @GetMapping("/recipes/{id}")
    public ResponseEntity fetchRecipesByID(@PathVariable("id") String id) {
        return new ResponseEntity(HttpStatus.OK);
    }

    @PostMapping(value = "/recipes", consumes = "application/jason", produces = "application/json")
    public Recipe createRecipe(@RequestBody Recipe recipe){
        return recipe;
    }

    @DeleteMapping("/recipe/{id}/")
    public ResponseEntity deleteRecipe(@PathVariable("id") String id){
        return new ResponseEntity(HttpStatus.OK);
    }
}
