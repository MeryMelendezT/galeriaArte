package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class altasExposicionForm extends ActionForm 
{
  String id;
  String salon_id;
  String titulo;
  String descripcion;
  String fechaClausura;
  String fechaInaguracion;

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

  public String getSalon_id()
  {
    return salon_id;
  }

  public void setSalon_id(String newSalon_id)
  {
    salon_id = newSalon_id;
  }



  public String getTitulo()
  {
    return titulo;
  }

  public void setTitulo(String newTitulo)
  {
    titulo = newTitulo;
  }

  public String getDescripcion()
  {
    return descripcion;
  }

  public void setDescripcion(String newDescripcion)
  {
    descripcion = newDescripcion;
  }



  public String getFechaClausura()
  {
    return fechaClausura;
  }

  public void setFechaClausura(String newFechaClausura)
  {
    fechaClausura = newFechaClausura;
  }

  public String getFechaInaguracion()
  {
    return fechaInaguracion;
  }

  public void setFechaInaguracion(String newFechaInaguracion)
  {
    fechaInaguracion = newFechaInaguracion;
  }





}