package com.hm.hamza.Le_Grand_Bazar.Mapper;


import com.hm.hamza.Le_Grand_Bazar.dto.ClientDto;
import com.hm.hamza.Le_Grand_Bazar.entity.Client;

import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClientMapper {

   ClientDto toDto(Client client);

   Client toEntity(ClientDto dto);
}