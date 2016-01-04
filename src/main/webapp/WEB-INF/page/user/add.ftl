<!DOCTYPE html>
<html lang="en">
	<head>
		<meta charset="utf-8" />
		<title>新增员工</title>
		<meta name="keywords" content="lanwan" />
		<meta name="description" content="lanwan" />
		<meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<!-- 头部, 存放公用样式 -->
		<#include "../global/head.ftl">
		
		<style type="text/css">
		
		</style>
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
								新增员工
							</li>
						</ul><!-- .breadcrumb -->
					</div>
	
					<!-- 以下为正文内容 -->
					<div class="page-content">
						<div class="page-header">
							<h1>
								新增员工
								<small>
									 新增内部员工基本信息
								</small>
							</h1>
						</div><!-- /.page-header -->
						<div class="row">
							<div class="col-xs-12">
								<!-- PAGE CONTENT BEGINS -->
								<div class="row">
									<!-- 此处为各页面内容 -->
									<div class="col-md-12">
										<form class="form-horizontal">
											<div class="form-group">
												<label class="col-sm-2 control-label no-padding-right" for=""> 姓名</label>
												<div class="col-sm-10">
													<input type="text" id="" class="col-xs-10 col-sm-5" />
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label no-padding-right" for=""> 手机号</label>
												<div class="col-sm-10">
													<input type="text" id="" class="col-xs-10 col-sm-5" />
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label no-padding-right" for=""> 性别</label>
												<div class="col-sm-2">
													<div class="control-group">
														<div class="radio">
															<label>
																<input type="radio" class="ace" name="form-field-radio">
																<span class="lbl"> 男</span>
															</label>
														</div>
													</div>
												</div>
												<div class="col-sm-2">
													<div class="control-group">
														<div class="radio">
															<label>
																<input type="radio" class="ace" name="form-field-radio">
																<span class="lbl"> 女</span>
															</label>
														</div>
													</div>
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label no-padding-right" for=""> 角色</label>
												<div class="col-sm-10">
													<input type="text" id="" class="col-xs-10 col-sm-5" />
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label no-padding-right" for=""> 邮箱</label>
												<div class="col-sm-10">
													<input type="text" id="" class="col-xs-10 col-sm-5" />
												</div>
											</div>
											<div class="form-group">
												<label class="col-sm-2 control-label no-padding-right" for=""> 简介</label>
												<div class="col-sm-10">
													<input type="text" id="" class="col-xs-10 col-sm-5" />
												</div>
											</div>
											
											<div class="clearfix form-actions">
												<div class="col-md-offset-3 col-md-9">
													<button type="button" class="btn btn-sm btn-info">
														<i class="icon-ok bigger-110"></i>
														提交
													</button>
		
													&nbsp; &nbsp; &nbsp;
													<button type="reset" class="btn btn-sm">
														<i class="icon-undo bigger-110"></i>
														重置
													</button>
												</div>
											</div>
											
										</form>
									</div>
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

