package com.example.demo;

import org.springframework.web.bind.annotation.*;
import java.util.*;

@RestController
@RequestMapping("/api")
public class NumberGuessingController {
    private int secretNumber;
    private int totalGuesses;
    private List<Integer> history = new ArrayList<>();

    @PostMapping("/start")
    public String startGame(@RequestParam("guesses") int guesses) {
        this.secretNumber = new Random().nextInt(100) + 1;
        this.totalGuesses = guesses;
        this.history.clear();
        return "Game Started";
    }

    @PostMapping("/guess")
    public Map<String, Object> processGuess(@RequestParam("num") int num) {
        Map<String, Object> response = new HashMap<>();
        history.add(num);
        
        if (num == secretNumber) {
            response.put("result", "WIN");
            response.put("message", "🎉 Congratulations! You guessed it!");
        } else if (history.size() >= totalGuesses) {
            response.put("result", "LOSE");
            response.put("message", "💀 Game Over! The number was " + secretNumber);
        } else {
            response.put("result", "CONTINUE");
            response.put("hint", num < secretNumber ? "Higher!" : "Lower!");
        }
        response.put("history", history);
        return response;
    }
}