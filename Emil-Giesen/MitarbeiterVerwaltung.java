public class MitarbeiterVerwaltung {
    public static void main(String[] args) {
        Mitarbeiter[] personalliste = new Mitarbeiter[4];
        int mitarbeiteranzahl;

         personalliste[0] = new Mitarbeiter("Mmarx ", "Groucho",8000);
         personalliste[1] = new Mitarbeiter("Mmarx ", "Chico",7000);
         personalliste[2] = new Mitarbeiter("Mmarx ", "Harpo",7000);
         personalliste[3] = new Mitarbeiter("Mmarx ", "Zeppo",7000);
         mitarbeiteranzahl = 4;


        //alle Mitarbeiter ausgeben
        for(int i = 0; i < personalliste.length; i++)
            personalliste[i].datenAusgeben();
    }
}