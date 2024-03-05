package com.proj.Sportathon.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.proj.Sportathon.customexceptions.ValueNotPresentException;
import com.proj.Sportathon.entities.Team;
import com.proj.Sportathon.repositories.TeamRepository;
import com.proj.Sportathon.response.Response;

import lombok.Data;

@Data
@Service
public class TeamService {
	
	@Autowired
	private TeamRepository teamRepository;


    public List<Team> getAllTeams() {
        return teamRepository.findAll();
    }

    public Optional<Team> getTeamById(Long id) {
        return teamRepository.findById(id);
    }

    public Team createTeam(Team team) {
        return teamRepository.save(team);
    }

    public Team updateTeam(Long id, Team team) {
        team.setId(id);
        return teamRepository.save(team);
    }

    public Response deleteTeam(Long id) throws Exception {
        if (!teamRepository.existsById(id)) {
            throw new ValueNotPresentException("Team with the specified ID does not exist");
        }
        
        teamRepository.deleteById(id);
        
        return new Response("Team deleted successfully");
    }
    
}
