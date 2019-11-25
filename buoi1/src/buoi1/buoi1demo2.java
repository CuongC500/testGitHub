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
public class buoi1demo2 {
    public static Scanner sc = new Scanner(System.in);
    static String tenHang[] = new String[100];
    static double chieuCao[] = new double[100];
    static String mauSac[] = new String[100];
    public static void nhapThongTin(){
        System.out.println("Nhập số phần tử : ");
        int size = Integer.parseInt(sc.nextLine());
        tenHang = new String[size];
        chieuCao = new double[size];
        mauSac = new String[size];
        for(int i = 0;i<tenHang.length;i++){
            System.out.printf("Phần tử thứ %d : \n",i+1 );
            System.out.println("Nhập tên : ");
            tenHang[i] = sc.nextLine();
            System.out.println("Nhập chiều cao : ");
            chieuCao[i] = Double.parseDouble(sc.nextLine());
            System.out.println("Nhập màu sắc : ");
            mauSac[i] = sc.nextLine();
            
        }
    }
    public static void xuatThongTin(){
       for(int i=0;i<tenHang.length;i++){
           System.out.printf("Phần tử tên : %s có chiều cao %.2f có màu : %s \n",tenHang[i],chieuCao[i],mauSac[i]);
       }
    }
    public static double TB(){
        double tong = 0;
        int dem = 0;
        for(int i=0;i<tenHang.length;i++){
            tong +=chieuCao[i];
            dem++;//sửa lần 3 chỗ này
        }
        double trungBinh = tong/dem;
        System.out.printf("Trung bình các phần tử nhập vào là %.2f\n",trungBinh);
        return trungBinh;
    }
    public static void max(){
        double chieuCaoMax = chieuCao[0];
        String ten = tenHang[0];
        String mau = mauSac[0];
        for(int i=0;i<tenHang.length;i++){
            if(chieuCaoMax < chieuCao[i]){
               chieuCaoMax = chieuCao[i]; 
               ten = tenHang[i];
               mau = mauSac[i];
            }
        }
        System.out.printf("Phần tử có Chiều cao lớn nhất là : %s , cao %.2f, màu %s\n",ten,chieuCaoMax,mau);
    }
    public static void sapXep(){
        for(int i =0;i<tenHang.length-1;i++){
            for(int j=i+1;j<tenHang.length;j++){
                if(chieuCao[i]>chieuCao[j]){
                    double temp1 =chieuCao[i];
                    chieuCao[i] = chieuCao[j];
                    
                    chieuCao[j] = temp1;
                    String temp2 =tenHang[i];
                    tenHang[i] = tenHang[j];
                    tenHang[j] = temp2;
                    String temp3 =mauSac[i];
                    mauSac[i] = mauSac[j];
                    mauSac[j] = temp3;
                }
            }
        }
        System.out.println("Sau khi sắp xếp là : ");
        for(int i=0;i<tenHang.length;i++){
           System.out.printf("Phần tử tên : %s có chiều cao %.2f có màu : %s \n",tenHang[i],chieuCao[i],mauSac[i]);
        
    }
    }
    public static void main(String[] args) {
        while(true){
            menu();//sdfsfsdfdsfsdfsdfsdf
        }
    }
    public static void menu(){
        System.out.println("Danh sách menu: \n"
                + "1. Nhập thông tin\n"
                + "2. Xuất thông tin\n"
                + "3.Trung Bình\n"
                + "4.Phần tử lớn nhất\n"
                + "5.Sắp xếp\n"
                + "6.Thoát\n");
        System.out.println("Nhập sự lựa chọn : ");
        int so=Integer.parseInt(sc.nextLine());
//        switch(so){
//            case 1 : nhapThongTin();
//            break;
//            case 2 : xuatThongTin();
//            break;
//            case 3 : TB();
//            break;
//            case 4: max();
//            break;
//            case 5 : sapXep();
//            break;
//            case 6: System.exit(0);
//            break;
//            default : System.out.println("Nhập lỗi xin mời nhập lại");
//            break;
//        }
    }
    
}
