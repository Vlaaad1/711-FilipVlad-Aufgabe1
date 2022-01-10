package com.company;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Repository repo = new Repository();
        Service service = new Service();
    try {
        List<Offerte> offerten = repo.readFromFile(
          "C:\\Users\\Vlad\\IdeaProjects\\711-FilipVlad-Aufgabe1\\src\\com\\company\\offerten.txt", "&");
        for(Offerte offerte:offerten){
            System.out.println(offerte);
        }
        System.out.println("------------");
        System.out.println(service.sortListeOffersByPreis(offerten));

        List<Offerte> sortierteOfferten = service.sortListeOffersByPreis(offerten);
        repo.writeToFile(
                "C:\\Users\\Vlad\\IdeaProjects\\711-FilipVlad-Aufgabe1\\src\\com\\company\\offertensortiert.txt",
                sortierteOfferten,  "#");
        repo.writeToFileString(
                "C:\\Users\\Vlad\\IdeaProjects\\711-FilipVlad-Aufgabe1\\src\\com\\company\\statistik.txt",
                service.getBiggestIncome(offerten).toString(),  "#");



    } catch (IOException e) {
        e.printStackTrace();
    }

    }
}
