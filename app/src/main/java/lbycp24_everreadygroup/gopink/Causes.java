package lbycp24_everreadygroup.gopink;

import android.app.Activity;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.TextView;


public class Causes extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.causes);

        TextView textview= (TextView) findViewById(R.id.textView4);
        textview.setMovementMethod(new ScrollingMovementMethod());
    }


}
