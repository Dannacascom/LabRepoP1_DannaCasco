/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labrepop1_dannacasco;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Danna Casco
 */
public class LabRepoP1_DannaCasco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        Scanner entrada = new Scanner (System.in);
        Scanner entrada2 = new Scanner (System.in);


        int opcion = 0;
                        System.out.println("                              BIENVENID@                             ");
                        System.out.println("--------------------------------------------------------------------");
        do{ System.out.println("");
                        System.out.println("                                  Menu                               ");
                        System.out.println("                          1.Ajedrez Nordico.                          ");
                        System.out.println("                          2.Venta de carros.                          ");
                        System.out.println("                                3.SALIR                              ");
                        System.out.print("                          Ingrese una opcion :  ");
            opcion=entrada.nextInt();
            
            if(opcion>4||opcion<1){
                System.out.println("");
                System.out.println("                           ¡¡OPCION INVALIDA!!");
            }else{
       
                switch(opcion){
                    case 1:
                        System.out.println("");
                        System.out.println("--------------------BIENVENIDO AL AJEDREZ NORDICO-------------------");
                        System.out.println("");
                        System.out.println("                              Intrucciones                          ");
                        System.out.println("          Cada jugador decide en que posicion mover sus piezas.\n          Jugador 1 gana si el rey logra llegar a los bordes.\n            Jugador 2  gana si logra capturar al rey\n\n             1. Jugador 1: Juega con rey y soldados (R/+)  \n                2. Jugador 2: Juega con moscovitas(*)");
                        ajedrez();
                        break;
                    case 2:
                        carros();
                        break;
                    case 3:
                        break;
                   
                    }
            }
                    
                
  
        }while(opcion<3||opcion>3);
        
}
    
    
    public static String[][] matriz(String[][] matriz){
        int rey=4;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(j==rey&&i==rey){ 
                    matriz[i][j]= "R";
                } else if(((( i==3)||(i==2)||(i==6)||(i==5))&&(j==rey))||((i==rey)&&((j==3)||(j==2)||(j==5)||(j==6)))){
                     matriz[i][j]= "+";
                }else if((((j==3)||(j==5))&&((i==8)||(i==0)))||((j==rey)&&((i==1)||(i==4)||(i==0)||(i==7)||(i==8)))||(((i==3)||(i==5))&&((j==0)||(j==8)))||((i==rey)&&((j==0)||(j==8)||(j==1)||j==7))){
                    matriz[i][j]= "*";
                }else{
                    matriz[i][j]= " ";

                }  
        }
    }
        
        return matriz;
    }
   
    public static void imprimir(String[][] matriz){
        matriz(matriz);
        System.out.println("");
                       

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
               System.out.print(matriz[i][j]+"|");
            }
            System.out.println("");   
        }
    }
    
    public static void actualizar(String[][] matriz,int posv,int posh,int posv1,int posh1){
        matriz(matriz);
        int rey =4;
         for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if(posv==4&&posh==4){ 
                    matriz[posv1][posh1]= "R";
                    matriz[posv][posh]=" ";
                } else if(((( posv==3)||(posv==2)||(posv==6)||(posv==5))&&(posh==rey))||((posv==rey)&&((posh==3)||(posh==2)||(posh==5)||(posh==6)))){
                     matriz[posv1][posh1]= "+";
                     matriz[posv][posh]=" ";

                }else if((((posh==3)||(posh==5))&&((posh==8)||(posv==0)))||((posh==rey)&&((posv==1)||(posv==4)||(posv==0)||(posv==7)||(posv==8)))||(((posv==3)||(posv==5))&&((posh==0)||(posh==8)))||((posv==rey)&&((posh==0)||(posh==8)||(posh==1)||posh==7))){
                    matriz[posv1][posh1]= "*";
                    matriz[posv][posh]=" ";

                      
                  
        }
            }
         }
            System.out.println("");
    
          for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
               System.out.print(matriz[i][j]+"|");
            }
            System.out.println("");   
        }
    }
    
    
    public static void ajedrez(){
        Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        String [][] matriz=new String[9][9];

        int posh = 0;
        int posv = 0;
         int posh1 = 0;
        int posv1 = 0;
        
        imprimir(matriz);
        System.out.println("");
        System.out.println("         Presione ENTER para seleccionar el jugador incial ");
        String enter = entrada2.nextLine();
        int rand = new Random().nextInt((10 - 1) + 1) + 1;

        if (rand % 2 == 0) {
            System.out.println("                           JUGADOR 1             ");
            System.out.println("");
            System.out.println("ELECCION DE FICHA ");
            do{
                System.out.print("Ingrese posicion horizontal: ");
                posh = entrada.nextInt();
                System.out.print("Ingrese posicion vertical: ");
                posv = entrada.nextInt();

                if (((( posv==3)||(posv==2)||(posv==6)||(posv==5))&&(posh==4))||((posv==4)&&((posh==3)||(posh==2)||(posh==5)||(posh==6)))||(posv==4&&posh==4)) {
                    System.out.println("");
                    System.out.println("MOVIMIENTO DE FICHA");
                    System.out.print("Ingrese posicion horizontal: ");
                    posh1 = entrada.nextInt();
                    System.out.print("Ingrese posicion vertical: ");
                    posv1 = entrada.nextInt();
                
                if(((( posv1==3)||(posv1==2)||(posv1==6)||(posv1==5))&&(posh1==4))||((posv1==4)&&((posh1==3)||(posh1==2)||(posh1==5)||(posh1==6)))||(posv1==4&&posh1==4)){
                    System.out.println("");
                    System.out.println("Ya existe una ficha en esta posicion ");
                }else if((((posh1==3)||(posh1==5))&&((posh1==8)||(posv1==0)))||((posh1==4)&&((posv1==1)||(posv1==4)||(posv1==0)||(posv1==7)||(posv1==8)))||(((posv1==3)||(posv1==5))&&((posh1==0)||(posh1==8)))||((posv1==4)&&((posh1==0)||(posh1==8)||(posh1==1)||posh1==7))){
                  System.out.println("");
                    System.out.println("Ya existe una ficha en esta posicion ");            
                }else if (posv1==4||posh1==4){
                    System.out.println("");
                    System.out.println("posición del rey");
                   
                }else{
                    actualizar(matriz,posv,posh,posv1,posh1);  
                }
                }else{
                    System.out.println("Ingrese posicion valida");
                    System.out.println("");
                }
            } while (((( posv!=3)||(posv!=2)||(posv!=6)||(posv!=5))&&(posh!=4))||((posv!=4)&&((posh!=3)||(posh!=2)||(posh!=5)||(posh!=6)))||(posv!=4&&posh!=4));
            
            } else {
            System.out.println("                               JUGADOR 2             ");
            System.out.println("");
            System.out.println("ELECCION DE FICHA ");
            do {
                System.out.print("Ingrese posicion horizontal: ");
                posh = entrada.nextInt();
                System.out.print("Ingrese posicion vertical: ");
                posv = entrada.nextInt();

                if ((((posh==3)||(posh==5))&&((posh==8)||(posv==0)))||((posh==4)&&((posv==1)||(posv==4)||(posv==0)||(posv==7)||(posv==8)))||(((posv==3)||(posv==5))&&((posh==0)||(posh==8)))||((posv==4)&&((posh==0)||(posh==8)||(posh==1)||posh==7))) {
                    System.out.println("MOVIMIENTO DE FICHA");
                    System.out.println("");
                    System.out.print("Ingrese posicion horizontal: ");
                    posh1 = entrada.nextInt();
                    System.out.print("Ingrese posicion vertical: ");
                    posv1 = entrada.nextInt();
                
                if(((( posv1==3)||(posv1==2)||(posv1==6)||(posv1==5))&&(posh1==4))||((posv1==4)&&((posh1==3)||(posh1==2)||(posh1==5)||(posh1==6)))||(posv1==4&&posh1==4)){
                    System.out.println("");
                    System.out.println("Ya existe una ficha en esta posicion ");
                }else if((((posh1==3)||(posh1==5))&&((posh1==8)||(posv1==0)))||((posh1==4)&&((posv1==1)||(posv1==4)||(posv1==0)||(posv1==7)||(posv1==8)))||(((posv1==3)||(posv1==5))&&((posh1==0)||(posh1==8)))||((posv1==4)&&((posh1==0)||(posh1==8)||(posh1==1)||posh1==7))){
                  System.out.println("");
                    System.out.println("Ya existe una ficha en esta posicion ");            
                              }else{
                    actualizar(matriz,posv,posh,posv1,posh1); 
                }
                }else{
                    System.out.println("Ingrese posicion valida");
                    System.out.println("");
                }
            } while ((((posh!=3)||(posh!=5))&&((posh!=8)||(posv!=0)))||((posh!=4)&&((posv!=1)||(posv!=4)||(posv!=0)||(posv!=7)||(posv!=8)))||(((posv!=3)||(posv!=5))&&((posh!=0)||(posh!=8)))||((posv!=4)&&((posh!=0)||(posh!=8)||(posh!=1)||posh!=7)));
                }
        
        }

    
    
    public static void carros(){
         Scanner entrada = new Scanner(System.in);
        Scanner entrada2 = new Scanner(System.in);
        ArrayList<carro> car = new ArrayList<>();
         int opcion;
        do {
            System.out.println("");
            System.out.println("-------------------------MENU HERMANOS RODRIGUEZ-------------------");
            System.out.println("");
            System.out.println("                          1. Ingresar un carro");
            System.out.println("                          2. Modificar un carro");
            System.out.println("                        3. Leer la lista de carros");
            System.out.println("                          4. Eliminar un carro");
            System.out.println("                                  5.SALIR");
            System.out.print("                            Ingrese una opcion: ");
            opcion = entrada.nextInt();

            System.out.println("-----------------------------------------------------------------------------");
            switch (opcion) {
                case 1:
                    System.out.println("");
                    System.out.print("                         Ingrese en VIN: ");
                    String vin = entrada2.nextLine();
                    System.out.print("                        Ingrese la marca: ");
                    String marca = entrada2.nextLine();
                    System.out.print("                        Ingrese el modelo: ");
                    String modelo = entrada2.nextLine();
                    System.out.print("                         Ingrese el color: ");
                    String color = entrada2.nextLine();
                    System.out.print("                          Ingrese el ao: ");
                    String ao = entrada2.nextLine();
                    car.add(new carro(vin, marca, modelo, color, ao));
                    System.out.println("             ---se ha ingresado un carro exitosamente :) ---: ");
                    break;
                case 2:
                    System.out.println("");
                    System.out.println("                      ---Lista de carros---");
                    if (car.isEmpty()) {
                         System.out.println("                  --La lista esta vacia--");
                    } else {
                        int cont = 1;
                        for (carro object : car) {

                            System.out.println(cont + ". Vin: " + object.getVIN() + ",  marca: " + object.getMarca() + ",  modelo: " + object.getModelo());
                            cont++;
                        }
                    }
                    System.out.println("                Ingrese el carro que desea modificar: ");
                    int asd = entrada2.nextInt();
                    asd -=1;
                    System.out.print("");
                    System.out.println("");
                    System.out.print("                          Ingrese en VIN: ");
                    String vina = entrada2.nextLine();
                    System.out.print("                         Ingrese la marca: ");
                    String marcaa = entrada2.nextLine();
                    System.out.print("                         Ingrese el modelo: ");
                    String modeloa = entrada2.nextLine();
                    System.out.print("                         Ingrese el color: ");
                    String colora = entrada2.nextLine();
                    System.out.print("                           Ingrese el ao: ");
                    String aoa = entrada2.nextLine();
                    
                    car.set(asd, new carro(vina, marcaa, modeloa, colora, aoa));
                    break;
                case 3:
                    System.out.println("");
                    System.out.println("                         ---lista de carros---");
                    if (car.isEmpty()) {
                        System.out.println("                     --la lista esta vacia--");
                    } else {
                        int cont = 1;
                        for (carro object : car) {

                            System.out.println("                   "+cont + ". Vin: " + object.getVIN() + ",  marca: " + object.getMarca() + ",  modelo: " + object.getModelo());
                            cont++;
                        }
                    }
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("");
                    System.out.println("                          ---lista de carros---");
                    if (car.isEmpty()) {
                        System.out.println("                      --la lista esta vacia--");
                    } else {
                        int cont = 1;
                        for (carro object : car) {

                            System.out.println("                    "+cont + ". Vin: " + object.getVIN() + ",  marca: " + object.getMarca() + ",  modelo: " + object.getModelo());
                            cont++;
                        }
                    }
                    System.out.println("                 Ingrese el carro que dea eliminar: ");
                    int elimin = entrada2.nextInt();
                    elimin -= 1;
                    car.remove(elimin);

                    System.out.println("                 ---se ha eliminado el carro exitosamente---");
                    break;
                    
                case 5:
                    System.out.println("-------------------------------------------------------------");
                    System.out.println("                  VOLVIENDO AL MENU PRINCIPAL...");
                    System.out.println("-------------------------------------------------------------");

                    break;
                default:
                    System.out.println("¡¡OPCION INVALIDA!!");
            }
        } while (opcion<5||opcion>5);
    }

}
    

