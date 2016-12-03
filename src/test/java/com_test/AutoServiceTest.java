package com_test;

import com.ApplicationConfig;
import com.model.Auto;
import com.service.AutoService;
import custom_runner.CustomRunner;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

//@RunWith(JUnit4.class)
@RunWith(CustomRunner.class)
public class AutoServiceTest {
    private AutoService autoService;

    @Before
    public void init() {
        ApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        autoService = context.getBean("autoService", AutoService.class);
    }

    @Test
    public void testDrive() {
        List<Auto> autos = autoService.getAutos();
        Assert.assertNotNull(autos.get(0));
    }
}
