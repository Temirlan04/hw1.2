package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        String helloWork;
        final int NUM = 21;
        String word = "54";
        helloWork = NUM + word;
        System.out.println(helloWork);

        if (NUM < 0) {
            System.out.println("Вы сохранили отрицательное число");
        } else if (NUM > 0) {
            System.out.println("Вы сохранили положительное число");
        } else System.out.println("Вы сохранили нуль");
        System.out.println("Введите ваше имя");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        System.out.println("ПРИВЕТ " + name);
    }
}

/*
#ДЗурок1:
ДЗ на сообразительность:
Сделать так, чтобы программа выводила в консоль строку “Введите ваше имя:”
Затем считывала имя пользователя, введенное с клавиатуры
И в конце здоровалась с пользователем по имени которое вы ввели с клавиатуры
Дэдлайн 31.07.2021 23 59*/