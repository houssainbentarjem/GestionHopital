public class Main {
    public static void main(String[] args) {
        // Création d'instances de Patient
        Patient patient1 = new Patient(123, "Bentarjem", "Houssain", 11111);
        Patient patient2 = new Patient(124, "Bentarjem", "Wissem", 22222);

        // Création d'instances de Medecin
        Medecin medecin1 = new Medecin(321, "foulen", "Fouleni", 44444);
        Medecin medecin2 = new Medecin(322, "Wael", "ayari", 55555);

        // Création d'une instance de Hopital, ajouter les médecins et les patients
        Hopital hopital = new Hopital();
        hopital.ajouterMedecin(medecin1);
        hopital.ajouterMedecin(medecin2);
        hopital.ajouterPatient(medecin1, patient1);
        hopital.ajouterPatient(medecin2, patient2);

        //Affichage
        hopital.afficherMap();

        // Création d'une instance de SetMedecins, ajouter les médecins et affichage
        SetMedecins setMedecins = new SetMedecins();
        setMedecins.ajouterMedecin(medecin1);
        setMedecins.ajouterMedecin(medecin2);
        setMedecins.afficherMedecins();

        // Création d'une instance de ListPatients, ajouter les patients et affichage
        ListPatients listPatients = new ListPatients();
        listPatients.ajouterPatient(patient1);
        listPatients.ajouterPatient(patient2);
        listPatients.afficherPatients();
    }
}
