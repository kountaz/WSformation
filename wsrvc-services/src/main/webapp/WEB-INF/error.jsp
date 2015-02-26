<%@ page isErrorPage="true" import="java.io.*" contentType="text/plain"%>

Erreur.

<% if (exception != null && exception.getMessage() != null) { %>
Message:
<%=exception.getMessage()%>
<% } %>
