package com.company;

import java.io.UncheckedIOException;

public class Main {

    public static void main(String[] args) {
	// write your code here

        try (Car car = new Car()) {
            car.drive();
        }
        catch (Exception e) {
            System.out.println("Ignored exception");
        }
    }
}

/*
* Try with resources-те колдоно ала турган Car деген класс тузунуз
close() деген метод "Машина жабылып жатат" деп консольго чыгаруусу керек.
try unchecked exceptionдарды кармап аларды игнор кылыш керек.
main методдо try блоктун ичинде drive() деген методду чакырыныз, ал консольго "Машина журуп жатат" деп чыгаруусу керек

Эскертуу: маселени чыгарууда try with resources колдонуу керек.
* */