/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author hp
 */
public class Simple_Implementatio {
    int[] nilai = {80, 90, 75, 88};
int total = 0;
for(int n : nilai){ // enhanced for loop
    total += n;
}
double rata = (double)total/nilai.length;
System.out.println("Rata-rata = " + rata);
}
