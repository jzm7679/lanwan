<!-- 分页 -->
<div class="row j-page-container">
    <div class="col-sm-6" style="margin-top: 6px">
        <div class="dataTables_info" id="sample-table-2_info">
            Showing 1 to 10 of 23 entries
        </div>
    </div>
    <div class="col-sm-6">
        <div class="dataTables_paginate paging_bootstrap">
            <ul class="pagination">
                <li class="prev disabled">
                    <a href="#">
                        <i class="icon-double-angle-left">
                        </i>
                    </a>
                </li>
                <#list 1..5 as p>
                <#if p == 1>
                <li class="active">
                    <a href="#">
                        ${p}
                    </a>
                </li>
                <#else>
                </#if>
                <li>
                    <a href="#">
                        ${p}
                    </a>
                </li>
                </#list>
                <li class="next">
                    <a href="#">
                        <i class="icon-double-angle-right">
                        </i>
                    </a>
                </li>
            </ul>
        </div>
    </div>
</div>