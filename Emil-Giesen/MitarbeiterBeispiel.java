public class MitarbeiterBeispiel {
	public static void main(String[] args) {
		//2 neue Mitarbeiter instanzieren
		Mitarbeiter donald = new Mitarbeiter("Duck","Donald",1000);
		Mitarbeiter gustav = new Mitarbeiter("Ganz","Gustav",3000);
		Mitarbeiter dasiy = new Mitarbeiter("Duck","Dasiy",5000);
		Mitarbeiter dagobert= new Mitarbeiter("Duck","Dagobert",100000);


		// Daten ausgeben
		donald.datenAusgeben();
		gustav.datenAusgeben();

		// Gehalt von a erhohen
		gustav.gehaltErhoehen(1000);

		// Gehalt von a kuerzen
		donald.gehaltKuerzen(500);

		// Kontrolle
		donald.datenAusgeben();
		gustav.datenAusgeben();
  }
}
		
		