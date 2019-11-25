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

public class person{
public static Scanner sc = new Scanner(System.in);
public String ten[] = new String[50];
public int tuoi[] = new int[50];
public String diaChi[] = new String[50];
public String soDienThoai[] = new String[50];
public  void nhap(){
    System.out.println("Nhập số lượng : ");
    int size = Integer.parseInt(sc.nextLine());
    for(int i = 0; i<ten.length;i++){
    System.out.println("Nhập tên : ");
    this.ten[i] = sc.nextLine();
    System.out.println("Nhập tuổi: ");
    this.tuoi[i] = Integer.parseInt(sc.nextLine());
    System.out.println("Nhập địa chỉ : ");
    this.diaChi[i] = sc.nextLine();
    System.out.println("Nhập soDienThoai : ");
    this.soDienThoai[i] = sc.nextLine();
    }
}
public void xuat(){
    for(int i = 0; i<ten.length;i++){
    System.out.printf("Tên : %s, tuổi : %d, địa chỉ : %s, số điện thoại : %s \n",ten[i],tuoi[i],diaChi[i],soDienThoai[i]);
}
}
    
}
