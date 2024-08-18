package by.nursery.adoption.mapper;

import by.nursery.adoption.dto.AdoptionPetDTO;
import by.nursery.adoption.model.AdoptionPet;
import java.util.List;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AdoptionPetMapper {

    AdoptionPetDTO toDTO(AdoptionPet adoptionPet);

    AdoptionPet toEntity(AdoptionPetDTO adoptionPetDTO);

    List<AdoptionPetDTO> toDTOList(List<AdoptionPet> adoptionPetList);
}
