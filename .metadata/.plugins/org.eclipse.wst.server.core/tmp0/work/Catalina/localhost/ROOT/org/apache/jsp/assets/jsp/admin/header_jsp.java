/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-05-16 14:35:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.assets.jsp.admin;

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
      out.write("<noscript>\n");
      out.write("	<iframe src=\"https://www.googletagmanager.com/ns.html?id=GTM-NKDMSK6\"\n");
      out.write("		height=\"0\" width=\"0\" style=\"display: none; visibility: hidden\"></iframe>\n");
      out.write("</noscript>\n");
      out.write("\n");
      out.write("<aside\n");
      out.write("	class=\"sidenav navbar navbar-vertical navbar-expand-xs border-0 border-radius-xl my-3 fixed-start ms-3 bg-gradient-dark ps bg-white\"\n");
      out.write("	id=\"sidenav-main\">\n");
      out.write("	<div class=\"sidenav-header\">\n");
      out.write("		<a class=\"navbar-brand m-0\"\n");
      out.write("			href=\"http://localhost/manage/dashboard/index.jsp\"\n");
      out.write("			> <span class=\"ms-1 font-weight-bold text-white\"\n");
      out.write("			style=\"font-size: 25px\">관리자</span>\n");
      out.write("		</a>\n");
      out.write("	</div>\n");
      out.write("	<hr class=\"horizontal light mt-0 mb-2\" />\n");
      out.write("		<ul class=\"navbar-nav\">\n");
      out.write("			<li class=\"nav-item\">\n");
      out.write("				<a\n");
      out.write("					id=\"dashboard_menu\"\n");
      out.write("					class=\"nav-link text-white\"\n");
      out.write("					href=\"http://localhost/manage/dashboard/index.jsp\">\n");
      out.write("					<span class=\"nav-link-text ms-1\">대시보드</span>\n");
      out.write("				</a>\n");
      out.write("			</li>\n");
      out.write("			<li class=\"nav-item\">\n");
      out.write("				<a \n");
      out.write("					id=\"order_menu\"\n");
      out.write("					class=\"nav-link text-white\"\n");
      out.write("					href=\"http://localhost/manage/order/orders.jsp?page=1\">\n");
      out.write("					<span class=\"nav-link-text ms-1\">주문 관리</span>\n");
      out.write("				</a>\n");
      out.write("			</li>\n");
      out.write("			<li class=\"nav-item\">\n");
      out.write("				<a\n");
      out.write("					id=\"refund_menu\"\n");
      out.write("					class=\"nav-link text-white\"\n");
      out.write("					href=\"http://localhost/manage/refund/refunds.jsp?page=1\">\n");
      out.write("					<span class=\"nav-link-text ms-1\">반품 관리</span>\n");
      out.write("				</a>\n");
      out.write("			</li>\n");
      out.write("			<li class=\"nav-item\">\n");
      out.write("				<a \n");
      out.write("					id=\"goods_menu\"\n");
      out.write("					class=\"nav-link text-white\"\n");
      out.write("					href=\"http://localhost/manage/goods/goods.jsp?page=1\">\n");
      out.write("					<span class=\"nav-link-text ms-1\">상품 관리</span>\n");
      out.write("				</a>\n");
      out.write("			</li>\n");
      out.write("			<li class=\"nav-item\">\n");
      out.write("				<a\n");
      out.write("					id=\"user_menu\"\n");
      out.write("					class=\"nav-link text-white\"\n");
      out.write("					href=\"http://localhost/manage/user/user.jsp\">\n");
      out.write("					<span class=\"nav-link-text ms-1\">사용자 관리</span>\n");
      out.write("				</a>\n");
      out.write("			</li>\n");
      out.write("			<li class=\"nav-item\">\n");
      out.write("				<a\n");
      out.write("					id=\"review_menu\"\n");
      out.write("					class=\"nav-link text-white\"\n");
      out.write("					href=\"http://localhost/manage/review/review_board_list.jsp\">\n");
      out.write("					<span class=\"nav-link-text ms-1\">리뷰 관리</span>\n");
      out.write("				</a>\n");
      out.write("			</li>\n");
      out.write("			<li class=\"nav-item\">\n");
      out.write("				<a\n");
      out.write("					id=\"notice_menu\"\n");
      out.write("					class=\"nav-link text-white\"\n");
      out.write("					href=\"http://localhost/manage/notice/notice.jsp\">\n");
      out.write("					<span class=\"nav-link-text ms-1\">공지사항 관리</span>\n");
      out.write("				</a>\n");
      out.write("			</li>\n");
      out.write("		</ul>\n");
      out.write("</aside>");
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
