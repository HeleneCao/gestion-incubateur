package fr.insy2s.gestionincubateur.entity;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
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
@Table(name = "team")
public class Team {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id_team")
    private Long id;


    @NotNull(message = "Name is required")
    @NotBlank(message = "Name is required")
    @Column(name = "name",nullable = false,length = 20,unique = true)
    private String name;

    @NotNull(message = "creation date is required")
    @NotBlank(message = "creation date is required")
    @Column(name = "creation_date",nullable = false)
    private Date creationDate;

    @NotNull(message = "archive is required")
    @NotBlank(message = "archive is required")
    @Column(name = "archive",nullable = false)
    private boolean archive;

    @Column(name = "url_repository")
    private String urlRepository;

    @Column(name = "url_backlog")
    private String urlBacklog;

    @OneToMany
    private List<Intern> listIntern;

    @OneToMany
    private List<Skill> skills;





}
