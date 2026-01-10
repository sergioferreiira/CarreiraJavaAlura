package org.example;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("digite o nome :");
        String nome = scan.nextLine();

        Pattern fomatado = Pattern.compile("\\w+\\W, \\w+\\D");
        Matcher matcher = fomatado.matcher(nome);

        if (matcher.find()){
            System.out.println(matcher.group().toLowerCase());
        }
    }
}