package net.zerhouani.hospital;

import net.zerhouani.hospital.entities.*;
import net.zerhouani.hospital.repositories.ConsultationRepository;
import net.zerhouani.hospital.repositories.MedecinRepository;
import net.zerhouani.hospital.repositories.PatientRepository;
import net.zerhouani.hospital.repositories.RendezVousRepository;
import net.zerhouani.hospital.service.IHospitalService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Date;
import java.util.stream.Stream;

@SpringBootApplication
public class HospitalApplication{

	public static void main(String[] args) {

		SpringApplication.run(HospitalApplication.class, args);
	}

	@Bean
	/** CommandLineRunner start(
			PatientRepository patientRepository,
			MedecinRepository medecinRepository,
			RendezVousRepository rendezVousRepository,
			ConsultationRepository consultationRepository){ **/
	CommandLineRunner start(IHospitalService hospitalService, PatientRepository patientRepository,
							MedecinRepository medecinRepository, RendezVousRepository rendezVousRepository,
							ConsultationRepository consultationRepository) {
		return args -> {
			//patientRepository.save(new Patient(null,"Hassan", new Date(), false, null));
			Stream.of("Mohammed", "Hassan", "Najat")
					.forEach(name -> {
						Patient patient = new Patient();
						patient.setNom(name);
						patient.setDateNaissance(new Date());
						patient.setMalade(false);
						hospitalService.save(patient);
					});
			Stream.of("Aymane", "Hanane", "Yasmine")
					.forEach(name -> {
						Medecin medecin = new Medecin();
						medecin.setNom(name);
						medecin.setEmail(name+"@gmail.com");
						medecin.setSpecialite(Math.random()>0.5?"Cardio":"Dentiste");
						hospitalService.save(medecin);
					});

			Patient patient=patientRepository.findById(1L).orElse(null);
			Patient patient1=patientRepository.findByNom("Mohammed");

			Medecin medecin=medecinRepository.findByNom("yasmine");

			RendezVous rendezVous=new RendezVous();
			rendezVous.setDate(new Date());
			rendezVous.setStatus(StatusRDV.PENDING);
			rendezVous.setMedecin(medecin);
			rendezVous.setPatient(patient);
			RendezVous saveRDV = hospitalService.save(rendezVous);
			System.out.println("ID : "+saveRDV.getId() );

			//RendezVous rendezVous1=rendezVousRepository.findById(1L).orElse(null);
			RendezVous rendezVous1=rendezVousRepository.findAll().get(0);
			Consultation consultation=new Consultation();
			consultation.setDateConsultation(new Date());
			consultation.setRendezVous(rendezVous1);
			consultation.setRapport("Rapport de la consultation...");
			hospitalService.save(consultation);
		};
	}

}
