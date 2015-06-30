<!--
    CompositeView consists of multiple atomic subviews. Each component could be managed independently.
-->
<html>
<body>
<jsp:include
  page="/jsp/CompositeView/javabean/banner.html"
  flush="true"/>
<table width="100%">
  <tr align="left" valign="middle">
    <td width="20%">
    <jsp:include
    page="/jsp/CompositeView/javabean/ProfilePane.jsp"
      flush="true"/>
    </td>
    <td width="70%" align="center">
    <jsp:include
      page="/jsp/CompositeView/javabean/mainpanel.jsp"
      flush="true"/>
    </td>
  </tr>
</table>
<jsp:include
  page="/jsp/CompositeView/javabean/footer.html"
    flush="true"/>
</body>
</html>