import java.util.HashMap;
import java.util.Map;

public class Hopital {

    public Map<Medecin, ListPatients> medecinPatiens;

    public Hopital(){
        medecinPatiens = new HashMap<>();
    }

    public void ajouterMedecin(Medecin m){
        medecinPatiens.put(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if(medecinPatiens.containsKey(m)) {
            medecinPatiens.get(m).ajouterPatient(p);
        } else {
            ListPatients list = new ListPatients();
            list.ajouterPatient(p);
            medecinPatiens.put(m, list);
        }
    }

    public void afficherMap(){
        medecinPatiens.forEach((m,list) -> {
            System.out.println(m);
            list.afficherPatients();
        });
    }

    public void afficherMedcinPatients(Medecin m) {
        if(m.getNom().equalsIgnoreCase("houssain")) {
            medecinPatiens.get(m).afficherPatients();
        }
    }

}