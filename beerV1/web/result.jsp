<%@ page import="java.util.*" %>

<html>
	<body>
		<h1 align="center">Beer recommedition jsp</h1>

		<p>
			<%
				List styles = (List)request.getAttribute("styles");
				Iterator it = styles.iterator();

				while(it.hasNext()){
					out.println("try: " + it.next());
			}
			%>
		</p>
	</body>
</html>