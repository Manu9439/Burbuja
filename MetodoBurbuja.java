/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package apps;

/**
 *
 * @author Manis
 */
import javax.swing.*;
import java.awt.*;
public class MetodoBurbuja extends JFrame
{
    void ventana()
    {
        setLayout(null);
        JLabel lbltit;
        JTextField txtarreglo;
        JTextArea tamostrar;
        JButton btncalcu;
        
        lbltit=new JLabel("Metodo Burbuja");
        lbltit.setFont(new Font("Arial", Font.BOLD,12));
        lbltit.setBounds(15, 20, 150, 30);
        add(lbltit);
        
        txtarreglo=new JTextField("Ingresa Variables");
        txtarreglo.setBounds(15, 70, 150, 30);
        add(txtarreglo);
        
        tamostrar=new JTextArea("Procedimiento");
        tamostrar.setBounds(200, 50, 150, 200);
        add(tamostrar);
        
        btncalcu=new JButton("Calcular");
        btncalcu.setBounds(45, 120, 20, 30);
        add(btncalcu);
        
        setTitle("Método Burbuja");
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
    }
    void burbuja()
    {
        int arreglo[], nElementos=0;
        
        
        //burbuja
        for(int i=0;i<(nElementos-1);i++){
            for(int j=0;j<(nElementos-1);j++){
                if(arreglo[j] > arreglo[j+1]){
                    aux=arreglo[j];
                    arreglo[j]=arreglo[j+1];
                    arreglo[j+1]=aux;
                }
            }
        }
    }
    public static void main(String[] args) {
        MetodoBurbuja mb=new MetodoBurbuja();
        mb.ventana();
    }
}
