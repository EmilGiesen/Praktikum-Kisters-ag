public class mitarbeiter {
 	    String m_name;
        String 	m_vorname;
        int	m_gehalt;

        public mitarbeiter(String name, String vorname, int gehalt) {
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

