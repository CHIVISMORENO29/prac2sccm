package mx.edu.tesoem.isc.prac2sccm;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    Button boton_sig;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        boton_sig=(Button)findViewById(R.id.button);
        boton_sig.setOnClickListener(this);
    }
    @Override
    public void onClick(View v){
        Intent frm = new Intent(this, FRM_ACTIVITY.class);
        startActivity(frm);
        finish();
    }
}
