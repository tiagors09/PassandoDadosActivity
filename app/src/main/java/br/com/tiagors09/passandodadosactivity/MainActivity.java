package br.com.tiagors09.passandodadosactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonEnviar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        buttonEnviar = findViewById(R.id.buttonEnviar);
        buttonEnviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);

                Usuario u = new Usuario("Tiago Rodrigues Sousa", "tiagors09@alu.ufc.br");

                // Passar dados
                intent.putExtra("NOME", "Tiago Rodrigues Sousa");
                intent.putExtra("IDADE", 22);
                intent.putExtra("USUARIO", u);

                startActivity(intent);
            }
        });

    }
}