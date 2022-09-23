package edu.grupo05.agendarte.entity;

// Importing required classes
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// Annotations
@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long musicId;
    private String musicTitle;
    private String musicGenre;
    private String musicAuthor;
    private String musicDuration;
}
