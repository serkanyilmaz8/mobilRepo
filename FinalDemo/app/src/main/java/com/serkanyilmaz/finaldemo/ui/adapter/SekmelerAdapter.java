package com.serkanyilmaz.finaldemo.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.serkanyilmaz.finaldemo.data.entity.Sekmeler;
import com.serkanyilmaz.finaldemo.data.entity.Urunler;
import com.serkanyilmaz.finaldemo.databinding.SekmelerCardTasarimBinding;
import com.serkanyilmaz.finaldemo.databinding.ShoppingCardTasarimBinding;
import com.serkanyilmaz.finaldemo.ui.fragment.AnasayfaFragmentDirections;
import com.serkanyilmaz.finaldemo.ui.fragment.ShoppingAnasayfaFragmentDirections;

import java.util.List;

public class SekmelerAdapter extends RecyclerView.Adapter<SekmelerAdapter.sekmelerCardTasarimTutucu>{
    private Context mContext;
    private List<Sekmeler> sekmelerList;

    public SekmelerAdapter(Context mContext, List<Sekmeler> sekmelerList) {
        this.mContext = mContext;
        this.sekmelerList = sekmelerList;
    }


    public class sekmelerCardTasarimTutucu extends RecyclerView.ViewHolder{
        private SekmelerCardTasarimBinding tasarim;
        public sekmelerCardTasarimTutucu(SekmelerCardTasarimBinding tasarim) {
            super(tasarim.getRoot());
            this.tasarim = tasarim;
        }
    }

    @NonNull
    @Override
    public sekmelerCardTasarimTutucu onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        SekmelerCardTasarimBinding binding =
                SekmelerCardTasarimBinding.inflate(LayoutInflater.from(mContext), parent, false);
        return new sekmelerCardTasarimTutucu(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull sekmelerCardTasarimTutucu holder, int position) {
        Sekmeler sekme = sekmelerList.get(position);
        SekmelerCardTasarimBinding t = holder.tasarim;

        t.imageViewSekme.setImageResource(
                mContext.getResources()
                        .getIdentifier(sekme.getSekmeResim(), "drawable", mContext.getPackageName()));
        t.textViewSekmeAd.setText(sekme.getSekmeAd());
        t.cardViewSekme.setOnClickListener(view -> {
            if(position == 1){
                AnasayfaFragmentDirections.AnasayfaShoppingAnasayfaGecis gecis = AnasayfaFragmentDirections.anasayfaShoppingAnasayfaGecis(sekme);
                Navigation.findNavController(view).navigate(gecis);
            } else if (position == 2) {
                AnasayfaFragmentDirections.AnasayfaRommateAnasayfaGecis gecis = AnasayfaFragmentDirections.anasayfaRommateAnasayfaGecis(sekme);
                Navigation.findNavController(view).navigate(gecis);
            }else{
                AnasayfaFragmentDirections.AnasayfaPlacesAnasayfaGecis gecis = AnasayfaFragmentDirections.anasayfaPlacesAnasayfaGecis(sekme);
                Navigation.findNavController(view).navigate(gecis);
            }
        });
    }

    @Override
    public int getItemCount() {
        return sekmelerList.size();
    }



}
