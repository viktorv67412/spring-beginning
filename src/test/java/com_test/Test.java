package com_test;


import com.model.Auto;
import com.repository.AutoRepository;
import com.repository.AutoRepositoryImpl;
import com.service.AutoService;
import com.service.AutoServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

import java.util.List;

@RunWith(JUnit4.class)
public class Test {

    AutoService autoService;

    @Before
    public void makePreparationl() {
        autoService = new AutoServiceImpl(new AutoRepositoryImpl());
    }

    @org.junit.Test
    public void getAutoTest() {
        List<Auto> autos = autoService.getAutos();
        Assert.assertNotNull(autos.get(0));
    }

}
