package edu.uniajc.mis_aves_colombianas;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class secondactivity extends AppCompatActivity {

    private int[] imgArr = {R.drawable.bichofue, R.drawable.torcasa, R.drawable.siriri, R.drawable.garcita, R.drawable.gallinazo, R.drawable.perico, R.drawable.mielero, R.drawable.cucarachero, R.drawable.azulejo, R.drawable.mayo};
    private int[] sndArr = {R.raw.bichofue, R.raw.torcaza, R.raw.siriri, R.raw.garcita, R.raw.gallinazo, R.raw.periquito, R.raw.mielero, R.raw.cucarachero, R.raw.azulejo, R.raw.mayo};
    private int count = -1;
    MediaPlayer mp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.ave);
    }

    public void referenceById (View view) {
        setCount(count + 1);
        if (count > 9){
            setCount(0);
        }
        MainActivity mnt = new MainActivity();
        mnt.AgregarAve();
        ave ave = (ave) mnt.getAve().get(getCount());
        TextView titulo = (TextView) findViewById(R.id.titulo);
        TextView descripcion = (TextView) findViewById(R.id.descripcion);
        ImageView imagen = (ImageView) findViewById(R.id.imagen);
        imagen.setImageResource(imgArr[getCount()]);
        ImageButton btnSonido = (ImageButton)findViewById(R.id.sonido);
        mp = MediaPlayer.create(this, sndArr[getCount()]);
        btnSonido.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mp.start();
            }
        });
        titulo.setText(ave.getTitulo());
        descripcion.setText(ave.getDescripcion());
    }

    public void referenceByIdAnt (View view) {
        setCount(count - 1);
        if (count < 0){
            setCount(9);
        }
        MainActivity mnt = new MainActivity();
        mnt.AgregarAve();
        ave ave = (ave) mnt.getAve().get(getCount());
        TextView titulo = (TextView) findViewById(R.id.titulo);
        TextView descripcion = (TextView) findViewById(R.id.descripcion);
        ImageView imagen = (ImageView) findViewById(R.id.imagen);
        imagen.setImageResource(imgArr[getCount()]);
        ImageButton btnSonido = (ImageButton)findViewById(R.id.sonido);
        mp = MediaPlayer.create(this, sndArr[getCount()]);
        btnSonido.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                mp.start();
            }
        });
        titulo.setText(ave.getTitulo());
        descripcion.setText(ave.getDescripcion());
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
