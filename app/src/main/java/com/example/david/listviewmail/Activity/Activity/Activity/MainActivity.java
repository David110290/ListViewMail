package com.example.david.listviewmail.Activity.Activity.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import com.example.david.listviewmail.Activity.Activity.Adapter.Correo_Adapter;
import com.example.david.listviewmail.Activity.Activity.Models.Correo;
import com.example.david.listviewmail.R;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch ((item.getItemId())){
            case R.id.mnu_Refrescar:
                Toast.makeText(MainActivity.this,"Refrescar",Toast.LENGTH_SHORT).show();
                return true;
            case R.id.mnu_Salir:
                finish();
                return true;
            default:
                return  super.onOptionsItemSelected(item);
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Correo> correos= new ArrayList<>();

        this.Lista(correos);

        ListView listaCorreos = (ListView) findViewById(R.id.listaCorreos);

        listaCorreos.setAdapter(new Correo_Adapter(correos));
        listaCorreos.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                Correo msj_select = correos.get(position);
                //Toast.makeText(MainActivity.this,""+msj_select.getMail(),Toast.LENGTH_SHORT).show();
                msjs(msj_select);

            }
        });
    }

    private  void  Lista(ArrayList<Correo> correos){

        correos.add(new Correo("Lucas Rosane","lucas@rosane.com","Fiesta","Te invito a una fiesta que se celebrara en mi casa por motivo de mi cumpleaños","11/02/17","#01758C"));
        correos.add(new Correo("Matias Gonzalez","Matias@Gonzalez.com","Reunion","Se le comunica que el dia miercoles se llevara a cabo una rauinion con el fin de mejorar las relaciones laborales","16/04/17","#8C1A01"));
        correos.add(new Correo("Javier Rodriguez","Javier@Rodriguez.com","Deuda","Se le solicita dirigirse a nuestras oficinas con motivo de solucionar su deuda","16/04/17","#8C0101"));
        correos.add(new Correo("Nicolas Dominguez","Nicolas@Dominguez.com","Reunion Escolar","Con motivo de mejorar la educacion de su hijo se lo invita a una reunion a llevarse a cabo en el colegio","19/04/17","#97D566"));
        correos.add(new Correo("Alexis Lopez","Alexis@Lopez.com","Informe de rendimiento","Se adjunta un archivo que muestra el rendimiento de los empleados","23/04/17","#6675D5"));
        correos.add(new Correo("Santiago Ferreira","Santiago@Ferreira.com","Felicitaciones","La empresa a decidido entregarle el merito al mjor empleado del mes","01/05/17","#8C1A01"));
        correos.add(new Correo("Maria Gomez","Maria@Gomez.com","Ofertas","Estas son las ofertas que se brindan este mes","03/05/17","#BF66D5"));
        correos.add(new Correo("Fernanda Aguilar","fernanda@Aguilar.com","Renovacion de seguro","Se le comunica su polisa de seguro esta por expirar por favor dirijase a nuestras oficinas","03/05/17","#55CD3D"));
        correos.add(new Correo("Marcela Gonzalez","Marcela@Gonzalez.com","Recibo de sueldo","Se el recibo de sueldo correspondiente al mes","07/05/17","#CDAA3D"));
        correos.add(new Correo("Marcos Sanchez","Marcos@sanchez.com","Verificacion de cuenta","Hemos recibido una subscripcion correspondiente a su correo por favor haga click en el enlace","12/05/17","#6675D5"));
        correos.add(new Correo("Daniela Gimenez","daniela@Gimenez.com","Reserva de turnos","El turno solicitado ya se encuentra disponible","23/05/17","#783DCD"));


    }
    private void msjs(Correo msj_select){
        Intent intent = new Intent(this, Activity_Msj.class);
        //Toast.makeText(MainActivity.this,""+msj_select.getMail(),Toast.LENGTH_SHORT).show();
        intent.putExtra("MAIL",msj_select.getMail());
        intent.putExtra("REMITENTE",msj_select.getRemitente());
        intent.putExtra("ASUNTO",msj_select.getAsunto());
        intent.putExtra("MENSAJE",msj_select.getMensaje());
        startActivity(intent);
    }
}
