package ua.step.balint.vote.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import ua.step.balint.vote.repository.VoteRepository;

@Controller
public class VoteController {
	@Autowired
	private VoteRepository voteRepository;

	@GetMapping("/votes")
	public String getVotes(@PageableDefault(size = 20, sort = "name") Pageable pageable,
			Model model) {
		model.addAttribute("votes", voteRepository.findAll(pageable));
		return "votes";
	}
}
