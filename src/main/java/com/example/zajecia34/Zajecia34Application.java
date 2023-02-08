package com.example.zajecia34;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Zajecia34Application {

	public static void main(String[] args) {
		SpringApplication.run(Zajecia34Application.class, args);
	}

//	Mandat musi tez miec punkty i kwota
//	Mandat ma pesel ukaranego czy id ukaranego i wtedy relacja? czy da sie relacje na podstawie peselu?
//	mandat i wykroczenia mają swoje ograniczenia do max punktow i max mandatu?

//	1)dodawanie mandatu (mandat czy wykroczenie?) - walidacja - lepiej adnotacjami czy metody z walidacja? co jesli update?
//	2)czy mandat dodawany odrazu z wykroczeniami czy moze byc bez a pozniej wykroczenia dodawane?
//	3)w mandate z offenses relacja wiele do wielu? jaka kolumna wtedy w liquibase?
//	4)punkty i kwota w Mandate - czy metody i sposob ok?
//	5)czy update w offenseservice ok? i czy transactional i lock?
//	6)czy ok dane z properties w klasach? da sie zrobic static final?
//	7)Jak mapowac entity na dto z lista/setem dto w relacji?



//	Stworz prosta aplikacje ktora pozwala rejestrowac wykroczenia drogowe.
//	Kazde wykroczenie ma: nr pesel ukranego, date, przewinienie, ilosc punktow, ilosc pln.
//	nr pesel musi byc powiazany z bazą danych osób którą będziesz miał w programie.
//	każda osoba ma: pesel, imie, nazwisko, email.
// 
//- nie mozna dodac wykroczenia w ktorym pesel nie wystepuje w naszej bazie osob
//- nie mozna dodac wykroczenia ktorego data jest w przyszlosci.
//- nie mozna dodac wykroczenia ktore ma wiecej niz 15 punktow
//- nie mozna dodac wykroczenia ktore ma wiecej niz 5000 pln madatu.
//
//	podczas dodawania nowego wykroczenia jesli suma przekroczonych punktow za wszystkie wykroczenia w ostatnim roku jest wieksza niz 24, to do obwinionego wysylany jest email
//	z informacja ze stracil prawojazdy.
//	model danych ma wygladac tak:
//	Kierowca: imie, nazwisko, pesel, email
//	Wykroczenie: nazwa, kwota, punkty
//	Mandat: lista wykroczen, kierowca, data
//	Wykroczenie ma byc wartością slownikowaną tzn, z poziomu aplikacji masz dostęp do słownika wykroczen gdzie mozesz dodawac/edytowac/zmieniac punkty za dane wykroczenia.
//	slownik wykroczen tzn:
//	nazwa: wyprzedanie na pasach, punkty: 15, mandat 5000
//	nazwa: przekroczenie predkosci o 50 km/h, punkty: 10, mandat: 5000
//	i wtedy np:
//	jak ktos dostanie mandat z dwoma wykroczeniami w ktorym bedzie: 1) wyprzedzanie na pasach, 2) przekroczenie predkosci o 50 km/h, to dostanie lacznie 25 punktu z automatu i 10000 pln, ALE system automatycznie zaokragli kwote i punktu do maksymalnego jednorazowego mandaty tzn: 8000 i 20 ptk. (powiedzmy taki sobie limit ustawimy ale to tez ma byc konfigurowalne)

}
