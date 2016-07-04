package com.example.pnnutkung.realmgridview.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.pnnutkung.realmgridview.R;
import com.example.pnnutkung.realmgridview.model.City;

import java.util.List;
import java.util.Locale;

/**
 * Created by PNNutkung on 2016-07-04.
 */
public class CityAdapter extends BaseAdapter {
    private LayoutInflater inflater;
    private List<City> cities = null;

    public CityAdapter(Context context) {
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    public void setData(List<City> cities) {
        this.cities = cities;
    }

    @Override
    public int getCount() {
        if( cities == null) {
            return 0;
        }
        return cities.size();
    }

    @Override
    public Object getItem(int position) {
        if(cities == null || cities.get(position) == null) {
            return null;
        }
        return cities.get(position);
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View currentView, ViewGroup parent) {
        if(currentView == null) {
            currentView = inflater.inflate(R.layout.city_listitem, parent, false);
        }

        City city = cities.get(i);

        if(city != null) {
            ((TextView) currentView.findViewById(R.id.name)).setText(city.getName());
            ((TextView) currentView.findViewById(R.id.votes)).setText(String.format(Locale.US, "%d", city.getVotes()));
        }
        return currentView;
    }
}
