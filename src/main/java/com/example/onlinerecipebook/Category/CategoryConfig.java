package com.example.onlinerecipebook.Category;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CategoryConfig {

    @Bean
    CommandLineRunner commandLineRunner1( CategoryRepository repository){

        return args -> {

            Category breakfast = new Category( "Breakfast");
            Category lunch = new Category("Lunch");
            Category soup = new Category("Soup");
            Category salad= new Category("Salad");
            Category pasta = new Category("Pasta");
            Category main_dish = new Category( "Main dish");
            Category condiments = new Category( "Condiments");
            Category cocktails = new Category("Cocktails");
            Category beverages = new Category( "Beverages");
            Category side_dish = new Category( "Side dish");


            List<Category> categories = List.of(breakfast,lunch,soup,salad,pasta,main_dish, condiments, cocktails, beverages, side_dish);
            for(Category x : categories){
                boolean bool = repository.findRecipeByCategory(x.getCategory()).isPresent();
                System.out.println(bool);
                if(!bool){
                    repository.save(x);
                }
            }
        };
    }
}
