package holidays;

public class Wakacje {
	String kraj;
	String miejscowosc;
	String hotel;
	String pokoj;
	String termin;
	String wyzywienie;
	int cena;
	public Wakacje(){}
	public Wakacje(String Kraj, String Miejscowosc, String Hotel, String Pokoj, String Termin, String Wyzywienie, int Cena){
		this.kraj = Kraj;
		this.miejscowosc = Miejscowosc;
		this.hotel = Hotel;
		this.pokoj = Pokoj;
		this.termin = Termin;
		this.wyzywienie = Wyzywienie;
		this.cena = Cena;
	}
	
	public void wyswietl(Wakacje kierunek)
	{
		 String s = "";
		    s += "Kraj: "  + kierunek.kraj + "\n";
		    s += "Miasto: "  + kierunek.miejscowosc + "\n";
		    s += "Hotel: "  + kierunek.hotel + "\n";
		    s += "Pokoj: "  + kierunek.pokoj + "\n";
		    s += "Termin: "  + kierunek.termin + "\n";
		    s += "Wyzywienie: "  + kierunek.wyzywienie + "\n";
		    s += "Cena: "  + kierunek.cena + "\n";
		    System.out.println(s);
	}
}