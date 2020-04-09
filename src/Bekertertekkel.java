/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FReni
 */
import java.util.Scanner;
public class Bekertertekkel {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Hány szorzótáblát szeretne kiíratni?");
        int a=sc.nextInt();
        for(int i=1; i<=a; i++){
            System.out.println("Kérem a számot: ");
            int b=sc.nextInt();
            System.out.println("Meddig írja ki "+a+" szorzótábláját?");
            int c=sc.nextInt();
            for(int j=1; j<=c; j++){
                System.out.println(j+"*"+b+"="+j*b);
            }      
        }
    }
    
    
}
