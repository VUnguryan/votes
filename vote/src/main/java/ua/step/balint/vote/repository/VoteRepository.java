package ua.step.balint.vote.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.step.balint.vote.model.Vote;

public interface VoteRepository extends JpaRepository<Vote, Long>{

}
