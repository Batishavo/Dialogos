package com.example.dialogos;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    Context contexto;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        contexto=this;
        Button boton=(Button)findViewById(R.id.btn_entrada);
        boton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                new CuadroDeDialogo(contexto);
            }
        });
    }
}