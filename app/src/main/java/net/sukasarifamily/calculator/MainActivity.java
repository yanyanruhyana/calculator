package net.sukasarifamily.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText edittext, edittext2;
    TextView tvhasil;
    Button btnhitung;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edittext =findViewById(R.id.edittext);
        edittext2 = findViewById(R.id.edittext2);
        tvhasil = findViewById(R.id.tvhasil);
        btnhitung = findViewById(R.id.btnhitung);

        btnhitung.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                int a1 = Integer.parseInt(edittext.getText().toString());
                int a2 = Integer.parseInt(edittext2.getText().toString());
                int hasil = a1 + a2;
                tvhasil.setText(String.valueOf(hasil));
            }
        });
    }

}
