package net.zerhouani.hospital.service;

import net.zerhouani.hospital.entities.Consultation;
import net.zerhouani.hospital.entities.Medecin;
import net.zerhouani.hospital.entities.Patient;
import net.zerhouani.hospital.entities.RendezVous;
import net.zerhouani.hospital.repositories.ConsultationRepository;
import net.zerhouani.hospital.repositories.MedecinRepository;
import net.zerhouani.hospital.repositories.PatientRepository;
import net.zerhouani.hospital.repositories.RendezVousRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.UUID;

@Service
@Transactional
public class IHospitalServiceImpl implements IHospitalService {
    private PatientRepository patientRepository;
    private MedecinRepository medecinRepository;
    private RendezVousRepository rendezVousRepository;
    private ConsultationRepository consultationRepository;

    public IHospitalServiceImpl(PatientRepository patientRepository, MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository, ConsultationRepository consultationRepository) {
        this.patientRepository = patientRepository;
        this.medecinRepository = medecinRepository;
        this.rendezVousRepository = rendezVousRepository;
        this.consultationRepository = consultationRepository;
    }


    @Override
    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }

    @Override
    public Medecin save(Medecin medecin) {
        return medecinRepository.save(medecin);
    }

    @Override
    public RendezVous save(RendezVous rendezVous) {
        rendezVous.setId(UUID.randomUUID().toString());
        return rendezVousRepository.save(rendezVous);
    }

    @Override
    public Consultation save(Consultation consultation) {
        return consultationRepository.save(consultation);
    }
}
