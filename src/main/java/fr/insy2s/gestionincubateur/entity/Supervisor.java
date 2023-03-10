package fr.insy2s.gestionincubateur.entity;


import fr.insy2s.gestionincubateur.annotation.Password;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "supervisor")
public class Supervisor {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "supervisor_generator")
    @SequenceGenerator(name="supervisor_generator", sequenceName = "supervisor_seq", allocationSize=1, initialValue = 1000)
    @Column(name = "id_supervisor")
    private Long id;


    @NotNull(message = "Name is required")
    @NotBlank(message = "Name is required")
    @Column(name = "firstName",nullable = false,length = 20)
    private String firstName;

    @NotNull(message = "Lastname is required")
    @NotBlank(message = "Lastname is required")
    @Column(name = "lastName",nullable = false,length = 20)
    private String lastName;

    @Email(message = "Email should be valid")
    @NotBlank(message = "Email is required")
    @Column(name = "email", unique = true, nullable = false ,length = 50)
    private String email;

    @NotNull(message = "archive is required")
    @NotBlank(message = "archive is required")
    @Column(name = "archive",nullable = false)
    private boolean archive;

    @Password
    @Column(name = "password")
    private String password;

    @OneToMany
    private List<Skill> skills;

    @ManyToOne
    private Role role;



}
