package com.hm.hamza.Le_Grand_Bazar.entity;

import com.hm.hamza.Le_Grand_Bazar.Enum.StatutCommande;
import com.hm.hamza.Le_Grand_Bazar.Enum.StatutProduit;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "categories")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;


    @Column(nullable = false)
    private String nom;


    @Column(length = 2000)
    private String description;


    @Column(nullable = false)
    private double prix;


    private double quantiteStock;


    private String imageUrl;


    private LocalDateTime dateAjout;
    private StatutProduit statuts;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;
}
