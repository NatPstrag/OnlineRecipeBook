package com.example.onlinerecipebook.Unit;

import com.example.onlinerecipebook.Difficulty.Difficulty;
import com.example.onlinerecipebook.Difficulty.DifficultyRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class UnitConfig {

    @Bean
    CommandLineRunner commandLineRunner4(UnitRepository repository){

        return args -> {


            Unit g = new Unit(1,"Grams");
            Unit m = new Unit(2, "ml");
            Unit p = new Unit(3, "Piece");
            Unit k = new Unit(4, "Kg");
            Unit ts = new Unit(5, "Teaspoon");
            Unit tb = new Unit(6, "Tablespoon");

            List<Unit> units = List.of(g, m, p, k, ts, tb);

        };
    }

}
