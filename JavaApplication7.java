
package javaapplication7;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author portatil
 */
public class JavaApplication7 {

    
    public static void main(String[] args) {
        
     
    Scanner lector = new Scanner (System.in);
     
    //COMENTARI VOSTRE
    String[] paraules={"ATOM","MOLECULA","BIO", "PERL"};
    
   //COMENTARI VOSTRE
    String resposta, llegit="";
    boolean valid;
    int count, encerts, pos;
    char c;
    
    do{
         
           //COMENTARI VOSTRE
            Random rnd = new Random();
            int endevina=(int)(rnd.nextDouble()*paraules.length);
            
           //COMENTARI VOSTRE
            String paraula=paraules[endevina];
         
            
            System.out.println("La paraula que has d'encertar té "+paraula.length()+" lletres");

            //Creo l'array de caràcters que mostraran les encertades
            char lletres[]=new char[paraula.length()];
            for(int i=0;i<paraula.length();i++){
                lletres[i] ='_';

            }
            
            //COMENTARI VOSTRE
            count=0;
            encerts=0;
            
            do{
                valid=false;
                
                //COMENTARI VOSTRE
              do{
                System.out.println ("Si us plau, Escriu una lletra valida");
                llegit=lector.nextLine().toUpperCase();
                if(llegit.matches("[ABCDEFGHIJKLMNÑOPQRSTUVWXYZ ]")) valid=true;
              }while(valid == false || llegit.isEmpty() || llegit==null);
              
              //COMENTARI VOSTRE
              c=llegit.toUpperCase().charAt(0);
              
              //COMENTARI VOSTRE
              pos = paraula.indexOf(c);
              
              //COMENTARI VOSTRE
              if (pos == -1) {
                   count++;
                   System.out.println("Aquesta lletra no es troba dins de la paraula. Ara et queden "+ (10-count)+ " intents");
                   //COMENTARI VOSTRE
                   if(count == 10) System.out.println("Has esgotat tots els intents");
               } else {
                        
                        //COMENTARI VOSTRE
                       for(int i=0;i<lletres.length;i++){
                           if(paraula.charAt(i) == c){
                               
                               lletres[i] =c;
                              
                               encerts +=1;
                           }
                           System.out.print(lletres[i]+" ");
                           
                       }
                  System.out.println("Molt bé!!! Torna a intentar-ho");
                  
                  if(encerts == paraula.length()){
                      System.out.println("Has acabat encertant la paraula. Felicitats!!!!");
                      count =10;
                  }

               }

             }while(count !=10);
        
        System.out.println("Vols continuar?(S/N)");
        resposta=lector.nextLine().toUpperCase();
       }while(resposta.equals("S"));
    
   } 
}
