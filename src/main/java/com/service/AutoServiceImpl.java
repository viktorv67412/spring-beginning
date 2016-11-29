package com.service;

import com.model.Auto;
import com.repository.AutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("autoService")
public class AutoServiceImpl implements AutoService {

    @Autowired
    AutoRepository autoRepository;

    @Autowired
    public AutoServiceImpl(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }

    public AutoServiceImpl() {
    }

    public List<Auto> getAutos() {
        return autoRepository.getAutos();
    }

    public AutoRepository getAutoRepository() {
        return autoRepository;
    }

    @Autowired
    public void setAutoRepository(AutoRepository autoRepository) {
        this.autoRepository = autoRepository;
    }
}

