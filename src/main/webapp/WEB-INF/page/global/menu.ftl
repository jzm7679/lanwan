<a class="menu-toggler" id="menu-toggler" href="#">
	<span class="menu-text"></span>
</a>
<div class="sidebar" id="sidebar">
	<script type="text/javascript">
		try{ace.settings.check('sidebar' , 'fixed')}catch(e){}
	</script>

	<div class="sidebar-shortcuts" id="sidebar-shortcuts">
		<div class="sidebar-shortcuts-large" id="sidebar-shortcuts-large">
			<button class="btn btn-success">
				<i class="icon-signal"></i>
			</button>

			<button class="btn btn-info">
				<i class="icon-pencil"></i>
			</button>

			<button class="btn btn-warning">
				<i class="icon-group"></i>
			</button>

			<button class="btn btn-danger">
				<i class="icon-cogs"></i>
			</button>
		</div>

	</div><!-- #sidebar-shortcuts -->

	
	<ul class="nav nav-list">
		<li class="active">
			<a href="${base}/index">
				<i class="icon-dashboard"></i>
				<span class="menu-text"> 控制台 </span>
			</a>
		</li>

		<li>
			<a href="#">
				<i class="icon-desktop"></i>
				<span class="menu-text"> 前台营业</span>
			</a>
		</li>

		<li>
			<a href="#" class="dropdown-toggle">
				<i class="icon-bullhorn"></i>
				<span class="menu-text"> 营销预订 </span>
			</a>
		</li>

		<li>
			<a href="#" class="dropdown-toggle">
				<i class="icon-lightbulb"></i>
				<span class="menu-text"> 点菜app </span>
			</a>
		</li>

		<li>
			<a href="#" class="dropdown-toggle">
				<i class=" icon-hdd"></i>
				<span class="menu-text"> 后台打印 </span>
			</a>
		</li>

		<li>
			<a href="#">
				<i class="icon-bell-alt"></i>
				<span class="menu-text"> 短信提醒</span>
			</a>
		</li>

		<li>
			<a href="#">
				<i class="icon-eye-open"></i>
				<span class="menu-text"> 管理稽查 </span>
			</a>
		</li>

		<li>
			<a href="#" class="dropdown-toggle">
				<i class="icon-group"></i>
				<span class="menu-text"> 会员管理 </span>
				<b class="arrow icon-angle-down"></b>
			</a>
			<ul class="submenu">
				<li>
					<a href="#">
						<i class="icon-double-angle-right"></i>
						会员列表
					</a>
				</li>
			</ul>
		</li>

		<!-- 系统设置 begin -->
		<li class="active open">
			<a href="#" class="dropdown-toggle">
				<i class="icon-cogs"></i>
				<span class="menu-text"> 系统设置</span>
				<b class="arrow icon-angle-down"></b>
			</a>
			<ul class="submenu">
				<li class="active">
					<a href="#" class="dropdown-toggle">
						<i class="icon-double-angle-right"></i>
						基础设置
						<b class="arrow icon-angle-down"></b>
					</a>
					<ul class="submenu">
						<li class="active">
							<a href="${base}/user/list">
								<i class="glyphicon glyphicon-user"></i>
								员工设置
							</a>
						</li>
						<li>
							<a href="#">
								<i class="icon-credit-card"></i>
								付款方式
							</a>
						</li>
					</ul>
				</li>
				
				<li>
					<a href="#" class="dropdown-toggle">
						<i class="icon-double-angle-right"></i>
						菜品设置
						<b class="arrow icon-angle-down"></b>
					</a>
					<ul class="submenu">
						<li>
							<a href="#">
								<i class="glyphicon glyphicon-th-list"></i>
								菜品列表
							</a>
						</li>
						<li>
							<a href="#">
								<i class="icon-food"></i>
								菜品类型
							</a>
						</li>
					</ul>
				</li>

			</ul>
		</li>
		<!-- 系统设置 end -->
		
	</ul>

	<div class="sidebar-collapse" id="sidebar-collapse">
		<i class="icon-double-angle-left" data-icon1="icon-double-angle-left" data-icon2="icon-double-angle-right"></i>
	</div>

	<script type="text/javascript">
		try{ace.settings.check('sidebar' , 'collapsed')}catch(e){}
	</script>
</div>