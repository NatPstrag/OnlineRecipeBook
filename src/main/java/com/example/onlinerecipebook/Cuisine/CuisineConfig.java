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

            Cuisine polish = new Cuisine("Polish");
            Cuisine french = new Cuisine("French");
            Cuisine spanish = new Cuisine("Spanish");
            Cuisine greek = new Cuisine("Greek");
            Cuisine japanese = new Cuisine("Japanese");
            Cuisine chinese = new Cuisine("Chinese");
            Cuisine fast_food = new Cuisine("Fast-food");
            Cuisine mexican = new Cuisine("Mexican");
            Cuisine indian = new Cuisine("Indian");
            Cuisine thai = new Cuisine("Thai");
            Cuisine italian = new Cuisine("Italian");

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
