/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiTextoBeann;

import java.awt.Color;
import java.awt.Font;
import java.io.Serializable;
import javax.swing.JTextField;

/**
 *
 * @author dam2
 */
public class MiTextoBean extends JTextField  implements Serializable {

    public MiTextoBean() {
    }

    private Color color;
    private Font fuente;
    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
        this.setForeground(color);
    }

    public Font getFuente() {
        return fuente;
    }

    public void setFuente(Font fuente) {
        this.fuente = fuente;
        this.setFont(fuente);
    }


}
