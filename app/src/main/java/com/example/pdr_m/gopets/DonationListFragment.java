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

public class DonationListFragment extends Fragment {

    ArrayList<DonationData> donation;
    ListView listView;
    DonationListAdapter adapter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_donationlist, container, false);
        listView = (ListView) rootView.findViewById(R.id.donation_list);

        donation = new ArrayList<>();

        donation.add(new DonationData("ONG", "Meta indefinida"));
        donation.add(new DonationData("Pipoca", "Meta R$500"));
        donation.add(new DonationData("ONG", "Meta R$1000"));
        donation.add(new DonationData("Requeijão", "Meta R$600"));
        donation.add(new DonationData("Princesa", "Meta R$200"));
        donation.add(new DonationData("ONG", "Meta indefinida"));
        donation.add(new DonationData("Pipoca", "Meta R$500"));
        donation.add(new DonationData("ONG", "Meta R$1000"));
        donation.add(new DonationData("Requeijão", "Meta R$600"));
        donation.add(new DonationData("Princesa", "Meta R$200"));
        donation.add(new DonationData("ONG", "Meta indefinida"));
        donation.add(new DonationData("Pipoca", "Meta R$500"));
        donation.add(new DonationData("Requeijão", "Meta R$600"));

        adapter = new DonationListAdapter(donation, getContext());

        listView.setAdapter(adapter);

        return rootView;
    }
}