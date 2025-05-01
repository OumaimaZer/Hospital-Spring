package net.zerhouani.hospital.entities;

import java.util.Date;

public class RendezVous {
    private Long id;
    private Date date;
    private StatusRDV annule;
    private Patient patient;
    private Medecin medecin;
}