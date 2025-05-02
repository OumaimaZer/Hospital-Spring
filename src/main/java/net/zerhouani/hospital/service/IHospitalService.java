package net.zerhouani.hospital.service;

import net.zerhouani.hospital.entities.Consultation;
import net.zerhouani.hospital.entities.Medecin;
import net.zerhouani.hospital.entities.Patient;
import net.zerhouani.hospital.entities.RendezVous;

public interface IHospitalService {
    Patient save(Patient patient);
    Medecin save(Medecin medecin);
    RendezVous save(RendezVous rendezVous);
    Consultation save(Consultation consultation);
}
