/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pbo;

/**
 *
 * @author hp
 */
public class Array {
    // deklarasi array integer[]
int[] anArray;

// buat array 10 elemen
anArray = new int[10];

// isi nilai
anArray[0] = 100;
anArray[1] = 200;

int[] anArray = {100,200,300,400};

System.out.println(anArray[0]); // 100
System.out.println(anArray[1]); // 200

String[][] names = {
    {"Mr. Smith", "Ms. "},
    {"Smith", "Jones"}
};

System.out.println(names[0][0] + names[1][0]); // Mr. Smith
System.out.println(names[0][2] + names[1][1]); // Ms. Jones
}
