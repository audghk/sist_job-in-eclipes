/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.86
 * Generated at: 2024-05-20 06:12:56 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.day0520;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import org.jdom2.Element;
import org.jdom2.Document;
import java.net.URL;
import org.jdom2.input.SAXBuilder;
import java.io.IOException;
import org.jdom2.JDOMException;

public final class jtbc_005frss_jsp extends org.apache.jasper.runtime.HttpJspBase
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
    _jspx_dependants.put("/WEB-INF/lib/standard.jar", Long.valueOf(1714367618698L));
    _jspx_dependants.put("jar:file:/C:/dev/workspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/jsp_prj/WEB-INF/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.LinkedHashSet<>(3);
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.LinkedHashSet<>(7);
    _jspx_imports_classes.add("org.jdom2.Document");
    _jspx_imports_classes.add("org.jdom2.input.SAXBuilder");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("org.jdom2.JDOMException");
    _jspx_imports_classes.add("java.net.URL");
    _jspx_imports_classes.add("java.io.IOException");
    _jspx_imports_classes.add("org.jdom2.Element");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

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
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<link rel=\"icon\" href=\"http://192.168.10.216/jsp_prj/common/favicon.ico\"/>\r\n");
      out.write("<!--bootstrap 시작-->\r\n");
      out.write("<link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\" integrity=\"sha384-QWTKZyjpPEjISv5WaRU9OFeRpok6YctnYmDr5pNlyT2bRjXh0JMhjY6hW+ALEwIH\" crossorigin=\"anonymous\">\r\n");
      out.write("<script src=\"https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js\" integrity=\"sha384-YvpcrYf0tY3lHB60NNkmXc5s9fDVZLESaAA55NDzOxhy9GkcIdslK1eN7N6jIeHz\" crossorigin=\"anonymous\"></script>\r\n");
      out.write("<!--bootstrap 끝-->\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://192.168.10.216/jsp_prj/common/css/main.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"http://192.168.10.216/jsp_prj/common/css/board.css\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("\r\n");
      out.write("<!--jQuery CDN 시작-->\r\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/2.2.4/jquery.min.js\"></script>\r\n");
      out.write("<!--jQuery CDN 끝-->\r\n");
      out.write("\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("	\r\n");
      out.write("</style>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	$(function(){\r\n");
      out.write("		\r\n");
      out.write("	});//ready\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<div>\r\n");

String[] title="속보,정치,경제,사회,국제,문화,연예,스포츠,풀영상,뉴스랭킹,뉴스룸,아침&amp;".split(",");
String[] url="newsflash,politics,economy,society,international,culture,entertainment,sports,fullvideo,newsrank,newsroom,newmorning".split(",");


      out.write("	\r\n");
      out.write("https://fs.jtbc.co.kr/RSS/\r\n");
      out.write("<table>\r\n");
      out.write("<tr>\r\n");

for(int i=0; i<title.length; i++){

      out.write("\r\n");
      out.write("<td><a href=\"jtbc_rss.jsp?url=");
      out.print( url[i]);
      out.write('"');
      out.write('>');
      out.print( title[i] );
      out.write("</a></td>\r\n");

}

      out.write("\r\n");
      out.write("</tr>\r\n");
      out.write("</table>\r\n");
      out.write("</div>\r\n");
      out.write("<div>\r\n");
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      boolean _jspx_th_c_005fif_005f0_reused = false;
      try {
        _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
        _jspx_th_c_005fif_005f0.setParent(null);
        // /day0520/jtbc_rss.jsp(59,0) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
        _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ not empty param.url }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
        int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
        if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
          do {
            out.write('\r');
            out.write('\n');

try{
  //1. 빌더 생성
  SAXBuilder builder=new SAXBuilder();
  //2. XML문서 객체 생성
  String paramUrl=request.getParameter("url");
  Document doc=builder.build(new URL("https://fs.jtbc.co.kr/RSS/"+paramUrl+".xml"));
  //3. 최상위 부모노드 얻기
  Element rssNode=doc.getRootElement();
  //out.println(rssNode);
  //4. 자식노드 얻기
  Element channelNode=rssNode.getChild("channel");
  
  Element categoryNode=channelNode.getChild("category");
  Element pubDateNode=channelNode.getChild("pubDate");
  
  List<Element> itemNodes=channelNode.getChildren("item");
  
            out.write("\r\n");
            out.write("  <div>\r\n");
            out.write("  	<strong>");
            out.print( categoryNode.getValue() );
            out.write("</strong>\r\n");
            out.write("  	(");
            out.print( pubDateNode.getValue() );
            out.write(")\r\n");
            out.write("  	<br>\r\n");
            out.write("  	<strong>조회 뉴스 :</strong> ");
            out.print( itemNodes.size() );
            out.write("건\r\n");
            out.write("  </div>\r\n");
            out.write("  ");

  if(itemNodes.isEmpty()){
   
            out.write("\r\n");
            out.write("   <div><span style=\"color:#dedede; font-weight:bold;\">조회된 뉴스가 존재하지 않습니다.</span></div>\r\n");
            out.write("   ");

  }
  
  Element titleNode=null;
  Element linkNode=null;
  Element descriptionNode=null;
  Element pubDateNode2=null;
  
  for(Element itemNode : itemNodes){
    titleNode=itemNode.getChild("title");
    linkNode=itemNode.getChild("link");
    descriptionNode=itemNode.getChild("description");
    pubDateNode2=itemNode.getChild("pubDate");
    
    
            out.write("\r\n");
            out.write("    <div>\r\n");
            out.write("    <table class=\"table table-hover\">\r\n");
            out.write("    <tr>\r\n");
            out.write("    <td style=\"width:80px\">제목</td>\r\n");
            out.write("    <td style=\"width:400px\"><a href=\"");
            out.print( linkNode.getValue() );
            out.write('"');
            out.write('>');
            out.print( titleNode.getValue() );
            out.write("</a></td>\r\n");
            out.write("    <td style=\"width:80px\">작성일</td>\r\n");
            out.write("    <td style=\"width:200px\">");
            out.print( pubDateNode2.getValue() );
            out.write("</td>\r\n");
            out.write("    </tr>\r\n");
            out.write("    <tr>\r\n");
            out.write("    <td style=\"width:80px\">설명</td>\r\n");
            out.write("    <td colspan=\"3\">");
            out.print( descriptionNode.getValue() );
            out.write("</td>\r\n");
            out.write("    </tr>\r\n");
            out.write("    </table>\r\n");
            out.write("    </div>\r\n");
            out.write("    \r\n");
            out.write("    ");

  }//end for
  
}catch(JDOMException | IOException je){
  je.printStackTrace();
  
            out.write("\r\n");
            out.write("  문제발생!\r\n");
            out.write("  ");

}

            out.write('\r');
            out.write('\n');
            int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
            if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
              break;
          } while (true);
        }
        if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
          return;
        }
        _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
        _jspx_th_c_005fif_005f0_reused = true;
      } finally {
        org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
      }
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
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
