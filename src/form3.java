import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form3 {
    public JPanel rootPanel;
    public JButton ok;
    public JTextField llenarNombre;
    public JLabel textodeBienvenida;

    public form3() {
        ok.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Probando el botón");
                textodeBienvenida.setText(llenarNombre.getText());
            }
        });
    }
}
