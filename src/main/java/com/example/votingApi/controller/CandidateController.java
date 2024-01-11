package com.example.votingApi.controller;

import com.example.votingApi.service.CandidateService;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
public class CandidateController {

    private final CandidateService candidateService = new CandidateService();

    @PostMapping("/entercandidate")
    public void enterCandidate(@RequestParam String name) {
        candidateService.enterCandidate(name);
    }
    @GetMapping("/countvote")
    public Map<String,Integer> countVote(@RequestParam String name){
        int voteCount = candidateService.countVote(name);
        return Map.of("VoteCount",voteCount);
    }
    @GetMapping("/listvote")
    public Map<String,Integer> listVote(){
        return candidateService.listVote();
    }
    @PostMapping("/castvote")
    public Map<String,Integer> casteVote(@RequestParam String name){
        int voteCount = candidateService.castVote(name);
        return Map.of("voteCount",voteCount);
    }

}