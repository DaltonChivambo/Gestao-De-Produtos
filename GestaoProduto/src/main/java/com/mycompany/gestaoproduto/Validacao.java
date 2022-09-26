
package com.mycompany.gestaoproduto;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Validacao {
    
    BufferedReader x =
            new BufferedReader(new InputStreamReader(System.in));

    public int valInt(int menor,int maior,String texto) throws IOException {
        int val;
        do{
            System.out.println("Digite "+texto);
            val = Integer.parseInt(x.readLine());

            if(val<menor || val >maior)
                System.err.println("Dados Incorretos!!! Tente Novamente");
        }while (val<menor || val >maior);
        return val;
    }

    public float valFloat(float menor,float maior,String texto) throws IOException {
        float val;
        do{
            System.out.println("Digite "+texto);
            val = Float.parseFloat(x.readLine());

            if(val<menor || val >maior)
                System.err.println("Dados Incorretos!!! Tente Novamente");
        }while (val<menor || val >maior);
        return val;
    }

    public String valString(int menor,int maior,String texto) throws IOException {
        String val;
        do{
            System.out.println("Digite "+texto);
            val = x.readLine();

            if(val.length()<menor || val.length() >maior)
                System.err.println("Dados Incorretos!!! Tente Novamente");
        }while (val.length()<menor || val.length() >maior);
        return val;
    }
}
