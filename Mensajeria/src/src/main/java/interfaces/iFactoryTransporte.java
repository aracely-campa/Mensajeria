/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package interfaces;

import dominio.Transporte;

/**
 *
 * @author arace
 * La interfaz iFactoryTransporte define un método para crear un objeto Transporte.
 */
public interface iFactoryTransporte {
    /**
     * Método para crear un objeto Transporte.
     * @return El objeto Transporte creado.
     */
    public Transporte crearTransporte();
}
