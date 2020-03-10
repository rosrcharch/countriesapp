package com.duque.contriesapp.view;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.duque.contriesapp.R;
import com.duque.contriesapp.model.CountryModel;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class CountryListAdapter extends RecyclerView.Adapter<CountryListAdapter.CountryViewhHolder> {

    private List<CountryModel> countries;

    public CountryListAdapter(List<CountryModel> countries){
        this.countries = countries;
    }


    public void updateCounries(List<CountryModel> newCountries){
        countries.clear();
        countries.addAll(newCountries);
        notifyDataSetChanged();

    }

    @NonNull
    @Override
    public CountryViewhHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_country, parent, false);
        return new CountryViewhHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CountryViewhHolder holder, int position) {

        holder.bind(countries.get(position));
    }

    public void removeItem(int position){
        countries.remove(position);
        notifyItemRemoved(position);
    }

    @Override
    public int getItemCount() {
        return countries.size();
    }

    class CountryViewhHolder extends RecyclerView.ViewHolder {

        private ImageView countryImage;
        private TextView countryName;
        private TextView countryCapital;

        /*@BindView(R.id.imageView)
        ImageView countryImage;

        @BindView(R.id.name)
        TextView countryName;

        @BindView(R.id.capital)
        TextView countryCapital;*/

        public CountryViewhHolder(@NonNull View itemView) {
            super(itemView);

            countryImage = itemView.findViewById(R.id.imageView);
            countryName = itemView.findViewById(R.id.name);
            countryCapital = itemView.findViewById(R.id.capital);

            ButterKnife.bind(this, itemView);
        }

        void bind(CountryModel country){

            countryName.setText(country.getNomePais());
            countryCapital.setText(country.getCapital());
            Util.loadImage(countryImage, country.getBandeira(), Util.getProgressDrawable(countryImage.getContext()));

        }
    }
}
