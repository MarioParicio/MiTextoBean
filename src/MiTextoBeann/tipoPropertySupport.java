/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MiTextoBeann;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

/**
 *
 * @author dam2
 */
public class tipoPropertySupport extends PropertyEditorSupport{
    
    tipoEditor editor = null;

    public tipoPropertySupport() {
        this.editor = new tipoEditor();
    }

    @Override
    public boolean supportsCustomEditor() {
        return true; 
    }

    @Override
    public Component getCustomEditor() {
        return editor;
    }



  

    @Override
    public String getJavaInitializationString() {
         return editor.cmbTipo.getSelectedItem().toString();
    }

    @Override
    public Object getValue() {
        if (super.getValue() == null){
            setValue(null);
        }
        
        return editor.cmbTipo.getSelectedItem().toString();
    }

    @Override
    public void setValue(Object tipo) {
        if(tipo == null){
            tipo = new String();
        }
        super.setValue(tipo);
    }

    @Override
    public void setAsText(String text) throws IllegalArgumentException {
        super.setAsText(text);
    }

    @Override
    public String getAsText() {
        return super.getAsText();
        
    }
    
}

    
    

