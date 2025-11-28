package com.hm.hamza.Le_Grand_Bazar.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Table(name = "clients")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nom;
    private String prenom;

    @Column(nullable = false, unique = true)
    private String email;

    private String telephone;
    private String adresse;

    private String motDePasse;

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Commande> commandes;
}
