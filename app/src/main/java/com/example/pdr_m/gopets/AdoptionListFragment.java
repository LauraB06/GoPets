package com.example.pdr_m.gopets;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by laura on 26-Jun-17.
 */

public class AdoptionListFragment extends Fragment {

    ArrayList<CatData> animals;
    ListView listView;
    AdoptionListAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_adoptionlist, container, false);
        listView = (ListView) rootView.findViewById(R.id.adoption_list);

        animals = new ArrayList<>();

        animals.add(new CatData("Apple Pie", "Male", "Medium", "3 months", "RN"));
        animals.add(new CatData("Banana Bread", "Female", "Large", "2 years old", "RN"));
        animals.add(new CatData("Cupcake", "Female", "Small", "2 months", "RN"));
        animals.add(new CatData("Donut", "Male", "Small", "2 months", "RN"));
        animals.add(new CatData("Eclair", "Male", "Large", "1 year old", "RN"));
        animals.add(new CatData("Froyo", "Male", "Large", "3 years old", "RN"));
        animals.add(new CatData("Gingerbread", "Male", "Small", "4 months", "RN"));
        animals.add(new CatData("Honeycomb", "Female", "Medium", "6 months", "RN"));
        animals.add(new CatData("Ice Cream Sandwich", "Female", "Medium", "6 months", "RN"));
        animals.add(new CatData("Jelly Bean", "Female", "Large", "1 year old", "RN"));
        animals.add(new CatData("Kitkat", "Male", "Small", "2 months", "RN"));
        animals.add(new CatData("Lollipop", "Female", "Large", "2 years old", "RN"));
        animals.add(new CatData("Marshmallow", "Male", "Small", "4 months", "RN"));

        adapter = new AdoptionListAdapter(animals, getContext());

        listView.setAdapter(adapter);

        return rootView;
    }
}

