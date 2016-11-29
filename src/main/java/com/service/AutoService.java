package com.service;

import com.model.Auto;
import com.repository.AutoRepository;

import java.util.List;

public interface AutoService {
    List<Auto> getAutos();

    AutoRepository getAutoRepository();

    void setAutoRepository(AutoRepository autoRepository);
}
