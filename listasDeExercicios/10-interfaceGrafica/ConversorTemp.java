import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.BorderFactory;
import javax.swing.JButton;
//import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.math.BigDecimal;
import java.math.RoundingMode;

import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ConversorTemp {
  private JFrame frmJanela;
  private JTextField txtFanhereit;
  private JLabel lblFanhereit;
  private JButton btnConverter;
  private JLabel lblCelsius;

  public ConversorTemp() { //construcao da interface
    frmJanela = new JFrame();
    //frmJanela.setSize(300, 300); //utilizando frmJanela.pack(); linha 43
    frmJanela.setTitle("Conversor de Temperatura");
    frmJanela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    frmJanela.setLocationRelativeTo(null);

    JPanel painel = new JPanel();
    //painel.setBorder(new EmptyBorder(10,10,10,10));
    painel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));
    frmJanela.setContentPane(painel);

    //frmJanela.setLayout(new FlowLayout());
    GridLayout layout = new GridLayout(2,2);
    layout.setHgap(25);
    layout.setVgap(5);
        
    frmJanela.setLayout(layout);

    txtFanhereit = new JTextField();
    txtFanhereit.setColumns(5);
    frmJanela.add(txtFanhereit);
    
    lblFanhereit = new JLabel();
    lblFanhereit.setText("Fanhereit");
    frmJanela.add(lblFanhereit);
  
    btnConverter = new JButton();
    btnConverter.setText("Converter");
    btnConverter.addActionListener((actionEvent) -> {
      try{
      double f = Double.parseDouble(txtFanhereit.getText());
      double c = (f - 32) * 5.0/9.0;
      c = new BigDecimal(c).setScale(2, RoundingMode.HALF_UP).doubleValue();
      lblCelsius.setText(String.valueOf(c) + " C");
      
      } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(null, "Digite um número", "Ops!", JOptionPane.ERROR_MESSAGE);
      }
    });
    frmJanela.add(btnConverter);

    lblCelsius = new JLabel();
    lblCelsius.setText("Celsius");
    frmJanela.add(lblCelsius);
  }

  public void exibir() {
    frmJanela.pack();
    frmJanela.setVisible(true);
  }  
}