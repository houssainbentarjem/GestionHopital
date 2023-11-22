import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class SetMedecins {
    private Set<Medecin> setM;
    public SetMedecins(){
        setM = new TreeSet<>();
    }
    public void ajouterMedecin(Medecin m) {
        setM.add(m);
    }
    /* Avec l’api Stream */
    public boolean rechercherMedecin(int cin) {
        return setM.stream().anyMatch(s->  s.getCin() == cin);
    }
    /* Avec l’api Stream */
    public void afficherMedecins() {
        setM.stream().forEach(s -> System.out.println(s));
    }
    /* Avec l’api Stream */
    public long nombreMedecins(){
        return setM.stream().count();
    }
    /* Avec l’api Stream */
    public TreeSet<Medecin> trierMedecins(){
        return setM.stream()
                .collect(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(m -> m.getNom()))));
    }
}
