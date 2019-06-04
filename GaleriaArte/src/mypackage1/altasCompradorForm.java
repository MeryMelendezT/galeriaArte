package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class altasCompradorForm extends ActionForm 
{
  String id;
  String carnet;
  String nombre;
  String apellido;
  String direccion;
  String correo;
  String clave;

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

  public String getCarnet()
  {
    return carnet;
  }

  public void setCarnet(String newCarnet)
  {
    carnet = newCarnet;
  }

  public String getNombre()
  {
    return nombre;
  }

  public void setNombre(String newNombre)
  {
    nombre = newNombre;
  }

  public String getApellido()
  {
    return apellido;
  }

  public void setApellido(String newApellido)
  {
    apellido = newApellido;
  }

  public String getDireccion()
  {
    return direccion;
  }

  public void setDireccion(String newDireccion)
  {
    direccion = newDireccion;
  }





  public String getCorreo()
  {
    return correo;
  }

  public void setCorreo(String newCorreo)
  {
    correo = newCorreo;
  }

  public String getClave()
  {
    return clave;
  }

  public void setClave(String newClave)
  {
    clave = newClave;
  }
}