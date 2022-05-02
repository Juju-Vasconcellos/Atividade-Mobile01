package br.com.julieta.atividade01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class CadastrarActivity extends AppCompatActivity {

    private Button btCadastrar;
    private EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_cadastrar);
        btCadastrar = findViewById(R.id.btCadastrarCadastro);
        editText = findViewById(R.id.txCadastroEmail);
        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BemvindoActivity.class);
                intent.putExtra("email", editText.getText().toString());
                startActivity(intent);
            }
        });
    }
}