package org.training.meetingroombooking.mapper;

import org.mapstruct.*;
import org.mapstruct.factory.Mappers;
import org.training.meetingroombooking.dto.ResourceDTO;
import org.training.meetingroombooking.entity.Resource;

@Mapper(componentModel = "spring")
public interface resourceMapper {
    resourceMapper INSTANCE = Mappers.getMapper(resourceMapper.class);

    ResourceDTO toDTO(Resource resource);

    Resource toEntity(ResourceDTO resourceDTO);
}
