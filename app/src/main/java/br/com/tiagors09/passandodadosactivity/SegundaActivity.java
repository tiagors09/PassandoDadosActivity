package br.com.tiagors09.passandodadosactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class SegundaActivity extends AppCompatActivity {
    private TextView textViewNome, textViewIdade;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        textViewNome = findViewById(R.id.textViewNome);
        textViewIdade = findViewById(R.id.textViewIdade);

        // Recuperar os dados enviados
        Bundle dados = getIntent().getExtras();

        String nome = dados.getString("NOME");
        int idade = dados.getInt("IDADE");
        Usuario usuario = (Usuario) dados.getSerializable("USUARIO");

        textViewNome.setText(usuario.toString());
        textViewIdade.setText(String.valueOf(idade));
    }
}