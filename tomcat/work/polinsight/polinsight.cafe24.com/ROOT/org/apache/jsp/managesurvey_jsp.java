/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.50
 * Generated at: 2021-05-25 12:44:28 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;
import java.util.*;
import DB.connection.DBConnection;

public final class manageSurvey_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {


    public int nullIntconvert(String str) {
        int num = 0;
        if (str == null) {
            str = "0";
        } else if ((str.trim()).equals("null")) {	// trim: 문자열 공백 제거
        											// 공백 제거한 결과가 null이라면
            str = "0";	// 문자열의 값을 0으로
        } else if (str.equals("")) {	// 그냥 값이 없으면
            str = "0";	// 그때도 0으로
        }
        try {
            num = Integer.parseInt(str);
        } catch (Exception e) {
        }
        return num;
    }

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("java.sql");
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("java.util");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("java.io");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("DB.connection.DBConnection");
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
      out.write('\r');
      out.write('\n');

    Connection conn = DBConnection.getConnection();
	
	conn.setAutoCommit(false);
	
    ResultSet rs1 = null;
    ResultSet rs2 = null;
    PreparedStatement ps1 = null;
    PreparedStatement ps2 = null;
	
    int showRows = 10;
    int totalRecords = 5;
    int totalRows = nullIntconvert(request.getParameter("totalRows"));
    int totalPages = nullIntconvert(request.getParameter("totalPages"));
    int iPageNo = nullIntconvert(request.getParameter("iPageNo"));
    int cPageNo = nullIntconvert(request.getParameter("cPageNo"));

    int startResult = 0;
    int endResult = 0;
    int ques = 1;
    int no = 1;
    if (iPageNo == 0) {
        iPageNo = 0;
    } else {
        iPageNo = Math.abs((iPageNo - 1) * showRows);
    }
    String tablename = "form";
    String query1 = "SELECT SQL_CALC_FOUND_ROWS * FROM " + tablename + " limit " + iPageNo + "," + showRows + "";
    ps1 = conn.prepareStatement(query1);
    rs1 = ps1.executeQuery();

    String query2 = "SELECT FOUND_ROWS() as cnt";
    ps2 = conn.prepareStatement(query2);
    rs2 = ps2.executeQuery();
    if (rs2.next()) {
        totalRows = rs2.getInt("cnt");
    }

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("\t<title>폴인사이트_관리자</title>\r\n");
      out.write("\t<link href=\"/css/mnms.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("\t<link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\">\r\n");
      out.write("\t<style>\r\n");
      out.write("\t\t#mnm:hover{\r\n");
      out.write("\t\t    background-color: #333;\r\n");
      out.write("\t\t    color: #fff;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#mns{\r\n");
      out.write("\t\t    background-color: tomato;\r\n");
      out.write("\t\t    color: #fff;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t\t#mkf:hover{\r\n");
      out.write("\t\tbackground-color: #333;\r\n");
      out.write("\t\t    color: #fff;\r\n");
      out.write("\t\t}\r\n");
      out.write("\t</style>\r\n");
      out.write("\t<script type=\"text/javascript\">\r\n");
      out.write("function makeForm(){\r\n");
      out.write("\twindow.name=\"parentForm\";\r\n");
      out.write("\twindow.open(\"formInfo.jsp\", \"chkForm\",\r\n");
      out.write("\t\"width=500 height=300 resizableno, scrollbars=no\");\r\n");
      out.write("}\r\n");
      out.write("/*\r\n");
      out.write("function toXLS(){\r\n");
      out.write("\tvar address = \"downloadExcel.jsp?title=타이틀&file_name=리스트.xls\";\r\n");
      out.write("\tlocation.href = address;\r\n");
      out.write("}\r\n");
      out.write("*/\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <div class=\"sidebar\">\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a id=\"mnm\" href=\"managePanel.jsp\">회원관리</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a id=\"mns\" href=\"manageSurvey.jsp\">설문관리</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div>\r\n");
      out.write("\t\t\t<a  id=\"mkf\" onclick=\"makeForm()\">설문제작</a>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("    <div class=\"main\">\r\n");
      out.write("       <h2>설문 관리</h2>\r\n");
      out.write("       <hr>\r\n");
      out.write("       <div class=\"searchbar\"\">\r\n");
      out.write("           <form class=\"searchbar-form\"> \r\n");
      out.write("               <fieldset>\r\n");
      out.write("                      <legend>검색</legend>\r\n");
      out.write("                      <select name=\"searchbar-select\">\r\n");
      out.write("                          <option value=\"name\">설문조사 이름</option>\r\n");
      out.write("                      </select>\r\n");
      out.write("                      <input type=\"search\" id=\"query\" name=\"q\" placeholder=\"설문조사조회\" autocomplete=\"off\" spellcheck=\"false\" style=\"margin:auto; max-width:400px\"><button type=\"submit\"><i class=\"fa fa-search\" style=\"display: inline-block\"></i></button>\r\n");
      out.write("                  </fieldset>\r\n");
      out.write("           </form>\r\n");
      out.write("        </div>\t\r\n");
      out.write("        <div class=\"surveylist\">\r\n");
      out.write("\t\t<table class=\"surveylist-table\">\r\n");
      out.write("\t\t\t<colgroup>\r\n");
      out.write("\t\t\t\t<col width=\"20%\">\r\n");
      out.write("\t\t\t\t<col width=\"20%\">\r\n");
      out.write("\t\t\t\t<col width=\"20%\">\r\n");
      out.write("\t\t\t\t<col width=\"10%\">\r\n");
      out.write("\t\t\t\t<col width=\"20%\">\r\n");
      out.write("\t\t\t\t<col width=\"10%\">\r\n");
      out.write("\t\t\t</colgroup>\r\n");
      out.write("\t\t\t<thead class=\"thead-light\">\r\n");
      out.write("\t\t\t\t<tr>\r\n");
      out.write("\t\t\t\t\t<th scope=\"col\">NO</th>\r\n");
      out.write("\t\t\t\t\t<th scope=\"col\">설문조사 이름</th>\r\n");
      out.write("\t\t\t\t\t<th scope=\"col\">응답률</th>\r\n");
      out.write("\t\t\t\t\t<th scope=\"col\">결과다운</th>\r\n");
      out.write("\t\t\t\t</tr>\r\n");
      out.write("\t\t\t</thead>\r\n");
      out.write("\t\t\t<tbody>\r\n");
      out.write("            ");

