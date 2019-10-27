package com.example.demostarterjoker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author Evgeny Borisov
 */

public class ChuckNorrisQuoterService {

    @Autowired
    private ChuckNorris chuckNorris;

    @Scheduled(fixedDelay = 500)
    public void printQuote() {
        System.out.println(chuckNorris.getQuote());
    }
}
