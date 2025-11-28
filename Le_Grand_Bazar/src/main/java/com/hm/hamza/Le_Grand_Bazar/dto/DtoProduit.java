package com.hm.hamza.Le_Grand_Bazar.dto;

import com.hm.hamza.Le_Grand_Bazar.Enum.StatutProduit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor @NoArgsConstructor
@Data
@Builder

public class DtoProduit {
    private Long id;
    private String nom;
    private String description;
    private double prix;
    private int quantite;
    private String imageUrl;
    private StatutProduit statut;
    private Long categorieId;
}
