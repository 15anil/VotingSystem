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
    public Map<String,Integer> countVote(@RequestParam String name){
        int voteCount = candidateService.castVote(name);
        return Map.of("VoteCount",voteCount);
    }
}