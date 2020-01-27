package com.annotationsPractice;

import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class RandomFortuneService implements FortuneService {
    //create array of strings
    private String[] data={
            "beware of the wolf in sheeps clothing",
            "deligence is the mother of good luck",
            "the journey is the reward"
    };
    private Random random= new Random();

    @Override
    public String getFortune() {
        //pick a random fortune

        int index=random.nextInt(data.length);
        String theFortune= data[index];
        return theFortune;
    }
}
