package com.duque.contriesapp.model;

import java.util.List;

import io.reactivex.Single;
import retrofit2.http.GET;

public interface CountriesApi {

    @GET("Countries")
    Single<List<CountryModel>> getCountries();



}
