package com.example.demo.persistance.entities;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;
@Entity
public class Reservation implements Serializable{

	  @Id 
	  @GeneratedValue(strategy = GenerationType.IDENTITY)
	  private Long id;
	  @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	  private LocalDateTime date_debut;
	  @JsonFormat(pattern = "dd-MM-yyyy HH:mm:ss")
	  private LocalDateTime date_fin;
	  
	  
	  
	public Reservation() {
		super();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDate_debut() {
		return date_debut;
	}

	public void setDate_debut(LocalDateTime date_debut) {
		this.date_debut = date_debut;
	}

	public LocalDateTime getDate_fin() {
		return date_fin;
	}

	public void setDate_fin(LocalDateTime date_fin) {
		this.date_fin = date_fin;
	}

	public Reservation(Long id, LocalDateTime date_debut, LocalDateTime date_fin) {
		super();
		this.id = id;
		this.date_debut = date_debut;
		this.date_fin = date_fin;
	}
	  
}
