package com.example.pdr_m.gopets;

//import android.os.Bundle;
//import android.app.Activity;
//import android.view.Menu;
//import android.widget.ArrayAdapter;
//import android.widget.ListView;
//
//public class IndexActivity extends Activity {
//    // Array of strings...
//    String[] mobileArray = {"Bolota", "Bolacha", "Pretinho", "Brahma", "Bacon", "Catito", "Chuvisco", "Dunga",
//                             "Bolota", "Bolacha", "Pretinho", "Brahma", "Bacon", "Catito", "Chuvisco", "Dunga"};
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.index_activity);
//
//        ArrayAdapter adapter = new ArrayAdapter<String>(this,
//                R.layout.activity_listview, mobileArray);
//
//        ListView listView = (ListView) findViewById(R.id.adoption_list);
//        listView.setAdapter(adapter);
//    }
//}

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class IndexActivity extends AppCompatActivity {

    ArrayList<CatData> animals;
    ListView listView;
    private static AdoptionListAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index_activity);

        listView = (ListView) findViewById(R.id.adoption_list);

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

        adapter = new AdoptionListAdapter(animals, getApplicationContext());

        listView.setAdapter(adapter);
    }
}
