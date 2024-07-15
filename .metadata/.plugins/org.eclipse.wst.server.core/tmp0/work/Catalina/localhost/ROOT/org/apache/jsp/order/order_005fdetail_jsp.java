/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-05-17 04:31:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.order;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import user.order.CartDAO;
import java.util.ArrayList;
import order.vo.OrderProductVO;
import java.util.List;
import java.sql.SQLException;
import user.order.UserOrderDAO;
import order.vo.OrderDetailVO;

public final class order_005fdetail_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  public java.lang.String getServletInfo() {
    return "";
  }

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1715869714055L));
    _jspx_dependants.put("jar:file:/C:/dev/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/online-shop/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(7);
    _jspx_imports_classes.add("order.vo.OrderDetailVO");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("java.sql.SQLException");
    _jspx_imports_classes.add("user.order.CartDAO");
    _jspx_imports_classes.add("order.vo.OrderProductVO");
    _jspx_imports_classes.add("java.util.ArrayList");
    _jspx_imports_classes.add("user.order.UserOrderDAO");
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

String userId = (String)session.getAttribute("userId");
String cartId = request.getParameter("cartId");

// 개발을 위해 임시로 사용하는 코드입니다.
/* if(cartId == null){
    cartId = "20240515060517";
} */

OrderDetailVO odVO = new OrderDetailVO();
List<OrderProductVO> list = new ArrayList<OrderProductVO>();
UserOrderDAO uDAO = UserOrderDAO.getInstance();
CartDAO cDAO = CartDAO.getInstance();
int result = 0; //총액
int priceSum = 0;
OrderProductVO opVO = new OrderProductVO();
try {
    
    odVO = uDAO.selectDetailOrder(cartId,"주문");
    list = odVO.getProductList();
    
    for(int i=0; i<list.size(); i++){
        opVO = list.get(i);
        priceSum += opVO.getPrice()*opVO.getQuantity();
        result = priceSum;
    }//end for
    result += 3000;
    
}catch(SQLException se){
    se.printStackTrace();
}//end catch



      out.write("\n");
      out.write("<script>\n");
      out.write("function redirectToReviewPage(code, cartId) {\n");
      out.write("        // code와 cartId를 URL에 파라미터로 추가하여 리뷰 작성 페이지로 이동\n");
      out.write("        window.location.href = \"http://localhost/review/review_write.jsp?code=\" + code + \"&cartId=\" + cartId;\n");
      out.write("    	}\n");
      out.write("</script>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../assets/jsp/user/lib.jsp", out, false);
      out.write("\n");
      out.write("<!-- golgolz start -->\n");
      out.write("<style>\n");
      out.write("html, body, div, dl, dt, dd, ul, ol, li, h1, h2, h3, h4, h5, h6, pre,\n");
      out.write("	code, form, fieldset, legend, input, textarea, p, blockquote, th, td,\n");
      out.write("	img {\n");
      out.write("	margin: 0;\n");
      out.write("	padding: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".xans-myshop-orderhistorydetail .orderArea:first-child .title {\n");
      out.write("	margin-top: 0;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".xans-myshop-orderhistorydetail .title {\n");
      out.write("	margin: 40px 0 10px 10px;\n");
      out.write("}\n");
      out.write("\n");
      out.write(".ec-base-table table {\n");
      out.write("	position: relative;\n");
      out.write("	margin: 0 0 0;\n");
      out.write("	border: 1px solid #d7d5d5;\n");
      out.write("	border-top: 0;\n");
      out.write("	color: #fff;\n");
      out.write("	line-height: 1.5;\n");
      out.write("} \n");
      out.write(".order-product-table{\n");
      out.write("	text-align: center;\n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("<!-- golgolz end -->\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "../assets/jsp/user/header.jsp", out, false);
      out.write("\n");
      out.write("	<div id=\"wrap\">\n");
      out.write("		<div id=\"main\">\n");
      out.write("			<!-- golgolz start -->\n");
      out.write("			<div id=\"container\">\n");
      out.write("				<div id=\"contents\">\n");
      out.write("\n");
      out.write("					<div class=\"path\">\n");
      out.write("						<span>현재 위치</span>\n");
      out.write("						<ol>\n");
      out.write("							<li><a href=\"/\">홈</a></li>\n");
      out.write("							<li><a href=\"/myshop/index.html\">마이쇼핑</a></li>\n");
      out.write("							<li title=\"현재 위치\"><strong>주문상세조회</strong></li>\n");
      out.write("						</ol>\n");
      out.write("					</div>\n");
      out.write("\n");
      out.write("					<div class=\"titleArea\">\n");
      out.write("						<h2>주문상세조회</h2>\n");
      out.write("					</div>\n");
      out.write("\n");
      out.write("					<form id=\"detailForm\" name=\"detailForm\"\n");
      out.write("						action=\"/exec/front/MyShop/OrderCancel/\" method=\"POST\"\n");
      out.write("						enctype=\"multipart/form-data\">\n");
      out.write("						<input id=\"order_id\" name=\"order_id\" fw-filter=\"isFill\"\n");
      out.write("							fw-label=\"주문번호\" fw-msg=\"\" value=\"");
      out.print( odVO.getCartId() );
      out.write("\" type=\"hidden\">\n");
      out.write("						<div\n");
      out.write("							class=\"xans-element- xans-myshop xans-myshop-orderhistorydetail xans-record-\">\n");
      out.write("							<div class=\"orderArea\">\n");
      out.write("								<div class=\"title\">\n");
      out.write("									<h6>주문정보</h6>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("								<div class=\"ec-base-table\">\n");
      out.write("									<table border=\"1\" summary=\"\">\n");
      out.write("										<caption>주문정보</caption>\n");
      out.write("										<colgroup>\n");
      out.write("											<col style=\"width: 160px\">\n");
      out.write("											<col style=\"width: auto\">\n");
      out.write("										</colgroup>\n");
      out.write("										<tbody>\n");
      out.write("											<tr>\n");
      out.write("												<th scope=\"row\">주문번호</th>\n");
      out.write("												<td>");
      out.print( odVO.getCartId() );
      out.write("</td>\n");
      out.write("											</tr>\n");
      out.write("											<tr>\n");
      out.write("												<th scope=\"row\">주문일자</th>\n");
      out.write("												<td>");
      out.print( odVO.getOrderDate() );
      out.write("</td>\n");
      out.write("											</tr>\n");
      out.write("											<tr>\n");
      out.write("												<th scope=\"row\">주문자</th>\n");
      out.write("												<td><span>");
      out.print( odVO.getRecipient() );
      out.write("</span></td>\n");
      out.write("											</tr>\n");
      out.write("											<tr>\n");
      out.write("												<th scope=\"row\">주문처리상태</th>\n");
      out.write("												<td>");
      out.print( odVO.getDeliveryStatus() );
      out.write("\n");
      out.write("												</td>\n");
      out.write("											</tr>\n");
      out.write("										</tbody>\n");
      out.write("									</table>\n");
      out.write("								</div>\n");
      out.write("							</div>\n");
      out.write("							<div class=\"orderArea\">\n");
      out.write("								<div class=\"title\">\n");
      out.write("									<h6>결제정보</h6>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"ec-base-table\">\n");
      out.write("									<table border=\"1\" summary=\"\">\n");
      out.write("										<caption>결제정보</caption>\n");
      out.write("										<colgroup>\n");
      out.write("											<col style=\"width: 160px\">\n");
      out.write("											<col style=\"width: auto\">\n");
      out.write("										</colgroup>\n");
      out.write("										<tbody>\n");
      out.write("											<tr class=\"sum\">\n");
      out.write("												<th scope=\"row\">총 주문금액</th>\n");
      out.write("												<td><span class=\"gSpace20\"> <strong\n");
      out.write("														class=\"txt14\">");
      out.print( result );
      out.write("</strong>원 <span class=\"displaynone\"></span>\n");
      out.write("												</span></td>\n");
      out.write("											</tr>\n");
      out.write("										</tbody>\n");
      out.write("									</table>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"ec-base-table total\">\n");
      out.write("									<table border=\"1\" summary=\"\">\n");
      out.write("										<caption>결제정보</caption>\n");
      out.write("										<colgroup>\n");
      out.write("											<col style=\"width: 160px\">\n");
      out.write("											<col style=\"width: auto\">\n");
      out.write("										</colgroup>\n");
      out.write("										<tbody>\n");
      out.write("											<tr class=\"sum\">\n");
      out.write("												<th scope=\"row\">총 결제금액</th>\n");
      out.write("												<td><span class=\"txtEm\"> <strong class=\"txt18\">");
      out.print( result );
      out.write("</strong>원\n");
      out.write("														<span class=\"displaynone\"></span>\n");
      out.write("												</span></td>\n");
      out.write("											</tr>\n");
      out.write("											<tr class=\"\">\n");
      out.write("												<th scope=\"row\">결제수단</th>\n");
      out.write("												<td><strong><span>카드 결제</span></strong></td>\n");
      out.write("											</tr>\n");
      out.write("											<tr class=\"displaynone\">\n");
      out.write("												<th scope=\"row\">전자보증보험<br>서비스정보\n");
      out.write("												</th>\n");
      out.write("												<td></td>\n");
      out.write("											</tr>\n");
      out.write("										</tbody>\n");
      out.write("									</table>\n");
      out.write("								</div>\n");
      out.write("							</div>\n");
      out.write("							<div class=\"orderArea\">\n");
      out.write("								<div class=\"title\">\n");
      out.write("									<h6>주문 상품 정보</h6>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("								<div class=\"ec-base-table typeList\">\n");
      out.write("									<table border=\"1\" summary=\"\" class=\"order-product-table\">\n");
      out.write("										<caption>기본배송</caption>\n");
      out.write("										<colgroup>\n");
      out.write("											<col style=\"width: 92px\">\n");
      out.write("											<col style=\"width: auto\">\n");
      out.write("											<col style=\"width: 60px\">\n");
      out.write("											<col style=\"width: 100px\">\n");
      out.write("											<col style=\"width: 95px\">\n");
      out.write("											<col style=\"width: 110px\">\n");
      out.write("											<col style=\"width: 110px\">\n");
      out.write("											<col style=\"width: 110px\">\n");
      out.write("										</colgroup>\n");
      out.write("										<thead>\n");
      out.write("											<tr>\n");
      out.write("												<th scope=\"col\">이미지</th>\n");
      out.write("												<th scope=\"col\">상품정보</th>\n");
      out.write("												<th scope=\"col\">수량</th>\n");
      out.write("												<th scope=\"col\">판매가</th>\n");
      out.write("												<th scope=\"col\">배송비</th>\n");
      out.write("												<th scope=\"col\">주문처리상태</th>\n");
      out.write("												<th scope=\"col\">구매현황</th>\n");
      out.write("												<th scope=\"col\">상품리뷰</th>\n");
      out.write("											</tr>\n");
      out.write("										</thead>\n");
      out.write("										<tfoot class=\"right\">\n");
      out.write("											<tr>\n");
      out.write("												<td colspan=\"8\">상품구매금액 <strong>");
      out.print( priceSum );
      out.write("</strong> + 배송비\n");
      out.write("													");
      out.print( opVO.getDelivertyFee() );
      out.write(" = 합계 : <strong class=\"txtEm gIndent10\"><span\n");
      out.write("														class=\"txt18\">");
      out.print( result );
      out.write("원</span></strong> <span class=\"displaynone\"></span>\n");
      out.write("												</td>\n");
      out.write("											</tr>\n");
      out.write("										</tfoot>\n");
      out.write("										");
 for(OrderProductVO oVO : list) { 
      out.write("\n");
      out.write("										<tbody\n");
      out.write("											class=\"xans-element- xans-myshop xans-myshop-orderhistorydetailbasic center\">\n");
      out.write("											<tr class=\"xans-record-\">\n");
      out.write("												<td class=\"thumb\"><a\n");
      out.write("													href=\"/product/detail.html?product_no=6183&amp;cate_no=523\"><img\n");
      out.write("														src=\"http://localhost/assets/images/goods/");
      out.print( oVO.getProductImg() );
      out.write("\"\n");
      out.write("														style=\"width: 100px;\" alt=\"\"\n");
      out.write("														onerror=\"this.src='//img.echosting.cafe24.com/thumb/img_product_small.gif';\"></a></td>\n");
      out.write("												<td class=\"left\"><strong class=\"name\"><a\n");
      out.write("														href=\"/product/i-live-with-six-cats-고양이의-바다-유광-카드-하드-케이스/6183/category/523/\"\n");
      out.write("														class=\"ec-product-name\">");
      out.print( oVO.getProductName() );
      out.write("</a></strong>\n");
      out.write("													<div class=\"option \">[옵션: ");
      out.print( oVO.getCode() );
      out.write("]</div>\n");
      out.write("													<p class=\"gBlank5 displaynone\">무이자할부 상품</p></td>\n");
      out.write("												<td>");
      out.print( oVO.getQuantity() );
      out.write("</td>\n");
      out.write("												<td class=\"right\">\n");
      out.write("													<div class=\"\">\n");
      out.write("														<strong>");
      out.print( oVO.getPrice() );
      out.write("원</strong>\n");
      out.write("														<div class=\"displaynone\"></div>\n");
      out.write("													</div>\n");
      out.write("													<div class=\"displaynone\">\n");
      out.write("														<strong>");
      out.print( oVO.getPrice() );
      out.write("원</strong>\n");
      out.write("														<div class=\"displaynone\"></div>\n");
      out.write("													</div>\n");
      out.write("												</td>\n");
      out.write("												<td><div class=\"txtInfo\">\n");
      out.write("														");
      out.print( oVO.getDelivertyFee() );
      out.write("원\n");
      out.write("														<div class=\"displaynone\">(해외배송가능)</div>\n");
      out.write("													</div></td>\n");
      out.write("												<td class=\"state\">\n");
      out.write("													<p class=\"txtEm\">");
      out.print( odVO.getDeliveryStatus() );
      out.write("</p>\n");
      out.write("													<p class=\"displaynone\">\n");
      out.write("														<a href=\"#\" target=\"_self\"></a>\n");
      out.write("													</p>\n");
      out.write("													<p class=\"displaynone\">\n");
      out.write("														<a href=\"#none\" class=\"line\" onclick=\"\">[]</a>\n");
      out.write("													</p>\n");
      out.write("												</td>\n");
      out.write("												<td>\n");
      out.write("													<p>");
      out.print( odVO.getPurchaseStatus() );
      out.write("</p>\n");
      out.write("													<p class=\"displaynone\">-</p>\n");
      out.write("												</td>\n");
      out.write("												<td class=\"state\">\n");
      out.write("												");
 if(odVO.getPurchaseStatus()=="구매확정") { 
      out.write("\n");
      out.write("												<input type=\"button\" class=\"btnNormal\" value=\"리뷰작성\" onclick=\"redirectToReviewPage('");
      out.print( oVO.getCode() );
      out.write("', '");
      out.print( cartId );
      out.write("')\">\n");
      out.write("												");
}else{
      out.write("\n");
      out.write("												<input type=\"button\"  class=\"btnNormal\" value=\"리뷰작성\" onclick=\"alert('구매 확정 시 작성이 가능합니다.')\" />\n");
      out.write("												");
 }//end else 
      out.write("\n");
      out.write("												</td>\n");
      out.write("											</tr>\n");
      out.write("										</tbody>\n");
      out.write("										");
 }//end for 
      out.write("\n");
      out.write("									</table>\n");
      out.write("								</div>\n");
      out.write("\n");
      out.write("							</div>\n");
      out.write("\n");
      out.write("							<div class=\"orderArea\" style=\"margin-bottom: 50px;\">\n");
      out.write("								<div class=\"title\">\n");
      out.write("									<h6>배송지정보</h6>\n");
      out.write("								</div>\n");
      out.write("								<div class=\"ec-base-table\">\n");
      out.write("									<table border=\"1\" summary=\"\">\n");
      out.write("										<caption>배송지정보</caption>\n");
      out.write("										<colgroup>\n");
      out.write("											<col style=\"width: 160px\">\n");
      out.write("											<col style=\"width: auto\">\n");
      out.write("										</colgroup>\n");
      out.write("										<tbody>\n");
      out.write("											<tr class=\"displaynone\">\n");
      out.write("												<th scope=\"row\">수령지</th>\n");
      out.write("												<td>\n");
      out.write("													<ul class=\"list\">\n");
      out.write("														<li>- 주소 :</li>\n");
      out.write("														<li>- 전화번호 :</li>\n");
      out.write("														<li>- 수령지 안내 :</li>\n");
      out.write("													</ul>\n");
      out.write("													</td>\n");
      out.write("											</tr>\n");
      out.write("											<tr>\n");
      out.write("												<th scope=\"row\">받으시는분</th>\n");
      out.write("												<td><span>");
      out.print( odVO.getRecipient() );
      out.write("</span></td>\n");
      out.write("											</tr>\n");
      out.write("											<tr class=\"\">\n");
      out.write("												<th scope=\"row\">우편번호</th>\n");
      out.write("												<td><span>");
      out.print( odVO.getZipcode() );
      out.write("</span></td>\n");
      out.write("											</tr>\n");
      out.write("											<tr class=\"\">\n");
      out.write("												<th scope=\"row\">주소</th>\n");
      out.write("												<td><span>");
      out.print( odVO.getDefaultAddr() );
      out.write(' ');
      out.print( odVO.getDetailAddr() );
      out.write("</span></td>\n");
      out.write("											</tr>\n");
      out.write("											<tr class=\"displaynone\">\n");
      out.write("												<th scope=\"row\">도시</th>\n");
      out.write("												<td></td>\n");
      out.write("											</tr>\n");
      out.write("											<tr class=\"displaynone\">\n");
      out.write("												<th scope=\"row\">주/지방</th>\n");
      out.write("												<td></td>\n");
      out.write("											</tr>\n");
      out.write("											<tr>\n");
      out.write("												<th scope=\"row\">휴대전화</th>\n");
      out.write("												<td><span>");
      out.print( odVO.getTel() );
      out.write("</span></td>\n");
      out.write("											</tr>\n");
      out.write("											<tr>\n");
      out.write("												<th scope=\"row\">배송메시지</th>\n");
      out.write("												<td><span>");
      out.print( odVO.getDeliveryMsg() );
      out.write("</span></td>\n");
      out.write("											</tr>\n");
      out.write("										</tbody>\n");
      out.write("									</table>\n");
      out.write("								</div>\n");
      out.write("							</div> \n");
      out.write("						</div>\n");
      out.write("					</form>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("			<hr class=\"layout\">\n");
      out.write("			<div id=\"banner\"></div>\n");
      out.write("			<div id=\"quick\"></div>\n");
      out.write("			<!-- golgolz end -->\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
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
