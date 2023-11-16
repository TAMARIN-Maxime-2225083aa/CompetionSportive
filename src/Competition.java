import java.util.ArrayList;

public class Competition {

    private ArrayList<Participant> participants;

    public Competition(Participant... amateurs) {
        this.participants = new ArrayList<>();
        for (int i = 0; i < amateurs.length; i++) {
            this.participants.add(amateurs[i]);
        }
    }

    public ArrayList<Participant> getAmateurs() {
        ArrayList<Participant> amateurs = new ArrayList<>();
        for (Participant participant : participants) {
            if (!participant.estUnCompetiteur())
                amateurs.add(participant);
        }
        return amateurs;
    }

    public ArrayList<Participant> getComptetiteurs() {
        ArrayList<Participant> competiteurs = new ArrayList<>();
        for (Participant participant : participants) {
            if (participant.estUnCompetiteur())
                competiteurs.add(participant);
        }
        competiteurs = ClassementCompetiteur(competiteurs);
        return competiteurs;
    }

    public ArrayList<Participant> ClassementCompetiteur(ArrayList<Participant> participants) {
        Participant tmpComp;
        int j;
        for (int i = 0 ; i < participants.size() ; i++) {
            tmpComp = participants.get(i);
            j = i;
            while (j > 0 && participants.get(j-1).getScore() < tmpComp.getScore()) {
                participants.set(j, participants.get(j-1));
                j--;
            }
            participants.set(j, tmpComp);
        }
        return participants;
    }

    @Override
    public String toString() {
        ArrayList amateurs = this.getAmateurs();
        ArrayList competiteurs = this.getComptetiteurs();
        String StrAmateurs = "\n Amateurs : \n\n   ";
        String StrCompetiteurs = "\n Compétiteurs : \n\n   ";

        // Trier dans l'ordre les compétiteurs
        competiteurs = ClassementCompetiteur(competiteurs);

        // remplir la partie "amateurs"
        for(int i = 0 ; i < amateurs.size() ; i++) {
            StrAmateurs += amateurs.get(i) + ",\n   ";
        }
        StrAmateurs = StrAmateurs.substring(0, StrAmateurs.length()-2);

        // remplir la partie "competiteurs"
        for(int i = 0 ; i < competiteurs.size() ; i++) {
            StrCompetiteurs += competiteurs.get(i) + ",\n   ";
        }
        StrCompetiteurs = StrCompetiteurs.substring(0, StrCompetiteurs.length()-2);

        return "Participants :\n" + StrAmateurs + StrCompetiteurs;
    }
}
