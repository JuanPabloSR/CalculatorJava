package Calculator;

import javax.swing.*;

public class Main {
    static int option;
    static String menu;


    public static void main(String[] args) {

        Operations object = new Operations();

        do {
            menu = JOptionPane.showInputDialog("MENU PRINCIPAL\n" +"SUPER MEGA CALCULADORA MASTER\n"+ "1.Suma\n" + "2.Resta\n" + "3.Division\n" + "4.Multiplicacion\n" + "5.Potenciacion\n" + "0. Salir");
            option = Integer.parseInt(menu);

            switch (option) {
                case 1:
                    object.suma();
                    break;
                case 2:
                    object.resta();
                    break;
                case 3:
                    object.division();
                    break;
                case 4:
                    object.multiplicacion();
                    break;
                case 5:
                    object.potenciacion();
                    break;
                case 0:
                    object.salir();
                    break;
            }
        } while (option != 0);
    }
}
