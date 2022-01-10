package com.company;

import java.io.IOException;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Repository repo = new Repository();
    try {
        List<Offerte> offerten = repo.readFromFile(
          "C:\\Users\\Vlad\\IdeaProjects\\711-FilipVlad-Aufgabe1\\src\\com\\company\\offerten.txt", "&");
        for(Offerte offerte:offerten){
            System.out.println(offerte);
        }

    } catch (IOException e) {
        e.printStackTrace();
    }

    }
}
