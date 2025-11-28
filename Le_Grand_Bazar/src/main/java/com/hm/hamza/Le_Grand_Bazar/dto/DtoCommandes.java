package com.hm.hamza.Le_Grand_Bazar.dto;

import com.hm.hamza.Le_Grand_Bazar.entity.Produit;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DtoCommandes {

    private Long id;
    private Produit produit;
    private Integer quantite;
    private double prixUnitaire;
    private double prixTotal;
}
