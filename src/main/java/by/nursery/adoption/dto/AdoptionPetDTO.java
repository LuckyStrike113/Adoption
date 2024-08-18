package by.nursery.adoption.dto;

import by.nursery.adoption.model.Owner;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class AdoptionPetDTO {
    private Long id;
    private Owner owner;
    private Long petId;
    private Long petInfoId;
    private LocalDate date;
}
