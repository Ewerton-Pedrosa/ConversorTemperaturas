import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ConversorTemperaturaGUI extends JFrame{
    private JPanel mainPanel;
    private JTextField textFieldUserInput;
    private JLabel inputLabel;
    private JRadioButton userInTempC;
    private JRadioButton userInTempK;
    private JRadioButton userInTempF;
    private JTextField textFieldSysOutput;
    private JRadioButton userOutTempC;
    private JRadioButton userOutTempK;
    private JRadioButton userOutTempF;
    private JButton ConverterButton;

    public ConversorTemperaturaGUI(String title){
        super (title);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        ConverterButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                double inputTemp = Double.parseDouble(textFieldUserInput.getText());
                double outputTemp = Temperature.convertTemp(inputTemp, userInTempK.isSelected(), userInTempC.isSelected(),
                        userInTempF.isSelected(), userOutTempK.isSelected(), userOutTempC.isSelected(),
                        userOutTempF.isSelected());
                textFieldSysOutput.setText(outputTemp + "");
            }
        });

        userInTempC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                userInTempF.setSelected(false);
                userInTempK.setSelected(false);
                userOutTempC.setEnabled(false);
                userOutTempK.setEnabled(true);
                userOutTempF.setEnabled(true);
            }
        });
        userInTempK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                userInTempC.setSelected(false);
                userInTempF.setSelected(false);
                userOutTempC.setEnabled(true);
                userOutTempK.setEnabled(false);
                userOutTempF.setEnabled(true);
            }
        });
        userInTempF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                userInTempC.setSelected(false);
                userInTempK.setSelected(false);
                userOutTempC.setEnabled(true);
                userOutTempK.setEnabled(true);
                userOutTempF.setEnabled(false);
            }
        });
        userOutTempC.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                userOutTempF.setSelected(false);
                userOutTempK.setSelected(false);
                userInTempC.setEnabled(false);
                userInTempF.setEnabled(true);
                userInTempK.setEnabled(true);
            }
        });
        userOutTempK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                userOutTempC.setSelected(false);
                userOutTempF.setSelected(false);
                userInTempC.setEnabled(true);
                userInTempF.setEnabled(true);
                userInTempK.setEnabled(false);

            }
        });
        userOutTempF.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                userOutTempK.setSelected(false);
                userOutTempC.setSelected(false);
                userInTempC.setEnabled(true);
                userInTempF.setEnabled(false);
                userInTempK.setEnabled(true);
            }
        });

    }
    }

