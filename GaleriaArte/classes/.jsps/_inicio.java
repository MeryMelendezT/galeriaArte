  /*@lineinfo:filename=/inicio.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _inicio extends com.orionserver.http.OrionHttpJspPage {

  public final String _globalsClassName = null;

  // ** Begin Declarations


  // ** End Declarations

  public void _jspService(HttpServletRequest request, HttpServletResponse response) throws java.io.IOException, ServletException {

    response.setContentType( "text/html;charset=windows-1252");
    /* set up the intrinsic variables using the pageContext goober:
    ** session = HttpSession
    ** application = ServletContext
    ** out = JspWriter
    ** page = this
    ** config = ServletConfig
    ** all session/app beans declared in globals.jsa
    */
    PageContext pageContext = JspFactory.getDefaultFactory().getPageContext( this, request, response, null, true, JspWriter.DEFAULT_BUFFER, true);
    // Note: this is not emitted if the session directive == false
    HttpSession session = pageContext.getSession();
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _inicio page = this;
    ServletConfig config = pageContext.getServletConfig();

    com.evermind.server.http.JspCommonExtraWriter __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
    try {
      // global beans
      // end global beans


      __ojsp_s_out.write(__jsp_StaticText.text[0]);
      __ojsp_s_out.write(__jsp_StaticText.text[1]);
      /*@lineinfo:translated-code*//*@lineinfo:29^13*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/inicio");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[2]);
            /*@lineinfo:translated-code*//*@lineinfo:52^19*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_2=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property styleClass");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setProperty("email");
              __jsp_taghandler_2.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_2,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[3]);
            /*@lineinfo:translated-code*//*@lineinfo:61^19*/            {
              org.apache.struts.taglib.html.PasswordTag __jsp_taghandler_3=(org.apache.struts.taglib.html.PasswordTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.PasswordTag.class,"org.apache.struts.taglib.html.PasswordTag property styleClass");
              __jsp_taghandler_3.setParent(__jsp_taghandler_1);
              __jsp_taghandler_3.setProperty("password");
              __jsp_taghandler_3.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_3,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[4]);
            /*@lineinfo:translated-code*//*@lineinfo:65^21*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_4=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag styleClass value");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setStyleClass("btn btn-primary pull-right");
              __jsp_taghandler_4.setValue("Registrar");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_4,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[5]);
          /*@lineinfo:translated-code*//*@lineinfo:65^94*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__jsp_StaticText.text[6]);


    }
    catch( Throwable e) {
      try {
        if (out != null) out.clear();
      }
      catch( Exception clearException) {
      }
      pageContext.handlePageException( e);
    }
    finally {
      OracleJspRuntime.extraHandlePCFinally(pageContext,true);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
    }

  }
  private static class __jsp_StaticText {
    private static final byte text[][]=new byte[7][];
    static {
      try {
      text[0] = 
      "\r\n".getBytes("Cp1252");
      text[1] = 
      "\r\n<html>\r\n<head>\r\n<meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n  <meta charset=\"utf-8\" />\r\n  <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"assets/img/apple-icon.png\">\r\n  <link rel=\"icon\" type=\"image/png\" href=\"assets/img/favicon.png\">\r\n  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n  <title>\r\n    Galeria de Arte\r\n  </title>\r\n  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\r\n  <!--     Fonts and icons     -->\r\n  <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons\" />\r\n  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\">\r\n  <!-- CSS Files -->\r\n  <link href=\"assets/css/material-kit.css?v=2.0.5\" rel=\"stylesheet\" />\r\n  <!-- CSS Just for demo purpose, don't include it in your project -->\r\n  <link href=\"assets/demo/demo.css\" rel=\"stylesheet\" />\r\n\r\n</head>\r\n<body class=\"login-page sidebar-collapse\">\r\n  <div class=\"page-header header-filter\" style=\"background-image: url('assets/img/bg7.jpg'); background-size: cover; background-position: top center;\">\r\n    <div class=\"container\">\r\n      <div class=\"row\">\r\n        <div class=\"col-lg-4 col-md-6 ml-auto mr-auto\">\r\n          <div class=\"card card-login\">\r\n            ".getBytes("Cp1252");
      text[2] = 
      "\r\n              <div class=\"card-header card-header-primary text-center\">\r\n                <h4 class=\"card-title\">Inicio de Sesion</h4>\r\n                <div class=\"social-line\">\r\n                  <a href=\"#pablo\" class=\"btn btn-just-icon btn-link\">\r\n                    <i class=\"fa fa-facebook-square\"></i>\r\n                  </a>\r\n                  <a href=\"#pablo\" class=\"btn btn-just-icon btn-link\">\r\n                    <i class=\"fa fa-twitter\"></i>\r\n                  </a>\r\n                  <a href=\"#pablo\" class=\"btn btn-just-icon btn-link\">\r\n                    <i class=\"fa fa-google-plus\"></i>\r\n                  </a>\r\n                </div>\r\n              </div>\r\n              <p class=\"description text-center\">Or Be Classical</p>\r\n              <div class=\"card-body\">\r\n                <div class=\"input-group\">\r\n                  <div class=\"input-group-prepend\">\r\n                    <span class=\"input-group-text\">\r\n                      <i class=\"material-icons\">mail</i>\r\n                    </span>\r\n                  </div>\r\n                  ".getBytes("Cp1252");
      text[3] = 
      "\r\n                  <!--<input type=\"email\" class=\"form-control\" placeholder=\"Email...\">-->\r\n                </div>\r\n                <div class=\"input-group\">\r\n                  <div class=\"input-group-prepend\">\r\n                    <span class=\"input-group-text\">\r\n                      <i class=\"material-icons\">lock_outline</i>\r\n                    </span>\r\n                  </div>\r\n                  ".getBytes("Cp1252");
      text[4] = 
      "\r\n                  <!--<input type=\"password\" class=\"form-control\" placeholder=\"Password...\">-->\r\n                </div>\r\n                <div class=\"input-group\" align=\"center\">\r\n                    ".getBytes("Cp1252");
      text[5] = 
      "\r\n                </div>\r\n              </div>\r\n            ".getBytes("Cp1252");
      text[6] = 
      "\r\n          </div>\r\n        </div>\r\n      </div>\r\n    </div>\r\n  </div>\r\n  <!--   Core JS Files   -->\r\n  <script src=\"assets/js/core/jquery.min.js\" type=\"text/javascript\"></script>\r\n  <script src=\"assets/js/core/popper.min.js\" type=\"text/javascript\"></script>\r\n  <script src=\"assets/js/core/bootstrap-material-design.min.js\" type=\"text/javascript\"></script>\r\n  <script src=\"assets/js/plugins/moment.min.js\"></script>\r\n  <!--\tPlugin for the Datepicker, full documentation here: https://github.com/Eonasdan/bootstrap-datetimepicker -->\r\n  <script src=\"assets/js/plugins/bootstrap-datetimepicker.js\" type=\"text/javascript\"></script>\r\n  <!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->\r\n  <script src=\"assets/js/plugins/nouislider.min.js\" type=\"text/javascript\"></script>\r\n  <!--  Google Maps Plugin    -->\r\n  <script src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\r\n  <!-- Control Center for Material Kit: parallax effects, scripts for the example pages etc -->\r\n  <script src=\"assets/js/material-kit.js?v=2.0.5\" type=\"text/javascript\"></script>\r\n</body>\r\n</html>\r\n".getBytes("Cp1252");
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
