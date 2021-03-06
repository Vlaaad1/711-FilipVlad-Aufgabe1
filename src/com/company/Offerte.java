package com.company;

public class Offerte {
    private Integer id;
    private String unternehmensname;
    private Integer preis;
    private Double mehrwertsteuer;
    private String adresse;
    private Ort ort;

    public Offerte(Integer id, String unternehmensname,
                   Integer preis, Double mehrwertsteuer,
                   String adresse, Ort ort) {
        this.id = id;
        this.unternehmensname = unternehmensname;
        this.preis = preis;
        this.mehrwertsteuer = mehrwertsteuer;
        this.adresse = adresse;
        this.ort = ort;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUnternehmensname() {
        return unternehmensname;
    }

    public void setUnternehmensname(String unternehmensname) {
        this.unternehmensname = unternehmensname;
    }

    public Integer getPreis() {
        return preis;
    }

    public void setPreis(Integer preis) {
        this.preis = preis;
    }

    public Double getMehrwertsteuer() {
        return mehrwertsteuer;
    }

    public void setMehrwertsteuer(Double mehrwertsteuer) {
        this.mehrwertsteuer = mehrwertsteuer;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Ort getOrt() {
        return ort;
    }

    public void setOrt(Ort ort) {
        this.ort = ort;
    }

    @Override
    public String toString() {
        return "Offerte{" +
                "id=" + id +
                ", unternehmensname='" + unternehmensname + '\'' +
                ", preis=" + preis +
                ", mehrwertsteuer=" + mehrwertsteuer +
                ", adresse='" + adresse + '\'' +
                ", ort=" + ort +
                '}';
    }
}
