package com.repository;

import com.model.Auto;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository(value = "autoRepo")
public class AutoRepositoryImpl implements AutoRepository {

    public List<Auto> getAutos() {
        List<Auto> autos = new ArrayList<Auto>();

        Auto ferrari = new Auto("f12berlinetta", 545, 690, 340);
        Auto bmw = new Auto("x1", 136, 220, 220);

        autos.add(ferrari);
        autos.add(bmw);

        return autos;
    }
}
