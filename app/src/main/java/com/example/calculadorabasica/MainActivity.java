package com.example.calculadorabasica;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;


import bsh.EvalError;
import bsh.Interpreter;



public class MainActivity extends AppCompatActivity {
    Button btnRaiz, btnPi,btnPotencia,btnFactorial,btnParentesisAbierto,btnSeno,btnCos,btnTangente,btnParentesisCerrado,btnE,btnLogaritNatural,btnLogaritmo,btnAC,btnradiasexa,btnPorcentaje,btnDivicion,btnSiete,btnOcho,btnNueve,
            btnPor,btnCuatro,btnCinco,btnSeis,btnMenos,btnUno,btnDos,btnTres,btnMas,btnCero,btnPunto,btnIgual;
    ImageButton btnBorrar;
    TextView txtResultado;
    String problema="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnRaiz=(Button) findViewById(R.id.btnRaiz);
        btnPi=(Button) findViewById(R.id.btnPi);
        btnPotencia=(Button) findViewById(R.id.btnPotencia);
        btnFactorial=(Button) findViewById(R.id.btnFactorial);
        btnParentesisAbierto=(Button) findViewById(R.id.btnParentesisAbierto);
        btnSeno=(Button) findViewById(R.id.btnSeno);
        btnCos=(Button) findViewById(R.id.btnCos);
        btnTangente=(Button) findViewById(R.id.btnTangente);
        btnParentesisCerrado=(Button) findViewById(R.id.btnParentesisCerrado);
        btnE=(Button) findViewById(R.id.btnE);
        btnLogaritNatural=(Button) findViewById(R.id.btnLogaritNatural);
        btnLogaritmo=(Button) findViewById(R.id.btnLogaritmo);
        btnAC=(Button) findViewById(R.id.btnAC);
        btnradiasexa=(Button) findViewById(R.id.btnradiasexa);
        btnPorcentaje=(Button) findViewById(R.id.btnPorcentaje);
        btnDivicion=(Button) findViewById(R.id.btnDivicion);
        btnSiete=(Button) findViewById(R.id.btnSiete);
        btnOcho=(Button) findViewById(R.id.btnOcho);
        btnNueve=(Button) findViewById(R.id.btnNueve);
        btnPor=(Button) findViewById(R.id.btnPor);
        btnCuatro=(Button) findViewById(R.id.btnCuatro);
        btnCinco=(Button) findViewById(R.id.btnCinco);
        btnSeis=(Button) findViewById(R.id.btnSeis);
        btnMenos=(Button) findViewById(R.id.btnMenos);
        btnUno=(Button) findViewById(R.id.btnUno);
        btnDos=(Button) findViewById(R.id.btnDos);
        btnTres=(Button) findViewById(R.id.btnTres);
        btnMas=(Button) findViewById(R.id.btnMas);
        btnCero=(Button) findViewById(R.id.btnCero);
        btnPunto=(Button) findViewById(R.id.btnPunto);
        btnBorrar=(ImageButton) findViewById(R.id.btnBorrar);
        btnIgual=(Button) findViewById(R.id.btnIgual);
        txtResultado=(TextView) findViewById(R.id.txtResultado);



        btnRaiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"√(";
                txtResultado.setText(problema);
//                double numero1=Double.parseDouble(txtNum1.getText().toString());
//                double numero2=Double.parseDouble(txtNum2.getText().toString());
//                double resultado=numero1+numero2;
//                txtResultado.setText("El resultado es : "+resultado);
            }

        });
        btnPi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"π";
                txtResultado.setText(problema);
            }
        });
        btnPotencia.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"^";
                txtResultado.setText(problema);

            }
        });
        btnFactorial.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"!";
                txtResultado.setText(problema);

            }
        });
        btnParentesisAbierto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"(";
                txtResultado.setText(problema);
                }
        });
        btnSeno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"sin(";
                txtResultado.setText(problema);
            }
        });
        btnCos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"cos(";
                txtResultado.setText(problema);
            }
        });
        btnTangente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"tan(";
                txtResultado.setText(problema);

            }
        });
        btnParentesisCerrado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+")";
                txtResultado.setText(problema);
            }
        });
        btnE.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"e";
                txtResultado.setText(problema);

            }
        });
        btnLogaritNatural.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"ln(";
                txtResultado.setText(problema);
            }
        });
        btnLogaritmo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"log(";
                txtResultado.setText(problema);
            }
        });
        btnAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema="";
                txtResultado.setText("");
            }
        });
        btnradiasexa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(btnradiasexa.getText()=="SXG") {
                    btnradiasexa.setText("RAD");
                }else{
                    btnradiasexa.setText("SXG");
                }
            }
        });
        btnPorcentaje.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"%";
                txtResultado.setText(problema);
            }
        });
        btnDivicion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"➗";
                txtResultado.setText(problema);

            }
        });
        btnSiete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"7";
                txtResultado.setText(problema);
            }
        });
        btnOcho.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"8";
                txtResultado.setText(problema);

            }
        });
        btnNueve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"9";
                txtResultado.setText(problema);
            }
        });
        btnPor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"✖";
                txtResultado.setText(problema);
            }
        });
        btnCuatro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"4";
                txtResultado.setText(problema);

            }
        });
        btnCinco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"5";
                txtResultado.setText(problema);

            }
        });
        btnSeis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"6";
                txtResultado.setText(problema);
            }
        });
        btnMenos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"➖";
                txtResultado.setText(problema);

            }
        });
        btnUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"1";
                txtResultado.setText(problema);
            }
        });
        btnDos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"2";
                txtResultado.setText(problema);

            }
        });
        btnTres.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"3";
                txtResultado.setText(problema);
            }
        });
        btnMas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"➕";
                txtResultado.setText(problema);

            }
        });
        btnCero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+"0";
                txtResultado.setText(problema);
            }
        });
        btnPunto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                problema=problema+".";
                txtResultado.setText(problema);
            }
        });
        btnBorrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(problema.length()-1>=0) {
                    problema = problema.substring(0, problema.length() - 1);
                    txtResultado.setText(problema);
                }


            }
        });
        btnIgual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Interpreter interpreter = new Interpreter();

                try {
                    if(problema.contains("!")){

                        String factor="";

                        for (int i = 0; i <problema.length(); i++) {

                            if(problema.charAt(i)=='!') {

                                for (int u = i-1; u >=0; u--) {

                                    if (!Character.isDigit(problema.charAt(u))) {

                                            problema=problema.replace(factor+"!",factorial(Long.parseLong(factor)));
                                            factor="";
                                            break;
                                    } else {
                                        factor = problema.charAt(u) + factor;
                                    }if(u-1<0){
                                        problema=problema.replace(factor+"!",factorial(Long.parseLong(factor)));
                                        factor="";
                                    }
                                }
                            }
                        }
                    }
                    if(problema.contains("^")){

                        String factor="";
                        String exponenete="";
                        for (int i = 0; i <problema.length()-1; i++) {

                            if(problema.charAt(i)=='^') {
                                for (int u = i + 1; u < problema.length(); u++) {

                                    if (!Character.isDigit(problema.charAt(u))) {

                                        if (problema.charAt(u) != '.') {
                                            for (int j = i - 1; j >= 0; j--) {
                                                if (!Character.isDigit(problema.charAt(j))) {

                                                    if (problema.charAt(j) != '.') {
                                                        problema = problema.replace(factor + "^" + exponenete,"Math.pow("+factor+","+exponenete+")");
                                                        factor = "";
                                                        exponenete = "";
                                                        break;
                                                    } else {

                                                        factor = problema.charAt(j) + factor;

                                                    }
                                                } else {
                                                    factor = problema.charAt(j) + factor;
                                                }
                                            }

                                        } else {
                                            exponenete = problema.charAt(u) + exponenete;
                                        }
                                    } else {
                                        exponenete = problema.charAt(u) + exponenete;
                                    }
                                    if(u+1==problema.length()){
                                        if(factor=="") {
                                            for (int j = i - 1; j >= 0; j--) {
                                                if (!Character.isDigit(problema.charAt(j))) {

                                                    if (problema.charAt(j) != '.') {
                                                        problema = problema.replace(factor + "^" + exponenete,"Math.pow("+factor+","+exponenete+")");
                                                        factor = "";
                                                        exponenete = "";
                                                        break;
                                                    } else {

                                                        factor = problema.charAt(j) + factor;
                                                    }
                                                } else {

                                                    factor = problema.charAt(j) + factor;
                                                }
                                            }
                                        }

                                        problema = problema.replace(factor + "^" + exponenete,"Math.pow("+factor+","+exponenete+")");
                                        factor="";
                                        exponenete="";

                                    }



                                }
                            }

                        }
                    }


                    if(btnradiasexa.getText()=="SXG"){
                        problema=problema.replace("sin(","Math.sin((Math.PI/180)*").replace("cos","Math.cos((Math.PI/180)*").replace("tan","Math.tan((Math.PI/180)*");

                    }else{
                        problema=problema.replace("sin","Math.sin").replace("cos","Math.cos")
                                .replace("tan","Math.tan");
                    }
                    if(problema.contains("(")) {
                        for (int i = 0; i <problema.length(); i++) {
                            if (problema.charAt(i)=='('&i!=0){
                                if(Character.isDigit(problema.charAt(i-1))){
                                    problema=problema.replace(problema.charAt(i-1)+"(",problema.charAt(i-1)+"*(");
                                }
                            }
                            if (problema.charAt(i)==')'& i!=problema.length()-1){
                                if(Character.isDigit(problema.charAt(i+1))){
                                    problema=problema.replace(")"+problema.charAt(i+1),")*"+problema.charAt(i+1));
                                }
                            }

                        }


                    }

                    problema=problema.replace("➕","+").replace("✖","*").replace("➖","-").replace("➗","/").replace("√","Math.sqrt")
                    .replace("π","Math.PI").replace("e","Math.E" ).replace("log","Math.log").replace("ln","Math.log10")
                            .replace("%","*1/100");
                    interpreter.eval("float result = (float)"+problema);



                    problema=interpreter.get("result").toString();
                    if(problema.charAt(problema.length()-1)=='0'&&problema.charAt(problema.length()-2)=='.'){
                        problema=problema.replace(".0","");
                    }
                    txtResultado.setText(problema);
                } catch (Error | EvalError e) {
                    Toast.makeText(MainActivity.this,"La Operacion no es Valida "+ e,Toast.LENGTH_SHORT).show();
                }
            }
        });



    }
    public String factorial(Long numero){
        int n=1;
        for(int i=1;i<=numero;i++){
            n=n*i;
        }
        return String.valueOf(n);
    }

}