package com.main.controller;

import com.main.model.Match;
import com.main.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/match")
@CrossOrigin("*")
public class MatchController {

    @Autowired
    private MatchService matchService;

    @GetMapping("/live")
    public ResponseEntity<List<Match>> getLiveMatches(){
        return new ResponseEntity<>(this.matchService.getLiveMatches(), HttpStatus.OK);
    }


    //   get all matches

    @GetMapping("/allMatches")
    public ResponseEntity<List<Match>> getAllMatches(){
        return new ResponseEntity<>(this.matchService.getAllMatches(),HttpStatus.OK);
    }


    //  get point table
    @GetMapping("/pointTable")
    public ResponseEntity<?> getPointTable(){
        return new ResponseEntity<>(this.matchService.getPointTable(), HttpStatus.OK);
    }
}
