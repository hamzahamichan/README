package com.hm.hamza.Le_Grand_Bazar.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

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
    private Produit produit;


    private Integer quantite;
    private double prixUnitaire;
    private double prixTotal;
}

