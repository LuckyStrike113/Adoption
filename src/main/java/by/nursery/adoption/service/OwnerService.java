package by.nursery.adoption.service;

import by.nursery.adoption.dto.OwnerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface OwnerService {

    OwnerDTO save(OwnerDTO ownerDTO);
    OwnerDTO findById(Long id);
    List<OwnerDTO> findAll();
    OwnerDTO update(OwnerDTO ownerDTO);
    void delete(Long id);
}
