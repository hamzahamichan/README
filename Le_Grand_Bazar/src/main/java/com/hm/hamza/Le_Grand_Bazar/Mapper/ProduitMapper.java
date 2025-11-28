package com.hm.hamza.Le_Grand_Bazar.Mapper;

import com.hm.hamza.Le_Grand_Bazar.dto.DtoProduit;
import com.hm.hamza.Le_Grand_Bazar.entity.Produit;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")

public interface ProduitMapper {

    @Mapping(source = "categorie.id", target = "categorieId")
    DtoProduit toDto(Produit produit);

    @Mapping(source = "categorieId", target = "categorie.id")
    Produit toEntity(DtoProduit dto);
}
