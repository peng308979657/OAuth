<%@ page pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8") ;
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ request.getContextPath() + "/";
%>
<html>
<head>
	<base href="<%=basePath%>" />
	<title>OAuth服务端Token检测</title>
	<script type="text/javascript" src="jquery/jquery.min.js"></script> 
	<script type="text/javascript">
		var tokenUrl = "http://www.server.com/enterpriseauth-oauth-server/accessToken.action" ;
		var authCode = "f3d7bbe364b90a2e5818324e66696cf0" ;
		$(function(){ 
			$(tokenBut).on("click",function(){
				$.ajax({ 
					url: tokenUrl ,
					method: "post" ,
					dataType: "json" ,
					data: {
						client_id: "d0fde52c-538f-4e06-9c2f-363fe4321c7e" ,
						client_secret: "902be4ff-9a36-331d-9f71-afb604d07787" ,
						grant_type: "authorization_code" ,
						code: authCode ,
						redirect_uri: "http://www.client.com/enterpriseauth-oauth-client"
					} ,
					success: function(data){
						console.log(data) ;
					}
				}) ;
			}) ;
		})
	</script>
</head>
<body>
<button id="tokenBut">获取Token信息</button>
</body>
</html>