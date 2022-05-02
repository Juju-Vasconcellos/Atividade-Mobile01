package br.com.julieta.atividade01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.widget.TextView;

public class BemvindoActivity extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_bemvindo);
        textView = findViewById(R.id.tvBemvindoEmail);
        String email = getIntent().getStringExtra("email");
        textView.setText(email);
    }
}