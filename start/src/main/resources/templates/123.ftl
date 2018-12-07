<!DOCTYPE html>  
<html>  
    <head>
        <title>Hello World!</title>
        <#include "/include/head.ftl"/>
        <link rel="stylesheet" type="text/css" href="${request.contextPath}/css/css.css" />
    </head>  
	<body>
		<#assign sex123="${sex}" />

		<#include "/macro/panel.ftl" />
		<#assign person="dasdas" />
		<@panel
			id="firstPanel"
			headClass="bg-danger"
			showFooter="true"
			footerContent="我是footer"
			title="我们"
			url="/include/table.ftl"
			options = "{
				'ddd' : 'dddddsads\"dasd'
			}"
		/>
		<input type="button" id="btn" value="点我" />
		<#if sex1234??>
		asdasda
		</#if>
       <#if sex123="1">
       	男
       <#elseif sex123="2">
       女
       <#else>
       无
       </#if>
       	<#list testList! as item>  
               标题：${item.title} , id${item.id}  
           <br>  
       </#list>  
       <#include "/include/footer.ftl"/>
       <script>
       	$(function() {
       		$("#btn").click(function() {
       			$("#firstPanel").panel("setTitle", "哈哈哈");
       		});
       	})
       </script>
    </body>  
</html>