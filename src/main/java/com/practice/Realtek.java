package com.practice;

import org.springframework.stereotype.Component;
@Component
public class Realtek implements MobileProcessor
{
    @Override
    public void process() {
        System.out.println("World Second Best");
    }
}
