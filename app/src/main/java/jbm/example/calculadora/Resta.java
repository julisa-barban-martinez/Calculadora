package jbm.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Resta extends AppCompatActivity {
    private EditText N1;
    private EditText N2;
    private EditText RS;
    private Button btrRestar, btrRegueso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resta);
        N1 = (EditText)findViewById(R.id.N1R);
        N2 = (EditText)findViewById(R.id.N2R);
        RS = (EditText)findViewById(R.id.NRR);
        btrRestar = (Button) findViewById(R.id.Restar);
        btrRegueso = (Button)findViewById(R.id.regueso);
    }

    public void  RESTA (View view){
        String v1= N1.getText().toString();
        String v2= N2.getText().toString();

        int valor1 = Integer.parseInt(v1);
        int valor2 = Integer.parseInt(v2);

        int valor3 = valor1 - valor2;

        String resul = String.valueOf(valor3);

        RS.setText(resul);
    }
    public void regueso (View view){
        Intent regueso = new Intent( Resta.this, principalActivity.class);
        startActivity(regueso);
    }
}
