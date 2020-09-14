package com.Pract_4;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Author c1 = new Author("Alex","Alex@gmail.ru",'m');
        System.out.println(c1.getEmail());
        System.out.println(c1.getName());
        System.out.println(c1.toString());
    }
}
