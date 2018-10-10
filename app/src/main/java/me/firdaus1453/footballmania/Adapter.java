package me.firdaus1453.footballmania;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends RecyclerView.Adapter<Adapter.ViewHolder> {
    // TODO 1 Membuat variable
    Context context;
    int[] gambarClub;
    String[] namaClub,detailClub;

    public Adapter(Context context, int[] gambarClub, String[] namaClub, String[] detailClub) {
        this.context = context;
        this.gambarClub = gambarClub;
        this.namaClub = namaClub;
        this.detailClub = detailClub;
    }

    @Override
    public Adapter.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_club, viewGroup, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(Adapter.ViewHolder viewHolder, int i) {
        viewHolder.txtNama.setText(namaClub[i]);
        viewHolder.imgLogo.setImageResource(gambarClub[i]);
    }

    @Override
    public int getItemCount() {
        return gambarClub.length;
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        ImageView imgLogo;
        TextView txtNama;
        public ViewHolder(View itemView) {
            super(itemView);
            imgLogo = itemView.findViewById(R.id.imgList);
            txtNama = itemView.findViewById(R.id.txtListTitle);
        }
    }
}
