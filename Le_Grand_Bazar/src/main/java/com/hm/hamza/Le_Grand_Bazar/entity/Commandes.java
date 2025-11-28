package com.hm.hamza.Le_Grand_Bazar.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "commande_items")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Commandes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "produit_id")
    private Produit produit;

    @ManyToOne
    @JoinColumn(name = "commande_id")
    private Commande commande;

    private Integer quantite;
    private double prixUnitaire;
    private double prixTotal;
}
