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
@Table(name = "status")
public class Status {

    @Id
    @NotBlank(message = "label is required")
    @NotNull(message = "label is required")
    @Column(name = "label",nullable = false,length = 20,unique = true)
    private String label;

}
