/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.examened;

/**
 *
 * @author Carlos Casas Rodriguez 53362313F
 * @version 1.0
 */

import java.util.*;
// !!!! MODIFICA TU NOMBRE Y TU DNI DONDE TOQUE

public class EmpleadoED_53362813F {
    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;
    
    /**
     * Contructor con tres parametros (en el documento pone esto pero son dos)
     * @param nombreCompleto nombre completo en mayusculas
     * @param dni documento nacional de identidad con letra y sin espacios
     */
    public EmpleadoED_53362813F(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }
    
    /**
     * Calcula el salario bruto mensual en funcion del salario base por hora y las horas extra
     * el precio por hora de la hora extra se determina con la constante de FACTOR_HORA_EXTRA
     * @param horasExtra numero de horas extra dedicadas redondeado a la baja (entero)
     * @return devuelve el salario bruto mensual en euros con dos decimales
     */
    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora * FACTOR_HORA_EXTRA;
        salarioFinal=this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal=(double)Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }
    // Este método no lo comentaremos con JavaDoc
    public static void main(String[] args) {
        EmpleadoED_53362813F emp = new EmpleadoED_53362813F("Carlos Casas","53362813F");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)  + " euros, al hacer " + horasExtra + " horas extra.");
    }
}