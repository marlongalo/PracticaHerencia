/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.practicaherencia;

import helpers.Ingles;
import helpers.IntroduccionIngenieria;

/**
 *
 * @author Marlon Galo
 */
public class PracticaHerencia {

    public static void main(String[] args) {
        Ingles ingles = new Ingles();
        IntroduccionIngenieria introduccion = new IntroduccionIngenieria();
                
        System.out.println("Asignatura1");
        
        ingles.imprimirInformacion();
        introduccion.imprimirInformacion();
    }
}
