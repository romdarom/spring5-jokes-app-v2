package com.monfollet.learning.springuru.spring5jokesappv2.jokes.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Service
public class JokeService {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    @Autowired
    public void setChuckNorrisQuotes(ChuckNorrisQuotes chuckNorrisQuotes) {
        this.chuckNorrisQuotes = chuckNorrisQuotes;
    }

    public String getNextJoke(){
        return chuckNorrisQuotes.getRandomQuote();
    }


}
