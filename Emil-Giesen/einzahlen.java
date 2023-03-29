public void einzahlen(double betrag) {
        if(betrag<0)
        System.out.prinln(" Nur positive Beträge erlaubt")
        else {
        kapital+=betrag;
        if(kapital>=50000&&kapital-betrag< 50000)
        zinssatz
        }
}
public void abheben(double betrag)  {
    if(betrag < 0)
        System.out.println("Nur positive Beträge erlaubt");
    else if(betrag > 3000)
        System.out.println(" Limit sind 3000 Euro");
    else
        kapital -= betrag;

    if(kapital < 50000 && kapital+betrag >= 50000)
        zinssatz -= 0.5;
        }