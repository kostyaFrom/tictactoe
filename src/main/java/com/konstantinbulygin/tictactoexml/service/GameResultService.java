package com.konstantinbulygin.tictactoexml.service;

import com.konstantinbulygin.tictactoexml.model.GameResult;
import com.konstantinbulygin.tictactoexml.repository.GameResultRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameResultService {

    @Autowired
    GameResultRepository gameResultRepository;

    public void save(GameResult gameResult) {
        gameResultRepository.save(gameResult);
    }

    public List<GameResult> findAll() {
        return gameResultRepository.findAll();
    }
}
