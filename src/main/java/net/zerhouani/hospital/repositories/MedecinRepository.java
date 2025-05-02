package net.zerhouani.hospital.repositories;

import net.zerhouani.hospital.entities.Medecin;
import net.zerhouani.hospital.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedecinRepository extends JpaRepository<Medecin, Long> {
    Medecin findByNom(String nom);
}
