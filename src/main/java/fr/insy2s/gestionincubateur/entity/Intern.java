package fr.insy2s.gestionincubateur.entity;


import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "intern")
public class Intern {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "intern_generator")
    @SequenceGenerator(name="intern_generator", sequenceName = "intern_seq", allocationSize=1, initialValue = 1000)
    @Column(name = "id_intern")
    private Long id;


    @NotNull(message = "Name is required")
    @NotBlank(message = "Name is required")
    @Column(name = "firstName",nullable = false,length = 25)
    private String firstName;


    @NotNull(message = "Lastname is required")
    @NotBlank(message = "Lastname is required")
    @Column(name = "lastName",nullable = false,length = 25)
    private String lastName;


    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is required")
    @Column(name = "email", unique = true,nullable = false ,length = 50)
    private String email;

    @NotNull(message = "archive is required")
    @NotBlank(message = "archive is required")
    @Column(name = "archive",nullable = false)
    private boolean archive;

    @NotNull(message = "arrival date is required")
    @NotBlank(message = "arrival date is required")
    @Column(name = "arrival_date",nullable = false)
    private Date arrivalDate;

    @Column(name = "release_date")
    private Date releaseDate;

    @OneToMany
    private List<Skill> skills;

    @OneToMany
    private List<Rate> rate;



}
