/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Calander;

import java.util.Scanner;

/**
 *
 * @author jordeguevara
 */
public class TestCalander {

    public static void main(String[] args) {

        System.out.println("Please enter year");
        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        while (year < 0) {
            System.out.println("Please enter a postive number");
            year = input.nextInt();
        }

        Calander calander = new Calander(year);

        calander.displayCalander(year);

    }

}
