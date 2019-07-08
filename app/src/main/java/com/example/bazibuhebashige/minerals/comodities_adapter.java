package com.example.bazibuhebashige.minerals;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

import static android.content.ContentValues.TAG;
import static com.example.bazibuhebashige.minerals.products.someofthem;






public class comodities_adapter extends RecyclerView.Adapter<comodities_adapter.myviewholder> implements Filterable {

    //String[][]oneofthem=someofthem;

    public static List<String> flatten(String[][] data) {
        List<String> list = new ArrayList<>();

        for(int i = 0; i < data.length; i++) {
            for(int j = 0; j < data[i].length; j++){
                list.add(data[i][0]);
            }
        }

        return list;
    }


    private List<String> all = flatten(someofthem);
    private List<String> some= new ArrayList<>(all);





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
            String specific = all.get(adapterPosition);
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
       String initInfo = all.get(position);
       holder.comtextview.setText(initInfo);

       specmin = initInfo;
   }
   @Override

    public int getItemCount (){return all.size();}

    @Override
    public Filter getFilter() {
        return filter;
    }

    private Filter filter = new Filter() {
        @Override
        protected FilterResults performFiltering(CharSequence constraint) {
            List<String> filtedlist = new ArrayList<>();

            if(constraint==null || constraint.length()==0)
                filtedlist.addAll(some);
            else{
                String filterpatern = constraint.toString().toLowerCase().trim();

                for(String item: some){
                    if(item.toLowerCase().contains(filterpatern))
                        filtedlist.add(item);
                }

            }

            FilterResults result = new FilterResults();
            result.values = filtedlist;

            return  result;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            all.clear();
            all.addAll((List) results.values);
            notifyDataSetChanged();
        }
    };


}
