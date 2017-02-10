/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculator;

import java.util.Scanner;

/**
 *
 * @author daolinh
 */
public class Calculator {

    /**
     * @param args the command line arguments
     */
    private static int a;
    private static int b;
    private static int d;

    public static void input() {
        System.out.println("Nhap a : ");
        a = new Scanner(System.in).nextInt();
        System.out.println("Nhap b : ");
        b = new Scanner(System.in).nextInt();
    }

    public static void congmang() {
        System.out.println("Nhap gioi han cua mang:");
        d = new Scanner(System.in).nextInt();
        int[] Array = new int[d];
        
        int sum = 0;
        for (int a = 0 ;a < d; a++){
            System.out.println("Nhap so:");
            Array[a] = new Scanner(System.in).nextInt();
            sum = sum + Array[a];
        }
        System.out.println(sum);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Calculator.menu();
        System.out.println("");
    }

    public Calculator() {

    }

    //Ham cong hai so, dau vao la 2 so nguyen a va b, tra ve tong 2 so
    public static int plus(int a, int b) {
        return a + b;
    }

    //Ham tru hai so, dau vao la 2 so nguyen a va b, tra ve hieu 2 so
    public static int subtract(int a, int b) {
        return a - b;
    }

    //Ham chia hai so, dau vao la 2 so nguyen a va b, tra ve thuong 2 so
    public static int divide(int a, int b) {
        if (b != 0) {
            return a / b;

        } else {
            System.out.println("input value is invalid");
            return 0;
        }
    }

    //Ham nhan hai so, dau vao la 2 so nguyen a va b, tra ve tich 2 so
    public static int multiply(int a, int b) {
        return a * b;
    }

    public static void menu() {

        int choice = 1;
        while (choice != 6) {
            System.out.println("---CHUONG TRINH MAY TINH-----");
            System.out.println("1. phep cong");
            System.out.println("2. phep tru");
            System.out.println("3. phep nhan");
            System.out.println("4. phep chia");
            System.out.println("5. cong mang");
            System.out.println("6. thoat chuong trinh");
            System.out.println("Vui long chon: ");

            Scanner choice1 = new Scanner(System.in);
            choice = choice1.nextInt();

            switch (choice) {
                case 1:
                    Calculator.input();
                    System.out.println("a + b = " + Calculator.plus(a, b));
                    break;
                case 2:
                    Calculator.input();
                    System.out.println("a - b = " + Calculator.subtract(a, b));
                    break;
                case 3:
                    Calculator.input();
                    System.out.println("a * b = " + Calculator.multiply(a, b));
                    break;
                case 4:
                    Calculator.input();
                    if (b == 0) {
                        System.out.println("Gia tri ban nhap khong hop le !!!");
                    } else {
                        System.out.println("a / b = " + Calculator.divide(a, b));
                    }
                    break;
                case 5:
                    Calculator.congmang();
                    break;
                case 6:
                    System.out.println("------------- KET THUC --------------");
                    break;
            }

        }

    }

}
