public class Mitarbeiter {
	String 	m_name;
	String 	m_vorname;
	int	m_gehalt;

Mitarbeiter(String name, String vorname,int gehalt) {
	m_name	 = name;
	m_vorname = vorname;
	m_gehalt = gehalt;
}
	
	public void datenAusgeben() {
	System.out.println("/n");
	System.out.println(" Name	: " + m_name);
	System.out.println(" Vorname	: " + m_vorname);
	System.out.println(" Gehalt	: " + m_gehalt + " Euro");
}

	public void gehaltErhoehen(int erhoehung) {
		m_gehalt += erhoehung;
	}
}
//Die abbgeleiteten Klassen
class Lehrling extends Mitarbeiter {
	int abgelegtePruefungen

			//Konstruktor setzen die Anzahl der Prüfungen auf 0
			Lehrling(String name, String vorname, int gehalt) {
				//den Konstruktor der Basisklasse aufrufen
				super(name, vorname, gehalt);

				//Initialisierung der eigenen felder
				abgelegtePruefungen = 0;
			}
}
class Angestellter extends Mitarbeiter {
	int hierarchiestufe;
	final int MAX_HIERARCHIE = 5;

	//Konstruktor
	Angestellter(String name, String vorname, int gehalt);
		//den konstruktor der Basisklasse aufrufen
		super(name,vorname,gehalt);

		//Initialisierung der eigenen Felder
		hierchiestufe = 0;
	}

	Void befoerdern() {
		//falls noch möglich, befördern
		if (hierarchiestufe < MAX_HIERARCHIE) ;
		hierarchiestufe++;
	}
}
	class Chef extends Mitarbeiter {
	//Keine Erweiterung

		//Konstruktor von Chef ruft nur den Konstruktor der Basisklasse auf
		Chef(String, String vorname, int gehalt) {
			super(name, vorname, gehalt);
		}

		//beim Gehalt erhält der Chef mehr
		void gehaltErhoehen (int erhoehung) {
			m_gehalt += 2*erhoehung;
		}
	}

