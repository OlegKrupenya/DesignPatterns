<!--
View Helper adopts the model data to the presentation.
A view contains formatting code, delegating its processing responsibilities to the helper.
-->
<jsp:useBean id="welcomeHelper" scope="request"
  class="corepatterns.util.WelcomeHelper" />

<HTML>
<BODY bgcolor="FFFFFF">
<% if (welcomeHelper.nameExists())
{
%>
<center><H3> Welcome <b>
<jsp:getProperty name="welcomeHelper" property="name" />
</b><br><br> </H3></center>
<%
}
%>

<H4><center>Glad you are visiting our
  site!</center></H4>

</BODY>
</HTML>