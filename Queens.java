import java.io.*;
import java.util.*;
class Queens{
    // Elegxei tin asfaleia tis topothetisis 2 vasilisswn
    public static boolean SafetyTest(int a,int b,int i){
           int dx = Math.abs(a-b);
           return (dx !=i) && (dx !=0);
    }
    
    public static void main(String[]args){
       Scanner input = new Scanner(System.in);
       System.out.print("Eisagete megethos 'skakieras' apo 4 mexri 15, i miden (0) gia termatismo: ");       
       int n = input.nextInt();
       System.out.println();
       // Diavazei megethi kai eisagwges mexri na dwthei megethos iso me miden
       while ((n !=0 )&& (n>3 && n<16)){          
         int [] Q = new int [n]; 
         int k=0;
         // Diavazei eigagwges apo ton xristi kai tis topothetei se ena pinaka-dianusma 
         while (k<n){
              System.out.print("Eisagete arithmo tetragwnou "+(k+1)+"hs grammis, gia tin topothetisi vasilissas : ");
              Q[k] = input.nextInt();
              // Elegxei tin egkyrotita tis eisagwgis
              if (Q[k]>n || n==0)
                    System.out.println("Akuri topothetisi. Oi vasilisses den mporoun na topothetithoun ektws 'skakieras'");
              else  k++;                     
              System.out.println();
         }
         // Kaloume tin PrintChess gia kathe grammi tis 'skakieras'
         for (int i=0;i<n;i++){
              PrintChess prnt = new PrintChess();
              prnt.Printline(n,Q[i]);
            }
         boolean sft = true;
         // Elegxei mesw tis SafetyTest tin egkurotita twn topothetisewn kai stamataei otan vrethei i 1h paravasi
         for (int i=0;(sft && i<n-1);i++){             
              for (int j=i+1;(sft && j<n);j++){                      
                     sft=SafetyTest (Q[i],Q[j],j-i);
                     // Elegxei an vrethike paravasi
                     if (sft==false)
                         System.out.println(" H "+(i+1)+"h vasilissa  apeileitai apo tin "+(j+1)+"h vasilissa.");
                 }
         }
         // Telikos elegxos asfaleia eisagwgis 
         if (sft) System.out.println("asfalhs topothetisi!!!!!!");
         System.out.print("Eisagete megethos 'skakieras' apo 4 mexri 15, i miden (0) gia termatismo: ");
         n = input.nextInt();System.out.println();
        }
      }
  }
              
         
    