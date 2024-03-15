/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aplikasikonsol;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Hello {
    public static void main(String[] args) {
        Scanner baca = new Scanner(System.in);
        String nama;
        
        System.out.print("Nama : "); nama = baca.nextLine();
        System.out.println("Halo " + nama + ", Ini aplikasi konsol dengan neatbeans");
    }
}
