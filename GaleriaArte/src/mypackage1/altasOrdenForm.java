package mypackage1;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionError;
import org.apache.struts.action.ActionMapping;
import javax.servlet.http.HttpServletRequest;

public class altasOrdenForm extends ActionForm 
{
  String id;
  String comprador_id;
  String envio_id;
  String pago_id;
  String obra_id;

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

  public String getComprador_id()
  {
    return comprador_id;
  }

  public void setComprador_id(String newComprador_id)
  {
    comprador_id = newComprador_id;
  }

  public String getEnvio_id()
  {
    return envio_id;
  }

  public void setEnvio_id(String newEnvio_id)
  {
    envio_id = newEnvio_id;
  }



  public String getPago_id()
  {
    return pago_id;
  }

  public void setPago_id(String newPago_id)
  {
    pago_id = newPago_id;
  }

  public String getObra_id()
  {
    return obra_id;
  }

  public void setObra_id(String newObra_id)
  {
    obra_id = newObra_id;
  }
}