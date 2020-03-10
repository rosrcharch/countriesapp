package com.duque.contriesapp.model;

import androidx.lifecycle.MutableLiveData;

import com.google.gson.annotations.SerializedName;

public class CountryModel {

    @SerializedName("name")
    public String nomePais;

    @SerializedName("capital")
    public String capital;

    @SerializedName("flagPNG")
    public String bandeira;

    public CountryModel(String nomePais, String capital, String bandeira) {
        this.nomePais = nomePais;
        this.capital = capital;
        this.bandeira = bandeira;
    }

    public String getNomePais() {
        return nomePais;
    }

    public void setNomePais(String nomePais) {
        this.nomePais = nomePais;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public String getBandeira() {
        return bandeira;
    }

    public void setBandeira(String bandeira) {
        this.bandeira = bandeira;
    }




}
