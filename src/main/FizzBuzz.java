package main;


public class FizzBuzz {

	public static String Wynik(int liczba) {
			if(liczba%15==0) {
			return "FizzBuzz!";
			}
			
			if(liczba%3==0){
			return "Fizz!";
			}
			
			if(liczba%5==0){
				return "Buzz!";
			}
			
			else {
				return "" + liczba;
				
			}
			
	}
	

}
