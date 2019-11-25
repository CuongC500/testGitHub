/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buoi1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class sinhVien extends buoi1.person{
    public double java1[] = new double[3];
    public double java2[] = new double[3];
    public static Scanner sc = new Scanner(System.in);
    @Override
    public void nhap(){
        
        
        for(int i = 0;i<3;i++){
            super.nhap();
            System.out.println("Điểm java1 là : ");
            java1[i] = Double.parseDouble(sc.nextLine());
            System.out.println("điểm java2 là : ");
             java2[i]  = Double.parseDouble(sc.nextLine());
        }
    }
   
}
