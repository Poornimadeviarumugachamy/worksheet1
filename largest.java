/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package worksheet1;
import java.util.Scanner;

/**
 *
 * @author ARUMUGASAMY
 */
public class largest {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter 3 nos");
        int a=obj.nextInt();
        int b=obj.nextInt();
        int c=obj.nextInt();
        if(a>b && a>c)
            System.out.println("A is greater");
        else if(b>a && b>c)
            System.out.println("B is greater");
        else
            System.out.println("C is greater");
        
                
    }
    
    
}
