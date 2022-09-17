package org.example.checkboxes;

// Los productos concretos son creados por las fábricas
// concretas correspondientes.
public class MacCheckbox implements Checkbox{
    @Override
    public void paint() {
        System.out.println("Pintando un checkbox de MAC");
    }
}
