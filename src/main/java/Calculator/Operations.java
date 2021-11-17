package Calculator;

import javax.swing.*;

public class Operations {
    double num1;
    double num2;
    double result;

    public Operations(){
        num1 = 0;
        num2 = 0;
        result = 0;
    }
    public void suma(){
        num1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo numero"));
        result = num1 + num2;
        JOptionPane.showMessageDialog(null, "El resultado es " + result);
    }
    public void resta(){
        num1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo numero"));
        result = num1 - num2;
        JOptionPane.showMessageDialog(null, "El resultado es " + result);
    }
    public void multiplicacion(){
        num1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo numero"));
        result = num1 * num2;
        JOptionPane.showMessageDialog(null, "El resultado es " + result);
    }
    public void division(){
        num1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el primer numero"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el segundo numero"));
        result = num1 / num2;
        JOptionPane.showMessageDialog(null, "El resultado es " + result);
    }
    public void potenciacion(){
        num1 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero base"));
        num2 = Double.parseDouble(JOptionPane.showInputDialog("ingrese el exponente"));
        result = Math.pow(num1,num2);
        JOptionPane.showMessageDialog(null, "El resultado es " + result);
    }
    public void salir(){
        System.out.println("Última instrucción del programa");
        System.exit(0);
    }
}
