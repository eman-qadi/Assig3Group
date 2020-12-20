package com.eman.assig3firstgroupwork;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    private final String[] caption;
    private final int[] imageIds;
    private Activity activity;
    private Context context;
    public Adapter(String[] caption, int[] imageIds,Activity activity,Context context) {
        this.caption = caption;
        this.imageIds = imageIds;
        this.context=context;
        this.activity=activity;
    }
    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        CardView v= (CardView) LayoutInflater.from(parent.getContext()).inflate(R.layout.card,parent,false);
        return new ViewHolder(v);
    }
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        CardView cardView=holder.cardView;
        ImageView imageView=cardView.findViewById(R.id.image);
        Drawable dr = ContextCompat.getDrawable(cardView.getContext(),imageIds[position]);
        imageView.setImageDrawable(dr);
        TextView txt = cardView.findViewById(R.id.text);
        txt.setText(caption[position]);
        holder.mainLayout.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v) {

                Intent intent = new Intent(context, MarioDesc.class);
                intent.putExtra("id", String.valueOf(position));
                activity.startActivityForResult(intent, 1);
               // activity.startActivity(intent);
            }
        });
    }
    @Override
    public int getItemCount() {
        return caption.length;
    }
    public static class ViewHolder extends RecyclerView.ViewHolder {
        private final CardView cardView;
        LinearLayout mainLayout;
        public ViewHolder(@NonNull CardView cardView) {
            super(cardView);
            this.cardView= cardView;
            mainLayout = itemView.findViewById(R.id.mainLayout);
        }
    }
}