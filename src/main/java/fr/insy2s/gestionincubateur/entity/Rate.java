package fr.insy2s.gestionincubateur.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "rate")
public class Rate {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_rate")
    private Long id;

    @Column(name = "comment", length = 1000)
    private String comment;

    @Max(value = 5)
    @Min(value = 0)
    @NotNull(message = "note is required")
    @NotBlank(message = "note is required")
    @Column(name = "note",nullable = false)
    private Float note;


    @NotNull(message = "date is required")
    @NotBlank(message = "date is required")
    @Column(name = "date",nullable = false)
    private Date date;







}
