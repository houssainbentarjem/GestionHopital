import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ListPatients implements InterfacePatient{

    private List<Patient> listP;

    public ListPatients(){
        listP = new ArrayList<>();
    }

    public void ajouterPatient(Patient p) {
        listP.add(p);
    }

    public void supprimerPatient(Patient p) {
        listP.remove(p);
    }

    public boolean rechercherPatient(Patient p){
        return listP.stream().anyMatch(l -> l.equals(p));
    }

    public boolean rechercherPatient(int cin) {
        return listP.stream().anyMatch(l -> l.getCin() == cin);
    }

    public void afficherPatients() {
        listP.stream().forEach(l-> System.out.println(l));
    }

    public void trierPatientsParNom() {
        listP = listP.stream()
                .sorted((p1, p2) -> p1.getNom().compareTo(p2.getNom()))
                .collect(Collectors.toList());
    }

    public void PatientSansRedondance(){
        List<Patient> distinctList = listP.stream().distinct().collect(Collectors.toList());
        distinctList.forEach(l-> System.out.println(l));
    }
}
