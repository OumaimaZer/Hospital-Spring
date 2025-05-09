# Rapport "Use case JPA, Hibernate Spring Data, One To Many, One To One", réalisée par Mr.Mohamed Youssfi
La vidéo offre une démonstration pratique de la mise en œuvre des relations One-to-One et One-to-Many en utilisant JPA, Hibernate et Spring Data JPA dans une application de Consultation médicale. Nous avons utilisé plusieures entités, dont : Patient, Médecin, RendezVous et Consultation. Cette application va permettre de suivre un rendez-vous qu'un patient peut prendre chez un médecin ainsi sa consultation.

### Lien : https://www.youtube.com/watch?v=Kfv_7m8INlU

### Contenu de la vidéo :
Cette vidéo didactique m'a guidé à travers la création d'une application de consultation médicale avec Java intégrant JPA et Hibernate pour gérer des relations entre entités. Elle couvre les étapes suivantes :
  -  Configuration du projet : Mise en place d'un projet Spring Boot avec les dépendances nécessaires pour JPA et Hibernate.
  -  Définition des entités : Création des classes d'entités représentant les tables de la base de données, avec annotations pour spécifier les relations One-to-One et One-to-Many.
  -  Création des repositories : Utilisation de Spring Data JPA pour créer des interfaces de repository permettant les opérations CRUD sur les entités.
  -  Implémentation des services : Développement des services pour gérer la logique métier, incluant la gestion des relations entre entités.
  -  Tests et démonstration : Exécution de l'application pour démontrer le fonctionnement des relations et la persistance des données.

### Application :
Ce projet est une application Spring Boot destinée à la gestion des patients, des médecins, des rendez-vous et des consultations dans un hôpital. Il utilise Hibernate pour la persistance des données via JPA (Java Persistence API) et expose des endpoints RESTful pour interagir avec les entités.

#### Technologies Utilisées :
  - Spring Boot :Cadre de développement pour faciliter la création d'applications Java.
  - Hibernate/JPA :Persistance des données via JPA pour interagir avec la base de données.
  - Lombok :Simplifie la génération de code boilerplate (getters, setters, constructeurs, etc.).
  - Spring Data JPA :Facilite la création et l'utilisation des répositories pour les opérations CRUD.
  - Spring Service Layer :Couche de service pour encapsuler la logique métier.
  - Spring Web :Expose des endpoints RESTful pour interagir avec l'application.

#### Packages :
Le package principal est net.zerhouani.hospital, qui contient toutes les classes et fichiers nécessaires pour le fonctionnement de l'application. Les packages secondaires sont : 
  - entities : Contient les classes d'entité (Patient, Medecin, RendezVous, Consultation, StatusRDV).
  - repositories : Contient les interfaces de répository pour chaque entité.
  - service : Contient les interfaces et implémentations des services (IHospitalService et IHospitalServiceImpl).
  - web : Contient les contrôleurs RESTful pour exposer les endpoints.
  - HospitalApplication : Classe principale de démarrage de l'application Spring Boot.

#### Classes :
  - Patient.java : Représente un patient avec son nom, sa date de naissance et son statut (malade ou non).
  - Medecin.java : Représente un médecin avec son nom, son email et sa spécialité.
  - RendezVous.java : Modélise un rendez-vous médical entre un patient et un médecin, avec une date et un statut.
  - Consultation.java : Représente une consultation médicale liée à un rendez-vous, incluant un rapport écrit.
  - StatusRDV.java : Enumération qui définit les statuts possibles d’un rendez-vous (PENDING, CANCELLED, DONE).
  - PatientRepository.java : Interface Spring Data pour accéder aux données des patients dans la base.
  - MedecinRepository.java : Interface Spring Data pour gérer les opérations CRUD sur les médecins.
  - RendezVousRepository.java : Interface Spring Data pour manipuler les rendez-vous depuis la base de données.
  - ConsultationRepository.java : Interface Spring Data pour gérer les consultations.
  - IHospitalService.java : Interface définissant les méthodes de service pour sauvegarder différentes entités.
  - IHospitalServiceImpl.java : Implémentation des méthodes de IHospitalService utilisant les répositories.
  - PatientRestController.java : Contrôleur REST exposant une API pour récupérer la liste des patients.
  - HospitalApplication.java : Classe principale lançant l’application Spring Boot et initialisant des données.

#### Fonctionnalités Implémentées :
 - Création et Sauvegarde des Entités :Les entités (Patient, Medecin, RendezVous, Consultation) peuvent être créées et sauvegardées dans la base de données via les services.
 - *Relation One-to-Many* : C’est une association où un objet d’une entité est lié à plusieurs objets d’une autre entité .
    Un patient peut avoir plusieurs rendez-vous (@OneToMany dans Patient).
    Un médecin peut avoir plusieurs rendez-vous (@ManyToOne implicite dans RendezVous).
 - Gestion des Rendez-Vous :
    Création de rendez-vous avec un statut initial (PENDING).
    Association d’un patient et d’un médecin à un rendez-vous.
 - Gestion des Consultations :Création d’une consultation liée à un rendez-vous existant.
 - Initialisation au Démarrage :Les méthodes CommandLineRunner ajoutent des données initiales pour tester les fonctionnalités de l’application.
 - Exposition des Données via REST :Endpoint /patients permet de récupérer la liste de tous les patients.

#### Flux de Fonctionnement :
  - Démarrage de l'Application :L'application Spring Boot est lancée via la méthode main de HospitalApplication.
  - Initialisation des Données :Au démarrage, le CommandLineRunner ajoute des patients, des médecins, des rendez-vous et des consultations initiaux dans la base de données.
  - Gestion des Entités :Les entités sont créées et manipulées via les services IHospitalService.
  - Exposition des Données via REST :Les contrôleurs RESTful exposent les données via des endpoints HTTP.
  - Affichage des Résultats :Les résultats des opérations (ex : sauvegarde d’un rendez-vous) sont affichés dans la console.

### Captures d'écrans :
#### Réalisation :
![image](https://github.com/user-attachments/assets/d9ccfe39-d8ad-48ba-8ef8-9ece814b0478)

#### Base de données :
![image](https://github.com/user-attachments/assets/7ada4d0e-477b-442d-96f3-9434281fdf32)

![image](https://github.com/user-attachments/assets/efc5d97e-2682-4859-8b7e-09f279dd6e09)

![image](https://github.com/user-attachments/assets/a2380748-5516-4be9-a9b7-66f112560518)

![image](https://github.com/user-attachments/assets/d6dac002-38e7-4aff-9861-1d2649d6e9ad)

![image](https://github.com/user-attachments/assets/86d7a9ff-1275-41c7-824d-0bd06a0b29af)


### Conclusion
Ce projet illustre une implémentation robuste de la gestion des patients, des médecins, des rendez-vous et des consultations dans un hôpital. Il utilise efficacement Hibernate/JPA pour la persistance des données et Spring Data JPA pour simplifier les opérations de base de données. La séparation claire des responsabilités entre les entités, les répositories, les services et les contrôleurs garantit une architecture bien structurée et facilement maintenable. L’utilisation de Lombok réduit la quantité de code boilerplate, améliorant ainsi la lisibilité et la productivité.





