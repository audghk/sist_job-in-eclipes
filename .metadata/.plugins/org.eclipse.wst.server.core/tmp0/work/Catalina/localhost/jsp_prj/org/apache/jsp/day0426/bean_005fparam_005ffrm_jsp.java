/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-04-26 02:26:18 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.day0426;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class bean_005fparam_005ffrm_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<!--bootstrap 시작-->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<!--bootstrap 끝-->\r\n");
      out.write("\r\n");
      out.write("<!-- jQuery CDN 시작 -->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>\r\n");
      out.write("<!--jQuery CDN 끝-->\r\n");
      out.write("\r\n");
      out.write("<!-- datepicker 시작-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"//code.jquery.com/ui/1.13.2/themes/base/jquery-ui.css\">\r\n");
      out.write("<script src=\"https://code.jquery.com/ui/1.13.2/jquery-ui.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<!-- datepicker 끝-->\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	.space {\r\n");
      out.write("  width: 5px;\r\n");
      out.write("  height: auto;\r\n");
      out.write("  display: inline-block;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.sist.co.kr/css/main.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"https://www.sist.co.kr/css/board.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("<!--다음 우편번호 API 끝-->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<!-- //join -->\r\n");
      out.write("<form name=\"frm\" method=\"post\" action=\"bean_param_frm_process.jsp\">\r\n");
      out.write("	<div class=\"writeForm\">\r\n");
      out.write("			<table>\r\n");
      out.write("				<colgroup>\r\n");
      out.write("					<col class=\"writeForm_col01\" />\r\n");
      out.write("					<col width=\"*\" />\r\n");
      out.write("				</colgroup>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th><label for=\"id\">아이디</label></th>\r\n");
      out.write("					<td>\r\n");
      out.write("						<input data-value=\"아이디를 입력해주세요.\" name=\"id\" id=\"id\" class=\"inputTxt inputIdtype essential\" type=\"text\" maxlength=\"20\"  />\r\n");
      out.write("						<div class=\"space\"></div>\r\n");
      out.write("						<input type=\"button\" value=\"ID 중복확인\"class=\"btn btn-outline-dark\" id=\"idChk\"/>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th><label for=\"password\">비밀번호</label></th>\r\n");
      out.write("					<td>\r\n");
      out.write("						<input data-value=\"비밀번호를 입력해주세요.\" name=\"password\" id=\"password\" class=\"inputPass size02 essential\" type=\"password\"  />\r\n");
      out.write("						<span class=\"password_ch\"><label for=\"password2\">비밀번호 확인</label></span>\r\n");
      out.write("						<input data-value=\"비밀번호를 입력해주세요.\" name=\"password2\" id=\"password2\" class=\"inputPass size02 mmarT10\" type=\"password\"  />\r\n");
      out.write("						<span>*6~12자의 영문, 숫자, 특수문자 3가지를 조합하여 입력</span>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th><label for=\"name\">이름</label></th>\r\n");
      out.write("					<td>\r\n");
      out.write("						<input data-value=\"이름을 입력해주세요.\" id=\"name\" name=\"name\" class=\"inputTxt inputName essential\" type=\"text\"  />\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th scope=\"row\"><label for=\"\">생일</label></th>\r\n");
      out.write("					<td >\r\n");
      out.write("						<!--<input type=\"text\" name=\"birthday\" id=\"birthday\" data-value=\"생년월일을 입력해 주세요.\"/>-->\r\n");
      out.write("						<input type=\"text\" name=\"birthday\" id=\"datepicker\" class=\"essential\">\r\n");
      out.write("						<span id=\"CalregistdateIcon\">\r\n");
      out.write("						</span>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>연락처</th>\r\n");
      out.write("					<td>\r\n");
      out.write("								\r\n");
      out.write("						<input type=\"text\" name=\"tel\" id=\"tel\" value=\"\" onkeyup=\"isNumberOrHyphen(this);\" onblur=\"cvtUserPhoneNumber(this)\" data-value=\"\"  />\r\n");
      out.write("								\r\n");
      out.write("								\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>휴대폰</th>\r\n");
      out.write("					<td>\r\n");
      out.write("								\r\n");
      out.write("						<input type=\"text\" name=\"cell\" class=\"essential\" id=\"cell\" value=\"\" onkeyup=\"isNumberOrHyphen(this);\" onblur=\"cvtUserPhoneNumber(this)\" data-value=\"휴대폰 번호를 입력해주세요.\"  />\r\n");
      out.write("						\r\n");
      out.write("						<span class=\"label_wrap\"><input type=\"checkbox\" id=\"Num_check\" name=\"issms\" value=\"1\" /><label for=\"Num_check\">수신</label></span>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("						\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th><label for=\"email\">이메일</label></th>\r\n");
      out.write("					<td class=\"mail_type\">\r\n");
      out.write("						<input data-value=\"이메일을 입력해주세요.\" name=\"email1\" id=\"email1\" class=\"inputEmail essential\" type=\"text\" maxlength=\"100\"  /><span class=\"email_txt\">@</span>\r\n");
      out.write("						<input type=\"text\" list=\"selecEmail\" name=\"email2\" id=\"email2\">\r\n");
      out.write("						<datalist class=\"selecEmail\" name=\"selecEmail\" id=\"selecEmail\" data-value=\"이메일을 선택해주세요.\">\r\n");
      out.write("							<option value=\"\">선택해주세요.</option>\r\n");
      out.write("							<option value='직접 입력'>직접 입력</option>\r\n");
      out.write("							<option value='gmail.com'>gmail.com</option>\r\n");
      out.write("							<option value='naver.com'>naver.com</option>\r\n");
      out.write("							<option value='daum.net'>daum.net</option>\r\n");
      out.write("							<option value='nate.com'>nate.com</option>\r\n");
      out.write("							<option value='hotmail.com'>hotmail.com</option>\r\n");
      out.write("						</datalist>\r\n");
      out.write("						<span class=\"label_wrap\"><input type=\"checkbox\" id=\"Email_check\" name=\"ismail\" value=\"1\" /><label for=\"Email_check\">수신</label></span>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th><label for=\"gender\">성별</label></th>\r\n");
      out.write("		 			<td> \r\n");
      out.write("						<input data-value=\"성별을 선택하세요.\" name=\"gender\" type=\"radio\" id=\"radio_check01\" value=\"1\" /><label for=\"radio_check01\">남자</label>\r\n");
      out.write("		 				<input name=\"gender\" type=\"radio\" id=\"radio_check02\"  value=\"2\"/><label for=\"radio_check02\">여자</label>\r\n");
      out.write("		 			</td> \r\n");
      out.write("				</tr> \r\n");
      out.write("				<tr>\r\n");
      out.write("					<th><label for=\"area\">소재지</label></th>\r\n");
      out.write("					<td>\r\n");
      out.write("						<select id=\"area\" name=\"area\">\r\n");
      out.write("							<option value=\"\">선택</option>\r\n");
      out.write("							<option value=\"1\">서울</option>\r\n");
      out.write("							<option value=\"2\">경기</option>\r\n");
      out.write("							<option value=\"3\">충남</option>\r\n");
      out.write("							<option value=\"4\">충북</option>\r\n");
      out.write("							<option value=\"5\">경남</option>\r\n");
      out.write("							<option value=\"6\">경북</option>\r\n");
      out.write("							<option value=\"7\">전남</option>\r\n");
      out.write("							<option value=\"8\">전북</option>\r\n");
      out.write("							<option value=\"8\">제주</option>\r\n");
      out.write("						</select>\r\n");
      out.write("		<!-- 						<input  id=\"area\" name=\"area\" class=\"inputTxt inputName\" type=\"text\" /> -->\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th><label for=\"zipcode\">우편번호</label></th>\r\n");
      out.write("					<td>\r\n");
      out.write("						<input data-value=\"우편번호를 입력해주세요.\" type=\"text\" class=\"zipcode essential\" id=\"zipcode\" name=\"zipcode\" value=\"\"/>\r\n");
      out.write("						<div class=\"space\"></div>\r\n");
      out.write("						<input type=\"button\" value=\"우편번호검색\"class=\"btn btn-outline-dark\" id=\"addChk\"/>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th><label for=\"addr0\">주소</label></th>\r\n");
      out.write("					<td class=\"addr_td\">\r\n");
      out.write("						<input data-value=\"주소를 입력해주세요.\" type=\"text\" id=\"addr0\" class=\"addr essential\" name=\"addr0\" value=\"\"/><br />\r\n");
      out.write("						<input data-value=\"상세주소를 입력해주세요.\" type=\"text\" id=\"addr1\" class=\"addr essential\" name=\"addr1\" value=\"\" style=\"margin-top:7px;\"  />\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("				<tr>\r\n");
      out.write("					<th>점심식사</th>\r\n");
      out.write("					<td>\r\n");
      out.write("					<input type=\"checkbox\" name=\"lunch\" value=\"고등어구이\"/>고등어구이<br/>\r\n");
      out.write("					<input type=\"checkbox\" name=\"lunch\" value=\"구내식당\"/>구내식당<br/>\r\n");
      out.write("					<input type=\"checkbox\" name=\"lunch\" value=\"짜장면\"/>홍짬뽕<br/>\r\n");
      out.write("					<input type=\"checkbox\" name=\"lunch\" value=\"돈까스\"/>탄<br/>\r\n");
      out.write("					<input type=\"checkbox\" name=\"lunch\" value=\"황상\"/>오삼불고기<br/>\r\n");
      out.write("					<input type=\"checkbox\" name=\"lunch\" value=\"해장국\"/>제주은희네<br/>\r\n");
      out.write("					<input type=\"checkbox\" name=\"lunch\" value=\"백반\"/>연탄마을<br/>\r\n");
      out.write("					<input type=\"checkbox\" name=\"lunch\" value=\"뼈해장국\"/>원당감자탕<br/>\r\n");
      out.write("					</td>\r\n");
      out.write("				</tr>\r\n");
      out.write("			</table>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"writeForm_btn\">\r\n");
      out.write("		<input type=\"submit\" value=\"확인\"class=\"btn btn-secondary btn-lg\" id=\"submit\"/>\r\n");
      out.write("		<div class=\"space\"></div>\r\n");
      out.write("		<input type=\"button\" value=\"취소\"class=\"btn btn-secondary btn-lg\" id=\"cancel\"/>\r\n");
      out.write("	</div>\r\n");
      out.write("	<input type=\"hidden\" name=\"email\" id=\"email\" value=\"\" />\r\n");
      out.write("	<input type=\"hidden\" name=\"cmd\" id=\"cmd\" value=\"write\" />\r\n");
      out.write("			<!--<input type=\"hidden\" name=\"spamkey\" value=\"1712214436243\"/> -->\r\n");
      out.write("	<input type=\"hidden\" name=\"spamkey\" value=\"null\"/>\r\n");
      out.write("</form>\r\n");
      out.write("	<!-- text/css -->\r\n");
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