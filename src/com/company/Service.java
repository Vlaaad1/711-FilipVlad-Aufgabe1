package com.company;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static com.company.Ort.Thurgau;
import static com.company.Ort.StGallen;
import static com.company.Ort.Zurich;

public class Service {
    public List<Offerte> sortListeOffersByPreis(List<Offerte> liste) {
        return liste.stream()
                .sorted((offerte1, offerte2) -> offerte1.getPreis().compareTo(offerte2.getPreis()))
                .collect(Collectors.toList());
    }


     public Map<String,Integer> getBiggestIncome(List<Offerte> liste) {
        int thurgau=0,zurich=0,stgallen=0;
        for(Offerte o:liste){
            if(o.getOrt()==Thurgau)
                thurgau+=o.getPreis();
            if(o.getOrt()==Zurich)
                zurich+=o.getPreis();
            if(o.getOrt()==StGallen)
                stgallen+=o.getPreis();
        }
        Map<String,Integer> map=new HashMap<>();
        map.put("Thurgau",thurgau);
        map.put("Zürich",zurich);
        map.put("St_Gallen",stgallen);

        return map;
    }
}
