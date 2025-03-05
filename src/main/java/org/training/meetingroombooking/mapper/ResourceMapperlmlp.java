package org.training.meetingroombooking.mapper;

import org.mapstruct.Mapper;
import org.training.meetingroombooking.dto.ResourceDTO;
import org.training.meetingroombooking.entity.Resource;

@Mapper(componentModel = "spring")
interface ResourceMapper {
    ResourceDTO toDTO(Resource resource);

    Resource toEntity(ResourceDTO resourceDTO);
}
