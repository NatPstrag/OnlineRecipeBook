package com.example.onlinerecipebook;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CategoryConfig {

    @Bean
    CommandLineRunner commandLineRunner( CategoryRepository repository){

        return args -> {

            Category breakfast = new Category(1, "Breakfast");
            Category lunch = new Category(2,"Lunch");
            Category soup = new Category(3,"Soup");
            Category salad= new Category(4,"Salad");
            Category pasta = new Category(5,"Pasta");
            Category main_dish = new Category(6, "Main dish");
            Category condiments = new Category(7, "Condiments");
            Category cocktails = new Category(8,"Cocktails");
            Category beverages = new Category(9, "Beverages");
            Category side_dish = new Category(10, "Side dish");



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
