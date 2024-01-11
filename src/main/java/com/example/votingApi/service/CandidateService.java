package com.example.votingApi.service;

import com.example.votingApi.model.Candidate;

import java.util.HashMap;
import java.util.Map;

public class CandidateService {

    private static final Map<String, Candidate> candidates = new HashMap<>();

    public void enterCandidate(String name) {
        candidates.put(name, new Candidate(name));
    }


}
