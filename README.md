# VotingSystem

This repository contains the code for a simple voting API, built using Spring Boot.

Features
Candidate Management:
    Create new candidates.
    List all candidates and their vote counts.
Voting:
    Cast votes for candidates.
Results:
    Get the vote count for a specific candidate.
    List all candidates and their vote counts.
    Determine the winner of the election.
Getting Started
Clone the repository:
    https://github.com/15anil/VotingSystem.git
Import the project into your IDE.
Run the application:
    mvn spring-boot:run
API Endpoints
    POST /entercandidate: Enter a new candidate.
    GET /countvote/{name}: Get the vote count for a specific candidate.
    GET /listvote: List all candidates and their vote counts.
    POST /castvote/{name}: Cast a vote for a candidate.
    GET /getwinner: Get the winner of the election.
Technologies Used
    Java
    Spring Boot
    Maven
    Postman
Author
Anil Nemani:https://github.com/15anil
