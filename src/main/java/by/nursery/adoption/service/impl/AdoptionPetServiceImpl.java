package by.nursery.adoption.service.impl;

import by.nursery.adoption.dto.AdoptionPetDTO;
import by.nursery.adoption.mapper.AdoptionPetMapper;
import by.nursery.adoption.model.AdoptionPet;
import by.nursery.adoption.repository.AdoptionPetRepository;
import by.nursery.adoption.service.AdoptionPetService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdoptionPetServiceImpl implements AdoptionPetService {

    @Autowired
    private final AdoptionPetRepository adoptionPetRepository;

    @Autowired
    private final AdoptionPetMapper adoptionPetMapper;

    public AdoptionPetServiceImpl(AdoptionPetRepository adoptionPetRepository,
        AdoptionPetMapper adoptionPetMapper) {
        this.adoptionPetRepository = adoptionPetRepository;
        this.adoptionPetMapper = adoptionPetMapper;
    }



    @Override
    public AdoptionPetDTO save(AdoptionPetDTO adoptionPetDTO) {
        return adoptionPetMapper.toDTO(
            adoptionPetRepository.save(adoptionPetMapper.toEntity(adoptionPetDTO)));
    }

    @Override
    public AdoptionPetDTO findById(Long id) {
        Optional<AdoptionPet> adoptionPet = adoptionPetRepository.findById(id);
        return adoptionPetMapper.toDTO(adoptionPet.get());
    }

    @Override
    public List<AdoptionPetDTO> findAll() {
        List<AdoptionPet> pets = adoptionPetRepository.findAll();
        return adoptionPetMapper.toDTOList(pets);
    }

    @Override
    public AdoptionPetDTO update(AdoptionPetDTO adoptionPetDTO) {
        return adoptionPetMapper.toDTO(
            adoptionPetRepository.save(adoptionPetMapper.toEntity(adoptionPetDTO)));
    }

    @Override
    public void delete(Long id) {
        adoptionPetRepository.deleteById(id);
    }
}
