package me.firdaus1453.footballmania;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreenActivity extends AppCompatActivity {
    // TODO 1 Membuat variable untuk logika koding kita
    private long ms = 0;
    private long splashTime = 3000;
    private  boolean splashActive = true;
    private boolean paused = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        // TODO 2 Membuat Thread
        Thread mythread = new Thread(){
            public void run(){
                try{
                    // TODO 3 Melakukan perulangan sampai ms > 3000
                    while(splashActive && ms < splashTime){
                        if (!paused){
                            ms = ms + 100;
                            sleep(100);
                        }
                    }
                }catch (Exception e) {

                }
                finally {
                    // TODO 4 setelah perulangan selesai maka akan berpindah halaman menggunakan intent
                        Intent intent = new Intent(SplashScreenActivity.this, MainActivity.class);
                    startActivity(intent);
                    finish();
                }
                }
            };
        // Menjalankan object mythread
        mythread.start();
    }
}
