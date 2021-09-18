package com.monfollet.learning.springuru.spring5jokesappv2.jokes.outbound;

import javax.annotation.PostConstruct;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

@Configuration
public class ChuckNorrisConfig {

    private ChuckNorrisQuotes chuckNorrisQuotes;

    @PostConstruct
    public void init(){
        chuckNorrisQuotes = new ChuckNorrisQuotes();
    }

    @Bean
    ChuckNorrisQuotes chuckNorrisQuotesGenerator(){
        return chuckNorrisQuotes;
    }
}
