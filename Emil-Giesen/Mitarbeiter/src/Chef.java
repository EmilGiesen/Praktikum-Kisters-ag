class Chef extends mitarbeiter {
    //Keine Erweiterung

    //Konstruktor von Chef ruft nur den Konstruktor der Basisklasse auf
    Chef(String name, String vorname, int gehalt) {
        super(name, vorname, gehalt);
    }

    //beim Gehalt erhält der Chef mehr
    public void gehaltErhoehen(int erhoehung) {
        m_gehalt += 2*erhoehung;
    }
}
