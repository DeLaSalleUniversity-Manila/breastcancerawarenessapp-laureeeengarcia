package lbycp24_everreadygroup.gopink;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;

public class Information extends Activity{
String[] main_menu = {
        "What is Breast Cancer?",
        "Causes",
        "Symptoms",
        "Treatments",
        "Facts"
};

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.information);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, main_menu);
        ListView list = (ListView) findViewById(R.id.listView2);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                switch (position){

                    case 0:
                        Intent goToBCancer = new Intent(Information.this, BCancer.class);
                        startActivity(goToBCancer);
                        break;

                    case 1:
                        Intent goToCauses = new Intent(Information.this,Causes.class);
                        startActivity(goToCauses);
                        break;

                    case 2:
                        Intent goToSymptoms = new Intent(Information.this,Symptoms.class);
                        startActivity(goToSymptoms);
                        break;

                    case 3:/*
                        Intent goToTreatments = new Intent(Information.this, Treatments.class);
                        startActivity(goToTreatments);
                        break;*/

                        Intent i = new Intent(Intent.ACTION_VIEW);
                        i.setData(Uri.parse("http://www.breastcancer.org/treatment"));
                        startActivity(i);
                        break;

                    case 4:
                        Intent goToFacts = new Intent(Information.this, Facts.class);
                        startActivity(goToFacts);
                        break;


                }
            }
        });
    }
}