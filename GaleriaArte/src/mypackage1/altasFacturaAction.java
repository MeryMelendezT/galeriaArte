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

public class altasFacturaAction extends Action 
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
    altasFacturaForm AltasFacturaForm = (altasFacturaForm) form;
    String id = AltasFacturaForm.getId();
    String orden_id = AltasFacturaForm.getOrden_id();
    String numeroFactura = AltasFacturaForm.getNumeroFactura();
    String autorizacion = AltasFacturaForm.getAutorizacion();
    String fecha = AltasFacturaForm.getFecha();
    String apellidoFactura = AltasFacturaForm.getApellidoFactura();
    String cantidad = AltasFacturaForm.getCantidad();
    String descripcion = AltasFacturaForm.getDescripcion();
    String importe = AltasFacturaForm.getImporte();
    String codigoControl = AltasFacturaForm.getCodigoControl();
    String limiteEmision = AltasFacturaForm.getLimiteEmision();

    Connection cn = null;
    ConnectDB conn =new ConnectDB();
    ResultSet rsConsulta = null;
    try
    {
      cn = conn.conexion;
      String cadena = "insert into my_factura values("+id+","+orden_id+",'"+numeroFactura+"','"+autorizacion+"','"+fecha+"','"+apellidoFactura+"','"+cantidad+"','"+descripcion+"','"+importe+"','"+codigoControl+"','"+limiteEmision+"')";
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