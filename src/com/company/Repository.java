package com.company;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Repository {
    public List<Offerte> readFromFile(String filename, String character) throws IOException{
        BufferedReader bufferedReader = new BufferedReader(new FileReader(filename));
        String line = bufferedReader.readLine();
        String[] attributes;
        Offerte offerte;
        List<Offerte> listeOfferte = new ArrayList<>();
        while (line != null){
            attributes = line.split(character);
            offerte = new Offerte(Integer.parseInt(attributes[0]),
                    attributes[1],
                    Integer.parseInt(attributes[2]),
                    Double.parseDouble(attributes[3]),
                    attributes[4], Ort.valueOf(attributes[5]));
            listeOfferte.add(offerte);

            line = bufferedReader.readLine();
        }
        return listeOfferte;
    }

    public void writeToFile(String filename, List<Offerte> liste, String character) throws IOException{
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(filename));
        for(Offerte offerte : liste) {
            String line = offerte.getId()+character+
                    offerte.getUnternehmensname()+character+
                    offerte.getPreis()+character+
                    offerte.getMehrwertsteuer()+character+
                    offerte.getAdresse()+character+
                    offerte.getOrt();
            bufferedWriter.write(line);
            bufferedWriter.newLine();
        }
        bufferedWriter.close();
    }
}
