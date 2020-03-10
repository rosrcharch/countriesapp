package com.duque.contriesapp.di;

import com.duque.contriesapp.model.CountriesService;

import dagger.Component;

@Component(modules = {ApiModule.class})
public interface ApiComponent {

    void inject(CountriesService service);
}
