package org.apache.jsp.WEB_002dINF.jsp.view;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class offer_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_choose;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_otherwise;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_when_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_choose = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_otherwise = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_when_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.release();
    _jspx_tagPool_c_choose.release();
    _jspx_tagPool_c_if_test.release();
    _jspx_tagPool_c_otherwise.release();
    _jspx_tagPool_c_when_test.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("    \n");
      out.write("        \n");
      out.write("            \n");
      out.write("                ");
      if (_jspx_meth_c_choose_0(_jspx_page_context))
        return;
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_choose_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:choose
    org.apache.taglibs.standard.tag.common.core.ChooseTag _jspx_th_c_choose_0 = (org.apache.taglibs.standard.tag.common.core.ChooseTag) _jspx_tagPool_c_choose.get(org.apache.taglibs.standard.tag.common.core.ChooseTag.class);
    _jspx_th_c_choose_0.setPageContext(_jspx_page_context);
    _jspx_th_c_choose_0.setParent(null);
    int _jspx_eval_c_choose_0 = _jspx_th_c_choose_0.doStartTag();
    if (_jspx_eval_c_choose_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                    ");
        out.write("\n");
        out.write("                        ");
        if (_jspx_meth_c_when_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                        ");
        out.write("\n");
        out.write("                            ");
        if (_jspx_meth_c_when_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                            ");
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_when_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        out.write("\n");
        out.write("                                    ");
        if (_jspx_meth_c_when_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        out.write("\n");
        out.write("                                        ");
        if (_jspx_meth_c_when_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        ");
        out.write("\n");
        out.write("                                            ");
        if (_jspx_meth_c_when_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        out.write("\n");
        out.write("                                                ");
        if (_jspx_meth_c_when_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                ");
        out.write("\n");
        out.write("                                                    ");
        if (_jspx_meth_c_when_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_when_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                        ");
        out.write("\n");
        out.write("                                                            ");
        if (_jspx_meth_c_when_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                            ");
        out.write("\n");
        out.write("                                                                ");
        if (_jspx_meth_c_when_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                ");
        out.write("\n");
        out.write("                                                                    ");
        if (_jspx_meth_c_when_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                    ");
        out.write("\n");
        out.write("                                                                        ");
        if (_jspx_meth_c_otherwise_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_choose_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                ");
        int evalDoAfterBody = _jspx_th_c_choose_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_choose_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
      return true;
    }
    _jspx_tagPool_c_choose.reuse(_jspx_th_c_choose_0);
    return false;
  }

  private boolean _jspx_meth_c_when_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_0 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_0.setPageContext(_jspx_page_context);
    _jspx_th_c_when_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${process eq 'getQuote'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_0 = _jspx_th_c_when_0.doStartTag();
    if (_jspx_eval_c_when_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                            <form id=\"inquiryform\">\n");
        out.write("                                <div class=\"card\">\n");
        out.write("                                    <div class=\"card-header text-white bg-primary mb-3\">\n");
        out.write("                                        <h5>Quote Inquiry</h5>\n");
        out.write("                                    </div>\n");
        out.write("                                    <div class=\"p-3\">\n");
        out.write("\n");
        out.write("                                        <div class=\"card mb-3\">\n");
        out.write("                                            <div class=\"card-header\"><i class=\"fas fa-user-alt\"></i> Personal\n");
        out.write("                                                Information</div>\n");
        out.write("                                            <div class=\"card-body\">\n");
        out.write("                                                <div class=\"row g-3\">\n");
        out.write("\n");
        out.write("                                                    <div class=\"col-md-6\">\n");
        out.write("                                                        <label for=\"firstname\" class=\"form-label\">First Name</label>\n");
        out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"firstname\"\n");
        out.write("                                                            id=\"firstname\" placeholder=\"Enter First Name\" />\n");
        out.write("                                                    </div>\n");
        out.write("\n");
        out.write("                                                    <div class=\"col-md-6\">\n");
        out.write("                                                        <label for=\"lastname\" class=\"form-label\">Last Name</label>\n");
        out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"lastname\"\n");
        out.write("                                                            id=\"lastname\" placeholder=\"Enter Last Name\" />\n");
        out.write("                                                    </div>\n");
        out.write("\n");
        out.write("                                                    <div class=\"col-md-6\">\n");
        out.write("                                                        <label for=\"dob\" class=\"form-label\">Date of Birth <small\n");
        out.write("                                                                class=\"small text-muted\">(Min Age : 18 & Max Age :\n");
        out.write("                                                                65)</small></label>\n");
        out.write("                                                        <div class=\"input-group mb-3\">\n");
        out.write("                                                            <input type=\"text\" disabled class=\"form-control\" name=\"dob\"\n");
        out.write("                                                                id=\"dob\" placeholder=\"Select Date of Birth\" />\n");
        out.write("                                                            <button class=\"btn btn-primary\" type=\"button\" id=\"btnDob\"\n");
        out.write("                                                                title=\"Click here to Select Date\"><i\n");
        out.write("                                                                    class=\"fas fa-calendar-day\"></i></button>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("\n");
        out.write("                                                    <div class=\"col-md-6\">\n");
        out.write("                                                        <label for=\"address\" class=\"form-label\">Address</label>\n");
        out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"address\"\n");
        out.write("                                                            id=\"address\" placeholder=\"Enter Address\" />\n");
        out.write("                                                    </div>\n");
        out.write("\n");
        out.write("                                                    <div class=\"col-md-5\">\n");
        out.write("                                                        <label for=\"state\" class=\"form-label\">State</label>\n");
        out.write("\n");
        out.write("                                                        <select id=\"state\" class=\"form-select\" name=\"state\"\n");
        out.write("                                                            onchange=\"getCities()\">\n");
        out.write("                                                            <option value=\"default\" disabled selected>Select State\n");
        out.write("                                                            </option>\n");
        out.write("                                                            ");
        if (_jspx_meth_c_forEach_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_0, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                        </select>\n");
        out.write("                                                    </div>\n");
        out.write("\n");
        out.write("                                                    <div class=\"col-md-4\">\n");
        out.write("                                                        <label for=\"city\" class=\"form-label\">City</label>\n");
        out.write("                                                        <select class=\"form-select\" id=\"city\" name=\"city\" disabled>\n");
        out.write("                                                            <option value=\"default\" selected disabled>Select City\n");
        out.write("                                                            </option>\n");
        out.write("                                                        </select>\n");
        out.write("                                                    </div>\n");
        out.write("\n");
        out.write("                                                    <div class=\"col-md-3\">\n");
        out.write("                                                        <label for=\"pincode\" class=\"form-label\">Pincode</label>\n");
        out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"pincode\"\n");
        out.write("                                                            id=\"pincode\" placeholder=\"Enter Pincode\" />\n");
        out.write("                                                    </div>\n");
        out.write("\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("\n");
        out.write("                                        <div class=\"card mb-3\">\n");
        out.write("                                            <div class=\"card-header\"><i class=\"fas fa-home\"></i> Home Information</div>\n");
        out.write("                                            <div class=\"card-body\">\n");
        out.write("                                                <div class=\"row g-3\">\n");
        out.write("                                                    <div class=\"col-md-6\">\n");
        out.write("                                                        <label for=\"crapetarea\" class=\"form-label\">Carpetarea (in\n");
        out.write("                                                            m<sup>2</sup>)</label>\n");
        out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"carpetarea\"\n");
        out.write("                                                            id=\"crapetarea\" placeholder=\"Enter Carpetarea\" />\n");
        out.write("                                                    </div>\n");
        out.write("\n");
        out.write("                                                    <div class=\"col-md-6\">\n");
        out.write("                                                        <label for=\"year\" class=\"form-label\">Build Year</label>\n");
        out.write("                                                        <input type=\"text\" class=\"form-control\" name=\"year\" id=\"year\"\n");
        out.write("                                                            placeholder=\"Enter Build Year\" />\n");
        out.write("                                                    </div>\n");
        out.write("\n");
        out.write("                                                    <div class=\"col-md-4\">\n");
        out.write("                                                        <fieldset class=\"form-group\">\n");
        out.write("                                                            <legend class=\"col-form-label pt-0\">Roof Material</legend>\n");
        out.write("                                                            <div class=\"form-check form-check-inline\">\n");
        out.write("                                                                <input class=\"form-check-input\" type=\"radio\" name=\"roof\"\n");
        out.write("                                                                    id=\"roof-wodden\" value=\"WOODEN\" checked>\n");
        out.write("                                                                <label class=\"form-check-label\"\n");
        out.write("                                                                    for=\"roof-wodden\">Wodden</label>\n");
        out.write("                                                            </div>\n");
        out.write("                                                            <div class=\"form-check form-check-inline\">\n");
        out.write("                                                                <input class=\"form-check-input\" type=\"radio\" name=\"roof\"\n");
        out.write("                                                                    id=\"roof-rcc\" value=\"RCC\">\n");
        out.write("                                                                <label class=\"form-check-label\"\n");
        out.write("                                                                    for=\"roof-rcc\">Rcc</label>\n");
        out.write("                                                            </div>\n");
        out.write("                                                        </fieldset>\n");
        out.write("                                                    </div>\n");
        out.write("\n");
        out.write("                                                    <div class=\"col-md-4\">\n");
        out.write("                                                        <fieldset class=\"form-group\">\n");
        out.write("                                                            <legend class=\"col-form-label pt-0\">Floor Material</legend>\n");
        out.write("                                                            <div class=\"form-check form-check-inline\">\n");
        out.write("                                                                <input class=\"form-check-input\" type=\"radio\"\n");
        out.write("                                                                    name=\"floor\" id=\"floor-wodden\" value=\"WOODEN\"\n");
        out.write("                                                                    checked>\n");
        out.write("                                                                <label class=\"form-check-label\"\n");
        out.write("                                                                    for=\"floor-wodden\">Wodden</label>\n");
        out.write("                                                            </div>\n");
        out.write("                                                            <div class=\"form-check form-check-inline\">\n");
        out.write("                                                                <input class=\"form-check-input\" type=\"radio\"\n");
        out.write("                                                                    name=\"floor\" id=\"floor-tile\" value=\"TILE\">\n");
        out.write("                                                                <label class=\"form-check-label\"\n");
        out.write("                                                                    for=\"floor-tile\">Tile</label>\n");
        out.write("                                                            </div>\n");
        out.write("                                                        </fieldset>\n");
        out.write("                                                    </div>\n");
        out.write("\n");
        out.write("                                                    <div class=\"col-md-4\">\n");
        out.write("                                                        <fieldset class=\"form-group\">\n");
        out.write("                                                            <legend class=\"col-form-label pt-0\">Fire Safety</legend>\n");
        out.write("                                                            <div class=\"form-check form-check-inline\">\n");
        out.write("                                                                <input class=\"form-check-input\" type=\"radio\" name=\"fire\"\n");
        out.write("                                                                    id=\"fire-yes\" value=\"true\" checked>\n");
        out.write("                                                                <label class=\"form-check-label\"\n");
        out.write("                                                                    for=\"fire-yes\">Yes</label>\n");
        out.write("                                                            </div>\n");
        out.write("                                                            <div class=\"form-check form-check-inline\">\n");
        out.write("                                                                <input class=\"form-check-input\" type=\"radio\" name=\"fire\"\n");
        out.write("                                                                    id=\"fire-no\" value=\"false\">\n");
        out.write("                                                                <label class=\"form-check-label\" for=\"fire-no\">No</label>\n");
        out.write("                                                            </div>\n");
        out.write("                                                        </fieldset>\n");
        out.write("                                                    </div>\n");
        out.write("\n");
        out.write("                                                </div>\n");
        out.write("                                            </div>\n");
        out.write("                                        </div>\n");
        out.write("\n");
        out.write("                                        <div class=\"text-center\">\n");
        out.write("                                            <button type=\"button\" class=\"btn btn-primary\"\n");
        out.write("                                                onclick=\"ValidateQuoteForm()\">Generate\n");
        out.write("                                                Quote</button>\n");
        out.write("                                            <button type=\"reset\" class=\"btn btn-warning\">Reset</button>\n");
        out.write("                                        </div>\n");
        out.write("\n");
        out.write("                                    </div>\n");
        out.write("                                </div>\n");
        out.write("                            </form>\n");
        out.write("                        ");
        int evalDoAfterBody = _jspx_th_c_when_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_0);
    return false;
  }

  private boolean _jspx_meth_c_forEach_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_0);
    _jspx_th_c_forEach_0.setVar("state");
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${statelist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${state.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\n");
          out.write("                                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${state.name.toUpperCase()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_when_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_1 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_1.setPageContext(_jspx_page_context);
    _jspx_th_c_when_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${process eq 'changeCoverage'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_1 = _jspx_th_c_when_1.doStartTag();
    if (_jspx_eval_c_when_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_if_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                ");
        if (_jspx_meth_c_if_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_1, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                            ");
        int evalDoAfterBody = _jspx_th_c_when_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_1);
    return false;
  }

  private boolean _jspx_meth_c_if_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_0.setPageContext(_jspx_page_context);
    _jspx_th_c_if_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status eq '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
    if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <div class=\"card-body\">\n");
        out.write("                                        <form id=\"change-coverage\">\n");
        out.write("                                            <div class=\"row g-2\">\n");
        out.write("                                                <div class=\"col-md-12\">\n");
        out.write("                                                    <label for=\"coverage\" class=\"form-label\">Coverage</label>\n");
        out.write("                                                    <div class=\"row align-items-center\">\n");
        out.write("                                                        <div class=\"col-md-5\">\n");
        out.write("                                                            <div class=\"input-group\">\n");
        out.write("                                                                <span class=\"input-group-text\">$</span>\n");
        out.write("                                                                <input type=\"text\" class=\"form-control col-md-3\"\n");
        out.write("                                                                    name=\"coverage\" disabled placeholder=\"coverage\"\n");
        out.write("                                                                    id=\"coverage\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offer.coverage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" />\n");
        out.write("                                                            </div>\n");
        out.write("                                                        </div>\n");
        out.write("                                                        <div class=\"col-md-7 d-flex justify-content-between\">\n");
        out.write("                                                            <input type=\"range\" class=\"form-range\" id=\"range\"\n");
        out.write("                                                                value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offer.coverage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" min=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${baseOffer.minCoverage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\n");
        out.write("                                                                max=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${baseOffer.maxCoverage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("                                                <input type=\"hidden\" name=\"inquiryid\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offer.inquiryid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                <input type=\"hidden\" name=\"offerid\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offer.offerid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                <div class=\"form-group mb-2\">\n");
        out.write("                                                    <label for=\"premium\" class=\"form-label\">Premium</label>\n");
        out.write("                                                    <div class=\"input-group\">\n");
        out.write("                                                        <span class=\"input-group-text\">$</span>\n");
        out.write("                                                        <input type=\"text\" class=\"form-control\" id=\"premium\"\n");
        out.write("                                                            placeholder=\"premium\" name=\"premium\" disabled\n");
        out.write("                                                            value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offer.premium}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                        <span class=\"input-group-text\">Per Month</span>\n");
        out.write("                                                    </div>\n");
        out.write("                                                </div>\n");
        out.write("\n");
        out.write("                                                <div class=\"text-center\">\n");
        out.write("                                                    <button type=\"button\" class=\"btn btn-primary\"\n");
        out.write("                                                        onclick=\"confirm('Are you sure you want to Update Coverage?') && UpdateNewCoverage()\">Update\n");
        out.write("                                                        Coverage</button>\n");
        out.write("                                                    <button type=\"button\" class=\"btn btn-warning\"\n");
        out.write("                                                        onclick=\"confirm('Are you sure you want to Cancel?') && getViewOfferLoader()\">\n");
        out.write("                                                        Cancel</button>\n");
        out.write("                                                </div>\n");
        out.write("                                        </form>\n");
        out.write("                                    </div>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
    return false;
  }

  private boolean _jspx_meth_c_if_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_1, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_1.setPageContext(_jspx_page_context);
    _jspx_th_c_if_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_1);
    _jspx_th_c_if_1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status eq '-1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_1 = _jspx_th_c_if_1.doStartTag();
    if (_jspx_eval_c_if_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <div class=\"alert alert-danger\" role=\"alert\">\n");
        out.write("                                        <h2>Cannot Update the Coverage of Provided Inquiry ID...</h2>\n");
        out.write("                                    </div>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_if_1.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_1);
    return false;
  }

  private boolean _jspx_meth_c_when_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_2 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_2.setPageContext(_jspx_page_context);
    _jspx_th_c_when_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${process eq 'viewOffer'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_2 = _jspx_th_c_when_2.doStartTag();
    if (_jspx_eval_c_when_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                    <table\n");
        out.write("                                        class=\"table table-hover table-xl align-middle table-responsive bg-white rounded\">\n");
        out.write("                                        <thead class=\"rounded\">\n");
        out.write("                                            <tr>\n");
        out.write("                                                <th scope=\"col\">Name / Inquiry ID</th>\n");
        out.write("                                                <!-- <th scope=\"col\" class=\"w-25\">Home Details</th> -->\n");
        out.write("                                                <th scope=\"col\">Offer Status</th>\n");
        out.write("                                                <th scope=\"col\">Address</th>\n");
        out.write("                                                <th scope=\"col\">Action</th>\n");
        out.write("                                            </tr>\n");
        out.write("                                        </thead>\n");
        out.write("                                        <tbody>\n");
        out.write("                                            ");
        if (_jspx_meth_c_forEach_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_2, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                        </tbody>\n");
        out.write("                                    </table>\n");
        out.write("                                ");
        int evalDoAfterBody = _jspx_th_c_when_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_2);
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_2, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_2);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offerlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("offerItem");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                <tr>\n");
          out.write("                                                    <th scope=\"row\">\n");
          out.write("                                                        <p class=\"name mb-0 text-capitalize\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offerItem.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offerItem.lastname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                        <p class=\"small text-muted mb-0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offerItem.inquiryid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                    </th>\n");
          out.write("                                                    <!-- <td>\n");
          out.write("...\n");
          out.write("</td> -->\n");
          out.write("                                                    <td>\n");
          out.write("                                                        <div class=\"d-flex align-items-center\">\n");
          out.write("                                                            ");
          if (_jspx_meth_c_if_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                                            ");
          if (_jspx_meth_c_if_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                                        </div>\n");
          out.write("                                                    </td>\n");
          out.write("                                                    <td>\n");
          out.write("                                                        <p class=\"name mb-0 text-capitalize\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offerItem.address}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(",\n");
          out.write("                                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offerItem.pincode}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(" </p>\n");
          out.write("                                                        <p class=\"small text-muted mb-0\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offerItem.city}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(",\n");
          out.write("                                                            ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offerItem.state}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\n");
          out.write("                                                    </td>\n");
          out.write("                                                    <td>\n");
          out.write("                                                        ");
          if (_jspx_meth_c_if_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                                        ");
          if (_jspx_meth_c_if_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_1, _jspx_page_context, _jspx_push_body_count_c_forEach_1))
            return true;
          out.write("\n");
          out.write("                                                    </td>\n");
          out.write("                                                </tr>\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_2.setPageContext(_jspx_page_context);
    _jspx_th_c_if_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offerItem.offerid eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_2 = _jspx_th_c_if_2.doStartTag();
    if (_jspx_eval_c_if_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                <span\n");
        out.write("                                                                    class=\"rounded-circle me-2 color-box bg-warning flex-grow-0 flex-shrink-0\"></span><span\n");
        out.write("                                                                    class=\"small\">Generation Remaining</span>\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_if_2.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_2);
    return false;
  }

  private boolean _jspx_meth_c_if_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_3.setPageContext(_jspx_page_context);
    _jspx_th_c_if_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offerItem.offerid ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_3 = _jspx_th_c_if_3.doStartTag();
    if (_jspx_eval_c_if_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                <span\n");
        out.write("                                                                    class=\"rounded-circle me-2 color-box bg-success flex-grow-0 flex-shrink-0\"></span>\n");
        out.write("                                                                <span class=\"small\">Generated</span>\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_if_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_3);
    return false;
  }

  private boolean _jspx_meth_c_if_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_4 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_4.setPageContext(_jspx_page_context);
    _jspx_th_c_if_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offerItem.offerid eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_4 = _jspx_th_c_if_4.doStartTag();
    if (_jspx_eval_c_if_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                            <button type=\"button\" class=\"btn btn-warning btn-sm w-100\"\n");
        out.write("                                                                onclick=\"GenerateOffer('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offerItem.inquiryid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("')\">Generate</button>\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_4);
    return false;
  }

  private boolean _jspx_meth_c_if_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_1, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_1)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_5 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_5.setPageContext(_jspx_page_context);
    _jspx_th_c_if_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_1);
    _jspx_th_c_if_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offerItem.offerid ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_5 = _jspx_th_c_if_5.doStartTag();
    if (_jspx_eval_c_if_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                            <button type=\"button\" class=\"btn btn-success btn-sm w-100\"\n");
        out.write("                                                                onclick=\"ViewGeneratedOffer('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offerItem.inquiryid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("')\">View</button>\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_5);
    return false;
  }

  private boolean _jspx_meth_c_when_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_3 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_3.setPageContext(_jspx_page_context);
    _jspx_th_c_when_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${process eq 'loadCity'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_3 = _jspx_th_c_when_3.doStartTag();
    if (_jspx_eval_c_when_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                        <option value=\"default\" selected disabled>Select City</option>\n");
        out.write("                                        ");
        if (_jspx_meth_c_forEach_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_3, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                    ");
        int evalDoAfterBody = _jspx_th_c_when_3.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_3);
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_3, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_3);
    _jspx_th_c_forEach_2.setVar("city");
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${citylist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                            <option value=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${city.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${city.name.toUpperCase()}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</option>\n");
          out.write("                                        ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_when_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_4 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_4.setPageContext(_jspx_page_context);
    _jspx_th_c_when_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_4.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${process eq 'insertInquiry'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_4 = _jspx_th_c_when_4.doStartTag();
    if (_jspx_eval_c_when_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                            <input type=\"hidden\" value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" name=\"status\" id=\"status\">\n");
        out.write("                                        ");
        int evalDoAfterBody = _jspx_th_c_when_4.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_4);
    return false;
  }

  private boolean _jspx_meth_c_when_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_5 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_5.setPageContext(_jspx_page_context);
    _jspx_th_c_when_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_5.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${process eq 'viewGeneratedOffer'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_5 = _jspx_th_c_when_5.doStartTag();
    if (_jspx_eval_c_when_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                ");
        if (_jspx_meth_c_if_6((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                ");
        if (_jspx_meth_c_if_9((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_5, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                            ");
        int evalDoAfterBody = _jspx_th_c_when_5.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_5);
    return false;
  }

  private boolean _jspx_meth_c_if_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_6 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_6.setPageContext(_jspx_page_context);
    _jspx_th_c_if_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_5);
    _jspx_th_c_if_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status eq '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_6 = _jspx_th_c_if_6.doStartTag();
    if (_jspx_eval_c_if_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <div class=\"row g-3\">\n");
        out.write("                                                        <div class=\"col-md-5 col-lg-4\">\n");
        out.write("                                                            <ul class=\"list-group mb-3\">\n");
        out.write("                                                                <li class=\"list-group-item list-group-item-primary\">\n");
        out.write("                                                                    <h4 class=\"text-primary mt-2\">Offer Made for You\n");
        out.write("                                                                    </h4>\n");
        out.write("                                                                </li>\n");
        out.write("                                                                <li class=\"list-group-item lh-sm\">\n");
        out.write("                                                                    <div>\n");
        out.write("                                                                        <h6 class=\"my-0\">Inquiry ID</h6>\n");
        out.write("                                                                        <small\n");
        out.write("                                                                            class=\"text-muted\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offer.inquiryid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</small>\n");
        out.write("                                                                    </div>\n");
        out.write("                                                                </li>\n");
        out.write("                                                                <li class=\"list-group-item lh-sm\">\n");
        out.write("                                                                    <div>\n");
        out.write("                                                                        <h6 class=\"my-0\">Offer ID</h6>\n");
        out.write("                                                                        <small\n");
        out.write("                                                                            class=\"text-muted\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offer.offerid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</small>\n");
        out.write("                                                                    </div>\n");
        out.write("                                                                </li>\n");
        out.write("                                                                <li\n");
        out.write("                                                                    class=\"list-group-item d-flex justify-content-between lh-sm\">\n");
        out.write("                                                                    <div>\n");
        out.write("                                                                        <h6 class=\"my-0\">Coverage</h6>\n");
        out.write("                                                                        <small class=\"text-muted\">Coverage of\n");
        out.write("                                                                            Property</small>\n");
        out.write("                                                                    </div>\n");
        out.write("                                                                    <span class=\"text-muted\">\n");
        out.write("                                                                        ");
        if (_jspx_meth_fmt_formatNumber_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                    </span>\n");
        out.write("                                                                </li>\n");
        out.write("                                                                <li\n");
        out.write("                                                                    class=\"list-group-item d-flex justify-content-between lh-sm\">\n");
        out.write("                                                                    <div>\n");
        out.write("                                                                        <h6 class=\"my-0\">Premium</h6>\n");
        out.write("                                                                        <small class=\"text-muted\">Premium for the\n");
        out.write("                                                                            Coverage</small>\n");
        out.write("                                                                    </div>\n");
        out.write("                                                                    <span class=\"text-muted\">\n");
        out.write("                                                                        ");
        if (_jspx_meth_fmt_formatNumber_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                    </span>\n");
        out.write("                                                                </li>\n");
        out.write("                                                            </ul>\n");
        out.write("                                                        </div>\n");
        out.write("                                                        <div class=\"col-md-7 col-lg-8\">\n");
        out.write("                                                            <div class=\"card\">\n");
        out.write("                                                                <div class=\"card-header\">\n");
        out.write("\n");
        out.write("                                                                    <span\n");
        out.write("                                                                        class=\"fs-3 d-block text-capitalize\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                                        ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.lastname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\n");
        out.write("                                                                    <span\n");
        out.write("                                                                        class=\"small text-muted\">");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.inquiryid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</span>\n");
        out.write("                                                                </div>\n");
        out.write("                                                                <ul class=\"list-group list-group-flush\">\n");
        out.write("                                                                    <li class=\"list-group-item\">\n");
        out.write("                                                                        <div class=\"d-flex flex-wrap w-75\">\n");
        out.write("                                                                            <span\n");
        out.write("                                                                                class=\"m-1 badge rounded-pill bg-info text-dark bg-opacity-50\"\n");
        out.write("                                                                                title=\"CARPETAREA\">\n");
        out.write("                                                                                <i class=\"fas fa-chart-area me-1\"></i>\n");
        out.write("                                                                                Carpetarea ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.carpetarea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                                            </span>\n");
        out.write("                                                                            <span\n");
        out.write("                                                                                class=\"m-1 badge rounded-pill bg-info text-dark bg-opacity-50\"\n");
        out.write("                                                                                title=\"BUILD YEAR\">\n");
        out.write("                                                                                <i class=\"fas fa-wrench me-1\"></i>\n");
        out.write("                                                                                Build Year ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.year}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                                            </span>\n");
        out.write("                                                                            <span\n");
        out.write("                                                                                class=\"m-1 badge rounded-pill bg-info text-dark bg-opacity-50\"\n");
        out.write("                                                                                title=\"ROOF TYPE\"><i\n");
        out.write("                                                                                    class=\"fas fa-home me-1\"></i></i>\n");
        out.write("                                                                                Ceiling ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.roof}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                                            </span>\n");
        out.write("                                                                            <span\n");
        out.write("                                                                                class=\"m-1 badge rounded-pill bg-info text-dark bg-opacity-50\"\n");
        out.write("                                                                                title=\"FLOOR TYPE\"><i\n");
        out.write("                                                                                    class=\"fas fa-arrows-alt me-1\"></i>\n");
        out.write("                                                                                Flooring ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.floor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\n");
        out.write("                                                                            </span>\n");
        out.write("                                                                            <span\n");
        out.write("                                                                                class=\"m-1 badge rounded-pill bg-info text-dark bg-opacity-50\"\n");
        out.write("                                                                                title=\"FIRESAFTEY\"><i\n");
        out.write("                                                                                    class=\"fas fa-fire-extinguisher me-1\"></i>\n");
        out.write("                                                                                Firesafety\n");
        out.write("                                                                                ");
        if (_jspx_meth_c_if_7((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                                ");
        if (_jspx_meth_c_if_8((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                            </span>\n");
        out.write("                                                                        </div>\n");
        out.write("                                                                    </li>\n");
        out.write("                                                                </ul>\n");
        out.write("                                                                <div class=\"card-body\">\n");
        out.write("                                                                    <div id=\"updation\">\n");
        out.write("                                                                        <h5 class=\"card-title\">Special Offer For Quoted\n");
        out.write("                                                                            Information</h5>\n");
        out.write("                                                                        <p class=\"card-text\">We have generated the best\n");
        out.write("                                                                            suitable offer for you according to your\n");
        out.write("                                                                            home structure..\n");
        out.write("                                                                        </p>\n");
        out.write("\n");
        out.write("\n");
        out.write("                                                                        <div class=\"btn-group\">\n");
        out.write("                                                                            <button type=\"button\"\n");
        out.write("                                                                                class=\"btn btn-primary dropdown-toggle\"\n");
        out.write("                                                                                data-bs-toggle=\"dropdown\"\n");
        out.write("                                                                                aria-expanded=\"false\">\n");
        out.write("                                                                                More Options\n");
        out.write("                                                                            </button>\n");
        out.write("                                                                            <ul class=\"dropdown-menu\">\n");
        out.write("                                                                                <li><a href=\"#\" class=\"dropdown-item\"\n");
        out.write("                                                                                        onclick=\"getUpdateQuoteLoader('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.inquiryid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("')\">Update\n");
        out.write("                                                                                        Quote</a>\n");
        out.write("                                                                                </li>\n");
        out.write("                                                                                <li>\n");
        out.write("                                                                                    <hr class=\"dropdown-divider\">\n");
        out.write("                                                                                </li>\n");
        out.write("                                                                                <li><a href=\"#\" class=\"dropdown-item\"\n");
        out.write("                                                                                        onclick=\"getChangeCoverage('");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.inquiryid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("')\">Change\n");
        out.write("                                                                                        Coverage</a></li>\n");
        out.write("                                                                            </ul>\n");
        out.write("                                                                        </div>\n");
        out.write("\n");
        out.write("                                                                        <a href=\"#\" class=\"btn btn-success\"\n");
        out.write("                                                                            onclick=\"showThankModal()\">Secure Offer</a>\n");
        out.write("                                                                    </div>\n");
        out.write("\n");
        out.write("                                                                </div>\n");
        out.write("                                                            </div>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                    <div class=\"modal fade\" id=\"thank\" tabindex=\"-1\"\n");
        out.write("                                                        aria-labelledby=\"Thank You Model\" aria-hidden=\"true\">\n");
        out.write("                                                        <div class=\"modal-dialog\">\n");
        out.write("                                                            <div class=\"modal-content\">\n");
        out.write("                                                                <div class=\"modal-header\">\n");
        out.write("                                                                    <h5 class=\"modal-title\" id=\"exampleModalLabel\">Thank\n");
        out.write("                                                                        You</h5>\n");
        out.write("                                                                    <button type=\"button\" class=\"btn-close\"\n");
        out.write("                                                                        data-bs-dismiss=\"modal\"\n");
        out.write("                                                                        aria-label=\"Close\"></button>\n");
        out.write("                                                                </div>\n");
        out.write("                                                                <div class=\"modal-body\">\n");
        out.write("                                                                    <div class=\"list-group\">\n");
        out.write("                                                                        <li\n");
        out.write("                                                                            class=\"list-group-item list-group-item-action list-group-item-success\">\n");
        out.write("                                                                            <i class=\"fas fa-shopping-cart\"></i>\n");
        out.write("                                                                            Shopping Module is not\n");
        out.write("                                                                            Build Yet, We are bringing these facility as\n");
        out.write("                                                                            soon as possible...\n");
        out.write("                                                                        </li>\n");
        out.write("\n");
        out.write("                                                                    </div>\n");
        out.write("                                                                </div>\n");
        out.write("                                                                <div class=\"modal-footer\">\n");
        out.write("                                                                    <button type=\"button\" class=\"btn btn-success\"\n");
        out.write("                                                                        data-bs-dismiss=\"modal\">Gotcha</button>\n");
        out.write("                                                                </div>\n");
        out.write("                                                            </div>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    </div>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_6);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_0 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_0.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_fmt_formatNumber_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offer.coverage}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_0.setType("CURRENCY");
    _jspx_th_fmt_formatNumber_0.setCurrencySymbol("$");
    int _jspx_eval_fmt_formatNumber_0 = _jspx_th_fmt_formatNumber_0.doStartTag();
    if (_jspx_th_fmt_formatNumber_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_0);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_0);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_1 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_1.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_fmt_formatNumber_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offer.premium}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_1.setType("CURRENCY");
    _jspx_th_fmt_formatNumber_1.setCurrencySymbol("$");
    int _jspx_eval_fmt_formatNumber_1 = _jspx_th_fmt_formatNumber_1.doStartTag();
    if (_jspx_th_fmt_formatNumber_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_1);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_1);
    return false;
  }

  private boolean _jspx_meth_c_if_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_7 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_7.setPageContext(_jspx_page_context);
    _jspx_th_c_if_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_c_if_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.fire eq 1}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_7 = _jspx_th_c_if_7.doStartTag();
    if (_jspx_eval_c_if_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                    Yes\n");
        out.write("                                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_7);
    return false;
  }

  private boolean _jspx_meth_c_if_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_8 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_8.setPageContext(_jspx_page_context);
    _jspx_th_c_if_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_6);
    _jspx_th_c_if_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.fire eq 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_8 = _jspx_th_c_if_8.doStartTag();
    if (_jspx_eval_c_if_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                    No\n");
        out.write("                                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_8);
    return false;
  }

  private boolean _jspx_meth_c_if_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_5, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_9 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_9.setPageContext(_jspx_page_context);
    _jspx_th_c_if_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_5);
    _jspx_th_c_if_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status eq '-1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_9 = _jspx_th_c_if_9.doStartTag();
    if (_jspx_eval_c_if_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    <div class=\"alert alert-danger\" role=\"alert\">\n");
        out.write("                                                        <h2>Cannot View offer of Provided Inquiry ID...</h2>\n");
        out.write("                                                    </div>\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_if_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_9);
    return false;
  }

  private boolean _jspx_meth_c_when_6(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_6 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_6.setPageContext(_jspx_page_context);
    _jspx_th_c_when_6.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_6.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${process eq 'generateOffer'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_6 = _jspx_th_c_when_6.doStartTag();
    if (_jspx_eval_c_when_6 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                    ");
        if (_jspx_meth_c_if_10((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        if (_jspx_meth_c_if_11((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_6, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                ");
        int evalDoAfterBody = _jspx_th_c_when_6.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_6.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_6);
    return false;
  }

  private boolean _jspx_meth_c_if_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_10 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_10.setPageContext(_jspx_page_context);
    _jspx_th_c_if_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_6);
    _jspx_th_c_if_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status eq '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_10 = _jspx_th_c_if_10.doStartTag();
    if (_jspx_eval_c_if_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <div class=\"alert alert-success mb-3\" role=\"alert\">\n");
        out.write("\n");
        out.write("                                                            <h4 class=\"alert-heading\">Yayy! Offer Generated.</h4>\n");
        out.write("                                                            <p>Aww yeah, you successfully Generated Offer Please Check\n");
        out.write("                                                                out the <a onclick=\"getViewOfferLoader()\"\n");
        out.write("                                                                    class=\"link-success\">View Offer Page</a>, and\n");
        out.write("                                                                remember the Offer ID\n");
        out.write("                                                                given below for further process</p>\n");
        out.write("                                                            <hr>\n");
        out.write("                                                        </div>\n");
        out.write("                                                        <div class=\"card text-white bg-success mb-3\"\n");
        out.write("                                                            style=\"max-width: 18rem;\">\n");
        out.write("                                                            <div class=\"card-header\">Offer Id : ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offer.offerid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</div>\n");
        out.write("                                                            <ul class=\"list-group\">\n");
        out.write("                                                                <li class=\"list-group-item\">Inquiry Id :\n");
        out.write("                                                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offer.inquiryid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</li>\n");
        out.write("                                                                <li\n");
        out.write("                                                                    class=\"list-group-item d-flex justify-content-between align-items-start\">\n");
        out.write("                                                                    <div class=\"ms-2 me-auto\">\n");
        out.write("                                                                        <div class=\"fw-bold\">Property Coverage</div>\n");
        out.write("                                                                        USD\n");
        out.write("                                                                        ");
        if (_jspx_meth_fmt_formatNumber_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                    </div>\n");
        out.write("                                                                </li>\n");
        out.write("                                                                <li\n");
        out.write("                                                                    class=\"list-group-item d-flex justify-content-between align-items-start\">\n");
        out.write("                                                                    <div class=\"ms-2 me-auto\">\n");
        out.write("                                                                        <div class=\"fw-bold\">Premium for the Coverage\n");
        out.write("                                                                        </div>\n");
        out.write("                                                                        USD\n");
        out.write("                                                                        ");
        if (_jspx_meth_fmt_formatNumber_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                    </div>\n");
        out.write("                                                                </li>\n");
        out.write("                                                            </ul>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_10);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_2 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_2.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_fmt_formatNumber_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offer.coverage}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_2.setType("CURRENCY");
    _jspx_th_fmt_formatNumber_2.setCurrencySymbol("$");
    int _jspx_eval_fmt_formatNumber_2 = _jspx_th_fmt_formatNumber_2.doStartTag();
    if (_jspx_th_fmt_formatNumber_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_2);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_2);
    return false;
  }

  private boolean _jspx_meth_fmt_formatNumber_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  fmt:formatNumber
    org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag _jspx_th_fmt_formatNumber_3 = (org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag) _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.get(org.apache.taglibs.standard.tag.rt.fmt.FormatNumberTag.class);
    _jspx_th_fmt_formatNumber_3.setPageContext(_jspx_page_context);
    _jspx_th_fmt_formatNumber_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_10);
    _jspx_th_fmt_formatNumber_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offer.premium}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_fmt_formatNumber_3.setType("CURRENCY");
    _jspx_th_fmt_formatNumber_3.setCurrencySymbol("$");
    int _jspx_eval_fmt_formatNumber_3 = _jspx_th_fmt_formatNumber_3.doStartTag();
    if (_jspx_th_fmt_formatNumber_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_3);
      return true;
    }
    _jspx_tagPool_fmt_formatNumber_value_type_currencySymbol_nobody.reuse(_jspx_th_fmt_formatNumber_3);
    return false;
  }

  private boolean _jspx_meth_c_if_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_6, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_11 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_11.setPageContext(_jspx_page_context);
    _jspx_th_c_if_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_6);
    _jspx_th_c_if_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status eq '-1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_11 = _jspx_th_c_if_11.doStartTag();
    if (_jspx_eval_c_if_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        <div class=\"alert alert-danger\" role=\"alert\">\n");
        out.write("                                                            <h2>Cannot Generate the offer of Provided Inquiry ID...</h2>\n");
        out.write("                                                        </div>\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_if_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_11);
    return false;
  }

  private boolean _jspx_meth_c_when_7(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_7 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_7.setPageContext(_jspx_page_context);
    _jspx_th_c_when_7.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_7.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${process eq 'updatedCoverageStatus'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_7 = _jspx_th_c_when_7.doStartTag();
    if (_jspx_eval_c_when_7 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_if_12((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                        ");
        if (_jspx_meth_c_if_13((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_7, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_7.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_7.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_7);
    return false;
  }

  private boolean _jspx_meth_c_if_12(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_12 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_12.setPageContext(_jspx_page_context);
    _jspx_th_c_if_12.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_7);
    _jspx_th_c_if_12.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status eq '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_12 = _jspx_th_c_if_12.doStartTag();
    if (_jspx_eval_c_if_12 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                            <div class=\"alert alert-success\" role=\"alert\">\n");
        out.write("                                                                <h2>Coverage Updated Successfully</h2>\n");
        out.write("                                                                <h3>Please Feel Free to Check <a\n");
        out.write("                                                                        onclick=\"getViewOfferLoader()\"\n");
        out.write("                                                                        class=\"link-success\">View Menu</a> For\n");
        out.write("                                                                    Further Process</h3>\n");
        out.write("                                                            </div>\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_12.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_12.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_12);
    return false;
  }

  private boolean _jspx_meth_c_if_13(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_7, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_13 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_13.setPageContext(_jspx_page_context);
    _jspx_th_c_if_13.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_7);
    _jspx_th_c_if_13.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status eq '-1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_13 = _jspx_th_c_if_13.doStartTag();
    if (_jspx_eval_c_if_13 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                            <div class=\"alert alert-danger\" role=\"alert\">\n");
        out.write("                                                                <h2>Cannot Update the Coverage of Provided Inquiry ID or\n");
        out.write("                                                                    Offer ID...</h2>\n");
        out.write("                                                            </div>\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_13.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_13.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_13);
    return false;
  }

  private boolean _jspx_meth_c_when_8(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_8 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_8.setPageContext(_jspx_page_context);
    _jspx_th_c_when_8.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_8.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${process eq 'updatedQuoteStatus'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_8 = _jspx_th_c_when_8.doStartTag();
    if (_jspx_eval_c_when_8 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                            ");
        if (_jspx_meth_c_if_14((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                            ");
        if (_jspx_meth_c_if_15((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_8, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                        ");
        int evalDoAfterBody = _jspx_th_c_when_8.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_8.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_8);
    return false;
  }

  private boolean _jspx_meth_c_if_14(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_14 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_14.setPageContext(_jspx_page_context);
    _jspx_th_c_if_14.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_8);
    _jspx_th_c_if_14.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status eq '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_14 = _jspx_th_c_if_14.doStartTag();
    if (_jspx_eval_c_if_14 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                <div class=\"alert alert-success\" role=\"alert\">\n");
        out.write("                                                                    <h2>Quote Updated Successfully</h2>\n");
        out.write("                                                                    <h3>Please Feel Free to Generate New Offer According\n");
        out.write("                                                                        to Your New Quote Information in\n");
        out.write("                                                                        <a onclick=\"getViewOfferLoader()\"\n");
        out.write("                                                                            class=\"link-success\">View Menu</a>...\n");
        out.write("                                                                    </h3>\n");
        out.write("                                                                </div>\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_if_14.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_14.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_14);
    return false;
  }

  private boolean _jspx_meth_c_if_15(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_8, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_15 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_15.setPageContext(_jspx_page_context);
    _jspx_th_c_if_15.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_8);
    _jspx_th_c_if_15.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status eq '-1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_15 = _jspx_th_c_if_15.doStartTag();
    if (_jspx_eval_c_if_15 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                <div class=\"alert alert-danger\" role=\"alert\">\n");
        out.write("                                                                    <h2>Cannot Update the Quote of Provided Inquiry ID\n");
        out.write("                                                                        or Offer ID...</h2>\n");
        out.write("                                                                </div>\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_if_15.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_15.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_15);
    return false;
  }

  private boolean _jspx_meth_c_when_9(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_9 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_9.setPageContext(_jspx_page_context);
    _jspx_th_c_when_9.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_9.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${process eq 'updateQuoteForm'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_9 = _jspx_th_c_when_9.doStartTag();
    if (_jspx_eval_c_when_9 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                ");
        if (_jspx_meth_c_if_16((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                ");
        if (_jspx_meth_c_if_17((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_9, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                                            ");
        int evalDoAfterBody = _jspx_th_c_when_9.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_9.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_9);
    return false;
  }

  private boolean _jspx_meth_c_if_16(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_16 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_16.setPageContext(_jspx_page_context);
    _jspx_th_c_if_16.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_9);
    _jspx_th_c_if_16.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${status eq '1'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_16 = _jspx_th_c_if_16.doStartTag();
    if (_jspx_eval_c_if_16 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                    <div class=\"card mb-3\">\n");
        out.write("                                                                        <div class=\"card-header\">Home Information</div>\n");
        out.write("                                                                        <div class=\"card-body\">\n");
        out.write("                                                                            <form id=\"update-quote-from\">\n");
        out.write("                                                                                <div class=\"row g-3\">\n");
        out.write("                                                                                    <input type=\"hidden\"\n");
        out.write("                                                                                        name=\"inquiryid\"\n");
        out.write("                                                                                        value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quoteDetail.inquiryid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\">\n");
        out.write("                                                                                    <div class=\"col-md-6\">\n");
        out.write("                                                                                        <label for=\"crapetarea\"\n");
        out.write("                                                                                            class=\"form-label\">Carpetarea\n");
        out.write("                                                                                            (in m<sup>2</sup>)</label>\n");
        out.write("                                                                                        <input type=\"text\"\n");
        out.write("                                                                                            class=\"form-control\"\n");
        out.write("                                                                                            name=\"carpetarea\"\n");
        out.write("                                                                                            id=\"crapetarea\"\n");
        out.write("                                                                                            placeholder=\"Enter Carpetarea\"\n");
        out.write("                                                                                            value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quoteDetail.carpetarea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" />\n");
        out.write("                                                                                    </div>\n");
        out.write("\n");
        out.write("                                                                                    <div class=\"col-md-6\">\n");
        out.write("                                                                                        <label for=\"year\"\n");
        out.write("                                                                                            class=\"form-label\">Build\n");
        out.write("                                                                                            Year</label>\n");
        out.write("                                                                                        <input type=\"text\"\n");
        out.write("                                                                                            class=\"form-control\"\n");
        out.write("                                                                                            name=\"year\" id=\"year\"\n");
        out.write("                                                                                            placeholder=\"Enter Build Year\"\n");
        out.write("                                                                                            value=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quoteDetail.year}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\" />\n");
        out.write("                                                                                    </div>\n");
        out.write("\n");
        out.write("                                                                                    <div class=\"col-md-4\">\n");
        out.write("                                                                                        <fieldset class=\"form-group\">\n");
        out.write("                                                                                            <legend\n");
        out.write("                                                                                                class=\"col-form-label pt-0\">\n");
        out.write("                                                                                                Roof Material</legend>\n");
        out.write("                                                                                            <div\n");
        out.write("                                                                                                class=\"form-check form-check-inline\">\n");
        out.write("                                                                                                <input\n");
        out.write("                                                                                                    class=\"form-check-input\"\n");
        out.write("                                                                                                    type=\"radio\"\n");
        out.write("                                                                                                    name=\"roof\"\n");
        out.write("                                                                                                    id=\"roof-wodden\"\n");
        out.write("                                                                                                    value=\"WOODEN\"\n");
        out.write("                                                                                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quoteDetail.roof=='WOODEN'\n                                                                                                    ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(">\n");
        out.write("                                                                                                <label\n");
        out.write("                                                                                                    class=\"form-check-label\"\n");
        out.write("                                                                                                    for=\"roof-wodden\">Wodden</label>\n");
        out.write("                                                                                            </div>\n");
        out.write("                                                                                            <div\n");
        out.write("                                                                                                class=\"form-check form-check-inline\">\n");
        out.write("                                                                                                <input\n");
        out.write("                                                                                                    class=\"form-check-input\"\n");
        out.write("                                                                                                    type=\"radio\"\n");
        out.write("                                                                                                    name=\"roof\"\n");
        out.write("                                                                                                    id=\"roof-rcc\"\n");
        out.write("                                                                                                    value=\"RCC\"\n");
        out.write("                                                                                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quoteDetail.roof=='RCC'\n                                                                                                    ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(">\n");
        out.write("                                                                                                <label\n");
        out.write("                                                                                                    class=\"form-check-label\"\n");
        out.write("                                                                                                    for=\"roof-rcc\">Rcc</label>\n");
        out.write("                                                                                            </div>\n");
        out.write("                                                                                        </fieldset>\n");
        out.write("                                                                                    </div>\n");
        out.write("\n");
        out.write("                                                                                    <div class=\"col-md-4\">\n");
        out.write("                                                                                        <fieldset class=\"form-group\">\n");
        out.write("                                                                                            <legend\n");
        out.write("                                                                                                class=\"col-form-label pt-0\">\n");
        out.write("                                                                                                Floor Material</legend>\n");
        out.write("                                                                                            <div\n");
        out.write("                                                                                                class=\"form-check form-check-inline\">\n");
        out.write("                                                                                                <input\n");
        out.write("                                                                                                    class=\"form-check-input\"\n");
        out.write("                                                                                                    type=\"radio\"\n");
        out.write("                                                                                                    name=\"floor\"\n");
        out.write("                                                                                                    id=\"floor-wodden\"\n");
        out.write("                                                                                                    value=\"WOODEN\"\n");
        out.write("                                                                                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quoteDetail.floor=='WOODEN'\n                                                                                                    ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(">\n");
        out.write("                                                                                                <label\n");
        out.write("                                                                                                    class=\"form-check-label\"\n");
        out.write("                                                                                                    for=\"floor-wodden\">Wodden</label>\n");
        out.write("                                                                                            </div>\n");
        out.write("                                                                                            <div\n");
        out.write("                                                                                                class=\"form-check form-check-inline\">\n");
        out.write("                                                                                                <input\n");
        out.write("                                                                                                    class=\"form-check-input\"\n");
        out.write("                                                                                                    type=\"radio\"\n");
        out.write("                                                                                                    name=\"floor\"\n");
        out.write("                                                                                                    id=\"floor-tile\"\n");
        out.write("                                                                                                    value=\"TILE\"\n");
        out.write("                                                                                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quoteDetail.floor=='TILE'\n                                                                                                    ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(">\n");
        out.write("                                                                                                <label\n");
        out.write("                                                                                                    class=\"form-check-label\"\n");
        out.write("                                                                                                    for=\"floor-tile\">Tile</label>\n");
        out.write("                                                                                            </div>\n");
        out.write("                                                                                        </fieldset>\n");
        out.write("                                                                                    </div>\n");
        out.write("\n");
        out.write("                                                                                    <div class=\"col-md-4\">\n");
        out.write("                                                                                        <fieldset class=\"form-group\">\n");
        out.write("                                                                                            <legend\n");
        out.write("                                                                                                class=\"col-form-label pt-0\">\n");
        out.write("                                                                                                Fire Safety</legend>\n");
        out.write("                                                                                            <div\n");
        out.write("                                                                                                class=\"form-check form-check-inline\">\n");
        out.write("                                                                                                <input\n");
        out.write("                                                                                                    class=\"form-check-input\"\n");
        out.write("                                                                                                    type=\"radio\"\n");
        out.write("                                                                                                    name=\"fire\"\n");
        out.write("                                                                                                    id=\"fire-yes\"\n");
        out.write("                                                                                                    value=\"1\"\n");
        out.write("                                                                                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quoteDetail.fire==1\n                                                                                                    ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(">\n");
        out.write("                                                                                                <label\n");
        out.write("                                                                                                    class=\"form-check-label\"\n");
        out.write("                                                                                                    for=\"fire-yes\">Yes</label>\n");
        out.write("                                                                                            </div>\n");
        out.write("                                                                                            <div\n");
        out.write("                                                                                                class=\"form-check form-check-inline\">\n");
        out.write("                                                                                                <input\n");
        out.write("                                                                                                    class=\"form-check-input\"\n");
        out.write("                                                                                                    type=\"radio\"\n");
        out.write("                                                                                                    name=\"fire\"\n");
        out.write("                                                                                                    id=\"fire-no\"\n");
        out.write("                                                                                                    value=\"0\"\n");
        out.write("                                                                                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quoteDetail.fire==0\n                                                                                                    ? 'checked' : '' }", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(">\n");
        out.write("                                                                                                <label\n");
        out.write("                                                                                                    class=\"form-check-label\"\n");
        out.write("                                                                                                    for=\"fire-no\">No</label>\n");
        out.write("                                                                                            </div>\n");
        out.write("                                                                                        </fieldset>\n");
        out.write("                                                                                    </div>\n");
        out.write("                                                                                    <div class=\"text-center\">\n");
        out.write("                                                                                        <button type=\"button\"\n");
        out.write("                                                                                            class=\"btn btn-primary\"\n");
        out.write("                                                                                            onclick=\"confirm('Are you sure you want to Update Quote Details?') && UpdateNewQuote()\">Update\n");
        out.write("                                                                                            Quote</button>\n");
        out.write("                                                                                        <button type=\"button\"\n");
        out.write("                                                                                            class=\"btn btn-warning\"\n");
        out.write("                                                                                            onclick=\"confirm('Are you sure you want to Cancel?') && getViewOfferLoader()\">Cancel</button>\n");
        out.write("                                                                                    </div>\n");
        out.write("                                                                                </div>\n");
        out.write("                                                                            </form>\n");
        out.write("                                                                        </div>\n");
        out.write("                                                                    </div>\n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_16.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_16.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_16);
    return false;
  }

  private boolean _jspx_meth_c_if_17(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_9, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_17 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_17.setPageContext(_jspx_page_context);
    _jspx_th_c_if_17.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_9);
    _jspx_th_c_if_17.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression(" ${status eq '-1' }", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_17 = _jspx_th_c_if_17.doStartTag();
    if (_jspx_eval_c_if_17 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                    <div class=\"alert alert-danger\" role=\"alert\">\n");
        out.write("                                                                        <h2>Cannot Update the Quote of Provided\n");
        out.write("                                                                            InquiryID or OfferID</h2>\n");
        out.write("                                                                    </div>\n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_17.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_17.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_17);
    return false;
  }

  private boolean _jspx_meth_c_when_10(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_10 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_10.setPageContext(_jspx_page_context);
    _jspx_th_c_when_10.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_10.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${process eq 'viewDetailReport'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_10 = _jspx_th_c_when_10.doStartTag();
    if (_jspx_eval_c_when_10 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                    <div class=\"p-4 my-4 bg-light rounded-3\">\n");
        out.write("                                                                        <div class=\"container-fluid py-3\">\n");
        out.write("                                                                            <h3 class=\"display-6 fw-bold\"><i\n");
        out.write("                                                                                    class=\"fas fa-chart-pie\"></i> Report\n");
        out.write("                                                                            </h3>\n");
        out.write("                                                                            <table\n");
        out.write("                                                                                class=\"table table-hover table-xl align-middle\">\n");
        out.write("                                                                                <thead class=\"rounded\">\n");
        out.write("                                                                                    <tr>\n");
        out.write("                                                                                        <th scope=\"col\">Name / Inquiry\n");
        out.write("                                                                                            ID</th>\n");
        out.write("                                                                                        <th scope=\"col\">Current Quote\n");
        out.write("                                                                                        </th>\n");
        out.write("                                                                                        <th scope=\"col\">Current Offer ID\n");
        out.write("                                                                                        </th>\n");
        out.write("                                                                                        <th scope=\"col\">Action</th>\n");
        out.write("                                                                                    </tr>\n");
        out.write("                                                                                </thead>\n");
        out.write("                                                                                <tbody>\n");
        out.write("                                                                                    ");
        if (_jspx_meth_c_forEach_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_10, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("\n");
        out.write("                                                                                </tbody>\n");
        out.write("                                                                            </table>\n");
        out.write("                                                                        </div>\n");
        out.write("                                                                    </div>\n");
        out.write("                                                                    <div id=\"load-report\"></div>\n");
        out.write("                                                                ");
        int evalDoAfterBody = _jspx_th_c_when_10.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_10.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_10);
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_10, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_10);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquirylist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("inquiry");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                                        <tr>\n");
          out.write("                                                                                            <th scope=\"row\">\n");
          out.write("                                                                                                <p class=\"name mb-0\">\n");
          out.write("                                                                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.firstname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.lastname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                                                </p>\n");
          out.write("                                                                                                <p\n");
          out.write("                                                                                                    class=\"small text-muted mb-0\">\n");
          out.write("                                                                                                    ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.inquiryid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                                                </p>\n");
          out.write("                                                                                            </th>\n");
          out.write("                                                                                            <td>\n");
          out.write("                                                                                                <div\n");
          out.write("                                                                                                    class=\"d-flex flex-wrap w-75\">\n");
          out.write("                                                                                                    <span\n");
          out.write("                                                                                                        class=\"m-1 badge rounded-pill bg-info text-dark bg-opacity-50\"\n");
          out.write("                                                                                                        title=\"CARPETAREA\">\n");
          out.write("                                                                                                        <i\n");
          out.write("                                                                                                            class=\"fas fa-chart-area me-1\"></i>\n");
          out.write("                                                                                                        Carpetarea\n");
          out.write("                                                                                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.carpetarea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                                                    </span>\n");
          out.write("                                                                                                    <span\n");
          out.write("                                                                                                        class=\"m-1 badge rounded-pill bg-info text-dark bg-opacity-50\"\n");
          out.write("                                                                                                        title=\"BUILD YEAR\">\n");
          out.write("                                                                                                        <i\n");
          out.write("                                                                                                            class=\"fas fa-wrench me-1\"></i>\n");
          out.write("                                                                                                        Build Year\n");
          out.write("                                                                                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.year}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                                                    </span>\n");
          out.write("                                                                                                    <span\n");
          out.write("                                                                                                        class=\"m-1 badge rounded-pill bg-info text-dark bg-opacity-50\"\n");
          out.write("                                                                                                        title=\"ROOF TYPE\"><i\n");
          out.write("                                                                                                            class=\"fas fa-home me-1\"></i></i>\n");
          out.write("                                                                                                        Ceiling\n");
          out.write("                                                                                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.roof}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                                                    </span>\n");
          out.write("                                                                                                    <span\n");
          out.write("                                                                                                        class=\"m-1 badge rounded-pill bg-info text-dark bg-opacity-50\"\n");
          out.write("                                                                                                        title=\"FLOOR TYPE\"><i\n");
          out.write("                                                                                                            class=\"fas fa-arrows-alt me-1\"></i>\n");
          out.write("                                                                                                        Flooring\n");
          out.write("                                                                                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.floor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                                                    </span>\n");
          out.write("                                                                                                    <span\n");
          out.write("                                                                                                        class=\"m-1 badge rounded-pill bg-info text-dark bg-opacity-50\"\n");
          out.write("                                                                                                        title=\"FIRESAFTEY\"><i\n");
          out.write("                                                                                                            class=\"fas fa-fire-extinguisher me-1\"></i>\n");
          out.write("                                                                                                        Firesafety\n");
          out.write("                                                                                                        ");
          if (_jspx_meth_c_if_18((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\n");
          out.write("                                                                                                        ");
          if (_jspx_meth_c_if_19((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\n");
          out.write("                                                                                                    </span>\n");
          out.write("                                                                                                </div>\n");
          out.write("                                                                                            </td>\n");
          out.write("                                                                                            <td class=\"small\">\n");
          out.write("                                                                                                ");
          if (_jspx_meth_c_if_20((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\n");
          out.write("                                                                                                ");
          if (_jspx_meth_c_if_21((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_3, _jspx_page_context, _jspx_push_body_count_c_forEach_3))
            return true;
          out.write("\n");
          out.write("                                                                                            </td>\n");
          out.write("                                                                                            <td><button type=\"button\"\n");
          out.write("                                                                                                    class=\"btn btn-primary btn-sm w-100\"\n");
          out.write("                                                                                                    onclick=\"getReportOfInquiry('");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.inquiryid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("')\">\n");
          out.write("                                                                                                    View Details\n");
          out.write("                                                                                                </button>\n");
          out.write("                                                                                            </td>\n");
          out.write("                                                                                        </tr>\n");
          out.write("                                                                                    ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_18(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_18 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_18.setPageContext(_jspx_page_context);
    _jspx_th_c_if_18.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_if_18.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.firesafety eq true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_18 = _jspx_th_c_if_18.doStartTag();
    if (_jspx_eval_c_if_18 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                                            Yes\n");
        out.write("                                                                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_18.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_18.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_18);
    return false;
  }

  private boolean _jspx_meth_c_if_19(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_19 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_19.setPageContext(_jspx_page_context);
    _jspx_th_c_if_19.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_if_19.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.firesafety eq false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_19 = _jspx_th_c_if_19.doStartTag();
    if (_jspx_eval_c_if_19 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                                            No\n");
        out.write("                                                                                                        ");
        int evalDoAfterBody = _jspx_th_c_if_19.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_19.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_19);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_19);
    return false;
  }

  private boolean _jspx_meth_c_if_20(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_20 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_20.setPageContext(_jspx_page_context);
    _jspx_th_c_if_20.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_if_20.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.offerid ne null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_20 = _jspx_th_c_if_20.doStartTag();
    if (_jspx_eval_c_if_20 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                                    ");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.offerid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write(" |\n");
        out.write("                                                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_20.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_20.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_20);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_20);
    return false;
  }

  private boolean _jspx_meth_c_if_21(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_3, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_3)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_21 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_21.setPageContext(_jspx_page_context);
    _jspx_th_c_if_21.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_3);
    _jspx_th_c_if_21.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${inquiry.offerid eq null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_21 = _jspx_th_c_if_21.doStartTag();
    if (_jspx_eval_c_if_21 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                                    <div\n");
        out.write("                                                                                                        class=\"d-flex align-items-center\">\n");
        out.write("                                                                                                        <span\n");
        out.write("                                                                                                            class=\"rounded-circle me-2 color-box bg-warning flex-grow-0 flex-shrink-0\"></span><span\n");
        out.write("                                                                                                            class=\"small\">Offer\n");
        out.write("                                                                                                            Generation\n");
        out.write("                                                                                                            Remaining</span>\n");
        out.write("                                                                                                    </div>\n");
        out.write("                                                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_21.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_21.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_21);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_21);
    return false;
  }

  private boolean _jspx_meth_c_when_11(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:when
    org.apache.taglibs.standard.tag.rt.core.WhenTag _jspx_th_c_when_11 = (org.apache.taglibs.standard.tag.rt.core.WhenTag) _jspx_tagPool_c_when_test.get(org.apache.taglibs.standard.tag.rt.core.WhenTag.class);
    _jspx_th_c_when_11.setPageContext(_jspx_page_context);
    _jspx_th_c_when_11.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    _jspx_th_c_when_11.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${process eq 'addingModalReport'}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_when_11 = _jspx_th_c_when_11.doStartTag();
    if (_jspx_eval_c_when_11 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                        <div class=\"modal fade\" id=\"");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${modalid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("\"\n");
        out.write("                                                                            tabindex=\"-1\">\n");
        out.write("                                                                            <div class=\"modal-dialog modal-xl\">\n");
        out.write("                                                                                <div class=\"modal-content\">\n");
        out.write("                                                                                    <div class=\"modal-header\">\n");
        out.write("                                                                                        <h6 class=\"modal-title\"><span\n");
        out.write("                                                                                                class=\"text-muted\">Deails\n");
        out.write("                                                                                                Report of\n");
        out.write("                                                                                            </span>");
        out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${modalid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
        out.write("</h6>\n");
        out.write("                                                                                        <button type=\"button\"\n");
        out.write("                                                                                            class=\"btn-close\"\n");
        out.write("                                                                                            data-bs-dismiss=\"modal\"\n");
        out.write("                                                                                            aria-label=\"Close\"></button>\n");
        out.write("                                                                                    </div>\n");
        out.write("                                                                                    <div class=\"modal-body\">\n");
        out.write("                                                                                        <ul class=\"list-group mb-3\">\n");
        out.write("                                                                                            <li class=\"list-group-item active\"\n");
        out.write("                                                                                                aria-current=\"true\">\n");
        out.write("                                                                                                <h3>Offer</h3>\n");
        out.write("                                                                                            </li>\n");
        out.write("                                                                                            <li class=\"list-group-item\">\n");
        out.write("                                                                                                ");
        if (_jspx_meth_c_if_22((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_11, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                                                ");
        if (_jspx_meth_c_if_23((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_11, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                                            </li>\n");
        out.write("                                                                                        </ul>\n");
        out.write("                                                                                        <ul class=\"list-group mb-3\">\n");
        out.write("                                                                                            <li class=\"list-group-item active\"\n");
        out.write("                                                                                                aria-current=\"true\">\n");
        out.write("                                                                                                <h3>\n");
        out.write("                                                                                                    Quote\n");
        out.write("                                                                                                </h3>\n");
        out.write("                                                                                            </li>\n");
        out.write("                                                                                            <li class=\"list-group-item\">\n");
        out.write("                                                                                                ");
        if (_jspx_meth_c_if_24((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_11, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                                                ");
        if (_jspx_meth_c_if_27((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_when_11, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                                            </li>\n");
        out.write("                                                                                        </ul>\n");
        out.write("                                                                                    </div>\n");
        out.write("                                                                                    <div class=\"modal-footer\">\n");
        out.write("                                                                                        <button type=\"button\"\n");
        out.write("                                                                                            class=\"btn btn-secondary\"\n");
        out.write("                                                                                            data-bs-dismiss=\"modal\">Close</button>\n");
        out.write("                                                                                    </div>\n");
        out.write("                                                                                </div>\n");
        out.write("                                                                            </div>\n");
        out.write("                                                                        </div>\n");
        out.write("                                                                    ");
        int evalDoAfterBody = _jspx_th_c_when_11.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_when_11.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
      return true;
    }
    _jspx_tagPool_c_when_test.reuse(_jspx_th_c_when_11);
    return false;
  }

  private boolean _jspx_meth_c_if_22(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_22 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_22.setPageContext(_jspx_page_context);
    _jspx_th_c_if_22.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_11);
    _jspx_th_c_if_22.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offerlist.size() > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_22 = _jspx_th_c_if_22.doStartTag();
    if (_jspx_eval_c_if_22 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                                    <table\n");
        out.write("                                                                                                        class=\"table table-hover table-xl align-middle\">\n");
        out.write("                                                                                                        <thead\n");
        out.write("                                                                                                            class=\"rounded\">\n");
        out.write("                                                                                                            <tr>\n");
        out.write("\n");
        out.write("                                                                                                                <th\n");
        out.write("                                                                                                                    scope=\"col\">\n");
        out.write("                                                                                                                    Offer\n");
        out.write("                                                                                                                    ID\n");
        out.write("                                                                                                                </th>\n");
        out.write("                                                                                                                <th\n");
        out.write("                                                                                                                    scope=\"col\">\n");
        out.write("                                                                                                                    Coverage\n");
        out.write("                                                                                                                </th>\n");
        out.write("                                                                                                                <th\n");
        out.write("                                                                                                                    scope=\"col\">\n");
        out.write("                                                                                                                    Premium\n");
        out.write("                                                                                                                </th>\n");
        out.write("                                                                                                            </tr>\n");
        out.write("                                                                                                        </thead>\n");
        out.write("                                                                                                        <tbody>\n");
        out.write("                                                                                                            ");
        if (_jspx_meth_c_forEach_4((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_22, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                                                        </tbody>\n");
        out.write("                                                                                                    </table>\n");
        out.write("                                                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_22.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_22.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_22);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_22);
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_22, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_22);
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offerlist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("offer");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                                                                <tr>\n");
          out.write("                                                                                                                    <th\n");
          out.write("                                                                                                                        scope=\"row\">\n");
          out.write("                                                                                                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offer.offerid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                                                                    </th>\n");
          out.write("                                                                                                                    <td>\n");
          out.write("                                                                                                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offer.coverage}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                                                                    </td>\n");
          out.write("                                                                                                                    <td>\n");
          out.write("                                                                                                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offer.premium}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                                                                    </td>\n");
          out.write("                                                                                                                </tr>\n");
          out.write("                                                                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_23(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_23 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_23.setPageContext(_jspx_page_context);
    _jspx_th_c_if_23.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_11);
    _jspx_th_c_if_23.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${offerlist.size() == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_23 = _jspx_th_c_if_23.doStartTag();
    if (_jspx_eval_c_if_23 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                            <li\n");
        out.write("                                                                                                class=\"list-group-item list-group-item-info\">\n");
        out.write("                                                                                                <h3>\n");
        out.write("                                                                                                    No Offer History\n");
        out.write("                                                                                                </h3>\n");
        out.write("                                                                                            </li>\n");
        out.write("                                                                                            ");
        int evalDoAfterBody = _jspx_th_c_if_23.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_23.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_23);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_23);
    return false;
  }

  private boolean _jspx_meth_c_if_24(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_24 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_24.setPageContext(_jspx_page_context);
    _jspx_th_c_if_24.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_11);
    _jspx_th_c_if_24.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quotelist.size() > 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_24 = _jspx_th_c_if_24.doStartTag();
    if (_jspx_eval_c_if_24 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                                    <table\n");
        out.write("                                                                                                        class=\"table table-hover table-xl align-middle\">\n");
        out.write("                                                                                                        <thead\n");
        out.write("                                                                                                            class=\"rounded\">\n");
        out.write("                                                                                                            <tr>\n");
        out.write("                                                                                                                <th\n");
        out.write("                                                                                                                    scope=\"col\">\n");
        out.write("                                                                                                                    Offer\n");
        out.write("                                                                                                                    ID\n");
        out.write("                                                                                                                </th>\n");
        out.write("                                                                                                                <th\n");
        out.write("                                                                                                                    scope=\"col\">\n");
        out.write("                                                                                                                    Quote\n");
        out.write("                                                                                                                    Details\n");
        out.write("                                                                                                                </th>\n");
        out.write("                                                                                                            </tr>\n");
        out.write("                                                                                                        </thead>\n");
        out.write("                                                                                                        <tbody>\n");
        out.write("                                                                                                            ");
        if (_jspx_meth_c_forEach_5((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_if_24, _jspx_page_context))
          return true;
        out.write("\n");
        out.write("                                                                                                        </tbody>\n");
        out.write("                                                                                                    </table>\n");
        out.write("                                                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_24.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_24.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_24);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_24);
    return false;
  }

  private boolean _jspx_meth_c_forEach_5(javax.servlet.jsp.tagext.JspTag _jspx_th_c_if_24, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_5 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_5.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_5.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_if_24);
    _jspx_th_c_forEach_5.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quotelist}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_5.setVar("quote");
    int[] _jspx_push_body_count_c_forEach_5 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_5 = _jspx_th_c_forEach_5.doStartTag();
      if (_jspx_eval_c_forEach_5 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                                                                                                                <tr>\n");
          out.write("                                                                                                                    <th\n");
          out.write("                                                                                                                        scope=\"row\">\n");
          out.write("                                                                                                                        ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quote.offerid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                                                                    </th>\n");
          out.write("                                                                                                                    <td>\n");
          out.write("                                                                                                                        <div\n");
          out.write("                                                                                                                            class=\"d-flex flex-wrap w-75\">\n");
          out.write("                                                                                                                            <span\n");
          out.write("                                                                                                                                class=\"m-1 badge rounded-pill bg-info text-dark bg-opacity-50\"\n");
          out.write("                                                                                                                                title=\"CARPETAREA\">\n");
          out.write("                                                                                                                                <i\n");
          out.write("                                                                                                                                    class=\"fas fa-chart-area me-1\"></i>\n");
          out.write("                                                                                                                                Carpetarea\n");
          out.write("                                                                                                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quote.carpetarea}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                                                                            </span>\n");
          out.write("                                                                                                                            <span\n");
          out.write("                                                                                                                                class=\"m-1 badge rounded-pill bg-info text-dark bg-opacity-50\"\n");
          out.write("                                                                                                                                title=\"BUILD YEAR\">\n");
          out.write("                                                                                                                                <i\n");
          out.write("                                                                                                                                    class=\"fas fa-wrench me-1\"></i>\n");
          out.write("                                                                                                                                Build\n");
          out.write("                                                                                                                                Year\n");
          out.write("                                                                                                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quote.year}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                                                                            </span>\n");
          out.write("                                                                                                                            <span\n");
          out.write("                                                                                                                                class=\"m-1 badge rounded-pill bg-info text-dark bg-opacity-50\"\n");
          out.write("                                                                                                                                title=\"ROOF TYPE\"><i\n");
          out.write("                                                                                                                                    class=\"fas fa-home me-1\"></i></i>\n");
          out.write("                                                                                                                                Ceiling\n");
          out.write("                                                                                                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quote.roof}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                                                                            </span>\n");
          out.write("                                                                                                                            <span\n");
          out.write("                                                                                                                                class=\"m-1 badge rounded-pill bg-info text-dark bg-opacity-50\"\n");
          out.write("                                                                                                                                title=\"FLOOR TYPE\"><i\n");
          out.write("                                                                                                                                    class=\"fas fa-arrows-alt me-1\"></i>\n");
          out.write("                                                                                                                                Flooring\n");
          out.write("                                                                                                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quote.floor}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\n");
          out.write("                                                                                                                            </span>\n");
          out.write("                                                                                                                            <span\n");
          out.write("                                                                                                                                class=\"m-1 badge rounded-pill bg-info text-dark bg-opacity-50\"\n");
          out.write("                                                                                                                                title=\"FIRESAFTEY\"><i\n");
          out.write("                                                                                                                                    class=\"fas fa-fire-extinguisher me-1\"></i>\n");
          out.write("                                                                                                                                Firesafety\n");
          out.write("                                                                                                                                ");
          if (_jspx_meth_c_if_25((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\n");
          out.write("                                                                                                                                ");
          if (_jspx_meth_c_if_26((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_5, _jspx_page_context, _jspx_push_body_count_c_forEach_5))
            return true;
          out.write("\n");
          out.write("                                                                                                                            </span>\n");
          out.write("                                                                                                                        </div>\n");
          out.write("                                                                                                                    </td>\n");
          out.write("                                                                                                                </tr>\n");
          out.write("                                                                                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_5.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_5.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_5[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_5.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_5.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_5);
    }
    return false;
  }

  private boolean _jspx_meth_c_if_25(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_25 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_25.setPageContext(_jspx_page_context);
    _jspx_th_c_if_25.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_if_25.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quote.firesafety eq true}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_25 = _jspx_th_c_if_25.doStartTag();
    if (_jspx_eval_c_if_25 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                                                                    Yes\n");
        out.write("                                                                                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_25.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_25.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_25);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_25);
    return false;
  }

  private boolean _jspx_meth_c_if_26(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_5, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_5)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_26 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_26.setPageContext(_jspx_page_context);
    _jspx_th_c_if_26.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_5);
    _jspx_th_c_if_26.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quote.firesafety eq false}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_26 = _jspx_th_c_if_26.doStartTag();
    if (_jspx_eval_c_if_26 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                                                                    No\n");
        out.write("                                                                                                                                ");
        int evalDoAfterBody = _jspx_th_c_if_26.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_26.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_26);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_26);
    return false;
  }

  private boolean _jspx_meth_c_if_27(javax.servlet.jsp.tagext.JspTag _jspx_th_c_when_11, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_27 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    _jspx_th_c_if_27.setPageContext(_jspx_page_context);
    _jspx_th_c_if_27.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_when_11);
    _jspx_th_c_if_27.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${quotelist.size() == 0}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
    int _jspx_eval_c_if_27 = _jspx_th_c_if_27.doStartTag();
    if (_jspx_eval_c_if_27 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                                            <li\n");
        out.write("                                                                                                class=\"list-group-item list-group-item-info\">\n");
        out.write("                                                                                                <h3>\n");
        out.write("                                                                                                    No Quote History\n");
        out.write("                                                                                                </h3>\n");
        out.write("                                                                                            </li>\n");
        out.write("\n");
        out.write("                                                                                            ");
        int evalDoAfterBody = _jspx_th_c_if_27.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_if_27.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_27);
      return true;
    }
    _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_27);
    return false;
  }

  private boolean _jspx_meth_c_otherwise_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_choose_0, PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:otherwise
    org.apache.taglibs.standard.tag.common.core.OtherwiseTag _jspx_th_c_otherwise_0 = (org.apache.taglibs.standard.tag.common.core.OtherwiseTag) _jspx_tagPool_c_otherwise.get(org.apache.taglibs.standard.tag.common.core.OtherwiseTag.class);
    _jspx_th_c_otherwise_0.setPageContext(_jspx_page_context);
    _jspx_th_c_otherwise_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_choose_0);
    int _jspx_eval_c_otherwise_0 = _jspx_th_c_otherwise_0.doStartTag();
    if (_jspx_eval_c_otherwise_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
      do {
        out.write("\n");
        out.write("                                                                            <h1>Will Think of that...</h1>\n");
        out.write("                                                                        ");
        int evalDoAfterBody = _jspx_th_c_otherwise_0.doAfterBody();
        if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
          break;
      } while (true);
    }
    if (_jspx_th_c_otherwise_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
      return true;
    }
    _jspx_tagPool_c_otherwise.reuse(_jspx_th_c_otherwise_0);
    return false;
  }
}
