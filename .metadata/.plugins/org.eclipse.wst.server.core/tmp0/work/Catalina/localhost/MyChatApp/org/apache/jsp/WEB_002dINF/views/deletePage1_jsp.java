/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.35
 * Generated at: 2016-08-19 11:58:58 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class deletePage1_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(5);
    _jspx_dependants.put("jar:file:/C:/Users/MUM-00131-GNP01/TempWorkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MyChatApp/WEB-INF/lib/spring-webmvc-4.3.2.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1469673008000L));
    _jspx_dependants.put("/WEB-INF/views/header.jsp", Long.valueOf(1471449060917L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-jstl-1.2.jar", Long.valueOf(1471177333894L));
    _jspx_dependants.put("jar:file:/C:/Users/MUM-00131-GNP01/TempWorkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MyChatApp/WEB-INF/lib/jstl-jstl-1.2.jar!/META-INF/c.tld", Long.valueOf(1153365282000L));
    _jspx_dependants.put("/WEB-INF/lib/spring-webmvc-4.3.2.RELEASE.jar", Long.valueOf(1471177096300L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
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

final java.lang.String _jspx_method = request.getMethod();
if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET POST or HEAD");
return;
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
      response.setContentType("text/html; charset=ISO-8859-1");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<html lang=\"en\">\r\n");
      out.write("<head>\r\n");
      out.write("<!-- Theme Made By www.w3schools.com - No Copyright -->\r\n");
      out.write("<title>Bootstrap Theme The Band</title>\r\n");
      out.write("<meta charset=\"utf-8\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/css/bootstrap.min.css\">\r\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Lato\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"http://fonts.googleapis.com/css?family=Montserrat\"\r\n");
      out.write("\trel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"https://ajax.googleapis.com/ajax/libs/jquery/1.12.2/jquery.min.js\"></script>\r\n");
      out.write("<script\r\n");
      out.write("\tsrc=\"http://maxcdn.bootstrapcdn.com/bootstrap/3.3.6/js/bootstrap.min.js\"></script>\r\n");
      out.write("<style>\r\n");
      out.write("body {\r\n");
      out.write("\tfont: 400 15px/1.8 Lato, sans-serif;\r\n");
      out.write("\tcolor: #777;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("h3, h4 {\r\n");
      out.write("\tmargin: 10px 0 30px 0;\r\n");
      out.write("\tletter-spacing: 10px;\r\n");
      out.write("\tfont-size: 20px;\r\n");
      out.write("\tcolor: #111;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".container {\r\n");
      out.write("\tpadding: 80px 120px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".person {\r\n");
      out.write("\tborder: 10px solid transparent;\r\n");
      out.write("\tmargin-bottom: 25px;\r\n");
      out.write("\twidth: 80%;\r\n");
      out.write("\theight: 80%;\r\n");
      out.write("\topacity: 0.7;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".person:hover {\r\n");
      out.write("\tborder-color: #f1f1f1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".carousel-inner img {\r\n");
      out.write("\t-webkit-filter: grayscale(90%);\r\n");
      out.write("\tfilter: grayscale(90%); /* make all photos black and white */\r\n");
      out.write("\twidth: 100%; /* Set width to 100% */\r\n");
      out.write("\tmargin: auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".carousel-caption h3 {\r\n");
      out.write("\tcolor: #fff !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("@media ( max-width : 600px) {\r\n");
      out.write("\t.carousel-caption {\r\n");
      out.write("\t\tdisplay: none;\r\n");
      out.write("\t\t/* Hide the carousel text when the screen is less than 600 pixels wide */\r\n");
      out.write("\t}\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bg-1 {\r\n");
      out.write("\tbackground: #2d2d30;\r\n");
      out.write("\tcolor: #bdbdbd;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bg-1 h3 {\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bg-1 p {\r\n");
      out.write("\tfont-style: italic;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".list-group-item:first-child {\r\n");
      out.write("\tborder-top-right-radius: 0;\r\n");
      out.write("\tborder-top-left-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".list-group-item:last-child {\r\n");
      out.write("\tborder-bottom-right-radius: 0;\r\n");
      out.write("\tborder-bottom-left-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".thumbnail {\r\n");
      out.write("\tpadding: 0 0 15px 0;\r\n");
      out.write("\tborder: none;\r\n");
      out.write("\tborder-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".thumbnail p {\r\n");
      out.write("\tmargin-top: 15px;\r\n");
      out.write("\tcolor: #555;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn {\r\n");
      out.write("\tpadding: 10px 20px;\r\n");
      out.write("\tbackground-color: #333;\r\n");
      out.write("\tcolor: #f1f1f1;\r\n");
      out.write("\tborder-radius: 0;\r\n");
      out.write("\ttransition: .2s;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".btn:hover, .btn:focus {\r\n");
      out.write("\tborder: 1px solid #333;\r\n");
      out.write("\tbackground-color: #fff;\r\n");
      out.write("\tcolor: #000;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".modal-header, h4, .close {\r\n");
      out.write("\tbackground-color: #333;\r\n");
      out.write("\tcolor: #fff !important;\r\n");
      out.write("\ttext-align: center;\r\n");
      out.write("\tfont-size: 30px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".modal-header, .modal-body {\r\n");
      out.write("\tpadding: 40px 50px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".nav-tabs li a {\r\n");
      out.write("\tcolor: #777;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("#googleMap {\r\n");
      out.write("\twidth: 100%;\r\n");
      out.write("\theight: 400px;\r\n");
      out.write("\t-webkit-filter: grayscale(100%);\r\n");
      out.write("\tfilter: grayscale(100%);\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar {\r\n");
      out.write("\tfont-family: Montserrat, sans-serif;\r\n");
      out.write("\tmargin-bottom: 0;\r\n");
      out.write("\tbackground-color: #2d2d30;\r\n");
      out.write("\tborder: 0;\r\n");
      out.write("\tfont-size: 11px !important;\r\n");
      out.write("\tletter-spacing: 4px;\r\n");
      out.write("\topacity: 0.9;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar li a, .navbar .navbar-brand {\r\n");
      out.write("\tcolor: #d5d5d5 !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-nav li a:hover {\r\n");
      out.write("\tcolor: #fff !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-nav li.active a {\r\n");
      out.write("\tcolor: #fff !important;\r\n");
      out.write("\tbackground-color: #29292c !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".navbar-default .navbar-toggle {\r\n");
      out.write("\tborder-color: transparent;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".open .dropdown-toggle {\r\n");
      out.write("\tcolor: #fff;\r\n");
      out.write("\tbackground-color: #555 !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-menu li a {\r\n");
      out.write("\tcolor: #000 !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".dropdown-menu li a:hover {\r\n");
      out.write("\tbackground-color: red !important;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer {\r\n");
      out.write("\tbackground-color: #2d2d30;\r\n");
      out.write("\tcolor: #f5f5f5;\r\n");
      out.write("\tpadding: 32px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer a {\r\n");
      out.write("\tcolor: #f5f5f5;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("footer a:hover {\r\n");
      out.write("\tcolor: #777;\r\n");
      out.write("\ttext-decoration: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".form-control {\r\n");
      out.write("\tborder-radius: 0;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("textarea {\r\n");
      out.write("\tresize: none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body id=\"myPage\" data-spy=\"scroll\" data-target=\".navbar\"\r\n");
      out.write("\tdata-offset=\"50\">\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("\t<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("\t\t<div class=\"container-fluid\">\r\n");
      out.write("\t\t\t<div class=\"navbar-header\">\r\n");
      out.write("\t\t\t\t<button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\"\r\n");
      out.write("\t\t\t\t\tdata-target=\"#myNavbar\">\r\n");
      out.write("\t\t\t\t\t<span class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("\t\t\t\t\t\tclass=\"icon-bar\"></span>\r\n");
      out.write("\t\t\t\t</button>\r\n");
      out.write("\t\t\t\t<a class=\"navbar-brand\" href=\"myPage\">Collaboration Center</a>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("\t\t\t\t<ul class=\"nav navbar-nav navbar-left\">\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"myPage\">HOME</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"<c:url value='/Chat'/>\">CHAT</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"<c:url value='/Forum'/>\">FORUM</a></li>\r\n");
      out.write("\t\t\t\t\t\t\t<li><a href=\"<c:url value='/ForumView'/>\">Forum View</a></li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t</nav>\r\n");
      out.write("\t\t<h1 align=center>Record Deleted Successfully</h1>\r\n");
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
