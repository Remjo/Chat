<%@ page errorPage="error.jsp" import="java.util.Set,java.util.Iterator,java.util.Map,chat.*"%>
<%
String username = request.getParameter("username");
%>

<HTML>
<HEAD>
<META http-equiv="pragma" content="no-cache">
<meta name="Author" content="Sukhwinder Singh (ssruprai@hotmail.com">	
<TITLE><%=username%>'s information</TITLE>
<LINK rel="stylesheet" href="<%=request.getContextPath()%>/chat.css" type="text/css">
</HEAD>

<BODY bgcolor="#FFFFFF">

<div align="center">
<center>
<table border="0" width="100%" cellpadding="0" cellspacing="0">
<tr>
	<TD valign="top"><h4>Username: </h4></td><TD valign="top"><%=username%></td>
</tr>


<tr><TD valign="top">&nbsp;</td>
<TD valign="top">
<form name="closing">
<input type="button" onClick="window.close()" value="Close">
</form>
</td>
<tr>
</table>
</center>
</div>

</BODY>
</HTML>