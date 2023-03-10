package fr.insy2s.gestionincubateur.entity;

import jakarta.persistence.*;
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
@Table(name = "review")
public class Review {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "review_generator")
    @SequenceGenerator(name="review_generator", sequenceName = "review_seq", allocationSize=1, initialValue = 1000)
    @Column(name = "id_review")
    private Long id;

    @NotBlank(message = "date is required")
    @NotNull(message = "date is required")
    @Column(name = "date",nullable = false)
    private Date date;


    @Column(name = "comment",length = 1000)
    private String comment;

    @ManyToOne
    private Team team;



}
