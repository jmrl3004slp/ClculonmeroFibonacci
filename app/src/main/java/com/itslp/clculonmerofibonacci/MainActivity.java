package com.itslp.clculonmerofibonacci;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText editText;
    private TextView textView3;
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.editText);
        textView3 = (TextView) findViewById(R.id.textView3); 
        button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                long numero = Long.parseLong(editText.getText().toString());
                String valor = "El valor del número fibonacci es: " + fibonacci(numero);
                textView3.setText(valor);
            }
        });
    }

    // Declaración recursiva del método fibonacci
    public long fibonacci(long number) {
        if ((number == 0) || (number == 1)) // base cases
            return number;
        else
            // Paso recursivo
            return fibonacci(number - 1) + fibonacci(number - 2);
    }
}