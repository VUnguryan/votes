package ua.step.balint.vote.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.step.balint.vote.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
