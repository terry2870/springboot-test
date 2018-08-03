<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<jsp:include page="head.jsp" />
<%@ taglib prefix="t" uri="/my-tags" %>
<div class="container-fluid">
	<div class="row clearfix" id="topBanner" style="background-color: #337ab7;color: white">
		<!-- 顶部banner -->
		顶部banner new
	</div>
	<div class="row clearfix" style="margin-top: 4px">
		<!-- 左侧菜单 -->
		<div class="col-md-2 column" id="left">
			leftmenu
		</div>
		
		<!-- 页面主内容 -->
		<div class="col-md-10 column" id="body">
			<jsp:include page='<%=request.getParameter("bodyPage")%>' />
		</div>
	</div>
</div>

<jsp:include page="footer.jsp" />