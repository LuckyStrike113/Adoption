package by.nursery.adoption.mapper;

import by.nursery.adoption.dto.OwnerDTO;
import by.nursery.adoption.model.Owner;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface OwnerMapper {

    OwnerDTO toDTO(Owner owner);

    Owner toEntity(OwnerDTO ownerDTO);

    List<OwnerDTO> toDTOList(List<Owner> owners);
}
