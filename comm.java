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
public class comm {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("enter the amount");
        double d=obj.nextDouble();
        System.out.println("enter the discount");
        double dl=obj.nextDouble();
        double amoper=d/100*dl;
        System.out.println("comission amount"+(d-amoper));
        
        
        
    }
    
}
