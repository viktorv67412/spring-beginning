package com_test;

import com.model.Auto;
import com.repository.AutoRepository;
import com.repository.AutoRepositoryImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.List;

@RunWith(JUnit4.class)
public class AutoRepositoryTest {

    private AutoRepository autoRepository;

    @Before
    public void init() {
        autoRepository = new AutoRepositoryImpl();
    }

    @Test
    public void autoTest() {
        List<Auto> autos = autoRepository.getAutos();
        Assert.assertNotNull(autos.get(0));
    }
}
