package mx.incorporation.typhoon.reserva;


import android.app.Activity;
import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Actividad2 extends Activity {

    String nombre = "", fecha = "", hora = "";
    int personas = 0;
    TextView muestraDatos;
    EditText usr, tel, eda, corr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.actividad2);

        usr = (EditText) findViewById(R.id.USUARIO);
        tel = (EditText) findViewById(R.id.TELEFONO);
        eda = (EditText) findViewById(R.id.EDAD);
        corr = (EditText) findViewById(R.id.editText4);

        muestraDatos = (TextView) findViewById(R.id.muestraDatos);

        Bundle recibe = new Bundle();
        recibe = this.getIntent().getExtras();

        nombre = recibe.getString("nombre");
        personas = recibe.getInt("personas");
        fecha = recibe.getString("fecha");
        hora = recibe.getString("hora");

        muestraDatos.setText("Reservacion a nombre de:\n" + nombre + "\n" + personas
                + " personas\nFecha: " + fecha + "\nHora: " + hora + "\n");

    }

    public void hacerOtraReserva(View v) {
        Intent envia = new Intent(this, MainActivity.class);
        finish();
        startActivity(envia);
    }
    public void ENVIO(View v) {
        Intent envia = new Intent(this, Actividad3.class);
        Bundle datos = new Bundle();
        datos.putString("Usuario", usr.getText().toString().trim());
        datos.putString("Edad", eda.getText().toString().trim());
        datos.putString("Telefono", tel.getText().toString().trim());
        datos.putString("Correo", corr.getText().toString().trim());

        envia.putExtras(datos);
        finish();
        startActivity(envia);
    }

}

