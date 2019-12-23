package com.mvc.basic.dto;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "tbl_Cricket")
public class CricketTeam  implements Serializable{
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "TEAM_NAME")
	private String teamName; 
	
	@Column(name = "JERSEY_COLOR")
	private String jerseyColor; 
	
	@Column(name = "TEAM_CITY")
	private String teamCity; 
	
	@Column(name = "COACH_NAME")
	private String coachName;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTeamName() {
		return teamName;
	}

	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}

	public String getJerseyColor() {
		return jerseyColor;
	}

	public void setJerseyColor(String jerseyColor) {
		this.jerseyColor = jerseyColor;
	}

	public String getTeamCity() {
		return teamCity;
	}

	public void setTeamCity(String teamCity) {
		this.teamCity = teamCity;
	}

	public String getCoachName() {
		return coachName;
	}

	public void setCoachName(String coachName) {
		this.coachName = coachName;
	}

	public CricketTeam() {
		super();
	}

	@Override
	public String toString() {
		return "CricketTeam [id=" + id + ", teamName=" + teamName + ", jerseyColor=" + jerseyColor + ", teamCity="
				+ teamCity + ", coachName=" + coachName + "]";
	}
	
	

}
