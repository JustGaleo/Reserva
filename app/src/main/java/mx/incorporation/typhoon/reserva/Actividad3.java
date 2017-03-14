package mx.incorporation.typhoon.reserva;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Actividad3 extends AppCompatActivity {

    String usr = "", edad = "", tel = "", correo = "";
    TextView muestraDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad3);

        muestraDatos = (TextView) findViewById(R.id.lblMSJ);


        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        usr = recibe.getString("Usuario");
        edad = recibe.getString("Edad");
        tel = recibe.getString("Telefono");
        correo = recibe.getString("Correo");

        muestraDatos.setText("Usuario: " + usr + "\nEdad: " + edad + "\nTelefono: " + tel + "\nCorreo: " + correo + "\n");




    }
    public void HOME(View v) {
        Intent envia = new Intent(this, MainActivity.class);
        finish();
        startActivity(envia);
    }
}
