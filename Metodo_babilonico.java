/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
import static java.lang.Math.abs;
import java.math.RoundingMode;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.text.ParseException;
import java.math.*;
/**
 *
 * @author vya-a
 */
public class Metodo_babilonico {
    static double resultado=0,b=0,h=0,Area=0,error=0,Altura=0,base=0,raiz=0;
    static int decimales=0;
    static Scanner leer=new Scanner(System.in);
    static Scanner seleccion=new Scanner(System.in);
    
    static String op;
    static boolean salir=false;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //pedimos menu
        menu();
        
        
        
    }    
    static void menu() {
        
        
        do{    
            System.out.println("1-introduce los datos");
            System.out.println("2-desea calcular");
            System.out.println("3-salir");
            op=seleccion.nextLine();
        
            
            switch(op){
            case "1":
                //aqui pedimos la informacion
                informacion();
                
                break;
            case "2":
                
                condicion();
                error();
                break;
            case "3":
                System.out.println("has salido exitosamente");
                salir=true;
                
                break; 
                default:
                System.out.println("intentalo de nuevo");
            }
        }while(salir==false);
        
    }
     static void informacion(){
        
        System.out.println("****programa raices cuadradas con el Metodo babilonico****");
        System.out.println("¿Que numero le quieres sacar raiz? ");
        raiz=leer.nextDouble();
        System.out.println("¿Que error quiere?");
        error=leer.nextDouble();
        System.out.println("¿A cuantos decimales quiere el resultado? ");
        decimales=leer.nextInt();
        
    }
    static void condicion(){
        int i=1;
        
       if(raiz>=1){
        
        for(b=1;resultado<=raiz;b++){//aqui hacemos un bucle para que cada que multiplique se vaya sumando uno ala b y luego entre en condicion si es menor el resultado
             
            resultado=b*b;
                    
            if(resultado<=raiz){//aqui comparamos el resultado con el de la raiz para que pueda entrar
                //System.out.println(b+"*"+b+"="+resultado);
                System.out.println("interacion "+i);
                h=raiz/b;
                System.out.println("tu raiz es de: "+String.format("%."+decimales+"f",h));
                //System.out.println("tu altura es de: "+String.format("%.3f", h));
                
               
                //System.out.println("tu base es "+b+"*"+" altura de: "+h+"="+Area);
                base=b;
                
                System.out.println("tu base es: "+String.format("%."+decimales+"f",base));
                System.out.println("tu resultado es: "+String.format("%."+decimales+"f",resultado));
                System.out.print("\n");
                }   
                else{
                    b--;
                    //System.out.println("aqui entre porque el resultado fue mayor y rompi el ciclo");
                    break;
                }
                i++;
            }
        }
       else{
           
           
           for(base=0.1;resultado<raiz;base++){
               //base=b+(0.1);
               resultado=base*base;  
           
                if(resultado<=raiz){
                     System.out.println("Interacion "+i++);
                     h=raiz/base;
                      System.out.println("tu altura es de: "+String.format("%."+decimales+"f",h));
                    // System.out.println("tu altura es de: "+String.format("%.3f", h));

                     System.out.println("tu base es: "+String.format("%."+decimales+"f",base));
                     System.out.println("resultado "+resultado);
                     System.out.print("\n");
                }
                else{
                     base--;
                    System.out.println("aqui entre porque el resultado fue mayor y rompi el ciclo");
                    break;
                 }
            }
       }
      
    }
    static void error(){
        
        
       // System.out.println("tu error es: "+h+"-"+b+"/"+h+"*100"+"="+String.format("%.3f", e)+"%");
        
        
        
        while(salir==false){
            if(raiz>1){
                double e=((h-b)/(h))*100;
                System.out.println("tu error es: "+String.format("%."+decimales+"f",abs(e)));
                
                if(abs(e)<=error){//
                    System.out.println("saliste por ser menor");
                    salir=true;
                }
            else{
                
                b=(b+h)/2;
                 System.out.println("tu base es"+String.format("%."+decimales+"f",b));
                h=raiz/b;
                System.out.println("tu altura es de: "+String.format("%."+decimales+"f",h));
               
               // e=((h-b)/(h))*100;
               // System.out.println("tu error es "+abs(e));
               
                } 
            }
            else{
                
                while(salir==false){
                    
                    double e=((h-base)/(h))*100;
                    System.out.println("tu error es: "+String.format("%."+decimales+"f",abs(e)));
                   // System.out.println("tu error es "+String.format("%.4f",abs(e) ));
                    
                    if(abs(e)<=error){//
                    System.out.println("saliste por ser menor");
                    salir=true;
                    }
                    else{
                        
                        base=(base+h)/2;
                        System.out.println("esta es tu base: "+String.format("%."+decimales+"f",base));
                        h=raiz/base;
                        System.out.println("resultado de la raiz es: "+String.format("%."+decimales+"f",h));
                        
                        
                    }
                }  
            }  
        } 
    }
    
}
