/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-05-23 03:10:29 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manage.refund;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import admin.refund.AdminRefundDAO;
import admin.refund.RefundSimpleVO;
import java.util.List;
import util.PageController;

public final class refunds_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes = new java.util.LinkedHashSet<>(4);
    _jspx_imports_classes.add("admin.refund.AdminRefundDAO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("util.PageController");
    _jspx_imports_classes.add("admin.refund.RefundSimpleVO");
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");

Boolean isLoggedIn = (Boolean) session.getAttribute("isLoggedIn");

if (!Boolean.TRUE.equals(isLoggedIn)) {

      out.write("\r\n");
      out.write("  <script type=\"text/javascript\">\r\n");
      out.write("      alert('로그인이 필요합니다.');\r\n");
      out.write("      window.location.href = 'http://localhost/manage/adminLogin/adminLogin.jsp';\r\n");
      out.write("  </script>\r\n");

  return;
}

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../assets/jsp/admin/lib.jsp", out, false);
      out.write("\r\n");
      out.write("<link href=\"http://localhost/assets/css/pagenation.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"http://localhost/assets/css/manage/order/admin.css\" rel=\"stylesheet\" />\r\n");
      out.write("<link href=\"http://localhost/assets/css/manage/order/reset.css\" rel=\"stylesheet\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	$(function() {\r\n");
      out.write("		$(\"#refund_menu\").addClass(\"bg-gradient-primary\");\r\n");
      out.write("    	\r\n");
      out.write("		$(\"#btn_today\").click(function(){\r\n");
      out.write("			$(\"#date\").val(\"today\");\r\n");
      out.write("			$(\"#btn_week\").removeClass('clicked');\r\n");
      out.write("			$(\"#btn_month\").removeClass('clicked');\r\n");
      out.write("			$(\"#btn_total\").removeClass('clicked');\r\n");
      out.write("			$(this).addClass('clicked');\r\n");
      out.write("		});\r\n");
      out.write("    	\r\n");
      out.write("		$(\"#btn_week\").click(function(){\r\n");
      out.write("			$(\"#date\").val(\"week\");\r\n");
      out.write("			$(\"#btn_today\").removeClass('clicked');\r\n");
      out.write("			$(\"#btn_month\").removeClass('clicked');\r\n");
      out.write("			$(\"#btn_total\").removeClass('clicked');\r\n");
      out.write("			$(this).addClass('clicked');\r\n");
      out.write("		});\r\n");
      out.write("    	\r\n");
      out.write("		$(\"#btn_month\").click(function(){\r\n");
      out.write("			$(\"#date\").val(\"month\");\r\n");
      out.write("			$(\"#btn_today\").removeClass('clicked');\r\n");
      out.write("			$(\"#btn_week\").removeClass('clicked');\r\n");
      out.write("			$(\"#btn_total\").removeClass('clicked');\r\n");
      out.write("			$(this).addClass('clicked');\r\n");
      out.write("		});\r\n");
      out.write("    	\r\n");
      out.write("		$(\"#btn_total\").click(function(){\r\n");
      out.write("			$(\"#date\").val(\"total\");\r\n");
      out.write("			$(\"#btn_today\").removeClass('clicked');\r\n");
      out.write("			$(\"#btn_week\").removeClass('clicked');\r\n");
      out.write("			$(\"#btn_month\").removeClass('clicked');\r\n");
      out.write("			$(this).addClass('clicked');\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("<!-- golgolz start -->\r\n");
      out.write("<style>\r\n");
      out.write(".od_status {\r\n");
      out.write("	font-size: 12px;\r\n");
      out.write("	color: black;\r\n");
      out.write("}\r\n");
      out.write(".clickable-image{\r\n");
      out.write("	border: 2px solid transparent;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".clicked {\r\n");
      out.write("  border-color: red; \r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("<!-- golgolz end -->\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	");
      admin.refund.SearchVO searchVO = null;
      searchVO = (admin.refund.SearchVO) _jspx_page_context.getAttribute("searchVO", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (searchVO == null){
        searchVO = new admin.refund.SearchVO();
        _jspx_page_context.setAttribute("searchVO", searchVO, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("searchVO"), request);
      out.write('\r');
      out.write('\n');
      out.write('	');

		// pagenation
		int pageScale = 5;
		int currentPage = Integer.parseInt(request.getParameter("page"));
		int startNum = pageScale * (currentPage - 1) + 1;
		int endNum = startNum + pageScale - 1;
		searchVO.setStart(startNum);
		searchVO.setEnd(endNum);

		searchVO.setField(Integer.parseInt(request.getParameter("category") == null ? "-1" : request.getParameter("category")));
		PageController pageController = PageController.getInstance();
		String params = pageController.createQueryStr(request);
		String keyword = request.getParameter("keyword");
		String category = request.getParameter("category");
		String field = "-1";
		
		if(!(category == null || keyword == "" || keyword == null)){
		    field = request.getParameter("category");
		}
		
		searchVO.setField(Integer.parseInt(field));
		
		AdminRefundDAO adminRefundDAO = AdminRefundDAO.getInstance();
		List<RefundSimpleVO> refunds = adminRefundDAO.selectRefunds(searchVO);
		int searchResultCount = adminRefundDAO.selectCount(searchVO);
	
      out.write('\r');
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../assets/jsp/admin/header.jsp", out, false);
      out.write("\r\n");
      out.write("	<main\r\n");
      out.write("		class=\"main-content position-relative max-height-vh-100 h-100 border-radius-lg ps--active-y\">\r\n");
      out.write("		<nav\r\n");
      out.write("			class=\"navbar navbar-main navbar-expand-lg px-0 mx-4 shadow-none border-radius-xl\"\r\n");
      out.write("			id=\"navbarBlur\" data-scroll=\"true\">\r\n");
      out.write("			<div class=\"container-fluid py-1 px-3\">\r\n");
      out.write("				<nav aria-label=\"breadcrumb\">\r\n");
      out.write("					<ol\r\n");
      out.write("						class=\"breadcrumb bg-transparent mb-0 pb-0 pt-1 px-0 me-sm-6 me-5\">\r\n");
      out.write("						<li class=\"breadcrumb-item text-sm\"><a\r\n");
      out.write("							class=\"opacity-5 text-dark\" href=\"javascript:;\"> 관리자 기능</a></li>\r\n");
      out.write("						<!-- 하단의 대시보드 텍스트를 본인 기능으로 변경 필요  -->\r\n");
      out.write("						<li class=\"breadcrumb-item text-sm text-dark active\"\r\n");
      out.write("							aria-current=\"page\">반품 관리</li>\r\n");
      out.write("					</ol>\r\n");
      out.write("					<h6 class=\"font-weight-bolder mb-0\">반품 관리</h6>\r\n");
      out.write("				</nav>\r\n");
      out.write("			</div>\r\n");
      out.write("		</nav>\r\n");
      out.write("		<div class=\"container-fluid py-4\">\r\n");
      out.write("			<!-- golgolz start -->\r\n");
      out.write("			<div class=\"s_wrap\">\r\n");
      out.write("				<form name=\"fsearch\" id=\"fsearch\">\r\n");
      out.write("					<input type=\"hidden\" name=\"code\" value=\"list\">\r\n");
      out.write("					<div class=\"tbl_frm01\">\r\n");
      out.write("						<table>\r\n");
      out.write("							<colgroup> \r\n");
      out.write("								<col class=\"w100\">\r\n");
      out.write("								<col>\r\n");
      out.write("							</colgroup>\r\n");
      out.write("							<tbody>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th scope=\"row\">검색어</th>\r\n");
      out.write("									<td>\r\n");
      out.write("										<input type=\"hidden\" name=\"page\" value=\"1\" />\r\n");
      out.write("										<select name=\"category\">\r\n");
      out.write("												<option value=\"0\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.category eq '0' ? \" selected\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">주문번호</option>\r\n");
      out.write("												<option value=\"1\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.category eq '1' ? \" selected\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">회원아이디</option>\r\n");
      out.write("												<option value=\"2\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.category eq '2' ? \" selected\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">주문자명</option>\r\n");
      out.write("												<option value=\"3\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.category eq '3' ? \" selected\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">수령자명</option>\r\n");
      out.write("										</select> \r\n");
      out.write("										<input type=\"text\" name=\"keyword\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ param.keyword }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"frm_input\" size=\"30\">\r\n");
      out.write("									</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th scope=\"row\">기간검색</th>\r\n");
      out.write("	              					<td class=\"box text\">\r\n");
      out.write("	              						<input type=\"hidden\" id=\"date\" name=\"date\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.date}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\r\n");
      out.write("	              						<img id=\"btn_today\" class=\"clickable-image");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.date eq 'today' ? \" clicked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" src=\"http://localhost/assets/images/manage/goods/btn_today.gif\" />\r\n");
      out.write("										<img id=\"btn_week\" class=\"clickable-image");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.date eq 'week' ? \" clicked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" src=\"http://localhost/assets/images/manage/goods/btn_thisWeek.gif\" />\r\n");
      out.write("										<img id=\"btn_month\" class=\"clickable-image");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.date eq 'month' ? \" clicked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" src=\"http://localhost/assets/images/manage/goods/btn_thisMonth.gif\" />\r\n");
      out.write("						                <img id=\"btn_total\" class=\"clickable-image");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.date eq 'total' ? \" clicked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" src=\"http://localhost/assets/images/manage/goods/btn_total.gif\" />\r\n");
      out.write("	              					</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("								<tr>\r\n");
      out.write("									<th scope=\"row\">반품상태</th>\r\n");
      out.write("									<td>\r\n");
      out.write("										<label class=\"od_status\">\r\n");
      out.write("											<input type=\"radio\" name=\"refund\" value=\"0\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.refund eq '0' ? \" checked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("> 전체\r\n");
      out.write("										</label> \r\n");
      out.write("										<label class=\"od_status\">\r\n");
      out.write("											<input type=\"radio\" name=\"refund\" value=\"1\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.refund eq '1' ? \" checked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("> 반품접수\r\n");
      out.write("										</label> \r\n");
      out.write("										<label class=\"od_status\">\r\n");
      out.write("											<input type=\"radio\" name=\"refund\" value=\"2\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.refund eq '2' ? \" checked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("> 반품완료\r\n");
      out.write("										</label> \r\n");
      out.write("									</td>\r\n");
      out.write("								</tr>\r\n");
      out.write("							</tbody>\r\n");
      out.write("						</table>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"btn_confirm\">\r\n");
      out.write("						<input type=\"submit\" value=\"검색\" class=\"btn_medium\"> \r\n");
      out.write("						<!-- <input type=\"button\" value=\"초기화\" id=\"frmRest\" class=\"btn_medium grey\"> -->\r\n");
      out.write("					</div>\r\n");
      out.write("				</form>\r\n");
      out.write("				<div class=\"local_ov mart30\">\r\n");
      out.write("						전체 : <b class=\"fc_red\">");
      out.print( searchResultCount );
      out.write("</b> 건 조회\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"tbl_head01\">\r\n");
      out.write("					<table id=\"sodr_list\">\r\n");
      out.write("						<colgroup>\r\n");
      out.write("							<col class=\"w120\">\r\n");
      out.write("							<col class=\"w100\">\r\n");
      out.write("							<col class=\"w40\">\r\n");
      out.write("							<col class=\"w40\">\r\n");
      out.write("							<col class=\"w60\">\r\n");
      out.write("							<col class=\"w120\">\r\n");
      out.write("							<col class=\"w100\">\r\n");
      out.write("							<col class=\"w90\">\r\n");
      out.write("						</colgroup>\r\n");
      out.write("						<thead>\r\n");
      out.write("						<tr>\r\n");
      out.write("							<th scope=\"col\">주문일시</th>\r\n");
      out.write("							<th scope=\"col\">주문번호</th>\r\n");
      out.write("							<th scope=\"col\">주문자ID</th>\r\n");
      out.write("							<th scope=\"col\">주문자명</th>\r\n");
      out.write("							<th scope=\"col\">반품상태</th>\r\n");
      out.write("							<th scope=\"col\">반품일시</th>\r\n");
      out.write("							<th scope=\"col\">환불금액</th>\r\n");
      out.write("							<th scope=\"col\">결제수단</th>\r\n");
      out.write("						</tr>\r\n");
      out.write("						</thead>\r\n");
      out.write("						<tbody>\r\n");
      out.write("							");
 for(RefundSimpleVO refund: refunds){ 
      out.write("\r\n");
      out.write("							<tr class=\"list0\">\r\n");
      out.write("								<td>");
      out.print( refund.getOrderDate() );
      out.write("</td>\r\n");
      out.write("								<td>\r\n");
      out.write("									<a href=\"http://localhost/manage/refund/detail.jsp?id=");
      out.print( refund.getCartId() );
      out.write("\">\r\n");
      out.write("										");
      out.print( refund.getCartId() );
      out.write("\r\n");
      out.write("									</a>\r\n");
      out.write("								</td>\r\n");
      out.write("								<td>");
      out.print( refund.getId() );
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print( refund.getName() );
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print( refund.getRefundStatus() );
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print( refund.getRefundDate() );
      out.write("</td>\r\n");
      out.write("								<td>");
      out.print( refund.getRefundAmount() );
      out.write("원</td>\r\n");
      out.write("								<td>");
      out.print( refund.getPayment() );
      out.write("</td>\r\n");
      out.write("							</tr>\r\n");
      out.write("							");
 } 
      out.write("\r\n");
      out.write("						</tbody>\r\n");
      out.write("					</table>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"alignCenter\">\r\n");
      out.write("          			<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\">\r\n");
      out.write("            			<tbody>\r\n");
      out.write("              				<tr>\r\n");
      out.write("                				<td align=\"center\">\r\n");
      out.write("                 					");

							        	String pageNation = 
									        	pageController.createPagingBtns("http://localhost/manage/refund/refunds.jsp", params
							        	        , Integer.parseInt(request.getParameter("page")), (searchResultCount / pageScale) + 1);
						        	
      out.write("\r\n");
      out.write("						        	<div id=\"pageNation\">\r\n");
      out.write("								        ");
      out.print( pageNation );
      out.write("\r\n");
      out.write("							        </div>		\r\n");
      out.write("                				</td>\r\n");
      out.write("              				</tr>\r\n");
      out.write("            			</tbody>\r\n");
      out.write("          			</table>\r\n");
      out.write("        		</div>	\r\n");
      out.write("			</div>\r\n");
      out.write("			<!-- golgolz end -->\r\n");
      out.write("		</div>\r\n");
      out.write("	</main>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
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