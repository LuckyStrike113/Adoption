package by.nursery.adoption.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

/**
 * Регистрация усыновления питомца
 *
 * @author Nazar Darvesh
 */
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@Entity
public class AdoptionPet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "owner_id", nullable = false)
    private Owner owner;

    @Column(name = "pet_id", nullable = false)
    private Long petId;

    @Column(name = "pet_info_id", nullable = false)
    private Long petInfoId;

    @Column(name = "date", nullable = false)
    private LocalDate date;
}
