abstract class Angestellter extends mitarbeiter {
    int hierarchiestufe;
    final int MAX_HIERARCHIE = 5;

    //Konstruktor
    Angestellter(String name,
                 String vorname,
                 int gehalt) {
        super(name, vorname,gehalt);

    }
    //Initialisierung der eigenen Felder
    hierarchiestufe = 0;


    Void befoerdern() {
        //falls noch möglich, befördern
        if(hierarchiestufe < MAX_HIERARCHIE) ;
        hierarchiestufe++;
        return null;
    }
}