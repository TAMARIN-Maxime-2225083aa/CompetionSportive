import java.util.Objects;

public class Participant {
    private String nom;
    private String prenom;
    private int score;
    private boolean estClasse;

    public Participant(String nom, String prenom,boolean estClasse) {
        this.nom = nom;
        this.prenom = prenom;
        this.score = 0;
        this.estClasse = estClasse;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public boolean estUnCompetiteur() {
        return estClasse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Participant that = (Participant) o;
        return score == that.score && Objects.equals(nom, that.nom) && Objects.equals(prenom, that.prenom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nom, prenom, score);
    }

    @Override
    public String toString() {
        return
                "nom='" + nom + '\'' +
                ", prenom='" + prenom + '\'' +
                ", score=" + score;
    }
}
