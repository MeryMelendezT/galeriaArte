  /*@lineinfo:filename=/factura.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _factura extends oracle.jsp.runtime.HttpJsp {

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
    if (pageContext.getAttribute(OracleJspRuntime.JSP_REQUEST_REDIRECTED, PageContext.REQUEST_SCOPE) != null) {
      pageContext.setAttribute(OracleJspRuntime.JSP_PAGE_DONTNOTIFY, "true", PageContext.PAGE_SCOPE);
      JspFactory.getDefaultFactory().releasePageContext(pageContext);
      return;
}
    int __jsp_tag_starteval;
    ServletContext application = pageContext.getServletContext();
    JspWriter out = pageContext.getOut();
    _factura page = this;
    ServletConfig config = pageContext.getServletConfig();

    try {
      // global beans
      // end global beans


      out.write(__jsp_StaticText.text[0]);
      out.write(__jsp_StaticText.text[1]);
      out.write(__jsp_StaticText.text[2]);
      /*@lineinfo:translated-code*//*@lineinfo:29^7*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/navbar");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[3]);
            /*@lineinfo:translated-code*//*@lineinfo:35^17*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_2=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setProperty("boton");
              __jsp_taghandler_2.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_2.setValue("Artista");
              __jsp_tag_starteval=__jsp_taghandler_2.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_2,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_2.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_2.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_2);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[4]);
            /*@lineinfo:translated-code*//*@lineinfo:41^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_3=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_3.setParent(__jsp_taghandler_1);
              __jsp_taghandler_3.setProperty("boton");
              __jsp_taghandler_3.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_3.setValue("Categor�a");
              __jsp_tag_starteval=__jsp_taghandler_3.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_3,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_3.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_3.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_3);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[5]);
            /*@lineinfo:translated-code*//*@lineinfo:47^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_4=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setProperty("boton");
              __jsp_taghandler_4.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_4.setValue("Comprador");
              __jsp_tag_starteval=__jsp_taghandler_4.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_4,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_4.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_4.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_4);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[6]);
            /*@lineinfo:translated-code*//*@lineinfo:53^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_5=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_5.setParent(__jsp_taghandler_1);
              __jsp_taghandler_5.setProperty("boton");
              __jsp_taghandler_5.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_5.setValue("Env�o");
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_5,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[7]);
            /*@lineinfo:translated-code*//*@lineinfo:59^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_6=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_6.setParent(__jsp_taghandler_1);
              __jsp_taghandler_6.setProperty("boton");
              __jsp_taghandler_6.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_6.setValue("Exposici�n");
              __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_6,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[8]);
            /*@lineinfo:translated-code*//*@lineinfo:65^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_7=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_7.setParent(__jsp_taghandler_1);
              __jsp_taghandler_7.setProperty("boton");
              __jsp_taghandler_7.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_7.setValue("Factura");
              __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_7,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[9]);
            /*@lineinfo:translated-code*//*@lineinfo:71^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_8=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_8.setParent(__jsp_taghandler_1);
              __jsp_taghandler_8.setProperty("boton");
              __jsp_taghandler_8.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_8.setValue("Obra");
              __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_8,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[10]);
            /*@lineinfo:translated-code*//*@lineinfo:77^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_9=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_9.setParent(__jsp_taghandler_1);
              __jsp_taghandler_9.setProperty("boton");
              __jsp_taghandler_9.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_9.setValue("Orden");
              __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_9,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[11]);
            /*@lineinfo:translated-code*//*@lineinfo:83^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_10=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_10.setParent(__jsp_taghandler_1);
              __jsp_taghandler_10.setProperty("boton");
              __jsp_taghandler_10.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_10.setValue("Pago");
              __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_10,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[12]);
            /*@lineinfo:translated-code*//*@lineinfo:89^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_11=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_11.setParent(__jsp_taghandler_1);
              __jsp_taghandler_11.setProperty("boton");
              __jsp_taghandler_11.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_11.setValue("Propietario");
              __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_11,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[13]);
            /*@lineinfo:translated-code*//*@lineinfo:95^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_12=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_12.setParent(__jsp_taghandler_1);
              __jsp_taghandler_12.setProperty("boton");
              __jsp_taghandler_12.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_12.setValue("Registro Exposici�n");
              __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_12,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[14]);
            /*@lineinfo:translated-code*//*@lineinfo:101^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_13=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_13.setParent(__jsp_taghandler_1);
              __jsp_taghandler_13.setProperty("boton");
              __jsp_taghandler_13.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_13.setValue("Registro Obra");
              __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_13,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[15]);
            /*@lineinfo:translated-code*//*@lineinfo:107^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_14=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_14.setParent(__jsp_taghandler_1);
              __jsp_taghandler_14.setProperty("boton");
              __jsp_taghandler_14.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_14.setValue("Sal�n");
              __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_14,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[16]);
          /*@lineinfo:translated-code*//*@lineinfo:107^104*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[17]);
      /*@lineinfo:translated-code*//*@lineinfo:192^19*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_15=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action");
        __jsp_taghandler_15.setParent(null);
        __jsp_taghandler_15.setAction("/altasFactura");
        __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[18]);
            /*@lineinfo:translated-code*//*@lineinfo:198^27*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_16=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property styleClass");
              __jsp_taghandler_16.setParent(__jsp_taghandler_15);
              __jsp_taghandler_16.setProperty("id");
              __jsp_taghandler_16.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_16,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[19]);
            /*@lineinfo:translated-code*//*@lineinfo:205^27*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_17=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property styleClass");
              __jsp_taghandler_17.setParent(__jsp_taghandler_15);
              __jsp_taghandler_17.setProperty("orden_id");
              __jsp_taghandler_17.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_17,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[20]);
            /*@lineinfo:translated-code*//*@lineinfo:212^27*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_18=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property styleClass");
              __jsp_taghandler_18.setParent(__jsp_taghandler_15);
              __jsp_taghandler_18.setProperty("numeroFactura");
              __jsp_taghandler_18.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_18,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[21]);
            /*@lineinfo:translated-code*//*@lineinfo:221^27*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_19=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property styleClass");
              __jsp_taghandler_19.setParent(__jsp_taghandler_15);
              __jsp_taghandler_19.setProperty("autorizacion");
              __jsp_taghandler_19.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_19.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_19,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_19.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_19.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_19);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[22]);
            /*@lineinfo:translated-code*//*@lineinfo:228^27*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_20=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property styleClass");
              __jsp_taghandler_20.setParent(__jsp_taghandler_15);
              __jsp_taghandler_20.setProperty("fecha");
              __jsp_taghandler_20.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_20.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_20,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_20.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_20.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_20);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[23]);
            /*@lineinfo:translated-code*//*@lineinfo:237^27*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_21=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property styleClass");
              __jsp_taghandler_21.setParent(__jsp_taghandler_15);
              __jsp_taghandler_21.setProperty("apellidoFactura");
              __jsp_taghandler_21.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_21.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_21,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_21.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_21.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_21);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[24]);
            /*@lineinfo:translated-code*//*@lineinfo:244^27*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_22=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property styleClass");
              __jsp_taghandler_22.setParent(__jsp_taghandler_15);
              __jsp_taghandler_22.setProperty("cantidad");
              __jsp_taghandler_22.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_22.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_22,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_22.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_22.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_22);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[25]);
            /*@lineinfo:translated-code*//*@lineinfo:251^27*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_23=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property styleClass");
              __jsp_taghandler_23.setParent(__jsp_taghandler_15);
              __jsp_taghandler_23.setProperty("descripcion");
              __jsp_taghandler_23.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_23.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_23,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_23.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_23.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_23);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[26]);
            /*@lineinfo:translated-code*//*@lineinfo:258^27*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_24=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property styleClass");
              __jsp_taghandler_24.setParent(__jsp_taghandler_15);
              __jsp_taghandler_24.setProperty("importe");
              __jsp_taghandler_24.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_24.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_24,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_24.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_24.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_24);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[27]);
            /*@lineinfo:translated-code*//*@lineinfo:265^27*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_25=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property styleClass");
              __jsp_taghandler_25.setParent(__jsp_taghandler_15);
              __jsp_taghandler_25.setProperty("codigoControl");
              __jsp_taghandler_25.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_25.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_25,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_25.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_25.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_25);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[28]);
            /*@lineinfo:translated-code*//*@lineinfo:272^27*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_26=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property styleClass");
              __jsp_taghandler_26.setParent(__jsp_taghandler_15);
              __jsp_taghandler_26.setProperty("limiteEmision");
              __jsp_taghandler_26.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_26.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_26,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_26.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_26.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_26);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[29]);
            /*@lineinfo:translated-code*//*@lineinfo:276^25*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_27=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag styleClass value");
              __jsp_taghandler_27.setParent(__jsp_taghandler_15);
              __jsp_taghandler_27.setStyleClass("btn btn-info pull-right");
              __jsp_taghandler_27.setValue("Registrar");
              __jsp_tag_starteval=__jsp_taghandler_27.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_27,__jsp_tag_starteval,out);
                do {
                } while (__jsp_taghandler_27.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
              }
              if (__jsp_taghandler_27.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_27);
            }
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[30]);
          /*@lineinfo:translated-code*//*@lineinfo:276^95*/          } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[31]);
      /*@lineinfo:translated-code*//*@lineinfo:312^37*/      {
        org.apache.struts.taglib.logic.IterateTag __jsp_taghandler_28=(org.apache.struts.taglib.logic.IterateTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.logic.IterateTag.class,"org.apache.struts.taglib.logic.IterateTag id indexId name property");
        __jsp_taghandler_28.setParent(null);
        __jsp_taghandler_28.setId("tabla");
        __jsp_taghandler_28.setIndexId("index");
        __jsp_taghandler_28.setName("listados");
        __jsp_taghandler_28.setProperty("tabla");
        java.lang.Object tabla = null;
        java.lang.Integer index = null;
        __jsp_tag_starteval=__jsp_taghandler_28.doStartTag();
        if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
        {
          out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_28,__jsp_tag_starteval,out);
          do {
            tabla = (java.lang.Object) pageContext.findAttribute("tabla");
            index = (java.lang.Integer) pageContext.findAttribute("index");
            /*@lineinfo:generated-code*/
            out.write(__jsp_StaticText.text[32]);
          /*@lineinfo:translated-code*//*@lineinfo:312^112*/          } while (__jsp_taghandler_28.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
          out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
        }
        if (__jsp_taghandler_28.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_28);
      }
      /*@lineinfo:generated-code*/
      out.write(__jsp_StaticText.text[33]);


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
    private static final char text[][]=new char[34][];
    static {
      try {
      text[0] = 
      "\n".toCharArray();
      text[1] = 
      "\n".toCharArray();
      text[2] = 
      "\n<html>\n<head>\n  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\n  <meta charset=\"utf-8\" />\n  <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"assets1/img/apple-icon.png\">\n  <link rel=\"icon\" type=\"image/png\" href=\"assets1/img/favicon.png\">\n  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\n  <title>Galeria de Arte</title>\n  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\n  <!--     Fonts and icons     -->\n  <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons\" />\n  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\">\n  <!-- CSS Files -->\n  <link href=\"assets1/css/material-dashboard.css?v=2.1.1\" rel=\"stylesheet\" />\n  <!-- CSS Just for demo purpose, don't include it in your project -->\n  <link href=\"assets1/demo/demo.css\" rel=\"stylesheet\" />\n</head>\n<body>\n<div class=\"wrapper \">\n    <div class=\"sidebar\" data-color=\"azure\" data-background-color=\"white\" data-image=\"assets1/img/sidebar-1.jpg\">\n      <div class=\"logo\">\n        <a href=\"http://www.creative-tim.com\" class=\"simple-text logo-normal\">\n          Galeria de arte\n        </a>\n      </div>\n      ".toCharArray();
      text[3] = 
      "\n        <div class=\"sidebar-wrapper\">\n          <ul class=\"nav\">\n            <li class=\"nav-item\">\n              <a class=\"nav-link\" href=\"./dashboard.jsp\">\n                <i class=\"material-icons\">palette</i>\n                ".toCharArray();
      text[4] = 
      "\n              </a>\n            </li>\n            <li class=\"nav-item \">\n              <a class=\"nav-link\" href=\"./categoria.jsp\">\n                <i class=\"material-icons\">rate_review</i>\n                <p>".toCharArray();
      text[5] = 
      "</p>\n              </a>\n            </li>\n            <li class=\"nav-item \">\n              <a class=\"nav-link\" href=\"./comprador.jsp\">\n                <i class=\"material-icons\">supervisor_account</i>\n                <p>".toCharArray();
      text[6] = 
      "</p>\n              </a>\n            </li>\n            <li class=\"nav-item \">\n              <a class=\"nav-link\" href=\"./envio.jsp\">\n                <i class=\"material-icons\">local_airport</i>\n                <p>".toCharArray();
      text[7] = 
      "</p>\n              </a>\n            </li>\n          <li class=\"nav-item  \">\n              <a class=\"nav-link\" href=\"./exposicion.jsp\">\n                <i class=\"material-icons\">layers</i>\n                <p>".toCharArray();
      text[8] = 
      "</p>\n              </a>\n            </li>\n            <li class=\"nav-item active\">\n              <a class=\"nav-link\" href=\"./factura.jsp\">\n                <i class=\"material-icons\">receipt</i>\n                <p>".toCharArray();
      text[9] = 
      "</p>\n              </a>\n            </li>\n            <li class=\"nav-item \">\n              <a class=\"nav-link\" href=\"./obra.jsp\">\n                <i class=\"material-icons\">photo_size_select_actual</i>\n                <p>".toCharArray();
      text[10] = 
      "</p>\n              </a>\n            </li>\n            <li class=\"nav-item \">\n              <a class=\"nav-link\" href=\"./orden.jsp\">\n                <i class=\"material-icons\">image_search</i>\n                <p>".toCharArray();
      text[11] = 
      "</p>\n              </a>\n            </li>\n            <li class=\"nav-item \">\n              <a class=\"nav-link\" href=\"./pago.jsp\">\n                <i class=\"material-icons\">monetization_on</i>\n                <p>".toCharArray();
      text[12] = 
      "</p>\n              </a>\n            </li>\n            <li class=\"nav-item \">\n              <a class=\"nav-link\" href=\"./propietario.jsp\">\n                <i class=\"material-icons\">person</i>\n                <p>".toCharArray();
      text[13] = 
      "</p>\n              </a>\n            </li>\n            <li class=\"nav-item \">\n              <a class=\"nav-link\" href=\"./registroExposicion.jsp\">\n                <i class=\"material-icons\">view_carousel</i>\n                <p>".toCharArray();
      text[14] = 
      "</p>\n              </a>\n            </li>\n            <li class=\"nav-item \">\n              <a class=\"nav-link\" href=\"./registroObra.jsp\">\n                <i class=\"material-icons\">vertical_split</i>\n                <p>".toCharArray();
      text[15] = 
      "</p>\n              </a>\n            </li>\n            <li class=\"nav-item \">\n              <a class=\"nav-link\" href=\"./salon.jsp\">\n                <i class=\"material-icons\">store</i>\n                <p>".toCharArray();
      text[16] = 
      "</p>\n              </a>\n            </li>\n            </ul>\n        </div>\n      </div>\n    ".toCharArray();
      text[17] = 
      "\n    \n    <div class=\"main-panel\">\n      <!-- Navbar -->\n      <nav class=\"navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top \">\n        <div class=\"container-fluid\">\n          <div class=\"navbar-wrapper\">\n            <a class=\"navbar-brand\" href=\"#pablo\">Inicio</a>\n          </div>\n          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" aria-controls=\"navigation-index\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n            <span class=\"sr-only\">Toggle navigation</span>\n            <span class=\"navbar-toggler-icon icon-bar\"></span>\n            <span class=\"navbar-toggler-icon icon-bar\"></span>\n            <span class=\"navbar-toggler-icon icon-bar\"></span>\n          </button>\n          <div class=\"collapse navbar-collapse justify-content-end\">\n            <ul class=\"navbar-nav\">\n\n              <li class=\"nav-item dropdown\">\n                <a class=\"nav-link\" href=\"#pablo\" id=\"navbarDropdownProfile\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n                  <i class=\"material-icons\">person</i>\n                  <p class=\"d-lg-none d-md-block\">\n                    Account\n                  </p>\n                </a>\n                <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownProfile\">\n                  <a class=\"dropdown-item\" href=\"#\">Log out</a>\n                </div>\n              </li>\n            </ul>\n          </div>\n        </div>\n      </nav>\n      <!-- End Navbar -->\n      <div class=\"content\">\n        <div class=\"container-fluid\">\n          <div class=\"row\">\n            <div class=\"col-md-12\">\n              <div class=\"row\">\n            <div class=\"col-lg-12 col-md-12\">\n              <div class=\"card\">\n                <div class=\"card-header card-header-tabs card-header-info\">\n                  <div class=\"nav-tabs-navigation\">\n                    <div class=\"nav-tabs-wrapper\">\n                      <ul class=\"nav nav-tabs\" data-tabs=\"tabs\">\n                        <li class=\"nav-item\">\n                          <a class=\"nav-link active\" href=\"#altas\" data-toggle=\"tab\">\n                            <i class=\"material-icons\">playlist_add</i> Altas\n                            <div class=\"ripple-container\"></div>\n                          </a>\n                        </li>\n                        <li class=\"nav-item\">\n                          <a class=\"nav-link\" href=\"#bajas\" data-toggle=\"tab\">\n                            <i class=\"material-icons\">delete_sweep</i> Bajas\n                            <div class=\"ripple-container\"></div>\n                          </a>\n                        </li>\n                        <li class=\"nav-item\">\n                          <a class=\"nav-link\" href=\"#modificaciones\" data-toggle=\"tab\">\n                            <i class=\"material-icons\">loop</i> Modificaciones\n                            <div class=\"ripple-container\"></div>\n                          </a>\n                        </li>\n                      </ul>\n                    </div>\n                  </div>\n                </div>\n                <div class=\"card-body\">\n                  <div class=\"tab-content\">\n                    <div class=\"tab-pane active\" id=\"altas\">\n                      <table class=\"table\">\n                        <tbody>\n                          <tr>\n                            <div class=\"content\">\n        <div class=\"container-fluid\">\n          <div class=\"row\">\n            <div class=\"col-md-12\">\n              <div class=\"card\">\n                <div class=\"card-body\">\n                  ".toCharArray();
      text[18] = 
      "\n                    <div class=\"row\">\n                      <div class=\"col-md-6\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">Id</label>\n                          <!--<input type=\"text\" class=\"form-control\">-->\n                          ".toCharArray();
      text[19] = 
      "\n                        </div>\n                      </div>\n                      <div class=\"col-md-6\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">Orden</label>\n                          <!--<input type=\"text\" class=\"form-control\">-->\n                          ".toCharArray();
      text[20] = 
      "\n                        </div>\n                      </div>\n                      <div class=\"col-md-12\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">Numero Factura</label>\n                          <!--<input type=\"email\" class=\"form-control\">-->\n                          ".toCharArray();
      text[21] = 
      "\n                        </div>\n                      </div>\n                    </div>\n                    <div class=\"row\">\n                      <div class=\"col-md-6\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">Autorizaci�n</label>\n                          <!--<input type=\"text\" class=\"form-control\">-->\n                          ".toCharArray();
      text[22] = 
      "\n                        </div>\n                      </div>\n                      <div class=\"col-md-6\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">Fecha</label>\n                          <!--<input type=\"text\" class=\"form-control\">-->\n                          ".toCharArray();
      text[23] = 
      "\n                        </div>\n                      </div>\n                    </div>\n                    <div class=\"row\">\n                      <div class=\"col-md-6\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">Apellido</label>\n                          <!--<input type=\"text\" class=\"form-control\">-->\n                          ".toCharArray();
      text[24] = 
      "\n                        </div>\n                      </div>\n                      <div class=\"col-md-6\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">Cantidad</label>\n                          <!--<input type=\"text\" class=\"form-control\">-->\n                          ".toCharArray();
      text[25] = 
      "\n                        </div>\n                      </div>\n                      <div class=\"col-md-6\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">Descripci�n</label>\n                          <!--<input type=\"text\" class=\"form-control\">-->\n                          ".toCharArray();
      text[26] = 
      "\n                        </div>\n                      </div>\n                      <div class=\"col-md-6\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">Importe</label>\n                          <!--<input type=\"text\" class=\"form-control\">-->\n                          ".toCharArray();
      text[27] = 
      "\n                        </div>\n                      </div>\n                      <div class=\"col-md-6\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">Codigo Control</label>\n                          <!--<input type=\"text\" class=\"form-control\">-->\n                          ".toCharArray();
      text[28] = 
      "\n                        </div>\n                      </div>\n                      <div class=\"col-md-6\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">Limite Emision</label>\n                          <!--<input type=\"text\" class=\"form-control\">-->\n                          ".toCharArray();
      text[29] = 
      "\n                        </div>\n                      </div>\n                      <div class=\"col-md-6\">\n                        ".toCharArray();
      text[30] = 
      "\n                      </div>\n                    </div>\n                    <!--<button type=\"submit\" class=\"btn btn-info pull-right\">Registrar</button>-->\n                  ".toCharArray();
      text[31] = 
      "\n                </div>\n              </div>\n            </div>\n          </div>\n        </div>\n      </div>\n      </tr>            \n    </tbody>\n  </table>\n</div>\n                    <div class=\"tab-pane\" id=\"bajas\">\n                        <div class=\"col-md-12\">\n                          <div class=\"card card-plain\">\n                            <div class=\"card-body\">\n                              <div class=\"table-responsive\">\n                                <table class=\"table table-hover\">\n                                  <thead class=\"\">\n                                    <th>ID</th>\n                                    <th>Orden</th>\n                                    <th>Numero Factura</th>\n                                    <th>Autorizacion</th>\n                                    <th>Fecha</th>\n                                    <th>Apellido</th>\n                                    <th>Cantidad</th>\n                                    <th>Descripcion</th>\n                                    <th>Importe</th>\n                                    <th>Codigo de Control</th>\n                                    <th>Limite de Emision</th>\n                                    <th></th>\n                                  </thead>\n                                  <tbody>\n                                    ".toCharArray();
      text[32] = 
      "\n                                      <tr>\n                                        <td><bean:write name=\"tabla\" property=\"id\" /></td>\n                                        <td><bean:write name=\"tabla\" property=\"orden_id\" /></td>\n                                        <td><bean:write name=\"tabla\" property=\"numeroFactura\" /></td>\n                                        <td><bean:write name=\"tabla\" property=\"autorizacion\" /></td>\n                                        <td><bean:write name=\"tabla\" property=\"fecha\" /></td>\n                                        <td><bean:write name=\"tabla\" property=\"apellidoFactura\" /></td>\n                                        <td><bean:write name=\"tabla\" property=\"cantidad\" /></td>\n                                        <td><bean:write name=\"tabla\" property=\"descripcion\" /></td>\n                                        <td><bean:write name=\"tabla\" property=\"importe\" /></td>\n                                        <td><bean:write name=\"tabla\" property=\"codigoControl\" /></td>\n                                        <td><bean:write name=\"tabla\" property=\"limiteEmision\" /></td>\n                                        <td class=\"td-actions text-right\">\n                                            <button type=\"button\" rel=\"tooltip\" title=\"Edit Task\" class=\"btn btn-primary btn-link btn-sm\">\n                                              <i class=\"material-icons\">edit</i>\n                                            </button>\n                                            <button type=\"button\" rel=\"tooltip\" title=\"Remove\" class=\"btn btn-danger btn-link btn-sm\">\n                                              <i class=\"material-icons\">close</i>\n                                            </button>\n                                        </td>\n                                      </tr>\n                                    ".toCharArray();
      text[33] = 
      "\n                                  </tbody>\n                                </table>\n                              </div>\n                            </div>\n                          </div>\n                        </div>\n                      </div>  \n\n  <div class=\"tab-pane\" id=\"modificaciones\">\n    <table class=\"table\">\n      <tbody>\n        <tr>\n           <td>\n             </td>\n               <div class=\"content\">\n        <div class=\"container-fluid\">\n          <div class=\"row\">\n            <div class=\"col-md-12\">\n              <div class=\"card\">\n                <div class=\"card-body\">\n                  <form>\n                    <div class=\"row\">\n                      <div class=\"col-md-6\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">Nombre</label>\n                          <input type=\"text\" class=\"form-control\">\n                        </div>\n                      </div>\n                      <div class=\"col-md-6\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">Apellido</label>\n                          <input type=\"text\" class=\"form-control\">\n                        </div>\n                      </div>\n                      <div class=\"col-md-12\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">Direccion</label>\n                          <input type=\"email\" class=\"form-control\">\n                        </div>\n                      </div>\n                    </div>\n                    <div class=\"row\">\n                      <div class=\"col-md-6\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">Correo</label>\n                          <input type=\"text\" class=\"form-control\">\n                        </div>\n                      </div>\n                      <div class=\"col-md-6\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">Celular</label>\n                          <input type=\"text\" class=\"form-control\">\n                        </div>\n                      </div>\n                    </div>\n                    <div class=\"row\">\n                      <div class=\"col-md-6\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">Ciudad</label>\n                          <input type=\"text\" class=\"form-control\">\n                        </div>\n                      </div>\n                      <div class=\"col-md-6\">\n                        <div class=\"form-group\">\n                          <label class=\"bmd-label-floating\">CI</label>\n                          <input type=\"text\" class=\"form-control\">\n                        </div>\n                      </div>\n                    </div>\n                    <button type=\"submit\" class=\"btn btn-info pull-right\">Registrar</button>\n                  </form>\n                </div>\n              </div>\n            </div>\n          </div>\n        </div>\n      </div>\n      </tr>            \n    </tbody>\n                </table>\n                    </div>\n                  </div>\n                </div>\n              </div>\n            </div>\n          </div>\n        </div>\n      </div>\n      </div>\n    </div>\n    </div>\n  </div>\n <!--   Core JS Files   -->\n  <script src=\"assets1/js/core/jquery.min.js\"></script>\n  <script src=\"assets1/js/core/popper.min.js\"></script>\n  <script src=\"assets1/js/core/bootstrap-material-design.min.js\"></script>\n  <script src=\"assets1/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\n  <!-- Plugin for the momentJs  -->\n  <script src=\"assets1/js/plugins/moment.min.js\"></script>\n  <!--  Plugin for Sweet Alert -->\n  <script src=\"assets1/js/plugins/sweetalert2.js\"></script>\n  <!-- Forms Validations Plugin -->\n  <script src=\"assets1/js/plugins/jquery.validate.min.js\"></script>\n  <!-- Plugin for the Wizard, full documentation here: https://github.com/VinceG/twitter-bootstrap-wizard -->\n  <script src=\"assets1/js/plugins/jquery.bootstrap-wizard.js\"></script>\n  <!--  Plugin for Select, full documentation here: http://silviomoreto.github.io/bootstrap-select -->\n  <script src=\"assets1/js/plugins/bootstrap-selectpicker.js\"></script>\n  <!--  Plugin for the DateTimePicker, full documentation here: https://eonasdan.github.io/bootstrap-datetimepicker/ -->\n  <script src=\"assets1/js/plugins/bootstrap-datetimepicker.min.js\"></script>\n  <!--  DataTables.net Plugin, full documentation here: https://datatables.net/  -->\n  <script src=\"assets1/js/plugins/jquery.dataTables.min.js\"></script>\n  <!--  Plugin for Tags, full documentation here: https://github.com/bootstrap-tagsinput/bootstrap-tagsinputs  -->\n  <script src=\"assets1/js/plugins/bootstrap-tagsinput.js\"></script>\n  <!-- Plugin for Fileupload, full documentation here: http://www.jasny.net/bootstrap/javascript/#fileinput -->\n  <script src=\"assets1/js/plugins/jasny-bootstrap.min.js\"></script>\n  <!--  Full Calendar Plugin, full documentation here: https://github.com/fullcalendar/fullcalendar    -->\n  <script src=\"assets1/js/plugins/fullcalendar.min.js\"></script>\n  <!-- Vector Map plugin, full documentation here: http://jvectormap.com/documentation/ -->\n  <script src=\"assets1/js/plugins/jquery-jvectormap.js\"></script>\n  <!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->\n  <script src=\"assets1/js/plugins/nouislider.min.js\"></script>\n  <!-- Include a polyfill for ES6 Promises (optional) for IE11, UC Browser and Android browser support SweetAlert -->\n  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/core-js/2.4.1/core.js\"></script>\n  <!-- Library for adding dinamically elements -->\n  <script src=\"assets1/js/plugins/arrive.min.js\"></script>\n  <!-- Chartist JS -->\n  <script src=\"assets1/js/plugins/chartist.min.js\"></script>\n  <!--  Notifications Plugin    -->\n  <script src=\"assets1/js/plugins/bootstrap-notify.js\"></script>\n  <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->\n  <script src=\"assets1/js/material-dashboard.js?v=2.1.1\" type=\"text/javascript\"></script>\n  <!-- Material Dashboard DEMO methods, don't include it in your project! -->\n  <script src=\"assets1/demo/demo.js\"></script>\n</body>\n</html>\n".toCharArray();
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
