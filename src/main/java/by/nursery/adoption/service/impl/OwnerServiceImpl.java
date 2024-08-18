package by.nursery.adoption.service.impl;

import by.nursery.adoption.dto.OwnerDTO;
import by.nursery.adoption.mapper.OwnerMapper;
import by.nursery.adoption.model.Owner;
import by.nursery.adoption.repository.OwnerRepository;
import by.nursery.adoption.service.OwnerService;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class OwnerServiceImpl implements OwnerService {

    @Autowired
    private final OwnerRepository ownerRepository;

    @Autowired
    private final OwnerMapper ownerMapper;

    public OwnerServiceImpl(OwnerRepository ownerRepository, OwnerMapper ownerMapper) {
        this.ownerRepository = ownerRepository;
        this.ownerMapper = ownerMapper;
    }

    @Override
    public OwnerDTO save(OwnerDTO ownerDTO) {
        return ownerMapper.toDTO(
            ownerRepository.save(ownerMapper.toEntity(ownerDTO)));
    }

    @Override
    public OwnerDTO findById(Long id) {
        Optional<Owner> optionalOwner = ownerRepository.findById(id);
        return ownerMapper.toDTO(optionalOwner.get());
    }

    @Override
    public List<OwnerDTO> findAll() {
        List<Owner> owners = ownerRepository.findAll();
        return ownerMapper.toDTOList(owners);
    }

    @Override
    public OwnerDTO update(OwnerDTO ownerDTO) {
        return ownerMapper.toDTO(
            ownerRepository.save(ownerMapper.toEntity(ownerDTO)));
    }

    @Override
    public void delete(Long id) {
        ownerRepository.deleteById(id);
    }
}
