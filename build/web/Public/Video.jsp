<%-- 
    Document   : Video
    Created on : 02-abr-2018, 16:31:47
    Author     : YonePC
--%>

<%@page import="org.Curso"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>



<!DOCTYPE html>


<html>
    <head>
        <%@include file="../Header.jsp" %>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Video</title>
        <link rel="stylesheet" href="videoStyle.css">
    </head>
    <body>

   <% 
    if(request.getParameter("video") != null){
        String srcVideo = request.getParameter("video");
    
%>
<iframe width="420" height="345" src=<%=srcVideo%>></iframe>
<% } %>

</body>
</html>
