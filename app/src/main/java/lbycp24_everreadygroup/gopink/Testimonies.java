package lbycp24_everreadygroup.gopink;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;


public class Testimonies extends Activity {

    String[] main_menu = {
            "Early Intervention",
            "Living with Breast Cancer",
            "Metastasis",
            "Prevention",
            "Survivors"
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.testimonies);


        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, main_menu);
        ListView list = (ListView) findViewById(R.id.listView3);
        list.setAdapter(adapter);

        list.setOnItemClickListener(new AdapterView.OnItemClickListener(){
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id){
                switch (position) {
                    case 0:
                        Intent goToEarlyIntervention = new Intent(Testimonies.this, EarlyIntervention.class);
                        startActivity(goToEarlyIntervention);
                        break;
                    case 1:
                        Intent goToLivingBreast = new Intent(Testimonies.this, LivingBreast.class);
                        startActivity(goToLivingBreast);
                        break;
                    case 2:
                        Intent goToMetastasis = new Intent(Testimonies.this, Metastasis.class);
                        startActivity(goToMetastasis);
                        break;
                    case 3:
                        Intent goToPrevention = new Intent(Testimonies.this, Prevention.class);
                        startActivity(goToPrevention);
                        break;
                    case 4:
                        Intent goToSurvivor = new Intent(Testimonies.this, Survivors.class);
                        startActivity(goToSurvivor);
                        break;
                }
            }
        });
    }
}
