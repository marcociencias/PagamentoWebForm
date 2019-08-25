/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PagamentoWeb;

import java.awt.Desktop;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author marco.junior
 */
public class ComandosWeb {
    
    public String Comando(String http,String versao,String pasta,String localh)
    {
       
        
       try{
            URI link = new URI(http+""+localh+":6050/"+pasta+"/"+versao);
            Desktop.getDesktop().browse(link);
      //      JOptionPane.showMessageDialog(null,"Pagina URL"+versao+pasta);
        }   catch(Exception ex)
            
        {
            System.out.println("Erro : " +ex.getMessage());
        }
        return versao;
    }
    
    public String tomCat(String ip)
    {
        try{
            URI link_1 = new URI ("HTTP:"+ip+":6050//");
            Desktop.getDesktop().browse(link_1);
        //    JOptionPane.showMessageDialog(null," Apache Tom Cat encontrado");
            
            
        }catch(Exception ex)
        {
            System.out.println("Erro : " + ex.getMessage());
        }
        return ip;
    }
    public String consulta(String http,String pasta,String localh,String consultar)
    {
        URI link_2;
        try {
            link_2 = new URI(http+""+localh+":6050/"+pasta+"/VerDadosPagamento/"+consultar+"/0/0/0/0");
            Desktop.getDesktop().browse(link_2);
        } catch (Exception ex) {
            System.out.println("Erro " + ex.getMessage());
        }
        
        return pasta;
    }
}
