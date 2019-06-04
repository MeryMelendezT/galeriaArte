package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class altasEnvioForm extends ActionForm 
{
  String id;
  String lugarOrigen;
  String lugarDestino;

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

  public String getLugarOrigen()
  {
    return lugarOrigen;
  }

  public void setLugarOrigen(String newLugarOrigen)
  {
    lugarOrigen = newLugarOrigen;
  }

  public String getLugarDestino()
  {
    return lugarDestino;
  }

  public void setLugarDestino(String newLugarDestino)
  {
    lugarDestino = newLugarDestino;
  }



}