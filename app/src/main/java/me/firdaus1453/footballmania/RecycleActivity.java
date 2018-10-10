package me.firdaus1453.footballmania;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import butterknife.BindView;
import butterknife.ButterKnife;

public class RecycleActivity extends AppCompatActivity {

    // TODO 1 Mengenerate butterknife untuk recyclerview
    @BindView(R.id.my_recycler_view)
    RecyclerView myRecyclerView;

    // TODO 2 Membuat variable array untuk menampung data nama,detail dan gambar dari String Array pada values
    String[] namaClub,detailClub;
    int gambarClub[] = {R.drawable.img_barca,R.drawable.img_madrid, R.drawable.img_bayern, R.drawable.img_city, R.drawable.img_mu, R.drawable.img_arsenal, R.drawable.img_chelsea, R.drawable.img_acm};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycle);
        ButterKnife.bind(this);

        // TODO 3 Mengisi variable array dari folder res -> strings,drawable
        namaClub = getResources().getStringArray(R.array.club_name);
        detailClub = getResources().getStringArray(R.array.club_detail);
//        gambarClub = new int[]

        // TODO 4 Membuat Object adapter dan mengirim data nama,detail,dan gambar ke adapter
        Adapter adapter = new Adapter(RecycleActivity.this, gambarClub, namaClub, detailClub);
        // TODO 5 Mensetting recyclerview dan mengeset recycleview dengan adapter
        myRecyclerView.setHasFixedSize(true);
        myRecyclerView.setLayoutManager(new LinearLayoutManager(RecycleActivity.this));
        myRecyclerView.setAdapter(adapter);

    }
}
