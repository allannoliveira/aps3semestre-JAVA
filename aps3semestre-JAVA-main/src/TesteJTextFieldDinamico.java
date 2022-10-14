import javax.swing.*;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import java.awt.*;

public class TesteJTextFieldDinamico extends JFrame {

    private JPanel contentPane;
    private JTextField textField;
    private JLabel label;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    TesteJTextFieldDinamico frame = new TesteJTextFieldDinamico();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public TesteJTextFieldDinamico() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        contentPane.setLayout(new BorderLayout(0, 0));
        setContentPane(contentPane);
        contentPane.add(getTextField(), BorderLayout.NORTH);
        contentPane.add(getLabel(), BorderLayout.SOUTH);
    }

    private JTextField getTextField() {
        if (textField == null) {
            textField = new JTextField();
            textField.setColumns(10);
            textField.getDocument().addDocumentListener(new DocumentListener() {
                @Override
                public void changedUpdate(DocumentEvent e) {
                    Document d = e.getDocument();
                    try {
                        String texto = d.getText(0, d.getLength());
                        label.setText(texto.toUpperCase()); // um exemplo do que fazer com o texto
                    } catch (BadLocationException ex) {
                    }
                }

                @Override
                public void insertUpdate(DocumentEvent e) {
                    Document d = e.getDocument();
                    try {
                        String texto = d.getText(0, d.getLength());
                        label.setText(texto.toUpperCase()); // um exemplo do que fazer com o texto
                    } catch (BadLocationException ex) {
                    }
                }

                @Override
                public void removeUpdate(DocumentEvent e) {
                    Document d = e.getDocument();
                    try {
                        String texto = d.getText(0, d.getLength());
                        label.setText(texto.toUpperCase()); // um exemplo do que fazer com o texto
                    } catch (BadLocationException ex) {
                    }
                }
            });
        }
        return textField;
    }

    private JLabel getLabel() {
        if (label == null) {
            label = new JLabel("-");
        }
        return label;
    }
}
