package com.example.sesion14olmoscm_toast;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {//inicia clase

    Button btnPrimero, btnSegundo, btnTercero;


    @Override
    protected void onCreate(Bundle savedInstanceState) {//inicia metodo onCreate
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnPrimero=findViewById(R.id.btnPrimero);
        btnSegundo=findViewById(R.id.btnSegundo);
        btnTercero=findViewById(R.id.btnTercero);
    }//termina metodo oncreate



    public void primerToast(View view){//inicia metodo
        Context context = getApplicationContext();
        CharSequence mensaje="Mensaje TOAST \nVictor Olmos \n CM";
        int duration=Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context,mensaje,duration);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();
            //Toast integrado
            Toast.makeText(this,"Ventana Emergente 1",Toast.LENGTH_LONG).show();
        }//termina metodo

    public void segundoToast(View view){//inicia metodo
        Context context = getApplicationContext();
        CharSequence mensaje="Mensaje TOAST \nSegundo Boton \n CM";
        int duration=Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context,mensaje,duration);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();
        //Toast integrado
        Toast.makeText(this,"Ventana Emergente Boton 2",Toast.LENGTH_LONG).show();
    }//termina metodo

    public void tercerToast(View view){//inicia metodo
        Context context = getApplicationContext();
        CharSequence mensaje="Mensaje TOAST \nTercer Boton \n CM";
        int duration=Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context,mensaje,duration);
        toast.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toast.show();
        //Toast integrado
        Toast.makeText(this,"Ventana Emergente Boton 3",Toast.LENGTH_LONG).show();
    }//termina metodo

    //Toast personalizado con XML
    public void toastPesonalizadoXML1(View view){
        //Inflater=> Ejecucion, vizualizacion, desplegado de vista
        LayoutInflater inflater=getLayoutInflater();
        View layout = inflater.inflate(R.layout.toast2,null);

        Toast toastXML =new Toast(getApplicationContext());
        toastXML.setGravity(Gravity.CENTER_VERTICAL,0,0);
        toastXML.setDuration(Toast.LENGTH_LONG);

        //Integracion de los elementos
        toastXML.setView(layout);
        toastXML.show();

    }//Termina clase

}//termina clase