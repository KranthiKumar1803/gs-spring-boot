package com.example.servcies;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
public class EvenOrOddService {

    public String checkEvenOrOdd(Integer num){

        return num % 2 == 0 ? "Even" : "Odd";
    }
}
