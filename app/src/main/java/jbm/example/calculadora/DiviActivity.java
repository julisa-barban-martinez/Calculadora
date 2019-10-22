package jbm.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class DiviActivity extends AppCompatActivity {
    private EditText N1;
    private EditText N2;
    private EditText RS;
    private Button btrDivi, btrRegueso;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_divi);
        N1 = (EditText)findViewById(R.id.N1D);
        N2 = (EditText)findViewById(R.id.N2D);
        RS = (EditText)findViewById(R.id.NRM);
        btrDivi = (Button) findViewById(R.id.Dividir);
        btrRegueso = (Button)findViewById(R.id.regueso);
    }

    public void  Dividir (View view){
        String v1= N1.getText().toString();
        String v2= N2.getText().toString();

        int valor1 = Integer.parseInt(v1);
        int valor2 = Integer.parseInt(v2);
        int valor3 = valor1/valor2;

        String resul = String.valueOf(valor3);

        RS.setText(resul);
    }
    public void regueso (View view){
        Intent regueso = new Intent( DiviActivity.this, principalActivity.class);
        startActivity(regueso);
    }
}
