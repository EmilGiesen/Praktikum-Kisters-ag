Public class Zinsberechnung {

	public static void zinsBerechnen(double laufzeit) {
	double startkapital = 15000;
	double zinssatz = 3.5;
	double endkapital;

	//Berechnung des Endkapitals
	endkapital = startkapital *
		Math.pow((1 + zinssatz/100),laufzeit);
	System.out.println(" Nach " + (int) laufzeit + " .Jahr: "
				+ (int) endkapital + " Euro " );
}

	public static void main(String[] args) {
	 System.out.println();

	zinsBerechnung(1);
	zinsBerechnung(2);
	zinsBerechnung(3);
	zinsBerechnung(4);
	zinsBerechnung(5);
	zinsBerechnung(6);
	zinsBerechnung(7);