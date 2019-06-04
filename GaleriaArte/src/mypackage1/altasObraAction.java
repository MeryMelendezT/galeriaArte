package mypackage1;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionErrors;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.naming.NamingException;
import oracle.jdbc.*;
import java.util.*;

public class altasObraAction extends Action 
{
  /**
   * This is the main action called from the Struts framework.
   * @param mapping The ActionMapping used to select this instance.
   * @param form The optional ActionForm bean for this request.
   * @param request The HTTP Request we are processing.
   * @param response The HTTP Response we are processing.
   */
  public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
  {
    altasObraForm AltasObraForm = (altasObraForm) form;
    String id = AltasObraForm.getId();
    String artista_id = AltasObraForm.getArtista_id();
    String propietario_id = AltasObraForm.getPropietario_id();
    String categoria_id = AltasObraForm.getCategoria_id();
    String numeroRegistro = AltasObraForm.getNumeroRegistro();
    String titulo = AltasObraForm.getTitulo();
    String estilo = AltasObraForm.getEstilo();
    String precio = AltasObraForm.getPrecio();
    String imagen = AltasObraForm.getImagen();

    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    try
    {
      cn = conn.conexion;
      String cadena = "insert into my_obra values("+id+","+artista_id+","+propietario_id+","+categoria_id+","+numeroRegistro+",'"+titulo+"','"+estilo+"','"+precio+"','"+imagen+"')";
      System.out.println(cadena);
      int a = conn.InsertaDatos(cadena);  
      return mapping.findForward("dashboard");
	  }
    catch(Exception e)
    {
      e.printStackTrace();
      return (mapping.findForward("inicio"));
    }
    finally
    {
      conn.closeConnection();	
    }
  }
}