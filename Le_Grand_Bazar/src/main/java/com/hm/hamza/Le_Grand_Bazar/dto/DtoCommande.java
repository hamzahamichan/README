package com.hm.hamza.Le_Grand_Bazar.dto;

import com.hm.hamza.Le_Grand_Bazar.Enum.StatutCommande;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.util.List;
@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
public class DtoCommande {
    private Long id;
    private Long clientId;
    private LocalDateTime dateCommande;
    private double total;
    private StatutCommande statut;
    private List<DtoCommandes> lignes;
}
