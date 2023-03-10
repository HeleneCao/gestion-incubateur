package fr.insy2s.gestionincubateur.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "formation")
public class Formations {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "formation_generator")
    @SequenceGenerator(name="formation_generator", sequenceName = "formation_seq", allocationSize=1, initialValue = 1000)
    @Column(name = "id_formation")
    private Long id;

    @NotBlank(message = "label is required")
    @NotNull(message = "label is required")
    @Column(name = "label", nullable = false, unique = true , length = 50)
    private String label;

    @ManyToOne
    private Intern intern;

    @ManyToOne
    private Status status;



}
