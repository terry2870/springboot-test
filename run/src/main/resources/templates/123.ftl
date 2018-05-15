<!DOCTYPE html>  
<html>  
    <head>
        <title>Hello World!</title>
        <script src="${request.contextPath}/js/jquery-3.1.1.min.js"></script>
        <link rel="stylesheet" type="text/css" href="${request.contextPath}/css/css.css" />
    </head>  
    <body>
       <center>
       <p class="logo">
           welcome ${name} to freemarker!  
       </p>        
        
       <p>性别：  
           <#if sex==0>  
                  女  
           <#elseif sex==1>  
                  男  
           <#else>  
                  保密     
           </#if>  
        </p>
        
       <h4>我的好友：</h4>  
       
       
       
       	<#list friends! as item>  
               姓名：${item.title} , 年龄${item.id}  
           <br>  
       </#list>  
       </center>
    </body>  
</html>