package by.nursery.adoption.controller;

import by.nursery.adoption.dto.AdoptionPetDTO;
import by.nursery.adoption.service.AdoptionPetService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/adoption")
public class AdoptionPetController {

    @Autowired
    private final AdoptionPetService adoptionPetService;

    @GetMapping(value = {"/{id}", "/{id}/"})
    public AdoptionPetDTO get(@PathVariable Long id) {
        return adoptionPetService.findById(id);
    }

    @GetMapping(value = {"", "/"})
    public List<AdoptionPetDTO> getAll() {
        return adoptionPetService.findAll();
    }

    @PostMapping(value = {"", "/"})
    public void save(@RequestBody AdoptionPetDTO adoptionPetDTO) {
        adoptionPetService.save(adoptionPetDTO);
    }

    @PutMapping(value = {"", "/"})
    public AdoptionPetDTO update(@RequestBody AdoptionPetDTO adoptionPetDTO){
        return adoptionPetService.update(adoptionPetDTO);
    }

    @DeleteMapping(value = {"/{id}", "/{id}/"})
    public void delete(@PathVariable Long id){
        adoptionPetService.delete(id);
    }

}
