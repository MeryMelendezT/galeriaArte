  /*@lineinfo:filename=/pago.jsp*/
  /*@lineinfo:generated-code*/

import oracle.jsp.runtime.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;


public class _pago extends com.orionserver.http.OrionHttpJspPage {

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
    _pago page = this;
    ServletConfig config = pageContext.getServletConfig();

    com.evermind.server.http.JspCommonExtraWriter __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
    try {
      // global beans
      // end global beans


      __ojsp_s_out.write(__jsp_StaticText.text[0]);
      __ojsp_s_out.write(__jsp_StaticText.text[1]);
      /*@lineinfo:translated-code*//*@lineinfo:33^7*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_1=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action");
        __jsp_taghandler_1.setParent(null);
        __jsp_taghandler_1.setAction("/navbar");
        __jsp_tag_starteval=__jsp_taghandler_1.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[2]);
            /*@lineinfo:translated-code*//*@lineinfo:39^17*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_2=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_2.setParent(__jsp_taghandler_1);
              __jsp_taghandler_2.setProperty("boton");
              __jsp_taghandler_2.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_2.setValue("Artista");
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
            /*@lineinfo:translated-code*//*@lineinfo:45^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_3=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_3.setParent(__jsp_taghandler_1);
              __jsp_taghandler_3.setProperty("boton");
              __jsp_taghandler_3.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_3.setValue("Categoría");
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
            /*@lineinfo:translated-code*//*@lineinfo:51^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_4=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_4.setParent(__jsp_taghandler_1);
              __jsp_taghandler_4.setProperty("boton");
              __jsp_taghandler_4.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_4.setValue("Comprador");
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
            /*@lineinfo:translated-code*//*@lineinfo:57^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_5=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_5.setParent(__jsp_taghandler_1);
              __jsp_taghandler_5.setProperty("boton");
              __jsp_taghandler_5.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_5.setValue("Envío");
              __jsp_tag_starteval=__jsp_taghandler_5.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_5,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_5.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_5.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_5);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[6]);
            /*@lineinfo:translated-code*//*@lineinfo:63^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_6=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_6.setParent(__jsp_taghandler_1);
              __jsp_taghandler_6.setProperty("boton");
              __jsp_taghandler_6.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_6.setValue("Exposición");
              __jsp_tag_starteval=__jsp_taghandler_6.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_6,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_6.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_6.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_6);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[7]);
            /*@lineinfo:translated-code*//*@lineinfo:69^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_7=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_7.setParent(__jsp_taghandler_1);
              __jsp_taghandler_7.setProperty("boton");
              __jsp_taghandler_7.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_7.setValue("Factura");
              __jsp_tag_starteval=__jsp_taghandler_7.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_7,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_7.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_7.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_7);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[8]);
            /*@lineinfo:translated-code*//*@lineinfo:75^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_8=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_8.setParent(__jsp_taghandler_1);
              __jsp_taghandler_8.setProperty("boton");
              __jsp_taghandler_8.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_8.setValue("Obra");
              __jsp_tag_starteval=__jsp_taghandler_8.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_8,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_8.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_8.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_8);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[9]);
            /*@lineinfo:translated-code*//*@lineinfo:81^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_9=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_9.setParent(__jsp_taghandler_1);
              __jsp_taghandler_9.setProperty("boton");
              __jsp_taghandler_9.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_9.setValue("Orden");
              __jsp_tag_starteval=__jsp_taghandler_9.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_9,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_9.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_9.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_9);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[10]);
            /*@lineinfo:translated-code*//*@lineinfo:87^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_10=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_10.setParent(__jsp_taghandler_1);
              __jsp_taghandler_10.setProperty("boton");
              __jsp_taghandler_10.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_10.setValue("Pago");
              __jsp_tag_starteval=__jsp_taghandler_10.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_10,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_10.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_10.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_10);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[11]);
            /*@lineinfo:translated-code*//*@lineinfo:93^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_11=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_11.setParent(__jsp_taghandler_1);
              __jsp_taghandler_11.setProperty("boton");
              __jsp_taghandler_11.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_11.setValue("Propietario");
              __jsp_tag_starteval=__jsp_taghandler_11.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_11,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_11.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_11.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_11);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[12]);
            /*@lineinfo:translated-code*//*@lineinfo:99^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_12=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_12.setParent(__jsp_taghandler_1);
              __jsp_taghandler_12.setProperty("boton");
              __jsp_taghandler_12.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_12.setValue("Registro Exposición");
              __jsp_tag_starteval=__jsp_taghandler_12.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_12,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_12.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_12.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_12);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[13]);
            /*@lineinfo:translated-code*//*@lineinfo:105^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_13=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_13.setParent(__jsp_taghandler_1);
              __jsp_taghandler_13.setProperty("boton");
              __jsp_taghandler_13.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_13.setValue("Registro Obra");
              __jsp_tag_starteval=__jsp_taghandler_13.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_13,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_13.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_13.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_13);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[14]);
            /*@lineinfo:translated-code*//*@lineinfo:111^20*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_14=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag property styleClass value");
              __jsp_taghandler_14.setParent(__jsp_taghandler_1);
              __jsp_taghandler_14.setProperty("boton");
              __jsp_taghandler_14.setStyleClass("btn btn-default btn-link");
              __jsp_taghandler_14.setValue("Salón");
              __jsp_tag_starteval=__jsp_taghandler_14.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_14,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_14.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_14.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_14);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[15]);
          /*@lineinfo:translated-code*//*@lineinfo:111^104*/          } while (__jsp_taghandler_1.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_1.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_1);
      }
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__jsp_StaticText.text[16]);
      /*@lineinfo:translated-code*//*@lineinfo:196^19*/      {
        org.apache.struts.taglib.html.FormTag __jsp_taghandler_15=(org.apache.struts.taglib.html.FormTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.FormTag.class,"org.apache.struts.taglib.html.FormTag action");
        __jsp_taghandler_15.setParent(null);
        __jsp_taghandler_15.setAction("/altasPago");
        __jsp_tag_starteval=__jsp_taghandler_15.doStartTag();
        if (OracleJspRuntime.checkStartTagEval(__jsp_tag_starteval))
        {
          do {
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[17]);
            /*@lineinfo:translated-code*//*@lineinfo:202^27*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_16=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property styleClass");
              __jsp_taghandler_16.setParent(__jsp_taghandler_15);
              __jsp_taghandler_16.setProperty("id");
              __jsp_taghandler_16.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_16.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_16,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_16.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_16.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_16);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[18]);
            /*@lineinfo:translated-code*//*@lineinfo:209^27*/            {
              org.apache.struts.taglib.html.TextTag __jsp_taghandler_17=(org.apache.struts.taglib.html.TextTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.TextTag.class,"org.apache.struts.taglib.html.TextTag property styleClass");
              __jsp_taghandler_17.setParent(__jsp_taghandler_15);
              __jsp_taghandler_17.setProperty("tipoPago");
              __jsp_taghandler_17.setStyleClass("form-control");
              __jsp_tag_starteval=__jsp_taghandler_17.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_17,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_17.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_17.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_17);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[19]);
            /*@lineinfo:translated-code*//*@lineinfo:213^25*/            {
              org.apache.struts.taglib.html.SubmitTag __jsp_taghandler_18=(org.apache.struts.taglib.html.SubmitTag)OracleJspRuntime.getTagHandler(pageContext,org.apache.struts.taglib.html.SubmitTag.class,"org.apache.struts.taglib.html.SubmitTag styleClass value");
              __jsp_taghandler_18.setParent(__jsp_taghandler_15);
              __jsp_taghandler_18.setStyleClass("btn btn-danger pull-center");
              __jsp_taghandler_18.setValue("Registrar");
              __jsp_tag_starteval=__jsp_taghandler_18.doStartTag();
              if (OracleJspRuntime.checkStartBodyTagEval(__jsp_tag_starteval))
              {
                out=OracleJspRuntime.pushBodyIfNeeded(pageContext,__jsp_taghandler_18,__jsp_tag_starteval,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
                do {
                } while (__jsp_taghandler_18.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
                out=OracleJspRuntime.popBodyIfNeeded(pageContext,out);
                __ojsp_s_out = (com.evermind.server.http.JspCommonExtraWriter) out;
              }
              if (__jsp_taghandler_18.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
                return;
              OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_18);
            }
            /*@lineinfo:generated-code*/
            __ojsp_s_out.write(__jsp_StaticText.text[20]);
          /*@lineinfo:translated-code*//*@lineinfo:213^98*/          } while (__jsp_taghandler_15.doAfterBody()==javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN);
        }
        if (__jsp_taghandler_15.doEndTag()==javax.servlet.jsp.tagext.Tag.SKIP_PAGE)
          return;
        OracleJspRuntime.releaseTagHandler(pageContext,__jsp_taghandler_15);
      }
      /*@lineinfo:generated-code*/
      __ojsp_s_out.write(__jsp_StaticText.text[21]);


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
    private static final byte text[][]=new byte[22][];
    static {
      try {
      text[0] = 
      "\r\n".getBytes("Cp1252");
      text[1] = 
      "\r\n<html>\r\n<head>\r\n  <meta http-equiv=\"Content-Type\" content=\"text/html; charset=windows-1252\">\r\n  <meta charset=\"utf-8\" />\r\n  <link rel=\"apple-touch-icon\" sizes=\"76x76\" href=\"assets1/img/apple-icon.png\">\r\n  <link rel=\"icon\" type=\"image/png\" href=\"assets1/img/favicon.png\">\r\n  <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge,chrome=1\" />\r\n  <title>Galeria de Arte</title>\r\n  <meta content='width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=0, shrink-to-fit=no' name='viewport' />\r\n  <!--     Fonts and icons     -->\r\n  <link rel=\"stylesheet\" type=\"text/css\" href=\"https://fonts.googleapis.com/css?family=Roboto:300,400,500,700|Roboto+Slab:400,700|Material+Icons\" />\r\n  <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/font-awesome/latest/css/font-awesome.min.css\">\r\n  <!-- CSS Files -->\r\n  <link href=\"assets1/css/material-dashboard.css?v=2.1.1\" rel=\"stylesheet\" />\r\n  <!-- CSS Just for demo purpose, don't include it in your project -->\r\n  <link href=\"assets1/demo/demo.css\" rel=\"stylesheet\" />\r\n</head>\r\n<body>\r\n<div class=\"wrapper \">\r\n    <div class=\"sidebar\" data-color=\"danger\" data-background-color=\"white\" data-image=\"assets1/img/sidebar-1.jpg\">\r\n      <!--\r\n        Tip 1: You can change the color of the sidebar using: data-color=\"purple | azure | green | orange | danger\"\r\n\r\n        Tip 2: you can also add an image using data-image tag\r\n    -->\r\n      <div class=\"logo\">\r\n        <a href=\"http://www.creative-tim.com\" class=\"simple-text logo-normal\">\r\n          Galeria de arte\r\n        </a>\r\n      </div>\r\n      ".getBytes("Cp1252");
      text[2] = 
      "\r\n        <div class=\"sidebar-wrapper\">\r\n          <ul class=\"nav\">\r\n            <li class=\"nav-item\">\r\n              <a class=\"nav-link\" href=\"./dashboard.jsp\">\r\n                <i class=\"material-icons\">palette</i>\r\n                ".getBytes("Cp1252");
      text[3] = 
      "\r\n              </a>\r\n            </li>\r\n            <li class=\"nav-item \">\r\n              <a class=\"nav-link\" href=\"./categoria.jsp\">\r\n                <i class=\"material-icons\">rate_review</i>\r\n                <p>".getBytes("Cp1252");
      text[4] = 
      "</p>\r\n              </a>\r\n            </li>\r\n            <li class=\"nav-item \">\r\n              <a class=\"nav-link\" href=\"./comprador.jsp\">\r\n                <i class=\"material-icons\">supervisor_account</i>\r\n                <p>".getBytes("Cp1252");
      text[5] = 
      "</p>\r\n              </a>\r\n            </li>\r\n            <li class=\"nav-item \">\r\n              <a class=\"nav-link\" href=\"./envio.jsp\">\r\n                <i class=\"material-icons\">local_airport</i>\r\n                <p>".getBytes("Cp1252");
      text[6] = 
      "</p>\r\n              </a>\r\n            </li>\r\n          <li class=\"nav-item  \">\r\n              <a class=\"nav-link\" href=\"./exposicion.jsp\">\r\n                <i class=\"material-icons\">layers</i>\r\n                <p>".getBytes("Cp1252");
      text[7] = 
      "</p>\r\n              </a>\r\n            </li>\r\n            <li class=\"nav-item \">\r\n              <a class=\"nav-link\" href=\"./factura.jsp\">\r\n                <i class=\"material-icons\">receipt</i>\r\n                <p>".getBytes("Cp1252");
      text[8] = 
      "</p>\r\n              </a>\r\n            </li>\r\n            <li class=\"nav-item \">\r\n              <a class=\"nav-link\" href=\"./obra.jsp\">\r\n                <i class=\"material-icons\">photo_size_select_actual</i>\r\n                <p>".getBytes("Cp1252");
      text[9] = 
      "</p>\r\n              </a>\r\n            </li>\r\n            <li class=\"nav-item \">\r\n              <a class=\"nav-link\" href=\"./orden.jsp\">\r\n                <i class=\"material-icons\">image_search</i>\r\n                <p>".getBytes("Cp1252");
      text[10] = 
      "</p>\r\n              </a>\r\n            </li>\r\n            <li class=\"nav-item active\">\r\n              <a class=\"nav-link\" href=\"./pago.jsp\">\r\n                <i class=\"material-icons\">monetization_on</i>\r\n                <p>".getBytes("Cp1252");
      text[11] = 
      "</p>\r\n              </a>\r\n            </li>\r\n            <li class=\"nav-item \">\r\n              <a class=\"nav-link\" href=\"./propietario.jsp\">\r\n                <i class=\"material-icons\">person</i>\r\n                <p>".getBytes("Cp1252");
      text[12] = 
      "</p>\r\n              </a>\r\n            </li>\r\n            <li class=\"nav-item \">\r\n              <a class=\"nav-link\" href=\"./registroExposicion.jsp\">\r\n                <i class=\"material-icons\">view_carousel</i>\r\n                <p>".getBytes("Cp1252");
      text[13] = 
      "</p>\r\n              </a>\r\n            </li>\r\n            <li class=\"nav-item \">\r\n              <a class=\"nav-link\" href=\"./registroObra.jsp\">\r\n                <i class=\"material-icons\">vertical_split</i>\r\n                <p>".getBytes("Cp1252");
      text[14] = 
      "</p>\r\n              </a>\r\n            </li>\r\n            <li class=\"nav-item \">\r\n              <a class=\"nav-link\" href=\"./salon.jsp\">\r\n                <i class=\"material-icons\">store</i>\r\n                <p>".getBytes("Cp1252");
      text[15] = 
      "</p>\r\n              </a>\r\n            </li>\r\n            </ul>\r\n        </div>\r\n      </div>\r\n    ".getBytes("Cp1252");
      text[16] = 
      "\r\n    \r\n    <div class=\"main-panel\">\r\n      <!-- Navbar -->\r\n      <nav class=\"navbar navbar-expand-lg navbar-transparent navbar-absolute fixed-top \">\r\n        <div class=\"container-fluid\">\r\n          <div class=\"navbar-wrapper\">\r\n            <a class=\"navbar-brand\" href=\"#pablo\">Inicio</a>\r\n          </div>\r\n          <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" aria-controls=\"navigation-index\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n            <span class=\"sr-only\">Toggle navigation</span>\r\n            <span class=\"navbar-toggler-icon icon-bar\"></span>\r\n            <span class=\"navbar-toggler-icon icon-bar\"></span>\r\n            <span class=\"navbar-toggler-icon icon-bar\"></span>\r\n          </button>\r\n          <div class=\"collapse navbar-collapse justify-content-end\">\r\n            <ul class=\"navbar-nav\">\r\n\r\n              <li class=\"nav-item dropdown\">\r\n                <a class=\"nav-link\" href=\"#pablo\" id=\"navbarDropdownProfile\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\r\n                  <i class=\"material-icons\">person</i>\r\n                  <p class=\"d-lg-none d-md-block\">\r\n                    Account\r\n                  </p>\r\n                </a>\r\n                <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdownProfile\">\r\n                  <a class=\"dropdown-item\" href=\"#\">Log out</a>\r\n                </div>\r\n              </li>\r\n            </ul>\r\n          </div>\r\n        </div>\r\n      </nav>\r\n      <!-- End Navbar -->\r\n      <div class=\"content\">\r\n        <div class=\"container-fluid\">\r\n          <div class=\"row\">\r\n            <div class=\"col-md-12\">\r\n              <div class=\"row\">\r\n            <div class=\"col-lg-12 col-md-12\">\r\n              <div class=\"card\">\r\n                <div class=\"card-header card-header-tabs card-header-danger\">\r\n                  <div class=\"nav-tabs-navigation\">\r\n                    <div class=\"nav-tabs-wrapper\">\r\n                      <ul class=\"nav nav-tabs\" data-tabs=\"tabs\">\r\n                        <li class=\"nav-item\">\r\n                          <a class=\"nav-link active\" href=\"#altas\" data-toggle=\"tab\">\r\n                            <i class=\"material-icons\">playlist_add</i> Altas\r\n                            <div class=\"ripple-container\"></div>\r\n                          </a>\r\n                        </li>\r\n                        <li class=\"nav-item\">\r\n                          <a class=\"nav-link\" href=\"#bajas\" data-toggle=\"tab\">\r\n                            <i class=\"material-icons\">delete_sweep</i> Bajas\r\n                            <div class=\"ripple-container\"></div>\r\n                          </a>\r\n                        </li>\r\n                        <li class=\"nav-item\">\r\n                          <a class=\"nav-link\" href=\"#modificaciones\" data-toggle=\"tab\">\r\n                            <i class=\"material-icons\">loop</i> Modificaciones\r\n                            <div class=\"ripple-container\"></div>\r\n                          </a>\r\n                        </li>\r\n                      </ul>\r\n                    </div>\r\n                  </div>\r\n                </div>\r\n                <div class=\"card-body\">\r\n                  <div class=\"tab-content\">\r\n                    <div class=\"tab-pane active\" id=\"altas\">\r\n                      <table class=\"table\">\r\n                        <tbody>\r\n                          <tr>\r\n                            <div class=\"content\">\r\n        <div class=\"container-fluid\">\r\n          <div class=\"row\">\r\n            <div class=\"col-md-12\">\r\n              <div class=\"card\">\r\n                <div class=\"card-body\">\r\n                  ".getBytes("Cp1252");
      text[17] = 
      "\r\n                    <div class=\"row\">\r\n                      <div class=\"col-md-12\">\r\n                        <div class=\"form-group\">\r\n                          <label class=\"bmd-label-floating\">ID</label>\r\n                          <!--<input type=\"text\" class=\"form-control\">-->\r\n                          ".getBytes("Cp1252");
      text[18] = 
      "\r\n                        </div>\r\n                      </div>\r\n                      <div class=\"col-md-12\">\r\n                        <div class=\"form-group\">\r\n                          <label class=\"bmd-label-floating\">Tipo de Pago</label>\r\n                          <!--<input type=\"text\" class=\"form-control\">-->\r\n                          ".getBytes("Cp1252");
      text[19] = 
      "\r\n                        </div>\r\n                      </div>\r\n                      <div class=\"col-md-12\">\r\n                        ".getBytes("Cp1252");
      text[20] = 
      "\r\n                      </div>\r\n                    </div>\r\n                    <!--<button type=\"submit\" class=\"btn btn-danger pull-right\">Registrar</button>-->\r\n                  ".getBytes("Cp1252");
      text[21] = 
      "\r\n                </div>\r\n              </div>\r\n            </div>\r\n          </div>\r\n        </div>\r\n      </div>\r\n      </tr>            \r\n    </tbody>\r\n  </table>\r\n</div>\r\n                    <div class=\"tab-pane\" id=\"bajas\">\r\n                      <table class=\"table\">\r\n                        <tbody>\r\n                          <tr>\r\n                            <td>Flooded: One year later, assessing what was lost and what was found when a ravaging rain swept through metro Detroit\r\n                            </td>\r\n                            <td class=\"td-actions text-right\">\r\n                              <button type=\"button\" rel=\"tooltip\" title=\"Edit Task\" class=\"btn btn-primary btn-link btn-sm\">\r\n                                <i class=\"material-icons\">edit</i>\r\n                              </button>\r\n                              <button type=\"button\" rel=\"tooltip\" title=\"Remove\" class=\"btn btn-danger btn-link btn-sm\">\r\n                                <i class=\"material-icons\">close</i>\r\n                              </button>\r\n                            </td>\r\n                          </tr>\r\n                          </tbody>\r\n                      </table>\r\n                    </div>\r\n\r\n  <div class=\"tab-pane \" id=\"modificaciones\">\r\n    <table class=\"table\">\r\n      <tbody>\r\n        <tr>\r\n           <td>\r\n             </td>\r\n               <div class=\"content\">\r\n        <div class=\"container-fluid\">\r\n          <div class=\"row\">\r\n            <div class=\"col-md-12\">\r\n              <div class=\"card\">\r\n                <div class=\"card-body\">\r\n                  <form>\r\n                    <div class=\"row\">\r\n                      <div class=\"col-md-6\">\r\n                        <div class=\"form-group\">\r\n                          <label class=\"bmd-label-floating\">Nombre</label>\r\n                          <input type=\"text\" class=\"form-control\">\r\n                        </div>\r\n                      </div>\r\n                      <div class=\"col-md-6\">\r\n                        <div class=\"form-group\">\r\n                          <label class=\"bmd-label-floating\">Apellido</label>\r\n                          <input type=\"text\" class=\"form-control\">\r\n                        </div>\r\n                      </div>\r\n                      <div class=\"col-md-12\">\r\n                        <div class=\"form-group\">\r\n                          <label class=\"bmd-label-floating\">Direccion</label>\r\n                          <input type=\"email\" class=\"form-control\">\r\n                        </div>\r\n                      </div>\r\n                    </div>\r\n                    <div class=\"row\">\r\n                      <div class=\"col-md-6\">\r\n                        <div class=\"form-group\">\r\n                          <label class=\"bmd-label-floating\">Correo</label>\r\n                          <input type=\"text\" class=\"form-control\">\r\n                        </div>\r\n                      </div>\r\n                      <div class=\"col-md-6\">\r\n                        <div class=\"form-group\">\r\n                          <label class=\"bmd-label-floating\">Celular</label>\r\n                          <input type=\"text\" class=\"form-control\">\r\n                        </div>\r\n                      </div>\r\n                    </div>\r\n                    <div class=\"row\">\r\n                      <div class=\"col-md-6\">\r\n                        <div class=\"form-group\">\r\n                          <label class=\"bmd-label-floating\">Ciudad</label>\r\n                          <input type=\"text\" class=\"form-control\">\r\n                        </div>\r\n                      </div>\r\n                      <div class=\"col-md-6\">\r\n                        <div class=\"form-group\">\r\n                          <label class=\"bmd-label-floating\">CI</label>\r\n                          <input type=\"text\" class=\"form-control\">\r\n                        </div>\r\n                      </div>\r\n                    </div>\r\n                    <button type=\"submit\" class=\"btn btn-danger pull-right\">Registrar</button>\r\n                  </form>\r\n                </div>\r\n              </div>\r\n            </div>\r\n          </div>\r\n        </div>\r\n      </div>\r\n      </tr>            \r\n    </tbody>\r\n                </table>\r\n                    </div>\r\n                  </div>\r\n                </div>\r\n              </div>\r\n            </div>\r\n          </div>\r\n        </div>\r\n      </div>\r\n      </div>\r\n    </div>\r\n    </div>\r\n  </div>\r\n <!--   Core JS Files   -->\r\n  <script src=\"assets1/js/core/jquery.min.js\"></script>\r\n  <script src=\"assets1/js/core/popper.min.js\"></script>\r\n  <script src=\"assets1/js/core/bootstrap-material-design.min.js\"></script>\r\n  <script src=\"assets1/js/plugins/perfect-scrollbar.jquery.min.js\"></script>\r\n  <!-- Plugin for the momentJs  -->\r\n  <script src=\"assets1/js/plugins/moment.min.js\"></script>\r\n  <!--  Plugin for Sweet Alert -->\r\n  <script src=\"assets1/js/plugins/sweetalert2.js\"></script>\r\n  <!-- Forms Validations Plugin -->\r\n  <script src=\"assets1/js/plugins/jquery.validate.min.js\"></script>\r\n  <!-- Plugin for the Wizard, full documentation here: https://github.com/VinceG/twitter-bootstrap-wizard -->\r\n  <script src=\"assets1/js/plugins/jquery.bootstrap-wizard.js\"></script>\r\n  <!--  Plugin for Select, full documentation here: http://silviomoreto.github.io/bootstrap-select -->\r\n  <script src=\"assets1/js/plugins/bootstrap-selectpicker.js\"></script>\r\n  <!--  Plugin for the DateTimePicker, full documentation here: https://eonasdan.github.io/bootstrap-datetimepicker/ -->\r\n  <script src=\"assets1/js/plugins/bootstrap-datetimepicker.min.js\"></script>\r\n  <!--  DataTables.net Plugin, full documentation here: https://datatables.net/  -->\r\n  <script src=\"assets1/js/plugins/jquery.dataTables.min.js\"></script>\r\n  <!--  Plugin for Tags, full documentation here: https://github.com/bootstrap-tagsinput/bootstrap-tagsinputs  -->\r\n  <script src=\"assets1/js/plugins/bootstrap-tagsinput.js\"></script>\r\n  <!-- Plugin for Fileupload, full documentation here: http://www.jasny.net/bootstrap/javascript/#fileinput -->\r\n  <script src=\"assets1/js/plugins/jasny-bootstrap.min.js\"></script>\r\n  <!--  Full Calendar Plugin, full documentation here: https://github.com/fullcalendar/fullcalendar    -->\r\n  <script src=\"assets1/js/plugins/fullcalendar.min.js\"></script>\r\n  <!-- Vector Map plugin, full documentation here: http://jvectormap.com/documentation/ -->\r\n  <script src=\"assets1/js/plugins/jquery-jvectormap.js\"></script>\r\n  <!--  Plugin for the Sliders, full documentation here: http://refreshless.com/nouislider/ -->\r\n  <script src=\"assets1/js/plugins/nouislider.min.js\"></script>\r\n  <!-- Include a polyfill for ES6 Promises (optional) for IE11, UC Browser and Android browser support SweetAlert -->\r\n  <script src=\"https://cdnjs.cloudflare.com/ajax/libs/core-js/2.4.1/core.js\"></script>\r\n  <!-- Library for adding dinamically elements -->\r\n  <script src=\"assets1/js/plugins/arrive.min.js\"></script>\r\n  <!--  Google Maps Plugin    -->\r\n  <script src=\"https://maps.googleapis.com/maps/api/js?key=YOUR_KEY_HERE\"></script>\r\n  <!-- Chartist JS -->\r\n  <script src=\"assets1/js/plugins/chartist.min.js\"></script>\r\n  <!--  Notifications Plugin    -->\r\n  <script src=\"assets1/js/plugins/bootstrap-notify.js\"></script>\r\n  <!-- Control Center for Material Dashboard: parallax effects, scripts for the example pages etc -->\r\n  <script src=\"assets1/js/material-dashboard.js?v=2.1.1\" type=\"text/javascript\"></script>\r\n  <!-- Material Dashboard DEMO methods, don't include it in your project! -->\r\n  <script src=\"assets1/demo/demo.js\"></script>\r\n</body>\r\n</html>\r\n".getBytes("Cp1252");
      }
      catch (Throwable th) {
        System.err.println(th);
      }
  }
}
}
