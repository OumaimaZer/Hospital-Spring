package net.zerhouani.hospital.entities;

import java.util.Collection;
import java.util.Collections;
import java.util.Date;

@Entity
public class Patient {
    private Long id;
    private String nom;
    private Date dateNaissance;
    private boolean malade;
    private Collection<RendezVous> redezVous;
}