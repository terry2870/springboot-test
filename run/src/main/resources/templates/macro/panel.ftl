<#macro panel 
	id=""						<#-- panel  id -->
	title=""						<#-- panel 标题 -->
	panelClass=""				<#-- class -->
	panelStyle=""				<#-- 样式 -->
	headClass=""					<#-- head class -->
	headStyle=""					<#-- head 样式 -->
	headTitleSize=""				<#-- 标题的大小 （1，2，3） -->
	bodyClass=""					<#-- 内容 class -->
	bodyStyle=""					<#-- 内容样式 -->
	footerClass=""				<#-- footer class -->
	footerStyle=""				<#-- footer 样式 -->
	showFooter="false"			<#-- 是否显示 footer -->
	closeAble="false"			<#-- 是否显示关闭按钮 -->
	content=""					<#-- 内容 -->
	url=""						<#-- 从远端地址加载内容 -->
	footerContent=""				<#-- footer 内容 -->
	onClose="$.noop"				<#-- 当关闭的时候，执行的操作 -->
	options=""
>
	<#assign op = options ? eval />
	<div id="${id}" class="card ${panelClass!}" style="${panelStyle!}">
		<#if title?? && title != "">
			<div class="card-header ${headClass!}" style="${headStyle!}">
				<h${headTitleSize} class="card-title">
					${title}
					<#if closeAble == "true">
						<a class="close">&times;</a>
					</#if>
				</h${headTitleSize}>
			</div>
		</#if>
		<div class="card-body ${bodyClass}" style="${bodyStyle}">
			<#if content?? && content != "">
				${content}
			<#elseif url?? && url != "">
				<#include "${url}" />
			</#if>
		</div>
		<#if showFooter == "true">
			<div class="card-footer ${footerClass}" style="${footerStyle}">
				${footerContent}
			</div>
		</#if>
	</div>
<script>
	$(function() {
		$("#${id}").panel({
			closeAble : ${closeAble},
			onClose : ${onClose!}
		});
	});
</script>
</#macro>
