public class Addition {
	public static void main(String[] args) {
		int x,y,z;
		int ergebnis_1,ergebnis_2;

		x = 1;
		y = 2;
		z = 3;

		ergebnis_1 = x + y * z; 	// = 7
		ergebnis_2 = (5 -3) *z;		// = 6
		System.out.println(ergebnis_1);
		System.out.println(ergebnis_2);
		
		x = x + z;			// = 4
		System.out.println(x);
		x += z;				// = 7		
		System.out.println(x);
		x += 1;				// = 8
		System.out.println(x);
		x++;				// = 9
		System.out.println(x);
		
			
			int a,b,c;
			int ergebnis_3,ergebnis_4;
			
			a = 10;
			b = 50;
			c = 100;

			ergebnis_3 = b * a / c + c;
			ergebnis_4 = c / a / b / c / z + x;
			System.out.println(ergebnis_3);
			System.out.println(ergebnis_4);



	}
}
			