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

        animals.add(new CatData("Apple Pie", "Android 1.0"));
        animals.add(new CatData("Banana Bread", "Android 1.1"));
        animals.add(new CatData("Cupcake", "Android 1.5"));
        animals.add(new CatData("Donut", "Android 1.6"));
        animals.add(new CatData("Eclair", "Android 2.0"));
        animals.add(new CatData("Froyo", "Android 2.2"));
        animals.add(new CatData("Gingerbread", "Android 2.3"));
        animals.add(new CatData("Honeycomb", "Android 3.0"));
        animals.add(new CatData("Ice Cream Sandwich", "Android 4.0"));
        animals.add(new CatData("Jelly Bean", "Android 4.2"));
        animals.add(new CatData("Kitkat", "Android 4.4"));
        animals.add(new CatData("Lollipop", "Android 5.0"));
        animals.add(new CatData("Marshmallow", "Android 6.0"));

        adapter = new AdoptionListAdapter(animals, getApplicationContext());

        listView.setAdapter(adapter);
    }
}
