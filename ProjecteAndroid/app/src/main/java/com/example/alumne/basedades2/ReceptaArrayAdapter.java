package com.example.alumne.basedades2;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class ReceptaArrayAdapter  extends ArrayAdapter<Recepta> {
    private Context context;
    private List<Recepta> receptes;
    Recepta rec;
    TextView nom, falten;
    ImageView totok;

    public ReceptaArrayAdapter(Context context, int resource, ArrayList<Recepta> objects) {
        super(context, resource, objects);
        this.context = context;
        this.receptes = objects;
    }

    public View getView(final int position, View convertView, final ViewGroup parent) {

        rec = receptes.get(position);
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
        View view =  inflater.inflate(R.layout.recepta_a_llista, null);
        nom = (TextView) view.findViewById(R.id.textView6);
        falten = (TextView) view.findViewById(R.id.textView7);
        totok = (ImageView) view.findViewById(R.id.imageView4);
        nom.setText(rec.getNom());
        String faltaing = "";
        ArrayList<Ingredient> ings = rec.getIngredients();
        for(int i = 0; i < ings.size(); i++){
            if(!ings.get(i).isQueda()) faltaing += ings.get(i).getNom();
        }
        falten.setText(faltaing);
        if(faltaing.length() >0){
            totok.setVisibility(View.INVISIBLE);
        }else{
            totok.setVisibility(View.VISIBLE);
        }
        return view;
    }
}
