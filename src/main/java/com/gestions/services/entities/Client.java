package com.gestions.services.entities;

import com.gestions.services.generic.AbstractEntity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Client")
public class Client extends AbstractEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOM", length = 255)
    private String nom;

    @Column(name = "PRENOM", length = 255)
    private String prenom;

    @Column(name = "RAISON_SOCIALE", length = 255)
    private String raisonSociale;
}
