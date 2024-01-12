import javax.swing.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Mi primera pantalla"); //un objeto de Jframe
        frame.setContentPane(new form3().rootPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //se definio un boton para cerrar
        frame.setSize(200,200);
        frame.pack();
//        JButton button1=new JButton("Click 1"); //un boton de laclase Jbutton,el cual mostrara click
//        JButton button2=new JButton("Click 2");
//        frame.getContentPane().add(button2);
//        frame.getContentPane().add(button1);
//
        frame.setVisible(true); //muestratodo


    }
}