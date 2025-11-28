package com.hm.hamza.Le_Grand_Bazar.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ClientDto {
    private Long id;
    private String nom;
    private String email;
    private String telephone;
    private String adresse;
}