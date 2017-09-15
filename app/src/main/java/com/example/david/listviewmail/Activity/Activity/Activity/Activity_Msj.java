package com.example.david.listviewmail.Activity.Activity.Activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import android.widget.Toast;

import com.example.david.listviewmail.R;

/**
 * Created by David on 13/09/2017.
 */

public class Activity_Msj extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate((R.menu.menu_msj),menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch ((item.getItemId())) {
            case R.id.mnu_Refres:

                Toast.makeText(Activity_Msj.this, "Refrescar", Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mnu_Atras:
                Toast.makeText(Activity_Msj.this, "Atras", Toast.LENGTH_SHORT).show();
                onBackPressed();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_msj);
        Bundle extras = getIntent().getExtras();

        TextView txtMail = (TextView) findViewById(R.id.txtMail);
        TextView txtRemitente = (TextView) findViewById(R.id.txtRemitente);
        TextView txtAsunto = (TextView) findViewById(R.id.txtAsunto);
        TextView txtMensaje = (TextView) findViewById(R.id.txtMensaje);


        txtMail.setText("Mail: "+extras.getString("MAIL"));
        txtRemitente.setText("Nombre: " + extras.getString("REMITENTE"));
        txtAsunto.setText("Asunto: " + extras.getString("ASUNTO"));
        txtMensaje.setText("Mensaje:\n\t\t\t\t\t\t\t\t\t\t" + extras.getString("MENSAJE"));
    }



}
