/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-05-23 03:10:33 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.manage.goods;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import util.PageController;
import admin.goods.AdminGoodsSimpleVO;
import java.util.List;
import admin.goods.AdminGoodsDAO;

public final class goods_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("util.PageController");
    _jspx_imports_classes.add("admin.goods.AdminGoodsDAO");
    _jspx_imports_classes.add("admin.goods.AdminGoodsSimpleVO");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

Boolean isLoggedIn = (Boolean) session.getAttribute("isLoggedIn");

if (!Boolean.TRUE.equals(isLoggedIn)) {

      out.write("\n");
      out.write("  <script type=\"text/javascript\">\n");
      out.write("      alert('로그인이 필요합니다.');\n");
      out.write("      window.location.href = 'http://localhost/manage/adminLogin/adminLogin.jsp';\n");
      out.write("  </script>\n");

  return;
}

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../assets/jsp/admin/lib.jsp", out, false);
      out.write("\n");
      out.write("<style type=\"text/css\">\n");
      out.write("#goodsTable thead tr th{\n");
      out.write("	font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#goodsTable tbody{\n");
      out.write("	font-size: 15px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".clickable-image{\n");
      out.write("	border: 2px solid transparent;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".clicked {\n");
      out.write("  border-color: red; \n");
      out.write("}\n");
      out.write("\n");
      out.write("#sortCategory li{\n");
      out.write("	display:inline;\n");
      out.write("}\n");
      out.write("\n");
      out.write("#sortCategory li:hover {\n");
      out.write("	font-weight:bold;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("	$(function(){\n");
      out.write("    	$(\"#goods_menu\").addClass(\"bg-gradient-primary\");\n");
      out.write("    	$(\"#btn_search\").click(function(){\n");
      out.write("    		$(\"#frmGoods\").submit();\n");
      out.write("    	});\n");
      out.write("    	\n");
      out.write("		$(\"#btn_today\").click(function(){\n");
      out.write("			$(\"#date\").val(\"today\");\n");
      out.write("			$(\"#btn_week\").removeClass('clicked');\n");
      out.write("			$(\"#btn_month\").removeClass('clicked');\n");
      out.write("			$(\"#btn_total\").removeClass('clicked');\n");
      out.write("			$(this).addClass('clicked');\n");
      out.write("		});\n");
      out.write("    	\n");
      out.write("		$(\"#btn_week\").click(function(){\n");
      out.write("			$(\"#date\").val(\"week\");\n");
      out.write("			$(\"#btn_today\").removeClass('clicked');\n");
      out.write("			$(\"#btn_month\").removeClass('clicked');\n");
      out.write("			$(\"#btn_total\").removeClass('clicked');\n");
      out.write("			$(this).addClass('clicked');\n");
      out.write("		});\n");
      out.write("    	\n");
      out.write("		$(\"#btn_month\").click(function(){\n");
      out.write("			$(\"#date\").val(\"month\");\n");
      out.write("			$(\"#btn_today\").removeClass('clicked');\n");
      out.write("			$(\"#btn_week\").removeClass('clicked');\n");
      out.write("			$(\"#btn_total\").removeClass('clicked');\n");
      out.write("			$(this).addClass('clicked');\n");
      out.write("		});\n");
      out.write("    	\n");
      out.write("		$(\"#btn_total\").click(function(){\n");
      out.write("			$(\"#date\").val(\"total\");\n");
      out.write("			$(\"#btn_today\").removeClass('clicked');\n");
      out.write("			$(\"#btn_week\").removeClass('clicked');\n");
      out.write("			$(\"#btn_month\").removeClass('clicked');\n");
      out.write("			$(this).addClass('clicked');\n");
      out.write("		});\n");
      out.write("    	\n");
      out.write("		$(\"#btn_update_today\").click(function(){\n");
      out.write("			$(\"#updateDate\").val(\"today\");\n");
      out.write("			$(\"#btn_update_week\").removeClass('clicked');\n");
      out.write("			$(\"#btn_update_month\").removeClass('clicked');\n");
      out.write("			$(\"#btn_update_total\").removeClass('clicked');\n");
      out.write("			$(this).addClass('clicked');\n");
      out.write("		});\n");
      out.write("    	\n");
      out.write("		$(\"#btn_update_week\").click(function(){\n");
      out.write("			$(\"#updateDate\").val(\"week\");\n");
      out.write("			$(\"#btn_update_today\").removeClass('clicked');\n");
      out.write("			$(\"#btn_update_month\").removeClass('clicked');\n");
      out.write("			$(\"#btn_update_total\").removeClass('clicked');\n");
      out.write("			$(this).addClass('clicked');\n");
      out.write("		});\n");
      out.write("    	\n");
      out.write("		$(\"#btn_update_month\").click(function(){\n");
      out.write("			$(\"#updateDate\").val(\"month\");\n");
      out.write("			$(\"#btn_update_today\").removeClass('clicked');\n");
      out.write("			$(\"#btn_update_week\").removeClass('clicked');\n");
      out.write("			$(\"#btn_update_total\").removeClass('clicked');\n");
      out.write("			$(this).addClass('clicked');\n");
      out.write("		});\n");
      out.write("    	\n");
      out.write("		$(\"#btn_update_total\").click(function(){\n");
      out.write("			$(\"#updateDate\").val(\"total\");\n");
      out.write("			$(\"#btn_update_today\").removeClass('clicked');\n");
      out.write("			$(\"#btn_update_week\").removeClass('clicked');\n");
      out.write("			$(\"#btn_update_month\").removeClass('clicked');\n");
      out.write("			$(this).addClass('clicked');\n");
      out.write("		});\n");
      out.write("		\n");
      out.write("		$(\".sort\").click(function(){\n");
      out.write("			$(\"#sort\").val($(this).text() === \"가격순\" ? \"price\" : \"input_date\");\n");
      out.write("    		$(\"#frmGoods\").submit();\n");
      out.write("		});\n");
      out.write("	});\n");
      out.write("</script>\n");
      out.write("<!-- golgolz start -->\n");
      out.write("<link href=\"../../assets/css/manage/goods/general.css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"../../assets/css/manage/goods/goods.css\" rel=\"stylesheet\" />\n");
      out.write("<link href=\"http://localhost/assets/css/pagenation.css\" rel=\"stylesheet\" />\n");
      out.write("<!-- golgolz end -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../assets/jsp/admin/lib.jsp", out, false);
      out.write("\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");
      admin.goods.SearchVO searchVO = null;
      searchVO = (admin.goods.SearchVO) _jspx_page_context.getAttribute("searchVO", javax.servlet.jsp.PageContext.PAGE_SCOPE);
      if (searchVO == null){
        searchVO = new admin.goods.SearchVO();
        _jspx_page_context.setAttribute("searchVO", searchVO, javax.servlet.jsp.PageContext.PAGE_SCOPE);
      }
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.introspect(_jspx_page_context.findAttribute("searchVO"), request);
      out.write('\n');
      out.write('	');

		// pagenation
		int pageScale = 10;
		int currentPage = Integer.parseInt(request.getParameter("page"));
		int startNum = pageScale * (currentPage - 1) + 1;
		int endNum = startNum + pageScale - 1;
		searchVO.setStart(startNum);
		searchVO.setEnd(endNum);
		
		PageController pageController = PageController.getInstance();
		String params = pageController.createQueryStr(request);
		
		// get data
		String nameCodeValue = (String)request.getParameter("ss");
		int nameCodeField = searchVO.getField();
		
		if(nameCodeValue != null && nameCodeValue != ""){
			if(nameCodeField == 1){
			    searchVO.setName(nameCodeValue);
			} else if(nameCodeField == 2){
			    searchVO.setCode(nameCodeValue);
			}
		}
		
		AdminGoodsDAO adminGoodsDAO = AdminGoodsDAO.getInstance();
		List<AdminGoodsSimpleVO> goods = adminGoodsDAO.selectGoods(searchVO);
		int searchResultCount = adminGoodsDAO.selectGoodsCount(searchVO);
	
      out.write('\n');
      out.write('	');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../../assets/jsp/admin/header.jsp", out, false);
      out.write("\n");
      out.write("	<main\n");
      out.write("		class=\"main-content position-relative max-height-vh-100 h-100 border-radius-lg ps--active-y\">\n");
      out.write("		<nav\n");
      out.write("			class=\"navbar navbar-main navbar-expand-lg px-0 mx-4 shadow-none border-radius-xl\"\n");
      out.write("			id=\"navbarBlur\" data-scroll=\"true\">\n");
      out.write("			<div class=\"container-fluid py-1 px-3\">\n");
      out.write("				<nav aria-label=\"breadcrumb\">\n");
      out.write("					<ol\n");
      out.write("						class=\"breadcrumb bg-transparent mb-0 pb-0 pt-1 px-0 me-sm-6 me-5\">\n");
      out.write("						<li class=\"breadcrumb-item text-sm\"><a\n");
      out.write("							class=\"opacity-5 text-dark\" href=\"javascript:;\">\n");
      out.write("							관리자 기능</a></li>\n");
      out.write("						<!-- 하단의 대시보드 텍스트를 본인 기능으로 변경 필요  -->\n");
      out.write("						<li class=\"breadcrumb-item text-sm text-dark active\"\n");
      out.write("							aria-current=\"page\">상품 관리</li>\n");
      out.write("					</ol>\n");
      out.write("					<h6 class=\"font-weight-bolder mb-0\">상품 관리</h6>\n");
      out.write("				</nav>\n");
      out.write("			</div>\n");
      out.write("		</nav>\n");
      out.write("		<div class=\"container-fluid py-4\">\n");
      out.write("			<!-- golgolz start -->\n");
      out.write("			<div id=\"contentcolumn\" class=\"\">\n");
      out.write("      			<div class=\"contents\">\n");
      out.write("			        <!--subtitle-->\n");
      out.write("			        <form id=\"frmGoods\">\n");
      out.write("				        <table class=\"tbstyleB\" width=\"100%\" >\n");
      out.write("				          	<colgroup>\n");
      out.write("				            	<col align=\"left\" width=\"100px\" />\n");
      out.write("				            	<col align=\"left\" />\n");
      out.write("				          	</colgroup>\n");
      out.write("	          				<tbody>\n");
      out.write("					            <tr>\n");
      out.write("					              <td colspan=\"2\" class=\"top2\"></td>\n");
      out.write("					            </tr>\n");
      out.write("            					<tr>\n");
      out.write("              						<td class=\"label\">검색어</td>\n");
      out.write("              						<td class=\"box text\">\n");
      out.write("                						<select name=\"field\" style=\"width: 90px\">\n");
      out.write("                  							<option value=\"1\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.field eq '1' ? \" selected\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">상품명</option>\n");
      out.write("                  							<option value=\"2\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.field eq '2' ? \" selected\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write(">상품코드</option>\n");
      out.write("                						</select>\n");
      out.write("                						<input type=\"text\" name=\"ss\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.ss}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"inputbox\" size=\"20\" />\n");
      out.write("              						</td>\n");
      out.write("            					</tr>\n");
      out.write("            					<tr>\n");
      out.write("              						<td class=\"label\">판매가</td>\n");
      out.write("              						<td class=\"box text\">\n");
      out.write("                						<input type=\"text\" name=\"priceMin\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.priceMin}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"inputbox2 price_only\" size=\"10\" />원 ~\n");
      out.write("                						<input type=\"text\" name=\"priceMax\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.priceMax}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" class=\"inputbox2 price_only\" size=\"10\" />원\n");
      out.write("              						</td>\n");
      out.write("            					</tr>\n");
      out.write("            					<tr>\n");
      out.write("              						<td class=\"label\">등록일</td>\n");
      out.write("              						<td class=\"box text\">\n");
      out.write("              							<input type=\"hidden\" id=\"date\" name=\"date\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.date}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("              							<img id=\"btn_today\" class=\"clickable-image");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.date eq 'today' ? \" clicked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" src=\"http://localhost/assets/images/manage/goods/btn_today.gif\" />\n");
      out.write("										<img id=\"btn_week\" class=\"clickable-image");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.date eq 'week' ? \" clicked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" src=\"http://localhost/assets/images/manage/goods/btn_thisWeek.gif\" />\n");
      out.write("										<img id=\"btn_month\" class=\"clickable-image");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.date eq 'month' ? \" clicked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" src=\"http://localhost/assets/images/manage/goods/btn_thisMonth.gif\" />\n");
      out.write("					                	<img id=\"btn_total\" class=\"clickable-image");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.date eq 'total' ? \" clicked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" src=\"http://localhost/assets/images/manage/goods/btn_total.gif\" />\n");
      out.write("              						</td>\n");
      out.write("            					</tr>\n");
      out.write("            					<tr>\n");
      out.write("              						<td class=\"label\">최근 수정일</td>\n");
      out.write("              						<td class=\"box text\">\n");
      out.write("              							<input type=\"hidden\" id=\"updateDate\" name=\"updateDate\" value=\"");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.updateDate}", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" />\n");
      out.write("              							<img id=\"btn_update_today\" class=\"clickable-image");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.updateDate eq 'today' ? \" clicked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" src=\"http://localhost/assets/images/manage/goods/btn_today.gif\" />\n");
      out.write("										<img id=\"btn_update_week\" class=\"clickable-image");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.updateDate eq 'week' ? \" clicked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" src=\"http://localhost/assets/images/manage/goods/btn_thisWeek.gif\" />\n");
      out.write("										<img id=\"btn_update_month\" class=\"clickable-image");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.updateDate eq 'month' ? \" clicked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" src=\"http://localhost/assets/images/manage/goods/btn_thisMonth.gif\" />\n");
      out.write("					                	<img id=\"btn_update_total\" class=\"clickable-image");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${param.updateDate eq 'total' ? \" clicked\" : \"\" }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
      out.write("\" src=\"http://localhost/assets/images/manage/goods/btn_total.gif\" />\n");
      out.write("              						</td>\n");
      out.write("            					</tr>\n");
      out.write("          					</tbody>\n");
      out.write("        				</table>\n");
      out.write("        				<div class=\"alignCenter\">\n");
      out.write("          					<input\n");
      out.write("            				type=\"image\"\n");
      out.write("            				src=\"http://localhost/assets/images/manage/goods/btn_search.gif\"\n");
      out.write("            				id=\"btn_search\"\n");
      out.write("          					/>\n");
      out.write("        				</div>\n");
      out.write("        				<!--검색갯수-->\n");
      out.write("        				<div class=\"boxContainer\">\n");
      out.write("          					<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\">\n");
      out.write("            					<tbody>\n");
      out.write("              						<tr>\n");
      out.write("                						<td class=\"left\">\n");
      out.write("					                  		<span class=\"bul\">검색결과 : </span>\n");
      out.write("					                  		<span class=\"fc_red\"><strong>");
      out.print( searchResultCount );
      out.write("</strong>건</span>\n");
      out.write("					                  		<span class=\"bul\">전체상품 : </span>\n");
      out.write("						                  	<span class=\"fc_red\"><strong>");
      out.print( adminGoodsDAO.selectAllGoodsCount(null) );
      out.write("</strong>건</span>\n");
      out.write("                						</td>\n");
      out.write("              						</tr>\n");
      out.write("            					</tbody>\n");
      out.write("          					</table>\n");
      out.write("        				</div>\n");
      out.write("        				<!--정렬-->\n");
      out.write("        				<div class=\"alignContainer01\">\n");
      out.write("          					<table id=\"sortCategory\" cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\">\n");
      out.write("            					<tbody>\n");
      out.write("              						<tr>\n");
      out.write("	                					<td align=\"left\"></td>\n");
      out.write("	                					<td align=\"right\">\n");
      out.write("	                						<input type=\"hidden\" name=\"sort\" id=\"sort\" />\n");
      out.write("	                						<input type=\"hidden\" name=\"page\" id=\"page\" value=\"1\"/>\n");
      out.write("	                						<ul>\n");
      out.write("	                							<li class=\"sort\">등록일</li>\n");
      out.write("	                							<li class=\"sort\">가격순</li>\n");
      out.write("	                						</ul>\n");
      out.write("	                					</td>\n");
      out.write("				              		</tr>\n");
      out.write("				            	</tbody>\n");
      out.write("				          	</table>\n");
      out.write("				        </div>\n");
      out.write("        			</form>\n");
      out.write("				    <!--테이블 header-->\n");
      out.write("				    <div class=\"bgtbheader01\">\n");
      out.write("				    	<table width=\"100%\" class=\"tablelistH31\" id=\"goodsTable\">\n");
      out.write("				            <colgroup>\n");
      out.write("				              	<col width=\"20%\" />\n");
      out.write("				              	<col width=\"15%\" />\n");
      out.write("				              	<col width=\"15%\" />\n");
      out.write("				              	<col width=\"15%\" />\n");
      out.write("				              	<col width=\"15%\" />\n");
      out.write("				              	<col width=\"30%\" />\n");
      out.write("				            </colgroup>\n");
      out.write("					        <thead>\n");
      out.write("					            <tr>\n");
      out.write("					                <th>상품명(상품코드)</th>\n");
      out.write("						            <th>등록일</th>\n");
      out.write("						            <th>최근 수정일</th>\n");
      out.write("						            <th>가격</th>\n");
      out.write("						            <th>재고</th>\n");
      out.write("						            <th>재고 및 기타 정보 수정</th>\n");
      out.write("					            </tr>\n");
      out.write("					        </thead>\n");
      out.write("				            <tbody>\n");
      out.write("				            	");
 for(AdminGoodsSimpleVO product : goods){ 
      out.write("\n");
      out.write("				              	<tr>\n");
      out.write("				                	<td class=\"tdL\" align=\"left\">\n");
      out.write("				                    	<a href=\"http://localhost/manage/goods/detail.jsp?code=");
      out.print( product.getCode() );
      out.write("\">\n");
      out.write("				                  			<div class=\"left_layer\">\n");
      out.write("						                    	<img src=\"http://localhost/assets/images/goods/");
      out.print( product.getDefaultImage() );
      out.write("\" width=\"60\" height=\"60\" class=\"imgborder\" />\n");
      out.write("				                  			</div>\n");
      out.write("				                  			<div style=\"line-height: 160%; margin-left: 72px; position: relative;\">\n");
      out.write("				                    			<strong>");
      out.print( product.getCode() );
      out.write("</strong>\n");
      out.write("				                    			<br />\n");
      out.write("				                    			<span>");
      out.print( product.getName() );
      out.write("</span>\n");
      out.write("				                  			</div>\n");
      out.write("				                    	</a>\n");
      out.write("				                	</td>\n");
      out.write("				                	<td class=\"tdL\" align=\"center\">");
      out.print( product.getInputDate() );
      out.write("</td>\n");
      out.write("				                	<td class=\"tdL\" align=\"center\">");
      out.print( product.getUpdateDate() );
      out.write("</td>\n");
      out.write("				                	<td class=\"tdL\" align=\"center\">\n");
      out.write("					                  	<span>");
      out.print( product.getPrice() );
      out.write("원</span>\n");
      out.write("				                	</td>\n");
      out.write("				                	<td class=\"tdL\" align=\"center\">");
      out.print( product.getAmount() );
      out.write("</td>\n");
      out.write("				                	<td class=\"tdR\" align=\"center\">\n");
      out.write("				                		<a href=\"http://localhost/manage/goods/detail.jsp?code=");
      out.print( product.getCode() );
      out.write("\">\n");
      out.write("				                    		<input id=\"btnEditor\" type=\"button\" value=\"바로가기\" class=\"btn btn-primary btn-small\" style=\"font-weight: bold;\" />\n");
      out.write("				                		</a>\n");
      out.write("				                	</td>\n");
      out.write("				              	</tr>\n");
      out.write("				              	");
 } 
      out.write("\n");
      out.write("				            </tbody>\n");
      out.write("				        </table>\n");
      out.write("				    </div>\n");
      out.write("        			<div class=\"alignCenter\">\n");
      out.write("          				<table cellpadding=\"0\" cellspacing=\"0\" border=\"0\" width=\"100%\">\n");
      out.write("            				<tbody>\n");
      out.write("              					<tr>\n");
      out.write("                					<td align=\"center\">\n");
      out.write("                  					");

							        	String pageNation = 
							        	pageController.createPagingBtns("http://localhost/manage/goods/goods.jsp", params
							        	        , Integer.parseInt(request.getParameter("page")), (searchResultCount / pageScale) + 1);
							        
      out.write("\n");
      out.write("							        <div id=\"pageNation\">\n");
      out.write("								        ");
      out.print( pageNation );
      out.write("\n");
      out.write("							        </div>		\n");
      out.write("                					</td>\n");
      out.write("                					<td width=\"10%\" align=\"right\">\n");
      out.write("                  						<a href=\"http://localhost/manage/goods/detail.jsp\" >\n");
      out.write("											<input type=\"button\" class=\"btn btn-success btn-sm\" value=\"등록하기\" />\n");
      out.write("                  						</a>\n");
      out.write("                					</td>\n");
      out.write("              					</tr>\n");
      out.write("            				</tbody>\n");
      out.write("          				</table>\n");
      out.write("        			</div>\n");
      out.write("      			</div>\n");
      out.write("    		</div>\n");
      out.write("			<!-- golgolz end -->\n");
      out.write("		</div>\n");
      out.write("	</main>\n");
      out.write("</body>\n");
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
