package com.example.backenddeveloperpracticaltest.util;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@RequiredArgsConstructor
public class AutoGeneratedAccountNumber {
    private Random random = new Random();
    public String getAccountNumber(){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            stringBuilder.append(random.nextInt(9));
        }
        return  stringBuilder.toString();
    }
}
