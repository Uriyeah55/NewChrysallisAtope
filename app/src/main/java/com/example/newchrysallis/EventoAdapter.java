package com.example.newchrysallis;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import java.util.ArrayList;
import java.util.List;


public class EventoAdapter extends ArrayAdapter<Evento> {

    private Context mContext;
    private List<Evento> listEvents = new ArrayList<>();

    public EventoAdapter(@NonNull Context context, @SuppressLint("SupportAnnotationUsage") @LayoutRes ArrayList<Evento> list) {
        super(context, 0 , list);
        mContext = context;
        listEvents = list;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.evento,parent,false);

        Evento currentEvento = listEvents.get(position);

        TextView titulo = (TextView) listItem.findViewById(R.id.txtTitulo);
        titulo.setText(currentEvento.getNombre());

        TextView ubicacion = (TextView) listItem.findViewById(R.id.txtUbicacion);
        ubicacion.setText(currentEvento.getLocalidad().toString());

                  //fecha=listItem.findViewById(R.id.txtFecha);
                   //hora=listItem.findViewById(R.id.txtHora);
        TextView numAsistentes = (TextView) listItem.findViewById(R.id.txtUbicacion);
        numAsistentes.setText(Integer.toString(currentEvento.getAforo()));





        return listItem;
    }
}