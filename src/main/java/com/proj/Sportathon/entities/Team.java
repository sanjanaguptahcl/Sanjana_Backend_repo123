package com.proj.Sportathon.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="team_details")
public class Team {
	@Id
    private Long id;
    private String name;
    private String sports;
    private Integer members;

}

