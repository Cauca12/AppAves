package edu.uniajc.mis_aves_colombianas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<ave> Ave = new ArrayList();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void AgregarAve(){
        ave datos = new ave("1.Bichofué", "Esta es una de las especies más comunes del Valle de Aburrá. Se puede encontrar solitaria o en pareja en parques, jardines y áreas de potrero. Es un ave ruidosa, irascible y oportunista: se alimenta de pequeños vertebrados, peces, frutas e insectos.");
        getAve().add(datos);
        datos = new ave("2.Tortolita común", "Es un ave adaptada a ambientes intervenidos por el hombre, por ello es tan común en el casco urbano del Valle de Aburrá, bosques secundarios y áreas de cultivo. Suelen recibir comida de personas.");
        getAve().add(datos);
        datos = new ave("3.Sirirí común", "Es muy común verla en áreas urbanas, calles y parques arbolados, perchada en alambres y árboles. Sus trinos son ásperos, poco musicales.");
        getAve().add(datos);
        datos = new ave("4.Garcita bueyera", "Esta garza pequeña y fornida es común en terrenos abiertos, humedales de agua dulce, arroyos y áreas urbanas. Es la garza más común en los potreros del Valle del Aburrá.");
        getAve().add(datos);
        datos = new ave("5.Gallinazo negro", "Abunda en basureros y mataderos de ganado. Tienen una gran importancia ecológica, pues sin ellos la basura y cadáveres permanecerían expuestos, y aumentaría la propagación de plagas y enfermedades.");
        getAve().add(datos);
        datos = new ave("6.Periquito bronceado", "Esta es una de las aves que más suelen ser privadas de su libertad para usarse como mascota. Ocasionalmente se observan algunos individuos en el Valle de Aburrá, posiblemente escapados de su cautiverio.");
        getAve().add(datos);
        datos = new ave("7.Mielero", "Esta es un ave pequeña y activa que suele estar solitaria o en pareja. Es común verla en parques y jardines, buscando néctar en flores y bayas.");
        getAve().add(datos);
        datos = new ave("8.Cucarachero Común", "Esta pequeña ave de plumaje poco vistoso es una de las cantoras más vivaces y alegres del Valle de Aburrá ya que posee un variado repertorio de cantos.");
        getAve().add(datos);
        datos = new ave("9.Azulejo", "Esta ave sociable y activa suele estar en pareja, grupos y en ocasiones con el azulejo palmero. Se alimenta de insectos, frutos, flores y también en comederos artificiales.");
        getAve().add(datos);
        datos = new ave("10.Mayo", "Es un ave mediana, de plumaje discreto que suele encontrarse en áreas abiertas como parques y jardines. Suele estar solitaria o en pareja, posado en arbustos o saltando por los prados en busca de lombrices y frutos.");
        getAve().add(datos);
    }

    public void onClick(View view){
        Intent miIntent = new Intent(this, secondactivity.class);
        startActivity(miIntent);
    }

    public ArrayList<ave> getAve() {
        return Ave;
    }
}