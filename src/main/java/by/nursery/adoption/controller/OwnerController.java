package by.nursery.adoption.controller;

import by.nursery.adoption.dto.OwnerDTO;
import by.nursery.adoption.service.OwnerService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/owner")
public class OwnerController {

    @Autowired
    private final OwnerService ownerService;

    @GetMapping(value = {"/{id}", "/{id}/"})
    public OwnerDTO getOwner(@PathVariable Long id) {
        return ownerService.findById(id);
    }

    @GetMapping(value = {"", "/"})
    public List<OwnerDTO> getAllOwners() {
        return ownerService.findAll();
    }

    @PostMapping(value = {"", "/"})
    public void save(@RequestBody OwnerDTO ownerDTO) {
        ownerService.save(ownerDTO);
    }

    @PutMapping(value = {"", "/"})
    public OwnerDTO updateOwner(@RequestBody OwnerDTO ownerDTO){
        return ownerService.update(ownerDTO);
    }

    @DeleteMapping(value = {"/{id}", "/{id}/"})
    public void deleteOwner(@PathVariable Long id){
        ownerService.delete(id);
    }
}
