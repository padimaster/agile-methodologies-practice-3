package com.app.utils;

import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class CalculatorTest {
    @Test
    public void testAdd(){
        System.out.println("testAdd");
        when(Calculator.add(10.0, 20.0)).thenReturn(30.00);
    }
}