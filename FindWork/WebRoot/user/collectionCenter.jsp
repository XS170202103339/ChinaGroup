<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>收藏中心</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link href="<%=request.getContextPath() %>/css/delue/wangdelue.css" rel="stylesheet" type="text/css" />
 
  </head>
   
  <body> 
  <!-- 引入头部  -->
    <jsp:include page="/common/header.jsp"/>
    
  	
	<div class="wdld11">
		<div class="wdlC2">	
			<div style="background-color:#337ab7; height: 60px;">
			<p class="glyphicon glyphicon-th" style="width: 150px; margin: 10px 0px 0px 10px; font-size: 20px;color: white;">收藏中心</p>			
			<%-- <s:url id="backHome" action="backHomeAction" namespace="/" ></s:url> --%>
			<a href="backHomeAction.action" style="float: right;margin: 12px 20px ;"><p style="font-size: 20px;color: white;" class="glyphicon glyphicon-share-alt">返回</p></a>				
			</div>
			<div>
			 <s:url id="showbusiness" action="/FindWork/collection_showBusiness.action? page.current=1" namespace="/" />
			 <s:url id="showAdvertise" action="/FindWork/collection_advertise_showAdvertise.action? page.current=1" namespace="/" />
			<ul class="nav nav-tabs" style="margin-top: 0px; background-color: white;">
			  <li role="presentation"  ><a href="${showbusiness}" target="showCollection" class="glyphicon glyphicon-star">企业收藏夹</a></li>
			  <li role="presentation"><a href="${showAdvertise}" target="showCollection" class="glyphicon glyphicon-star-empty">招聘收藏夹</a></li>
			</ul>
			</div>
		</div>			
		<div class="wdlC14">
			<iframe name="showCollection" 
			frameborder=0 width=950 height=460
			marginheight=0 marginwidth=0 scrolling=no
			src="${showbusiness}"></iframe>
		</div>
	</div>
		
	   <!-- 引入底部 -->
    <jsp:include page="/common/footer.jsp"/>	
      <script src="<%=request.getContextPath() %>/resource/static/jquery/jquery.min.js"></script>
    <script src="<%=request.getContextPath() %>/resource/static/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script> 
  </body>
</html>
