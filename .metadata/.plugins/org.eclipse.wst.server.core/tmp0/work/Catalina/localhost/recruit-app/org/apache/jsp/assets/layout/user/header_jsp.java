/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-06-03 08:23:38 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.assets.layout.user;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class header_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  public java.lang.String getServletInfo() {
    return "";
  }

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("      <div\n");
      out.write("        role=\"presentation\"\n");
      out.write("        class=\"NavBar_className__y2qGg\"\n");
      out.write("        style=\"position: fixed\"\n");
      out.write("      >\n");
      out.write("        <div class=\"NavBar_background__SQmnx\"></div>\n");
      out.write("        <div class=\"MainBar_MainBar__40DX7\" role=\"presentation\">\n");
      out.write("          <nav class=\"MainBar_MainBarNav__pVhal\">\n");
      out.write("            <div class=\"MainBar_MainBarNavLogo__caIek\">\n");
      out.write("              <a\n");
      out.write("                href=\"https://www.wanted.co.kr/\"\n");
      out.write("                aria-label=\"Wanted\"\n");
      out.write("                data-attribute-id=\"gnb\"\n");
      out.write("                data-gnb-kind=\"jobsfeed\"\n");
      out.write("              >\n");
      out.write("                <img\n");
      out.write("                  src=\"http://localhost/recruit-app/assets/images/logo.png\"\n");
      out.write("                  style=\"max-width: 100%; margin-top: 7px; padding-right: 20px\"\n");
      out.write("                />\n");
      out.write("              </a>\n");
      out.write("            </div>\n");
      out.write("            <ul class=\"Menu_MenuNav__EOf3X\">\n");
      out.write("              <li\n");
      out.write("                class=\"Menu_MenuItem__wI1yA\"\n");
      out.write("                data-attribute-id=\"gnb\"\n");
      out.write("                data-gnb-kind=\"event\"\n");
      out.write("              >\n");
      out.write("                <a href=\"https://www.wanted.co.kr/events\"\n");
      out.write("                  ><span>채용공고</span></a\n");
      out.write("                >\n");
      out.write("              </li>\n");
      out.write("              <li\n");
      out.write("                class=\"Menu_MenuItem__wI1yA\"\n");
      out.write("                data-attribute-id=\"gnb\"\n");
      out.write("                data-gnb-kind=\"event\"\n");
      out.write("              >\n");
      out.write("                <a href=\"https://www.wanted.co.kr/events\"><span>기업</span></a>\n");
      out.write("              </li>\n");
      out.write("              <li\n");
      out.write("                class=\"Menu_MenuItem__wI1yA\"\n");
      out.write("                data-attribute-id=\"gnb\"\n");
      out.write("                data-gnb-kind=\"community\"\n");
      out.write("              >\n");
      out.write("                <a href=\"https://www.wanted.co.kr/community\"\n");
      out.write("                  ><span>이력서관리</span></a\n");
      out.write("                >\n");
      out.write("              </li>\n");
      out.write("              <li\n");
      out.write("                class=\"Menu_MenuItem__wI1yA\"\n");
      out.write("                data-attribute-id=\"gnb\"\n");
      out.write("                data-gnb-kind=\"resume\"\n");
      out.write("              >\n");
      out.write("                <a href=\"https://www.wanted.co.kr/cv/list\"\n");
      out.write("                  ><span>공지사항</span></a\n");
      out.write("                >\n");
      out.write("              </li>\n");
      out.write("              <li\n");
      out.write("                class=\"Menu_MenuItem__wI1yA\"\n");
      out.write("                data-attribute-id=\"gnb\"\n");
      out.write("                data-gnb-kind=\"freelancer\"\n");
      out.write("              >\n");
      out.write("                <a\n");
      out.write("                  href=\"https://www.wanted.co.kr/gigs/experts\"\n");
      out.write("                  target=\"_blank\"\n");
      out.write("                  rel=\"noopener noreferrer\"\n");
      out.write("                  ><span>문의사항</span></a\n");
      out.write("                >\n");
      out.write("              </li>\n");
      out.write("            </ul>\n");
      out.write("            <aside class=\"Aside_aside__f0SVC\">\n");
      out.write("              <ul class=\"Aside_asideList__3WNyu\">\n");
      out.write("                <li class=\"Aside_signUpButtonContainer___0wTS\">\n");
      out.write("                  <button\n");
      out.write("                    class=\"Button_Button__root__V1ie3 Button_Button__outlined__H2mkd Button_Button__outlinedAssistive__mBcQK Button_Button__outlinedSizeSmall__JJmOo Aside_signUpButton__pY721\"\n");
      out.write("                    type=\"button\"\n");
      out.write("                    data-attribute-id=\"gnb\"\n");
      out.write("                    data-gnb-kind=\"signupLogin\"\n");
      out.write("                  >\n");
      out.write("                    <span class=\"Button_Button__label__1Kk0v\"\n");
      out.write("                      ><span\n");
      out.write("                        class=\"Typography_Typography__root__xYuMs Typography_Typography__label2__BRssq Typography_Typography__weightBold__e15ql\"\n");
      out.write("                        >회원가입/로그인</span\n");
      out.write("                      ></span\n");
      out.write("                    ><span class=\"Button_Button__interaction__kkYaa\"></span>\n");
      out.write("                  </button>\n");
      out.write("                </li>\n");
      out.write("              </ul>\n");
      out.write("            </aside>\n");
      out.write("          </nav>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"Padding_padding___Nyki\"></div>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
