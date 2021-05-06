package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	String name,newName;
        Scanner sc=new Scanner(System.in);
        //Neu Nhap ANH NGUYEN thi next se quet toi ANH thoi. |_|NGUYEN thi se luu tren steam va
        // se duoc quet tiep boi nextLine ma khong can yeu cau nhap tiep.
        System.out.println("Nhập tên: ");
        name=sc.next();
        System.out.println("Nhập tên mới: ");
        newName=sc.nextLine();
        System.out.println("Name:["+name+"]");
        System.out.println("New Name:["+newName+"]");
    }
}
