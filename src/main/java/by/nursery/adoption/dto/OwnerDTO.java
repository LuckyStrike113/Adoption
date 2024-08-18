package by.nursery.adoption.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class OwnerDTO {
    private Long id;
    private String name;
    private String address;
    private String telephoneNumber;
}
