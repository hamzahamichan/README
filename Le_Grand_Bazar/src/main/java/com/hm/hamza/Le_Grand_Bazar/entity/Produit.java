package com.hm.hamza.Le_Grand_Bazar.entity;

import com.hm.hamza.Le_Grand_Bazar.Enum.StatutProduit;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Entity
@Table(name = "produits")
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

    @Enumerated(EnumType.STRING)
    private StatutProduit statuts;

    @ManyToOne
    @JoinColumn(name = "categorie_id")
    private Categorie categorie;
}
