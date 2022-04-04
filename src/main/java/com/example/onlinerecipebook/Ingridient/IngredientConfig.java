package com.example.onlinerecipebook.Ingridient;



import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class IngredientConfig {

    @Bean
    CommandLineRunner commandLineRunner3(IngredientRepository repository){

        return args -> {

            Ingredient g = new Ingredient("Grams");
            Ingredient n = new Ingredient("-");
            Ingredient m = new Ingredient("ml");
            Ingredient k = new Ingredient("kg");
            Ingredient p = new Ingredient("Piece");
            Ingredient ts = new Ingredient("Teaspoon");
            Ingredient tb = new Ingredient("Tablespoon");

            List<Ingredient> ingredients = List.of(g, n, m, k, p, ts, tb);
            for(Ingredient x : ingredients){
                boolean bool = repository.findRecipeByIngredient(x.getName()).isPresent();
                System.out.println(bool);
                if(!bool){
                    repository.save(x);
                }
            }
        };
    }

}
