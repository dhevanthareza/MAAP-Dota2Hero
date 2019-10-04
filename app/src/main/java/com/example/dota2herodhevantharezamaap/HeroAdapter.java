package com.example.dota2herodhevantharezamaap;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

public class HeroAdapter extends RecyclerView.Adapter<HeroAdapter.CardViewHolder> {
    private ArrayList<Hero> listHero;
    public HeroAdapter(ArrayList<Hero> list) {
        this.listHero = list;
    }
    @NonNull
    @Override
    public CardViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.item_cardview, viewGroup, false);
        return new CardViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewHolder holder, int position) {
        final Hero hero = listHero.get(position);
        Glide.with(holder.itemView.getContext())
                .load(hero.getImage())
                .apply(new RequestOptions().override(350,550))
                .into(holder.imgPhoto);
        holder.tvName.setText(hero.getName().toUpperCase());
        holder.btnDetail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(holder.itemView.getContext(), DetailActivity.class);
                intent.putExtra(DetailActivity.EXTRA_NAME, hero.getName());
                intent.putExtra(DetailActivity.EXTRA_DETAIL, hero.getDetail());
                intent.putExtra(DetailActivity.EXTRA_IMAGE, hero.getImage());
                holder.itemView.getContext().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return listHero.size();
    }

    public class CardViewHolder extends RecyclerView.ViewHolder {
        ImageView imgPhoto;
        TextView tvName;
        Button btnDetail;
        CardViewHolder(@NonNull View itemView) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            tvName = itemView.findViewById(R.id.tv_item_name);
            btnDetail = itemView.findViewById(R.id.btn_detail);
        }
    }
}
