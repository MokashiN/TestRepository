/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.35
 * Generated at: 2016-08-30 12:53:34 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.WEB_002dINF.views;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(7);
    _jspx_dependants.put("jar:file:/C:/Users/MUM-00131-GNP01/TempWorkspace/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/MyChatApp/WEB-INF/lib/spring-webmvc-4.3.2.RELEASE.jar!/META-INF/spring-form.tld", Long.valueOf(1469673008000L));
    _jspx_dependants.put("/WEB-INF/views/header.jsp", Long.valueOf(1471449060917L));
    _jspx_dependants.put("/WEB-INF/lib/jstl-jstl-1.2.jar", Long.valueOf(1471177333894L));
    _jspx_dependants.put("/WEB-INF/views/footer.jsp", Long.valueOf(1471158490000L));
    _jspx_dependants.put("/WEB-INF/views/menu.jsp", Long.valueOf(1472561421922L));
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

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fy_005furl_0026_005fvalue_005fnobody;

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
    _005fjspx_005ftagPool_005fy_005furl_0026_005fvalue_005fnobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fy_005furl_0026_005fvalue_005fnobody.release();
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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

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
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write('\r');
      out.write('\n');
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
      out.write("<br><br>\r\n");
      out.write("<nav class=\"navbar navbar-default navbar-fixed-top\">\r\n");
      out.write("  <div class=\"container-fluid\">\r\n");
      out.write("    <div class=\"navbar-header\">\r\n");
      out.write("      <button type=\"button\" class=\"navbar-toggle\" data-toggle=\"collapse\" data-target=\"#myNavbar\">\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>\r\n");
      out.write("        <span class=\"icon-bar\"></span>                        \r\n");
      out.write("      </button>\r\n");
      out.write("      <a class=\"navbar-brand\" href=\"myPage\">Collaboration Center</a>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"collapse navbar-collapse\" id=\"myNavbar\">\r\n");
      out.write("      <ul class=\"nav navbar-nav navbar-right\">\r\n");
      out.write("        <li><a href=\"#myPage\">HOME</a></li>\r\n");
      out.write("        <li class=\"active\"><a href=\"");
      if (_jspx_meth_y_005furl_005f0(_jspx_page_context))
        return;
      out.write("\"> Chat</a></li>\r\n");
      out.write("        <li class=\"active\"><a href=\"");
      if (_jspx_meth_y_005furl_005f1(_jspx_page_context))
        return;
      out.write("\"> Login</a></li>\r\n");
      out.write("        <li><a href=\"Register\">Register With Us</a></li>\r\n");
      out.write("        <li><a href=\"other\">Forum and Blog</a></li>\r\n");
      out.write("        <li><a href=\"other1\">Job Opportunities</a></li>\r\n");
      out.write("        <li><a href=\"AboutUs\">About Us</a></li>\r\n");
      out.write("      </ul>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>\r\n");
      out.write("<div id=\"myCarousel\" class=\"carousel slide\" data-ride=\"carousel\">\r\n");
      out.write("    <!-- Indicators -->\r\n");
      out.write("    <ol class=\"carousel-indicators\">\r\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"0\" class=\"active\"></li>\r\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"1\"></li>\r\n");
      out.write("      <li data-target=\"#myCarousel\" data-slide-to=\"2\"></li>\r\n");
      out.write("    </ol>\r\n");
      out.write("\r\n");
      out.write("    <!-- Wrapper for slides -->\r\n");
      out.write("    <div class=\"carousel-inner\" role=\"listbox\">\r\n");
      out.write("      <div class=\"item active\">\r\n");
      out.write("        <img src=\"./resource/images/ny.jpg\" alt=\"New York\" width=\"1200\" height=\"700\">\r\n");
      out.write("        <div class=\"carousel-caption\">\r\n");
      out.write("          <h3>New York</h3>\r\n");
      out.write("          <p>The atmosphere in New York is lorem ipsum.</p>\r\n");
      out.write("        </div>      \r\n");
      out.write("      </div>\r\n");
      out.write("\r\n");
      out.write("      <div class=\"item\">\r\n");
      out.write("        <img src=\"./resource/images/chicago.jpg\" alt=\"Chicago\" width=\"1200\" height=\"700\">\r\n");
      out.write("        <div class=\"carousel-caption\">\r\n");
      out.write("          <h3>Chicago</h3>\r\n");
      out.write("          <p>Thank you, Chicago - A night we won't forget.</p>\r\n");
      out.write("        </div>      \r\n");
      out.write("      </div>\r\n");
      out.write("    \r\n");
      out.write("      <div class=\"item\">\r\n");
      out.write("        <img src=\"./resource/images/la.jpg\" alt=\"Los Angeles\" width=\"1200\" height=\"700\">\r\n");
      out.write("        <div class=\"carousel-caption\">\r\n");
      out.write("          <h3>LA</h3>\r\n");
      out.write("          <p>Even though the traffic was a mess, we had the best time playing at Venice Beach!</p>\r\n");
      out.write("        </div>      \r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("\r\n");
      out.write("    <!-- Left and right controls -->\r\n");
      out.write("    <a class=\"left carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"prev\">\r\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-left\" aria-hidden=\"true\"></span>\r\n");
      out.write("      <span class=\"sr-only\">Previous</span>\r\n");
      out.write("    </a>\r\n");
      out.write("    <a class=\"right carousel-control\" href=\"#myCarousel\" role=\"button\" data-slide=\"next\">\r\n");
      out.write("      <span class=\"glyphicon glyphicon-chevron-right\" aria-hidden=\"true\"></span>\r\n");
      out.write("      <span class=\"sr-only\">Next</span>\r\n");
      out.write("    </a>\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container text-center\">\r\n");
      out.write("  <h3>THE BAND</h3>\r\n");
      out.write("  <p><em>We love music!</em></p>\r\n");
      out.write("  <p>We have created a fictional band website. Lorem ipsum..</p>\r\n");
      out.write("  <br>\r\n");
      out.write("  <div class=\"row\">\r\n");
      out.write("    <div class=\"col-sm-4\">\r\n");
      out.write("      <p class=\"text-center\"><strong>Create Own Blog</strong></p><br>\r\n");
      out.write("      <a href=\"#demo\" data-toggle=\"collapse\">\r\n");
      out.write("        <img src=\"./resource/images/blog1.jpg\" class=\"img-circle person\" alt=\"Random Name\" width=\"255\" height=\"255\">\r\n");
      out.write("      </a>\r\n");
      out.write("      <div id=\"demo\" class=\"collapse\">\r\n");
      out.write("        <p>Guitarist and Lead Vocalist</p>\r\n");
      out.write("        <p>Loves long walks on the beach</p>\r\n");
      out.write("        <p>Member since 1988</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-4\">\r\n");
      out.write("      <p class=\"text-center\"><strong>Social Status</strong></p><br>\r\n");
      out.write("      <a href=\"#demo2\" data-toggle=\"collapse\">\r\n");
      out.write("        <img src=\"./resource/images/blog3.jpg\" class=\"img-circle person\" alt=\"Random Name\" width=\"255\" height=\"255\">\r\n");
      out.write("      </a>\r\n");
      out.write("      <div id=\"demo2\" class=\"collapse\">\r\n");
      out.write("        <p>Drummer</p>\r\n");
      out.write("        <p>Loves drummin'</p>\r\n");
      out.write("        <p>Member since 1988</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("    <div class=\"col-sm-4\">\r\n");
      out.write("      <p class=\"text-center\"><strong>Chat With Friends</strong></p><br>\r\n");
      out.write("      <a href=\"#demo3\" data-toggle=\"collapse\">\r\n");
      out.write("        <img src=\"./resource/images/blogchat1.jpg\" class=\"img-circle person\" alt=\"Random Name\" width=\"255\" height=\"255\">\r\n");
      out.write("      </a>\r\n");
      out.write("      <div id=\"demo3\" class=\"collapse\">\r\n");
      out.write("        <p>Bass player</p>\r\n");
      out.write("        <p>Loves math</p>\r\n");
      out.write("        <p>Member since 2005</p>\r\n");
      out.write("      </div>\r\n");
      out.write("    </div>\r\n");
      out.write("  </div>\r\n");
      out.write("</div>\r\n");
      out.write("<!-- \r\n");
      out.write("    <nav class=\"navbar navbar-inverse navbar-fixed-top\">\r\n");
      out.write("      <div class=\"container\">\r\n");
      out.write("        <div class=\"navbar-header\">\r\n");
      out.write("          <button type=\"button\" class=\"navbar-toggle collapsed\" data-toggle=\"collapse\" data-target=\"#navbar\" aria-expanded=\"false\" aria-controls=\"navbar\">\r\n");
      out.write("            <span class=\"sr-only\">Toggle navigation</span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("            <span class=\"icon-bar\"></span>\r\n");
      out.write("          </button>\r\n");
      out.write("          <a class=\"navbar-brand\" href=\"#\">Project name</a>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div id=\"navbar\" class=\"collapse navbar-collapse\">\r\n");
      out.write("          <ul class=\"nav navbar-nav\">\r\n");
      out.write("            <li class=\"active\"><a href=\"#\">Home</a></li>\r\n");
      out.write("            <li class=\"active\"><a href=\"$#\">About</a></li>\r\n");
      out.write("            <li class=\"active\"><a href=\"#\">contact</a></li>\r\n");
      out.write("            <li class=\"active\"><a href=\"");
      if (_jspx_meth_y_005furl_005f2(_jspx_page_context))
        return;
      out.write("\"> Chat</a></li>\r\n");
      out.write("            \r\n");
      out.write("           \r\n");
      out.write("          </ul>\r\n");
      out.write("        </div><!--/.nav-collapse -->\r\n");
      out.write("      </div>\r\n");
      out.write("    </nav>\r\n");
      out.write(" -->");
      out.write("\r\n");
      out.write("<div class=\"container\">\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write(" <div>\t\r\n");
      out.write("\t <footer>@Copyrights 2016\r\n");
      out.write("\t  </footer>\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\r\n");
      out.write("<script type=\"text/javascript\" src=\"<c:url value=\"/resources/js/jquery-2.2.0.min.js\" />\"></script>\r\n");
      out.write("<script src=\"<c:url value=\"/resources/js/bootstrap.min.js\"/>\"></script>\r\n");
      out.write("<script src=\"<c:url value=\"/resources/js/jquery.rating.pack.js\"/>\"></script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
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

  private boolean _jspx_meth_y_005furl_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  y:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_y_005furl_005f0 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fy_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_y_005furl_005f0.setPageContext(_jspx_page_context);
    _jspx_th_y_005furl_005f0.setParent(null);
    // /WEB-INF/views/menu.jsp(16,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_y_005furl_005f0.setValue("/Chat");
    int _jspx_eval_y_005furl_005f0 = _jspx_th_y_005furl_005f0.doStartTag();
    if (_jspx_th_y_005furl_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fy_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_y_005furl_005f0);
      return true;
    }
    _005fjspx_005ftagPool_005fy_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_y_005furl_005f0);
    return false;
  }

  private boolean _jspx_meth_y_005furl_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  y:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_y_005furl_005f1 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fy_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_y_005furl_005f1.setPageContext(_jspx_page_context);
    _jspx_th_y_005furl_005f1.setParent(null);
    // /WEB-INF/views/menu.jsp(17,36) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_y_005furl_005f1.setValue("/Login");
    int _jspx_eval_y_005furl_005f1 = _jspx_th_y_005furl_005f1.doStartTag();
    if (_jspx_th_y_005furl_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fy_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_y_005furl_005f1);
      return true;
    }
    _005fjspx_005ftagPool_005fy_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_y_005furl_005f1);
    return false;
  }

  private boolean _jspx_meth_y_005furl_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  y:url
    org.apache.taglibs.standard.tag.rt.core.UrlTag _jspx_th_y_005furl_005f2 = (org.apache.taglibs.standard.tag.rt.core.UrlTag) _005fjspx_005ftagPool_005fy_005furl_0026_005fvalue_005fnobody.get(org.apache.taglibs.standard.tag.rt.core.UrlTag.class);
    _jspx_th_y_005furl_005f2.setPageContext(_jspx_page_context);
    _jspx_th_y_005furl_005f2.setParent(null);
    // /WEB-INF/views/menu.jsp(130,40) name = value type = null reqTime = true required = false fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
    _jspx_th_y_005furl_005f2.setValue("/Chat");
    int _jspx_eval_y_005furl_005f2 = _jspx_th_y_005furl_005f2.doStartTag();
    if (_jspx_th_y_005furl_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _005fjspx_005ftagPool_005fy_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_y_005furl_005f2);
      return true;
    }
    _005fjspx_005ftagPool_005fy_005furl_0026_005fvalue_005fnobody.reuse(_jspx_th_y_005furl_005f2);
    return false;
  }
}
