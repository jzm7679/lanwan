<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>员工设置</title>
		<meta name="keywords" content="lanwan" />
		<meta name="description" content="lanwan" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<!-- 头部, 存放公用样式 -->
		<#include "../global/head.ftl">
	</head>

	<body>
		<!-- 顶部 -->
		<#include "../global/top.ftl">
		
		<div class="main-container" id="main-container">
			<script type="text/javascript">
				try{ace.settings.check('main-container' , 'fixed')}catch(e){}
			</script>

			<div class="main-container-inner">
				<!-- 左侧菜单 -->
				<#include "../global/menu.ftl">
				
				<div class="main-content">
					<div class="breadcrumbs" id="breadcrumbs">
						<script type="text/javascript">
							try{ace.settings.check('breadcrumbs' , 'fixed')}catch(e){}
						</script>

						<ul class="breadcrumb">
							<li>
								<i class="icon-home home-icon"></i>
								<a href="#">首页</a>
							</li>
							<li class="">
								基础设置
							</li>
							<li class="active">
								员工设置
							</li>
							
						</ul><!-- .breadcrumb -->
					</div>
	
					<!-- 以下为正文内容 -->
					<div class="page-content">
						<div class="page-header">
							<h1>
								员工设置
								<small>
									设置员工基本信息		 
								</small>
							</h1>
						</div><!-- /.page-header -->
						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
								<div class="row">
									
									
									
								</div>
								<!-- PAGE CONTENT ENDS -->
							</div><!-- /.col -->
						</div><!-- /.row -->
					</div><!-- /.page-content -->
					
				</div><!-- /.main-content -->
			</div><!-- /.main-container-inner -->

		</div><!-- /.main-container -->

		<!-- 底部,存放公用JS -->
		<#include "../global/foot.ftl">
		
	</body>
</html>

