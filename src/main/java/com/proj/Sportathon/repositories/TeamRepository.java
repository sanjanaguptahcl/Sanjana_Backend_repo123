package com.proj.Sportathon.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.proj.Sportathon.entities.Team;


@Repository
public interface TeamRepository extends JpaRepository<Team,Long> {

}
