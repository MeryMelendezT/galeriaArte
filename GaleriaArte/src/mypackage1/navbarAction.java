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

public class navbarAction extends Action 
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
    navbarForm NavbarForm = (navbarForm) form;
    String boton = NavbarForm.getBoton();
    System.out.println("navbar");
    System.out.println(boton);
    if(boton.equals("Dashboard")){
      return mapping.findForward("dashboard");
    }
    if(boton.equals("Artista")){
      Connection cn = null;
      ConnectDB conn = new ConnectDB();
      ResultSet rsConsulta = null;
      try{
        cn = conn.conexion;
        String cadena = "select * from my_artista order by 1";
        rsConsulta = conn.getData(cadena);
        System.out.println(cadena);
        ArrayList items = new ArrayList();
        while(rsConsulta.next()){
          ClassArtista item = new ClassArtista();
          item.setId(rsConsulta.getString("id"));
          item.setCarnet(rsConsulta.getString("carnet"));
          item.setNombre(rsConsulta.getString("nombre"));
          item.setApellido(rsConsulta.getString("apellido"));
          item.setCorreo(rsConsulta.getString("correo"));
          item.setTelefono(rsConsulta.getString("telefono"));
          items.add(item);
          System.out.println("Paso");
        }
        listadoForm ListadoForm = new listadoForm();
        ListadoForm.setTabla(items);
        request.getSession().setAttribute("listados",ListadoForm);
        return mapping.findForward("artista");
      }catch(Exception e){
        e.printStackTrace();
        return (mapping.findForward("nook"));
      }finally{
        conn.closeConnection();
      }
      //return mapping.findForward("dashboard");
    }if(boton.equals("Categoría")){
      Connection cn = null;
      ConnectDB conn = new ConnectDB();
      ResultSet rsConsulta = null;
      try{
        cn = conn.conexion;
        String cadena = "select * from my_categoria order by 1";
        rsConsulta = conn.getData(cadena);
        System.out.println(cadena);
        ArrayList items = new ArrayList();
        while(rsConsulta.next()){
          ClassCategoria item = new ClassCategoria();
          item.setId(rsConsulta.getString("id"));
          item.setNombre(rsConsulta.getString("nombre"));
          items.add(item);
          System.out.println("Paso");
        }
        listadoForm ListadoForm = new listadoForm();
        ListadoForm.setTabla(items);
        request.getSession().setAttribute("listados",ListadoForm);
        return mapping.findForward("categoria");
      }catch(Exception e){
        e.printStackTrace();
        return (mapping.findForward("nook"));
      }finally{
        conn.closeConnection();
      }
      //return mapping.findForward("categoria");
    }if(boton.equals("Comprador")){
      Connection cn = null;
      ConnectDB conn = new ConnectDB();
      ResultSet rsConsulta = null;
      try{
        cn = conn.conexion;
        String cadena = "select * from my_comprador order by 1";
        rsConsulta = conn.getData(cadena);
        System.out.println(cadena);
        ArrayList items = new ArrayList();
        while(rsConsulta.next()){
          ClassComprador item = new ClassComprador();
          item.setId(rsConsulta.getString("id"));
          item.setCarnet(rsConsulta.getString("carnet"));
          item.setNombre(rsConsulta.getString("nombre"));
          item.setApellido(rsConsulta.getString("apellido"));
          item.setDireccion(rsConsulta.getString("direccion"));
          item.setCorreo(rsConsulta.getString("correo"));
          items.add(item);
          System.out.println("Paso");
        }
        listadoForm ListadoForm = new listadoForm();
        ListadoForm.setTabla(items);
        request.getSession().setAttribute("listados",ListadoForm);
        return mapping.findForward("comprador");
      }catch(Exception e){
        e.printStackTrace();
        return (mapping.findForward("nook"));
      }finally{
        conn.closeConnection();
      }
      //return mapping.findForward("comprador");
    }if(boton.equals("Envío")){
      Connection cn = null;
      ConnectDB conn = new ConnectDB();
      ResultSet rsConsulta = null;
      try{
        cn = conn.conexion;
        String cadena = "select * from my_envio order by 1";
        rsConsulta = conn.getData(cadena);
        System.out.println(cadena);
        ArrayList items = new ArrayList();
        while(rsConsulta.next()){
          ClassEnvio item = new ClassEnvio();
          item.setId(rsConsulta.getString("id"));
          item.setLugarOrigen(rsConsulta.getString("lugarOrigen"));
          item.setLugarDestino(rsConsulta.getString("lugarDestino"));
          items.add(item);
          System.out.println("Paso");
        }
        listadoForm ListadoForm = new listadoForm();
        ListadoForm.setTabla(items);
        request.getSession().setAttribute("listados",ListadoForm);
        return mapping.findForward("envio");
      }catch(Exception e){
        e.printStackTrace();
        return (mapping.findForward("nook"));
      }finally{
        conn.closeConnection();
      }
      //return mapping.findForward("envio");
    }if(boton.equals("Exposición")){
      Connection cn = null;
      ConnectDB conn = new ConnectDB();
      ResultSet rsConsulta = null;
      try{
        cn = conn.conexion;
        String cadena = "select a.id, b.nombre, a.titulo, a.descripcion, a.fechaInaguracion, a.fechaClausura from my_exposicion a, my_salon b where a.salon_id=b.id order by 1";
        rsConsulta = conn.getData(cadena);
        System.out.println(cadena);
        ArrayList items = new ArrayList();
        while(rsConsulta.next()){
          ClassExposicion item = new ClassExposicion();
          item.setId(rsConsulta.getString("id"));
          item.setNombre(rsConsulta.getString("nombre"));
          item.setTitulo(rsConsulta.getString("titulo"));
          item.setDescripcion(rsConsulta.getString("descripcion"));
          item.setFechaInaguracion(rsConsulta.getString("fechaInaguracion"));
          item.setFechaClausura(rsConsulta.getString("fechaClausura"));
          items.add(item);
          System.out.println("Paso");
        }
        listadoForm ListadoForm = new listadoForm();
        ListadoForm.setTabla(items);
        request.getSession().setAttribute("listados",ListadoForm);
        return mapping.findForward("exposicion");
      }catch(Exception e){
        e.printStackTrace();
        return (mapping.findForward("nook"));
      }finally{
        conn.closeConnection();
      }
      //return mapping.findForward("exposicion");
    }if(boton.equals("Factura")){
      Connection cn = null;
      ConnectDB conn = new ConnectDB();
      ResultSet rsConsulta = null;
      try{
        cn = conn.conexion;
        String cadena = "select * from my_factura order by 1";
        rsConsulta = conn.getData(cadena);
        System.out.println(cadena);
        ArrayList items = new ArrayList();
        while(rsConsulta.next()){
          ClassFactura item = new ClassFactura();
          item.setId(rsConsulta.getString("id"));
          item.setOrden_id(rsConsulta.getString("orden_id"));
          item.setNumeroFactura(rsConsulta.getString("numeroFactura"));
          item.setAutorizacion(rsConsulta.getString("autorizacion"));
          item.setFecha(rsConsulta.getString("fecha"));
          item.setApellidoFactura(rsConsulta.getString("apellidoFactura"));
          item.setCantidad(rsConsulta.getString("cantidad"));
          item.setDescripcion(rsConsulta.getString("descripcion"));
          item.setImporte(rsConsulta.getString("importe"));
          item.setCodigoControl(rsConsulta.getString("codigoControl"));
          item.setLimiteEmision(rsConsulta.getString("limiteEmision"));
          items.add(item);
          System.out.println("Paso");
        }
        listadoForm ListadoForm = new listadoForm();
        ListadoForm.setTabla(items);
        request.getSession().setAttribute("listados",ListadoForm);
        return mapping.findForward("factura");
      }catch(Exception e){
        e.printStackTrace();
        return (mapping.findForward("nook"));
      }finally{
        conn.closeConnection();
      }
      //return mapping.findForward("factura");
    }if(boton.equals("Obra")){
      Connection cn = null;
      ConnectDB conn = new ConnectDB();
      ResultSet rsConsulta = null;
      try{
        cn = conn.conexion;
        String cadena = "select * from my_obra order by 1";
        rsConsulta = conn.getData(cadena);
        System.out.println(cadena);
        ArrayList items = new ArrayList();
        while(rsConsulta.next()){
          ClassObra item = new ClassObra();
          item.setId(rsConsulta.getString("id"));
          item.setArtista_id(rsConsulta.getString("artista_id"));
          item.setPropietario_id(rsConsulta.getString("propietario_id"));
          item.setCategoria_id(rsConsulta.getString("categoria_id"));
          item.setNumeroRegistro(rsConsulta.getString("numeroRegistro"));
          item.setTitulo(rsConsulta.getString("titulo"));
          item.setEstilo(rsConsulta.getString("estilo"));
          item.setPrecio(rsConsulta.getString("precio"));
          item.setImagen(rsConsulta.getString("imagen"));
          items.add(item);
          System.out.println("Paso");
        }
        listadoForm ListadoForm = new listadoForm();
        ListadoForm.setTabla(items);
        request.getSession().setAttribute("listados",ListadoForm);
        return mapping.findForward("obra");
      }catch(Exception e){
        e.printStackTrace();
        return (mapping.findForward("nook"));
      }finally{
        conn.closeConnection();
      }
      //return mapping.findForward("obra");
    }if(boton.equals("Orden")){
      return mapping.findForward("orden");
    }if(boton.equals("Pago")){
      return mapping.findForward("pago");
    }if(boton.equals("Propietario")){
      Connection cn = null;
      ConnectDB conn = new ConnectDB();
      ResultSet rsConsulta = null;
      try{
        cn = conn.conexion;
        String cadena = "select * from my_propietario order by 1";
        rsConsulta = conn.getData(cadena);
        System.out.println(cadena);
        ArrayList items = new ArrayList();
        while(rsConsulta.next()){
          ClassPropietario item = new ClassPropietario();
          item.setId(rsConsulta.getString("id"));
          item.setCarnet(rsConsulta.getString("carnet"));
          item.setNombre(rsConsulta.getString("nombre"));
          item.setApellido(rsConsulta.getString("apellido"));
          item.setDireccion(rsConsulta.getString("direccion"));
          item.setCorreo(rsConsulta.getString("correo"));
          items.add(item);
          System.out.println("Paso");
        }
        listadoForm ListadoForm = new listadoForm();
        ListadoForm.setTabla(items);
        request.getSession().setAttribute("listados",ListadoForm);
        return mapping.findForward("propietario");
      }catch(Exception e){
        e.printStackTrace();
        return (mapping.findForward("nook"));
      }finally{
        conn.closeConnection();
      }
      //return mapping.findForward("propietario");
    }if(boton.equals("Registro Exposición")){
      return mapping.findForward("registroExposicion");
    }if(boton.equals("Registro Obra")){
      return mapping.findForward("registroObra");
    }if(boton.equals("Salón")){
      Connection cn = null;
      ConnectDB conn = new ConnectDB();
      ResultSet rsConsulta = null;
      try{
        cn = conn.conexion;
        String cadena = "select * from my_salon order by 1";
        rsConsulta = conn.getData(cadena);
        System.out.println(cadena);
        ArrayList items = new ArrayList();
        while(rsConsulta.next()){
          ClassSalon item = new ClassSalon();
          item.setId(rsConsulta.getString("id"));
          item.setNombre(rsConsulta.getString("nombre"));
          item.setCapacidad(rsConsulta.getString("capacidad"));
          items.add(item);
          System.out.println("Paso");
        }
        listadoForm ListadoForm = new listadoForm();
        ListadoForm.setTabla(items);
        request.getSession().setAttribute("listados",ListadoForm);
        return mapping.findForward("salon");
      }catch(Exception e){
        e.printStackTrace();
        return (mapping.findForward("nook"));
      }finally{
        conn.closeConnection();
      }
      //return mapping.findForward("salon");
    }else{
      return mapping.findForward("nook");
    }
  }
}