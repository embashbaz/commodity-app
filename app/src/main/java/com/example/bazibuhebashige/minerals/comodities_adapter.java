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

       LayoutInflater inflater= LayoutInflater.from(context);

       View view = inflater.inflate(R.layout.list_comodities, viewgroup, false);

       return new myviewholder(view);
   }
   @Override
    public  void onBindViewHolder(myviewholder holder, int position) {
       String initInfo = allofthem[position];
       holder.comtextview.setText(initInfo);

       specmin = initInfo;
   }
   @Override

    public int getItemCount (){return allofthem.length;}


}
