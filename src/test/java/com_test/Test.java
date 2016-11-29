package com_test;

import com.model.Auto;
import com.repository.AutoRepositoryImpl;
import com.service.AutoService;
import com.service.AutoServiceImpl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import java.util.ArrayList;
import java.util.List;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@RunWith(JUnit4.class)
public class Test {

    private AutoService autoService;

    @Before
    public void makePreparationl() {
        autoService = new AutoServiceImpl(new AutoRepositoryImpl());
    }

    @org.junit.Test
    public void getAutoTest() {
        List<Auto> autos = autoService.getAutos();
        Assert.assertNotNull(autos.get(0));
    }

    @org.junit.Test
    public void checGetAuto() {
        List<Auto> audios = new ArrayList<Auto>(1);
        audios.add(new Auto("test", 1.1, 2.2, 3.3));
        AutoService autoService = mock(AutoService.class);
        when(autoService.getAutos()).thenReturn((List<Auto>) audios);
    }
}
