package com.example.myapplication;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
public class MainActivity extends AppCompatActivity {
    //Variables globales
    TextView Res;
    double res;
    String op, showv, reser;

    @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Variables de tipo Button
        Button Buno, Bdos, Btres, Bcuatro, Bcinco, Bseis, Bsiete, Bocho, Bnueve, Bcero, Bpunto, Bmas, Bmenos, Bpor, Bdiv, Bigual, Bupdate;
        //Instancia o ligado de la parte lógica con la parte visual
        Buno = (Button) findViewById(R.id.Uno);
        Bdos = (Button) findViewById(R.id.Dos);
        Btres = (Button) findViewById(R.id.Tres);
        Bcuatro = (Button) findViewById(R.id.Cuatro);
        Bcinco = (Button) findViewById(R.id.Cinco);
        Bseis = (Button) findViewById(R.id.Seis);
        Bsiete = (Button) findViewById(R.id.Siete);
        Bocho = (Button) findViewById(R.id.Ocho);
        Bnueve = (Button) findViewById(R.id.Nueve);
        Bcero = (Button) findViewById(R.id.Cero);
        Bpunto = (Button) findViewById(R.id.Punto);
        Bmas = (Button) findViewById(R.id.Mas);
        Bmenos = (Button) findViewById(R.id.Menos);
        Bpor = (Button) findViewById(R.id.Por);
        Bdiv = (Button) findViewById(R.id.Entre);
        Bupdate = (Button) findViewById(R.id.Actualizar);
        Bigual = (Button) findViewById(R.id.Igual);
        Res=(TextView)findViewById(R.id.Vista);
        //Evento al momento de clickear algun boton
        Buno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View V) {
                showv = Res.getText().toString();
                showv = showv + "1";
                Res.setText(showv);
            }
        });
        Bdos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showv = Res.getText().toString();
                showv = showv + "2";
                Res.setText(showv);
            }
        });
        Btres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showv = Res.getText().toString();
                showv = showv + "3";
                Res.setText(showv);
            }
        });
        Bcuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showv = Res.getText().toString();
                showv = showv + "4";
                Res.setText(showv);
            }
        });
        Bcinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showv = Res.getText().toString();
                showv = showv + "5";
                Res.setText(showv);
            }
        });
        Bseis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showv = Res.getText().toString();
                showv = showv + "6";
                Res.setText(showv);
            }
        });
        Bsiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showv = Res.getText().toString();
                showv = showv + "7";
                Res.setText(showv);
            }
        });
        Bocho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showv = Res.getText().toString();
                showv = showv + "8";
                Res.setText(showv);
            }
        });
        Bnueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showv = Res.getText().toString();
                showv = showv + "9";
                Res.setText(showv);
            }
        });
        Bcero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showv = Res.getText().toString();
                showv = showv + "0";
                Res.setText(showv);
            }
        });
        Bpunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showv = Res.getText().toString();
                showv = showv + ".";
                Res.setText(showv);
            }
        });
        Bmas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reser = Res.getText().toString();
                op = "+";
                Res.setText("");
            }
        });
        Bmenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reser = Res.getText().toString();
                op = "-";
                Res.setText("");
            }
        });
        Bpor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reser = Res.getText().toString();
                op = "*";
                Res.setText("");
            }
        });
        Bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                reser = Res.getText().toString();
                op = "/";
                Res.setText("");
            }
        });
        Bupdate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showv = "";
                Res.setText(showv);
                reser = "";
                op = "";
            }
        });
        //Evento que genera las operaciones
        Bigual.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                showv = Res.getText().toString();
                showv = showv + "1";
                if (op.equals("-")) {
                    res = Double.parseDouble(reser) - Double.parseDouble(Res.getText().toString());
                    Res.setText(String.valueOf(res));
                }
                if (op.equals("+")) {
                    res = Double.parseDouble(reser) + Double.parseDouble(Res.getText().toString());
                    Res.setText(String.valueOf(res));
                }
                if (op.equals("/")) {
                    res = Double.parseDouble(reser) / Double.parseDouble(Res.getText().toString());
                    Res.setText(String.valueOf(res));
                }
                if (op.equals("*")) {
                    res = Double.parseDouble(reser) * Double.parseDouble(Res.getText().toString());
                    Res.setText(String.valueOf(res));
                }
            }
        });
    }
}
