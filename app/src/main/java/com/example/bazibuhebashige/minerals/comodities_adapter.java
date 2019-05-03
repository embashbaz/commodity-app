package com.example.bazibuhebashige.minerals;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import static android.content.ContentValues.TAG;
import static com.example.bazibuhebashige.minerals.products.allofthem;






public class comodities_adapter extends RecyclerView.Adapter<comodities_adapter.myviewholder> {


    public interface adaptateronclickhandler {

        void onClick(String comodiry);
    }

    private final adaptateronclickhandler mclickHandler;
    private int numberitems= allofthem.length;
    String specmin;


    public comodities_adapter(adaptateronclickhandler clickHandler){
        mclickHandler = clickHandler;
    }

    public class myviewholder extends RecyclerView.ViewHolder implements View.OnClickListener {



       public final TextView comtextview;

       public myviewholder(View view){
           super(view);

           comtextview = view.findViewById(R.id.text_item);
           view.setOnClickListener(this);
       }
        @Override
        public void onClick(View v) {
            int adapterPosition = getAdapterPosition();
            String specific = allofthem[adapterPosition];
            mclickHandler.onClick(specific);
        }
       }


   @Override
    public myviewholder onCreateViewHolder (ViewGroup viewgroup, int numbervier){
      Context context = viewgroup.getContext();
      int iditem = R.layout.list_comodities;
       LayoutInflater inflater= LayoutInflater.from(context);

       boolean attachimediately = false;

       View view = inflater.inflate(iditem, viewgroup, attachimediately);

       return new myviewholder(view);
   }
   @Override
    public  void onBindViewHolder(myviewholder holder, int position) {
       String weatherForThisDay = allofthem[position];
       holder.comtextview.setText(weatherForThisDay);

       specmin = weatherForThisDay;
   }
   @Override

    public int getItemCount (){return numberitems;}

    public void setcomoiries(String[] mydata) {
        allofthem=mydata;
        notifyDataSetChanged();
    }
}
