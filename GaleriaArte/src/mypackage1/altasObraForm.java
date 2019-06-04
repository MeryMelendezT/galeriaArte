package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class altasObraForm extends ActionForm 
{
  String id;
  String propietario_id;
  String titulo;
  String estilo;
  String precio;
  String imagen;
  String categoria_id;
  String artista_id;
  String numeroRegistro;

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

  public String getPropietario_id()
  {
    return propietario_id;
  }

  public void setPropietario_id(String newPropietario_id)
  {
    propietario_id = newPropietario_id;
  }

  public String getTitulo()
  {
    return titulo;
  }

  public void setTitulo(String newTitulo)
  {
    titulo = newTitulo;
  }

  public String getEstilo()
  {
    return estilo;
  }

  public void setEstilo(String newEstilo)
  {
    estilo = newEstilo;
  }

  public String getPrecio()
  {
    return precio;
  }

  public void setPrecio(String newPrecio)
  {
    precio = newPrecio;
  }



  public String getImagen()
  {
    return imagen;
  }

  public void setImagen(String newImagen)
  {
    imagen = newImagen;
  }

  public String getCategoria_id()
  {
    return categoria_id;
  }

  public void setCategoria_id(String newCategoria_id)
  {
    categoria_id = newCategoria_id;
  }

  public String getArtista_id()
  {
    return artista_id;
  }

  public void setArtista_id(String newArtista_id)
  {
    artista_id = newArtista_id;
  }

  public String getNumeroRegistro()
  {
    return numeroRegistro;
  }

  public void setNumeroRegistro(String newNumeroRegistro)
  {
    numeroRegistro = newNumeroRegistro;
  }



}