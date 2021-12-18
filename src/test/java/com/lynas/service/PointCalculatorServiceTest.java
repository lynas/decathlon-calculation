package com.lynas.service;

import com.lynas.dto.ResultDTO;
import com.lynas.util.AppUtil;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PointCalculatorServiceTest {

    private PointCalculatorService service;

    @Before
    public void init(){
        AppUtil.loadApplicationConfig();
        service = new PointCalculatorService();
    }

    @Test
    public void calculateResultTotal() {
        ResultDTO resultDTO = new ResultDTO("Demo", 2.0, 3.0, 4.0, 5.5, 6.7, 8.8, 9.5, 1.5, 3.3, 2.0);
        ResultDTO calculatedResultDTO = service.calculateResultTotal(resultDTO);
        assertEquals(18579.0, calculatedResultDTO.getTotalScore(), 0.0);

    }

    @Test
    public void calculatePoint() {
        double aDouble = service.calculatePoint(5.0, 6.5, 7.5, 9.5);
        assertEquals(18939.0, aDouble, 0.0);
    }
}