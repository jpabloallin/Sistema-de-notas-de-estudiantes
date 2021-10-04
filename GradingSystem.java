import java.util.Scanner;


public class GradingSystem {

    Scanner Entrada = new Scanner(System.in);
    public int Registros;
    public Double Registro [][];
    public String [] datos;
    public String nombres [] = {"armando","nicolas","daniel","maria","marcela","alexandra"};
    double promedio1 =0, promedio2= 0;
    int cantidadNotas = 0;
    double notasSobr =0;
    double sumatoriaM  = 0, cantidadM =0, sumatoriaF  = 0, cantidadF = 0;
      
    public double stat1(){        
        for (int fila = 0; fila < Registros; fila++){
            for (int columna = 0; columna <4; columna++){
                cantidadNotas += 1;                 
                promedio1 += Registro[fila][3];
                promedio2 += (Registro[fila][3] * Registro[fila][3]);
            }
            }
        double varianza = promedio2 / (cantidadNotas)-(promedio1*promedio1)/(cantidadNotas*(cantidadNotas));
        return varianza;
    }
    public double stat2(){
        for (int fila = 0; fila < Registros; fila++){
             for (int columna = 0; columna <4; columna++){                 
                if(Registro[fila][3] >8 && Registro[fila][3] <=9){
                    notasSobr +=1; 
                }
            }
            }
        double PorcentajeSobr = notasSobr / cantidadNotas;
        return PorcentajeSobr;
    }
    public String stat3(){      
        for (int fila = 0; fila < Registros; fila++){
            for (int columna = 0; columna <4; columna++){
                if(Registro[fila][1] == 0.0){
                    sumatoriaM += Registro[fila][3];
                    cantidadM += 1;}
                 if(Registro[fila][1] == 1.0){
                    sumatoriaF += Registro[fila][3];
                    cantidadF += 1;}              
            }
            }
        double promedioM = sumatoriaM / cantidadM;
        double promedioF = sumatoriaF / cantidadF;
        if (promedioM > promedioF){
            String gen = "m";
            return gen;
        }
        else{
            String gen = "f";
            return gen;
        }
    }
    public String stat4(){
        String n;
        double max = Registro[0][3];
        int posicion = ((int)(Math.round(Registro[0][0])))-1;
        for (int fila = 0; fila < Registros; fila++){
            for (int columna = 0; columna <4; columna++){
                if(columna == 0 | columna ==2){
                     if(columna ==0){}
                     else{}}
                 else{}
                 if(Registro[fila][2] == 1.0){
                     if(max < Registro[fila][3]){
                         max = Registro[fila][3];
                         posicion = ((int)(Math.round(Registro[fila][0])))-1;
                    }
                }                                 
            }
            }
        return n = (nombres[posicion]);
    }
}
