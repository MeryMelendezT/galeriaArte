package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class altasFacturaForm extends ActionForm 
{
  String id;
  String orden_id;
  String numeroFactura;
  String fecha;
  String autorizacion;
  String apellidoFactura;
  String cantidad;
  String descripcion;
  String importe;
  String codigoControl;
  String limiteEmision;

  /**
   * Reset all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   */
  public void reset(ActionMapping mapping, HttpServletRequest request)
  {
    super.reset(mapping, request);
  }

  /**
   * Validate all properties to their default values.
   * @param mapping The ActionMapping used to select this instance.
   * @param request The HTTP Request we are processing.
   * @return ActionErrors A list of all errors found.
   */
  public ActionErrors validate(ActionMapping mapping, HttpServletRequest request)
  {
    return super.validate(mapping, request);
  }

  public String getId()
  {
    return id;
  }

  public void setId(String newId)
  {
    id = newId;
  }

  public String getOrden_id()
  {
    return orden_id;
  }

  public void setOrden_id(String newOrden_id)
  {
    orden_id = newOrden_id;
  }

  public String getNumeroFactura()
  {
    return numeroFactura;
  }

  public void setNumeroFactura(String newNumeroFactura)
  {
    numeroFactura = newNumeroFactura;
  }



  public String getFecha()
  {
    return fecha;
  }

  public void setFecha(String newFecha)
  {
    fecha = newFecha;
  }

  public String getAutorizacion()
  {
    return autorizacion;
  }

  public void setAutorizacion(String newAutorizacion)
  {
    autorizacion = newAutorizacion;
  }

  public String getApellidoFactura()
  {
    return apellidoFactura;
  }

  public void setApellidoFactura(String newApellidoFactura)
  {
    apellidoFactura = newApellidoFactura;
  }

  public String getCantidad()
  {
    return cantidad;
  }

  public void setCantidad(String newCantidad)
  {
    cantidad = newCantidad;
  }

  public String getDescripcion()
  {
    return descripcion;
  }

  public void setDescripcion(String newDescripcion)
  {
    descripcion = newDescripcion;
  }

  public String getImporte()
  {
    return importe;
  }

  public void setImporte(String newImporte)
  {
    importe = newImporte;
  }

  public String getCodigoControl()
  {
    return codigoControl;
  }

  public void setCodigoControl(String newCodigoControl)
  {
    codigoControl = newCodigoControl;
  }

  public String getLimiteEmision()
  {
    return limiteEmision;
  }

  public void setLimiteEmision(String newLimiteEmision)
  {
    limiteEmision = newLimiteEmision;
  }
}