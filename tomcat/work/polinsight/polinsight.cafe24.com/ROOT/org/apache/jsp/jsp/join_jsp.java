/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.0.50
 * Generated at: 2021-04-17 08:33:21 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class join_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

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
      response.setContentType("text/html; charset=utf-8");
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
      out.write("<meta charset=\"utf-8\" />\r\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\" />\r\n");
      out.write("<title>폴인사이트</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("\thref=\"https://cdn.jsdelivr.net/bxslider/4.2.12/jquery.bxslider.css\">\r\n");
      out.write("<meta name=\"viewport\"\r\n");
      out.write("\tcontent=\"user-scalable=no,initial-scale=1.0,maximum-scale=1.0,minimum-scale=1.0,width=device-width\" />\r\n");
      out.write("<link rel=\"stylesheet\" type=\"text/css\" href=\"../css/style.css\" />\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("    \r\n");
      out.write("        // 필수 입력정보인 아이디, 비밀번호가 입력되었는지 확인하는 함수\r\n");
      out.write("        function checkValue()\r\n");
      out.write("        {\r\n");
      out.write("        \tvar from = document.userInfo;\r\n");
      out.write("        \t\r\n");
      out.write("            if(!form.user_id.value){ \r\n");
      out.write("                alert(\"아이디를 입력하세요.\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            if(form.idDuplication.value != \"idChek\"){\r\n");
      out.write("            \talert(\"아이디 중복체크를 해주세요.\");\r\n");
      out.write("            \treturn false;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            if(!form.user_pw.value){\r\n");
      out.write("                alert(\"비밀번호를 입력하세요.\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }\r\n");
      out.write("            \r\n");
      out.write("            // 비밀번호와 비밀번호 확인에 입력된 값이 동일한지 확인\r\n");
      out.write("            if(form.user_pw.value != form.user_pwre.value ){\r\n");
      out.write("                alert(\"비밀번호를 동일하게 입력하세요.\");\r\n");
      out.write("                return false;\r\n");
      out.write("            }  \r\n");
      out.write("        }\r\n");
      out.write("        //아이디 중복체크 화면 open\r\n");
      out.write("        function openIdChk(){\r\n");
      out.write("        \twindow.name = \"parentForm\";\r\n");
      out.write("        \twindow.open(\"IdChekFrom.jsp\", \"chkForm\",\r\n");
      out.write("        \t\t\t\"width=500 height=300 resizableno, scrollbars=no\");\r\n");
      out.write("        }\r\n");
      out.write("        \r\n");
      out.write("        //아이디 입력창에 값 입력시 hidden에 idUnchek를 세팅, 중복체크\r\n");
      out.write("        function inputIdChek(){\r\n");
      out.write("        \tdocument.userInfo.idDuplicaiton.value=\"idUnchek\";\r\n");
      out.write("        }\r\n");
      out.write("    </script>\r\n");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\t<div id=\"top\">\r\n");
      out.write("\t\t<span id=\"bookmark\">즐겨찾기 추가</span><span id=\"top_menu\"><span\r\n");
      out.write("\t\t\tclass=\"top_menu_d\" onclick=\"location.href='index.php';\">홈</span><span\r\n");
      out.write("\t\t\tclass=\"top_menu_d\" onclick=\"location.href='login.php';\">로그인</span><span\r\n");
      out.write("\t\t\tclass=\"top_menu_d\">패널가입</span><span class=\"top_menu_d\">사이트맵</span></span>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"lmd\">\r\n");
      out.write("\t\t<img id=\"logoimg\" src=\"../img/logo.png\"\r\n");
      out.write("\t\t\tonclick=\"location.href='index.jsp';\" />\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"topmenu\">\r\n");
      out.write("\t\t<div id=\"topmenuwrap\">\r\n");
      out.write("\t\t\t<div id=\"topmenu1\">폴인사이트소개</div>\r\n");
      out.write("\t\t\t<div id=\"topmenu2\">사업영역</div>\r\n");
      out.write("\t\t\t<div id=\"topmenu3\">온라인조사</div>\r\n");
      out.write("\t\t\t<div id=\"topmenu4\">커뮤니티</div>\r\n");
      out.write("\t\t\t<div id=\"submenuwrap\">\r\n");
      out.write("\t\t\t\t<div id=\"submenu\">\r\n");
      out.write("\t\t\t\t\t<div id=\"submenu1\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"subt1\" class=\"sub\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"location.href='greeting.php';\">인사말</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sub\" onclick=\"location.href='history.php';\">연혁</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"submenu2\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"subt2\" class=\"sub\" onclick=\"location.href='field.php';\">분야별영역</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sub\" onclick=\"location.href='performance1.php';\">주요실적</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"submenu3\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"subt3\" class=\"sub\"\r\n");
      out.write("\t\t\t\t\t\t\tonclick=\"location.href='onlinesurvey.php';\">온라인설문</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sub\" onclick=\"location.href='polpointmall.php';\">포인트몰</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t<div id=\"submenu4\">\r\n");
      out.write("\t\t\t\t\t\t<div id=\"subt4\" class=\"sub\" onclick=\"location.href='notice.php';\">공지사항</div>\r\n");
      out.write("\t\t\t\t\t\t<div class=\"sub\" onclick=\"location.href='request.php';\">조사의뢰\r\n");
      out.write("\t\t\t\t\t\t\t및 문의</div>\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"joinpolwrapdiv\">\r\n");
      out.write("\t\t<div id=\"loginjoinselect\">\r\n");
      out.write("\t\t\t<span id=\"loginbtn\" onclick=\"location.href='login.php';\">로그인</span><span\r\n");
      out.write("\t\t\t\tid=\"joinbtn\" onclick=\"location.href='join.jsp';\">회원가입</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<div id=\"joinpoltopdiv\">\r\n");
      out.write("\t\t\t<span id=\"joinpoltop\">·회원가입</span><span class=\"required\">*</span> <span\r\n");
      out.write("\t\t\t\tid=\"required_info\">모든 항목은 필수 입력 사항입니다.</span>\r\n");
      out.write("\t\t</div>\r\n");
      out.write("\t\t<form name=\"joinpol\" action=\"JoinPro.jsp\" method=\"post\"\r\n");
      out.write("\t\t\tautocomplete=\"off\">\r\n");
      out.write("\t\t\t<div class=\"user_info_div\">\r\n");
      out.write("\t\t\t\t<span class=\"userinput_info\"><span class=\"required\">*</span>아이디</span><input\r\n");
      out.write("\t\t\t\t\tid=\"useridinput\" type=\"text\" name =\"user_id\" onkeydown=\"inputIdChk()\"/><span id=\"idchk\"></span>\r\n");
      out.write("\t\t\t\t\t<input type = \"button\" value=\"중복확인\" onclick=\"openIDChk()\">\r\n");
      out.write("\t\t\t\t\t<input type= \"hidden\" name=\"idDuplication\" value=\"idUnCheck\">\r\n");
      out.write("\t\t\t\t<div class=\"useridpwinfo\">* 영문자, 숫자만 입력 가능(최소 6자 이상 16자 이하로\r\n");
      out.write("\t\t\t\t\t입력하세요.)</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"user_info_div\">\r\n");
      out.write("\t\t\t\t<span class=\"userinput_info\"><span class=\"required\">*</span>비밀번호</span><input\r\n");
      out.write("\t\t\t\t\tid=\"userpwinput\" type=\"password\" name=\"user_pw\" /><span id=\"pwchk\"></span>\r\n");
      out.write("\t\t\t\t<div class=\"useridpwinfo\">* 영문자, 숫자, 특수문자를 포함하여 8자 이상 15자 이하로\r\n");
      out.write("\t\t\t\t\t입력하세요.</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"user_info_div\">\r\n");
      out.write("\t\t\t\t<span class=\"userinput_info\"><span class=\"required\">*</span>비밀번호확인</span><input\r\n");
      out.write("\t\t\t\t\tid=\"userpwreinput\" type=\"password\" name=\"user_pwre\" /><span\r\n");
      out.write("\t\t\t\t\tid=\"pwrechk\"></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"user_info_div\">\r\n");
      out.write("\t\t\t\t<span class=\"userinput_info\"><span class=\"required\">*</span>이름</span><input\r\n");
      out.write("\t\t\t\t\tid=\"usernameinput\" type=\"text\" name=\"user_name\" /><span\r\n");
      out.write("\t\t\t\t\tid=\"namechk\"></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"user_info_div\">\r\n");
      out.write("\t\t\t\t<span class=\"userinput_info\"><span class=\"required\">*</span>휴대폰\r\n");
      out.write("\t\t\t\t\t번호</span><input id=\"usertelinput\" type=\"text\" name=\"user_tel\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"ex) 01012341234\" /><span id=\"telchk\"></span>\r\n");
      out.write("\t\t\t\t<div class=\"useridpwinfo\">* 명의와 상관없이 실제 사용하시는 휴대폰 번호를 특수문자\r\n");
      out.write("\t\t\t\t\t'-'를 제외한 숫자만 입력해주세요</div>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"user_info_div\">\r\n");
      out.write("\t\t\t\t<span class=\"userinput_info\"><span class=\"required\">*</span>이메일</span><input\r\n");
      out.write("\t\t\t\t\tid=\"useremailinput\" type=\"text\" name=\"user_email1\"> @ <input\r\n");
      out.write("\t\t\t\t\tid=\"useremailinput\" type=\"text\" name=\"user_email2\" disabled>\r\n");
      out.write("\t\t\t\t<select name=\"email\" onchange=\"email_change()\">\r\n");
      out.write("\t\t\t\t\t<option value=\"0\">선택하세요</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"9\">직접입력</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"naver.com\">naver.com</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"nate.com\">nate.com</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"hanmail.net\">hanmail.net</option>\r\n");
      out.write("\t\t\t\t\t<option value=\"gmail.com\">gmail.com</option>\r\n");
      out.write("\t\t\t\t</select> <span id=\"emailchk\"></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"user_info_div\">\r\n");
      out.write("\t\t\t\t<span class=\"userinput_info\"><span class=\"required\">*</span>성별</span>\r\n");
      out.write("\t\t\t\t<label><input type=\"radio\" name=\"user_sex\" value=\"1\" />남성</label> <label><input\r\n");
      out.write("\t\t\t\t\ttype=\"radio\" name=\"user_sex\" value=\"2\" />여성</label>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"user_info_div\">\r\n");
      out.write("\t\t\t\t<span class=\"userinput_info\"><span class=\"required\">*</span>생년월일</span><input\r\n");
      out.write("\t\t\t\t\tid=\"userbirthinput\" type=\"date\" name=\"user_birth\"\r\n");
      out.write("\t\t\t\t\tplaceholder=\"ex) 19940723\" /><span id=\"birthchk\"></span>\r\n");
      out.write("\t\t\t\t<!--<div class=\"useridpwinfo\">* 주민등록번호와 상관없이 태어난 날짜를 작성해주세요 [예)19940723]</div>-->\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t\t\t<div class=\"user_info_div\">\r\n");
      out.write("\t\t\t\t<span class=\"userinput_info\"><span class=\"required\">*</span>추천인ID</span><input\r\n");
      out.write("\t\t\t\t\tid=\"userrecommend\" type=\"text\" name=\"user_rec\" /><span id=\"recchk\"></span>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t<script type=\"text/javascript\">\r\n");
      out.write("\t\t\t\t//email 관련\r\n");
      out.write("\t\t\t\tfunction email_change() {\r\n");
      out.write("\t\t\t\t\tif (document.joinpol.email.options[document.joinpol.email.selectedIndex].value == '0') {\r\n");
      out.write("\t\t\t\t\t\tdocument.joinpol.user_email2.disabled = true;\r\n");
      out.write("\t\t\t\t\t\tdocument.joinpol.user_email2.value = \"\";\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t\tjoinpol\r\n");
      out.write("\t\t\t\t\tif (document.joinpol.email.options[document.joinpol.email.selectedIndex].value == '9') {\r\n");
      out.write("\t\t\t\t\t\tdocument.joinpol.user_email2.disabled = false;\r\n");
      out.write("\t\t\t\t\t\tdocument.joinpol.user_email2.value = \"\";\r\n");
      out.write("\t\t\t\t\t\tdocument.joinpol.user_email2.focus();\r\n");
      out.write("\t\t\t\t\t} else {\r\n");
      out.write("\t\t\t\t\t\tdocument.joinpol.user_email2.disabled = true;\r\n");
      out.write("\t\t\t\t\t\tdocument.joinpol.user_email2.value = document.joinpol.email.options[document.joinpol.email.selectedIndex].value;\r\n");
      out.write("\t\t\t\t\t}\r\n");
      out.write("\t\t\t\t}\r\n");
      out.write("\t\t\t</script>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t\t\t<div id=\"sbmbtn_wrap\">\r\n");
      out.write("\t\t\t\t<button id=\"cancel_submit\" type=\"button\"\r\n");
      out.write("\t\t\t\t\tonclick=\"location.href='index.php';\">취소</button>\r\n");
      out.write("\t\t\t\t<button id=\"submitbtn\" type=\"button\"\r\n");
      out.write("\t\t\t\tonclick=\"location.href='JoinPro.jsp'\" >가입</button>\r\n");
      out.write("\t\t\t</div>\r\n");
      out.write("\t</div>\r\n");
      out.write("\t<div id=\"footer\">\r\n");
      out.write("\t\t[62265] 광주광역시 광산구 첨단내촌로 70번길 55(월계동 769-4) 404호<br>T :\r\n");
      out.write("\t\t062-374-7011 F : 062-374-7013 E : polinsight@gmail.com<br> <br>COPYRIGHT(C)\r\n");
      out.write("\t\t2019 POLINSIGHT. ALL RIGHTS RESERVED\r\n");
      out.write("\t</div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
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
