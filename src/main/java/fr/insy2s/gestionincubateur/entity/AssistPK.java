package fr.insy2s.gestionincubateur.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Data
@Embeddable
public class AssistPK implements Serializable {

    @Column(name = "id_review")
    private int idReview;

    @Column(name = "id_intern")
    private int idIntern;

}
