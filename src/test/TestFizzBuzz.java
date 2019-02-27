package test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import main.FizzBuzz;

class TestFizzBuzz {
	
	
	@Test
	public void WynikRownyJeden() {
		assertEquals("1", FizzBuzz.Wynik(1));
	}
	
	@Test
	public void WynikRownyFizz() {
		assertEquals("Fizz!", FizzBuzz.Wynik(3));
	
	}
	
	@Test
	public void WynikRownyBuzz() {
		assertEquals("Buzz!", FizzBuzz.Wynik(5));
	
	}
	
	@Test
	public void WynikRownyFizzBuzz() {
		assertEquals("FizzBuzz!", FizzBuzz.Wynik(15));
	
	} 
	
	

}
