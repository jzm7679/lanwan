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
		
		<style type="text/css">
			.j-list>table>tbody>tr>td{vertical-align:middle;}
			.j-page-container{background-color: #eff3f8;padding-bottom: 5px;padding-top: 10px;}
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
									<div class="col-xs-12">
										<div class="form-horizontal">
											<div class="row">
												<div class="col-xs-4">
													<div class="form-group">
														<label class="col-xs-3 control-label no-padding-right" for="">姓名</label>
														<div class="col-xs-9">
															<input type="text" class="col-xs-12">
														</div>
													</div>
												</div>
												<div class="col-xs-4">
													<div class="form-group">
														<label class="col-xs-3 control-label no-padding-right" for="">手机号</label>
														<div class="col-xs-9">
															<input type="text" class="col-md-12">
														</div>
													</div>
												</div>
											</div><!--/.row-->
											<div class="row">
												<div class="">
													<div class="col-md-offset-2 col-md-10">
														<button class="btn btn-sm btn-info" type="button">查询</button>
													</div>
												</div>
											</div>
										</div>
									</div>									
								</div>
								
								<div class="hr hr-18 dotted hr"></div>
								
								<div class="row" style="padding-bottom: 15px;">
									<div class="col-xs-12">
										<a href="${base}/user/add" class="btn btn-xs btn-info">新增员工</a>
									</div>
								</div>
								
								<div class="row">
									<div class="j-list col-xs-12">
										<table class="table table-striped table-hover table-condensed">
											<thead>
												<tr>
													<th>工号</th>
													<th>头像</th>
													<th>姓名</th>
													<th>手机号</th>
													<th>性别</th>
													<th>角色</th>
													<th></th>
												</tr>
											</thead>
											<tbody>
												<#list 0..9 as i>
												<tr>
													<td>LW${i}</td>
													<td>
														<img class="nav-user-photo" src="${base}/plugins/ace/assets/avatars/user.jpg"  />
													</td>
													<td>赵${i}</td>
													<td>1850251502${i}</td>
													<td><#if i%2 == 0>女<#else>男</#if></td>
													<td>员工</td>
													<td>
														<a class="btn btn-minier btn-success no-radius" href="#">
															<i class="icon-eye-open bigger-100"></i>
															查看
														</a>
														<a class="btn btn-minier btn-primary no-radius" href="#">
															<i class="icon-edit bigger-100"></i>
															修改
														</a>
														<a class="btn btn-minier btn-purple no-radius" href="#">
															<i class="icon-edit bigger-100"></i>
															角色
														</a>
														<a class="btn btn-minier btn-danger no-radius" href="#">
															<i class="icon-edit bigger-100"></i>
															删除
														</a>
													</td>
												</tr>
												</#list>
											</tbody>
										</table>
									</div>	
								</div>
								<!-- 分页 -->
								<#include "../global/fenye.ftl">
								
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

