/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.printstream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author Armando
 */
public class PrintStreamExample {
    public static void main(String[] args) {
        PrintWriter writer = null;
        PrintStream ps = new PrintStream(System.out);
        String convert = ""; 
            System.out.println("Introduce la palabra de 7 digitos: ");
            Scanner codigo = new Scanner(System.in);
            String codigoString = codigo.next();
            for (char ch: codigoString.toCharArray()) {
                if (ch == 'a' || ch == 'b' || ch == 'c') {
                    convert += "2";
                } else if (ch == 'd' || ch == 'e' || ch == 'f') {
                    convert += "3";
                } else if (ch == 'g' || ch == 'h' || ch == 'i') {
                    convert += "4";
                } else if (ch == 'j' || ch == 'k' || ch == 'l') {
                    convert += "5";
                } else if (ch == 'm' || ch == 'n' || ch == 'o') {
                    convert += "6";
                } else if (ch == 'p' || ch == 'r' || ch == 's') {
                    convert += "7";
                } else if (ch == 't' || ch == 'u' || ch == 'v') {
                    convert += "8";
                } else if (ch == 'x' || ch == 'y' || ch == 'z') {
                    convert += "9";
                }
            }
            ps.println(convert);
            try {
            writer = new PrintWriter("filename.txt");
            writer.println("Código: " + codigoString);
            writer.println("Número: " + convert);
            writer.close();
            }
            catch(FileNotFoundException ex) {
                ex.printStackTrace();
            }
    }
}
