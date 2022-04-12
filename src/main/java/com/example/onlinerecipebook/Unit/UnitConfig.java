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


            Unit g = new Unit("Grams");
            Unit m = new Unit( "ml");
            Unit p = new Unit( "Piece");
            Unit k = new Unit( "Kg");
            Unit ts = new Unit( "Teaspoon");
            Unit tb = new Unit( "Tablespoon");

            List<Unit> units = List.of(g, m, p, k, ts, tb);

        };
    }

}
