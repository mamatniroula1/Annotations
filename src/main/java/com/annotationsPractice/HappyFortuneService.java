package com.annotationsPractice;

import org.springframework.stereotype.Component;

@Component
public class HappyFortuneService implements FortuneService {
    @Override
    public String getFortune() {
        return "you will have a very good day.";
    }
}
