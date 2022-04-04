package com.example.onlinerecipebook.Cuisine;


import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CuisineConfig {

    @Bean
    CommandLineRunner commandLineRunner3(CuisineRepository repository){

        return args -> {

            Cuisine polish = new Cuisine(1, "Polish");
            Cuisine french = new Cuisine(2, "French");
            Cuisine spanish = new Cuisine(3, "Spanish");
            Cuisine greek = new Cuisine(4, "Greek");
            Cuisine japanese = new Cuisine(5, "Japanese");
            Cuisine chinese = new Cuisine(6, "Chinese");
            Cuisine fast_food = new Cuisine(7, "Fast-food");
            Cuisine mexican = new Cuisine(8, "Mexican");
            Cuisine indian = new Cuisine(9, "Indian");
            Cuisine thai = new Cuisine(10, "Thai");
            Cuisine italian = new Cuisine(11, "Italian");

            List<Cuisine> cuisine = List.of(polish, french, spanish, greek, japanese, chinese, fast_food, mexican, indian, thai, italian);
            for(Cuisine x : cuisine){
                boolean bool = repository.findRecipeByCuisine(x.getCuisine()).isPresent();
                System.out.println(bool);
                if(!bool){
                    repository.save(x);
                }
            }
        };
    }

}
