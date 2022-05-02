package br.com.julieta.atividade01;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.InputType;
import android.text.TextWatcher;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private Button btCadastrar;
    private Button btLogin;
    private EditText txEmail;
    private  EditText txSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        btCadastrar = findViewById(R.id.btCadastrar);
        btLogin = findViewById(R.id.btAcessar);
        txEmail = findViewById(R.id.txEmail);
        txSenha = findViewById(R.id.txSenha);
        btCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), CadastrarActivity.class);
                startActivity(intent);
            }
        });
        btLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getApplicationContext(), BemvindoActivity.class);
                intent.putExtra("email", txEmail.getText().toString());
                startActivity(intent);
            }
        });
    }
}