                while (rs1.next()) {
            
      out.write("\t\r\n");
      out.write("            <tr>\r\n");
      out.write("            \t<td>");
      out.print(iPageNo+no);
      out.write("</td>\r\n");
      out.write("                <td>");
      out.print(rs1.getString("title"));
      out.write("</td>\r\n");
      out.write("                <td>%</td>\r\n");
      out.write("\t\t\t\t<td><input type=\"button\" value=\"결과다운(excel)\" onclick=\"location.href='downloadEx.jsp?survey_id=1';\"></td>\r\n");
      out.write("            </tr>\r\n");
      out.write("            ");

                    ques++;
    				no++;
                }
            
      out.write("\r\n");
      out.write("            </tbody>\r\n");
      out.write("          </table>\r\n");
      out.write("        </div><br>\r\n");
      out.write("        <div class=\"surveynav\">\r\n");
      out.write("\t        <form class=\"surveynav-form\">\r\n");
      out.write("\t           <input type=\"hidden\" name=\"iPageNo\" value=\"");
      out.print(iPageNo);
      out.write("\">\r\n");
      out.write("\t           <input type=\"hidden\" name=\"cPageNo\" value=\"");
      out.print(cPageNo);
      out.write("\">\r\n");
      out.write("\t           <input type=\"hidden\" name=\"showRows\" value=\"");
      out.print(showRows);
      out.write("\">\r\n");
      out.write("\t           ");

	               try {
	                   if (totalRows < (iPageNo + showRows)) {
	                       endResult = totalRows;
	                   } else {
	                       endResult = (iPageNo + showRows);
	                   }
	                   startResult = (iPageNo + 1);
	                   totalPages = ((int) (Math.ceil((double) totalRows / showRows)));
	               } catch (Exception e) {
	                   e.printStackTrace();
	               }
	               int i = 0;
	               int cPage = 0;
	               if (totalRows != 0) {
	                   cPage = ((int) (Math.ceil((double) endResult / (totalRecords * showRows))));
	
	                   int prePageNo = (cPage * totalRecords) - ((totalRecords - 1) + totalRecords);
	                   if ((cPage * totalRecords) - (totalRecords) > 0) {	//현재 페이지 * 한 화면에 보일 최대 페이지 수 - 한 화면에 보일 최대 페이지 수
	           
      out.write("\r\n");
      out.write("\t           <span id=\"prev\"><a href=\"manageSurvey.jsp?iPageNo=");
      out.print(prePageNo);
      out.write("&cPageNo=");
      out.print(prePageNo);
      out.write("\" class=\"prev-span\" style=\"text-decoration:none;\">&lt;</a></span>\r\n");
      out.write("\t           ");

	               }
	               for (i = ((cPage * totalRecords) - (totalRecords - 1)); i <= (cPage * totalRecords); i++) {
	                   if (i == ((iPageNo / showRows) + 1)) {
      out.write("\r\n");
      out.write("\t           <span class=\"numbers\"><a href=\"manageSurvey.jsp?iPageNo=");
      out.print(i);
      out.write("\" class=\"number-span1\" style=\"text-decoration:none;\">");
      out.print(i);
      out.write("</a></span>\r\n");
      out.write("\t               ");

	               } else if (i <= totalPages) {
	               
      out.write("\r\n");
      out.write("\t           <span class=\"numbers\"><a href=\"manageSurvey.jsp?iPageNo=");
      out.print(i);
      out.write("\" class=\"number-span2\" style=\"text-decoration:none;\">");
      out.print(i);
      out.write("</a></span>\r\n");
      out.write("\t               ");

	                       }
	                   }
	                   if (totalPages > totalRecords && i < totalPages) {
	               
      out.write("\r\n");
      out.write("\t           <span id=\"next\"><a href=\"manageSurvey.jsp?iPageNo=");
      out.print(i);
      out.write("&cPageNo=");
      out.print(i);
      out.write("\" class=\"next-span\" style=\"text-decoration:none;\">&gt;</a></span>\r\n");
      out.write("\t           ");

	                   }
	               }
	               conn.close();
	
	               conn = null;
	               rs1 = null;
	               rs2 = null;
	               ps1 = null;
	               ps2 = null;
	               query1 = null;
	               query2 = null;
	           
      out.write("\r\n");
      out.write("\t        </form><br>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
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
