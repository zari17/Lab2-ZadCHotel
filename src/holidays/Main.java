package holidays;


public class Main {
	public static void main(String[] args)
	{
		Wakacje wakacje1 = new Wakacje("Hiszpania", "Barcelona", "La Mar", "dwuosobowy", "20.08.2016", "HB", 2500);
		Wakacje wakacje2 = new Wakacje("W³ochy", "Rzym", "Rome Hotel", "kawalerka", "05.08.2016", "ALL-INCLUSIVE", 3000);
		Wakacje wakacje3 = new Wakacje("Grecja", "Ateny", "Olympus", "dwuosobowy", "20.07.2016", "Bez wyzywienia", 2000);
		Wakacje wakacje4 = new Wakacje("Polska", "Gdansk", "Sheraton", "trzyosobowy" ,"15.08.2016", "HB", 1500);
		
		Wakacje kierunek = new Wakacje();
		
	    kierunek.wyswietl(wakacje1);
	    kierunek.wyswietl(wakacje2);
	    kierunek.wyswietl(wakacje3);
	    kierunek.wyswietl(wakacje4);
	}
}
