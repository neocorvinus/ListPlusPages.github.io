package fr.vfaury.listpluspages;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class secondactivity extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondactivity);

        textView=(TextView)findViewById(R.id.txtitem);
        String Tempholder=getIntent().getStringExtra("Listviewclickvalue");
        textView.setText(Tempholder);
    }
}
