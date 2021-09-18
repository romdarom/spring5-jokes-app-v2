package com.monfollet.learning.springuru.spring5jokesappv2.jokes.inbound;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.monfollet.learning.springuru.spring5jokesappv2.jokes.service.JokeService;

@Controller
public class JokeResource {

    private JokeService jokeService;

    public JokeResource(JokeService jokeService) {
        this.jokeService = jokeService;
    }

    @RequestMapping("/jokes")
    public String getNextJoke(Model model) {

        model.addAttribute("joke", this.jokeService.getNextJoke());
        return "joke";
    }

}
