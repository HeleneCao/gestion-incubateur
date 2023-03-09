package fr.insy2s.gestionincubateur.entity;


import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "assist")
public class Assist {

    @EmbeddedId
    AssistPK assistPK;

    @Column(name = "is_present")
    private Boolean isPresent;
}
