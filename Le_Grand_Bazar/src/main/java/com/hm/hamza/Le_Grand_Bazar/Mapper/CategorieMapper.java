package com.hm.hamza.Le_Grand_Bazar.Mapper;


import com.hm.hamza.Le_Grand_Bazar.dto.CategorieDto;
import com.hm.hamza.Le_Grand_Bazar.entity.Categorie;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CategorieMapper {

    CategorieDto toDto(Categorie categorie);

    Categorie toEntity(CategorieDto dto);

}
