package com.perscholas;

import java.util.Scanner;

public class AreaOfaCircle {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Radius of a Circle: ");
        
        double radius = input.nextDouble();
        double area = Math.PI * (radius * radius);      
        
        System.out.println("Area = " + area);

	}

}
