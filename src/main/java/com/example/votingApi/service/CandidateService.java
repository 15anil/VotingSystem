package com.example.votingApi.service;

import com.example.votingApi.model.Candidate;

import java.util.HashMap;
import java.util.Map;

public class CandidateService {

    private static final Map<String, Candidate> candidates = new HashMap<>();

    public void enterCandidate(String name) {
        candidates.put(name, new Candidate(name));
    }
    public int castVote(String name) {
        validateCandidate(name);
        Candidate candidate = candidates.get(name);
        candidate.incrementVoteCount();
        return candidate.getVoteCount();
    }
    private void validateCandidate(String name) {
        if (!candidates.containsKey(name)) {
            throw new IllegalArgumentException("Invalid candidate name");
        }
    }//this method is used for validating the candidate by checking if they contain name



}
