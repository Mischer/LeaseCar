<%@ taglib prefix="s" uri="/struts-tags" %>
<html>
<body>

<s:property value="message"/>

<a href="<s:url action="Logout"/>">Logout</a>
<a href="<s:url action="Admin"/>">Admin</a>
<a href="<s:url action="User"/>">User</a>
</body>
</html>
