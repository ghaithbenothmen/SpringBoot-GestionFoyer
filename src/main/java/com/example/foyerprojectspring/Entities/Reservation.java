package com.example.foyerprojectspring.Entities;

import java.util.Date;
import java.util.Set;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Reservation {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idReservation;

    private Date anneeUniversitaire;
    private boolean estValide;



    @ManyToMany(cascade = CascadeType.ALL)
    private Set<Etudiant> etudiants;
}
