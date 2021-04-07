package com.example.newchrysallis;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class EventoAdapter extends RecyclerView.Adapter<EventoAdapter.ViewHolder> implements View.OnClickListener
{

    private Evento [] eventos;
    private View.OnClickListener listener;

    public EventoAdapter( Evento [] eventos)
    {

        this.eventos = eventos;
    }

    static class ViewHolder extends RecyclerView.ViewHolder
    {
        TextView titulo;
        TextView ubicacion;
        TextView fecha;
        TextView hora;
        TextView numAsistentes;

        public ViewHolder(@NonNull View item) {
            super(item);

            titulo=item.findViewById(R.id.txtTitulo);
            ubicacion=item.findViewById(R.id.txtUbicacion);
            fecha=item.findViewById(R.id.txtFecha);
            hora=item.findViewById(R.id.txtHora);
            numAsistentes=item.findViewById(R.id.txtAsist);
        }

        void bindEvento(Evento evento)
        {
            titulo.setText(evento.getNombre());
            ubicacion.setText((CharSequence) evento.getLocalidad());
            fecha.setText((CharSequence) evento.getFecha());
            hora.setText("12:00");
            numAsistentes.setText("Asistentes:" + evento.getNumeroAforo());
            //imagenJuego.setImageResource(juego.getImage());
        }
    }
    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewtype)
    {
        View item = LayoutInflater.from(parent.getContext()).inflate(R.layout.evento,parent,false);
        item.setOnClickListener((this));
        return new ViewHolder(item);
    }
    public void onBindViewHolder(ViewHolder holder, int position)
    {
        holder.bindEvento(eventos[position]);
    }
    public int getItemCount()
    {
        return eventos.length;
    }

    public void setOnClickListener(View.OnClickListener listener)
    {
        this.listener = listener;
    }


    public void onClick(View view)
    {
        if(listener != null)
        {
            listener.onClick(view);
        }
    }

}

/*


public class ContacteAdapter extends ArrayAdapter<Contacte> {

private Context mContext;
private List<Contacte> llistaContactes = new ArrayList<>();

public ContacteAdapter(@NonNull Context context, @SuppressLint("SupportAnnotationUsage") @LayoutRes ArrayList<Contacte> list) {
super(context, 0 , list);
mContext = context;
llistaContactes = list;
}

@NonNull
@Override
public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
View listItem = convertView;
if(listItem == null)
listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item,parent,false);

Contacte currentContacte = llistaContactes.get(position);

ImageView image1 = (ImageView)listItem.findViewById(R.id.imageView1);
image1.setImageResource(currentContacte.getImageDrawable1());

TextView name = (TextView) listItem.findViewById(R.id.textContacte);
name.setText(currentContacte.getNom());

ImageView image2 = (ImageView)listItem.findViewById(R.id.imageView2);
image2.setImageResource(currentContacte.getImageDrawable2());



return listItem;
}
}*/