/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Package1.subpackage;


import java.util.Scanner;
public class NewClass {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter the amount in dollor:");
        int am1=scan.nextInt();
        int i1=(am1*74.81);
        System.out.print(i1);
        System.out.print("enter the amount in euro:");
        int am2=scan.nextInt();
        int i2=(am2*89.32);
        System.out.print(i2);
        System.out.print("enter the amount in yen:");
        int am3=scan.nextInt();
        int i3=(am3*0.71);
        System.out.print(i3);
      
        
        
    }
}

