class Lehrling extends mitarbeiter {
    int abgelegtePruefungen;

    //Konstruktor setzen die Anzahl der Prüfungen auf 0
    Lehrling(String name, String vorname, int gehalt) {
        //den Konstruktor der Basisklasse aufrufen
        super(name, vorname, gehalt);

        //Initialisierung der eigenen felder
        abgelegtePruefungen = 0;
    }
}

