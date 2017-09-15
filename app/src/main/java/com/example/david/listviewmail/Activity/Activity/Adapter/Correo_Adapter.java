package com.example.david.listviewmail.Activity.Activity.Adapter;


import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;
import com.example.david.listviewmail.Activity.Activity.Models.Correo;
import com.example.david.listviewmail.R;

import java.util.ArrayList;

/**
 * Created by David on 13/09/2017.
*/

public class Correo_Adapter extends BaseAdapter{

    private ArrayList<Correo> correos;
    private final int Largo_Msj=35;

    public Correo_Adapter(ArrayList<Correo> correos) {
        this.correos = correos;
    }


    @Override
    public int getCount() {
        return correos.size();
    }

    @Override
    public Object getItem(int position) {
        return correos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_correo,parent,false);
        if(convertView==null){
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.adapter_correo,parent,false);
        }
        else {
            view = convertView;
        }
        Correo correo = (Correo) getItem(position);
        
        TextView txtRemitente = (TextView) view.findViewById(R.id.txtRemitente);
        TextView txtAsunto = (TextView) view.findViewById(R.id.txtAsunto);
        TextView txtFecha = (TextView) view.findViewById(R.id.txtFecha);
        TextView txtMensaje = (TextView) view.findViewById(R.id.txtMensaje);
        TextView txtLetra = (TextView) view.findViewById(R.id.txtLetra);


        txtRemitente.setText(correo.getRemitente());
        txtAsunto.setText(correo.getAsunto());
        txtFecha.setText((correo.getFecha()));
        if(correo.getMensaje().length() > Largo_Msj)
        {
            txtMensaje.setText(correo.getMensaje().substring(0,Largo_Msj));
        }else {
            txtMensaje.setText(correo.getMensaje());
        }
        txtLetra.setText(correo.getRemitente().substring(0,1));
        txtLetra.getBackground().setColorFilter(Color.parseColor(correo.getColor()), PorterDuff.Mode.SRC);



        return view;
    }
}
