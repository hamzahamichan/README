package com.hm.hamza.Le_Grand_Bazar.Mapper;

import com.hm.hamza.Le_Grand_Bazar.dto.DtoCommandes;
import com.hm.hamza.Le_Grand_Bazar.entity.Commandes;
import org.mapstruct.Mapping;

public interface CommandesMapper {
    @Mapping(source = "produit.id", target = "produitId")
    DtoCommandes toDto(Commandes ligne);

    @Mapping(source = "produitId", target = "produit.id")
    Commandes toEntity(DtoCommandes dto);
}
