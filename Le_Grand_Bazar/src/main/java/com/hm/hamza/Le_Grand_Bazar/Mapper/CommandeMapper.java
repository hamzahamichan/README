package com.hm.hamza.Le_Grand_Bazar.Mapper;

import ch.qos.logback.core.model.ComponentModel;
import com.hm.hamza.Le_Grand_Bazar.dto.DtoCommande;
import com.hm.hamza.Le_Grand_Bazar.entity.Commande;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


 @Mapper(componentModel = "spring")
public interface CommandeMapper {
    @Mapping(source = "client.id", target = "clientId")
    DtoCommande toDto(Commande commande);

    @Mapping(source = "clientId", target = "client.id")
    Commande toEntity(DtoCommande dto);
}
