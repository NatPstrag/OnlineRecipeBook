package com.example.onlinerecipebook.Difficulty;


import com.example.onlinerecipebook.Category.Category;
import com.example.onlinerecipebook.Category.CategoryRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class DifficultyConfig {

    @Bean
    CommandLineRunner commandLineRunner2(DifficultyRepository repository){

        return args -> {

            Difficulty easy = new Difficulty(1, "Easy");
            Difficulty medium = new Difficulty(2, "Medium");
            Difficulty hard = new Difficulty(3, "Hard");

            List<Difficulty> difficulty = List.of(easy, medium, hard);
            for(Difficulty x : difficulty){
                boolean bool = repository.findRecipeByDifficult(x.getDifficult()).isPresent();
                System.out.println(bool);
                if(!bool){
                    repository.save(x);
                }
            }
        };
    }

}
