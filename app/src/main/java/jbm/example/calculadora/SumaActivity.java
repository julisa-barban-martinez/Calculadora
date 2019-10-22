package jbm.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class SumaActivity extends AppCompatActivity  {
     private EditText N1;
     private EditText N2;
     private EditText RS;
     private Button btrSUMA, btrRegueso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suma);
        N1 = (EditText)findViewById(R.id.N1S);
        N2 = (EditText)findViewById(R.id.N2S);
        RS = (EditText)findViewById(R.id.NRS);
        btrSUMA = (Button) findViewById(R.id.btrSUMA);
        btrRegueso = (Button)findViewById(R.id.btrRegueso);
    }
    public void  suma (View view){
        String v1= N1.getText().toString();
        String v2= N2.getText().toString();

        int valor1 = Integer.parseInt(v1);
        int valor2 = Integer.parseInt(v2);

        int valor3 = valor1 + valor2;

        String resul = String.valueOf(valor3);
        RS.setText(resul);
    }
    public void regueso (View view){
        Intent regueso = new Intent( SumaActivity.this, principalActivity.class);
        startActivity(regueso);
    }
}


