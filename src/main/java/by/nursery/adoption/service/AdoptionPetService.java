package by.nursery.adoption.service;

import by.nursery.adoption.dto.AdoptionPetDTO;

import java.util.List;

public interface AdoptionPetService {
    AdoptionPetDTO save(AdoptionPetDTO adoptionPetDTO);
    AdoptionPetDTO findById(Long id);
    List<AdoptionPetDTO> findAll();
    AdoptionPetDTO update(AdoptionPetDTO adoptionPetDTO);
    void delete(Long id);
}
