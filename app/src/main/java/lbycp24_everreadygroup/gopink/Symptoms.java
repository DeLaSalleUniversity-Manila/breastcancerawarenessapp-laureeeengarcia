package lbycp24_everreadygroup.gopink;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;


public class Symptoms extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.symptoms);

        TextView textview= (TextView) findViewById(R.id.textView5);
        textview.setMovementMethod(new ScrollingMovementMethod());
    }


}