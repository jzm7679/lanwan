<!DOCTYPE html>
<html lang="zh-CN">
	<head>
    	<meta charset="utf-8">
    	<meta http-equiv="X-UA-Compatible" content="IE=edge">
    	<meta name="viewport" content="width=device-width, initial-scale=1">
    	<title>lanwan</title>
    	<link rel="stylesheet" href="${base}/plugins/bs3/css/bootstrap.min.css">
    	<script src="${base}/plugins/jquery/jquery-2.1.1.min.js"></script>
    	<script src="${base}/plugins/bs3/js/bootstrap.min.js"></script>
  	</head>
  	<body>
		<div class="container">
			<div class="row">
				<div class="col-md-12">
					<table class="table table-striped table-condensed table-hover">
						<thead>
							<tr>
								<th>#</th>
								<th>用户名</th>
								<th>手机号</th>
								<th>性别</th>
								<th>年龄</th>
							</tr>
						</thead>
						<tbody>
							<#list 1..5 as i>
							<tr>
								<th scope="row">${i}</th>
								<td>lw${i}</td>
								<td>1850251502${i}</td>
								<td><#if i%2 == 0>男<#else>女</#if></td>
								<td>2${i}</td>
							</tr>
							</#list>
						</tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>