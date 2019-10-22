package jbm.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class principalActivity extends AppCompatActivity {
    EditText Opcionsuma;
    Button Action;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);

        Opcionsuma = (EditText) findViewById(R.id.Ocion);
        Action = (Button) findViewById(R.id.button);
        Action.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String aux = Opcionsuma.getText().toString();
                if(aux.matches("")){
                    Toast.makeText(getApplicationContext(),"No hay nada en el Campo" ,Toast.LENGTH_SHORT).show();

                }

                if (Opcionsuma.getText().toString().equals("1")){
                        Intent siguiente =new Intent(principalActivity.this, SumaActivity.class);
                        startActivity(siguiente);
                }
                if (Opcionsuma.getText().toString().equals("2")){
                    Intent siguiente =new Intent(principalActivity.this, Resta.class);
                    startActivity(siguiente);
                }
                if (Opcionsuma.getText().toString().equals("3")){
                    Intent siguiente =new Intent(principalActivity.this, MultiActivity.class);
                    startActivity(siguiente);
                }
                if (Opcionsuma.getText().toString().equals("4")){
                    Intent siguiente =new Intent(principalActivity.this, DiviActivity.class);
                    startActivity(siguiente);
                }
            }
        });

    }

}

