<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<%@ include file="exp/header.jsp"%>

<div class="easyui-layout" data-options="fit:true">

	<div data-options="region:'west',split:true,title:'区域'" style="width:200px">
		<div class="easyui-layout" data-options="fit:true">
			<div data-options="region:'center',border:false">
				<ul id="region_tree" class="ztree"></ul>
			</div>
		</div>
	</div>

	<div data-options="region:'center',title:'报警管理'">
		<div class="easyui-layout" data-options="fit:true">
			<div data-options="region:'center',border:false">
				<div id="alarm_tabs" class="easyui-tabs" data-options="tabPosition:'bottom'" style="height:auto" fit="true">

					<div title="摄像机报警">
						<table id="dg_camera"></table>
						<div id="camera_toolbar" style="display: none;">
							<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add-t" plain="true" onclick="opendlg_camera()">添加</a>
							<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove-t" plain="true" onclick="delAlarmCfg()">删除</a>
							<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit-t" plain="true" onclick="changeAlarmLevel(0,1)">一般告警</a>
							<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit-t" plain="true" onclick="changeAlarmLevel(1,1)">严重告警</a>
						</div>

			<!-- 告警配置对话框 -->
			<div id="dlg_cam" class="easyui-dialog" title="摄像机告警信息" style="display:none;width:480px;height:480px;" data-options="closed:true,iconCls:'ico i-add',resizable:true,modal:true,buttons:[{
				text:'保存',
				handler:function(){
				    save_camera_alarm_cfg();
				}
			},{
				text:'取消',
				handler:function(){$('#dlg_cam').dialog('close')}
			}]">
			
			         <ul id="camrea_tree"  class="ztree"></ul>
					</div>
					
			<!-- 告警联动配置对话框 -->		
					
			<div id="dlg_linkage" class="easyui-dialog" title="摄像机告警信息" style="display:none;width:480px;height:640px;" data-options="closed:true,iconCls:'ico i-add',resizable:true,modal:true,buttons:
				[{
					text:'取消',
					handler:function(){$('#dlg_linkage').dialog('close')}
				}]">
				<div class="easyui-layout" data-options="fit:true">
					<div data-options="region:'north',title:'告警信息',collapsible:false" style="height:100px;">
					<div style="margin-bottom:5px;margin-top:5px;margin-left:5px;">
							<input class="easyui-textbox" label="摄像机名称：" id="camera_name" name="camera_name" labelPosition="left" data-options="readonly:true" style="width:250px;height:24px">
						</div>
						<div style="margin-bottom:5px;margin-left:5px;" id="password_div">
							<input class="easyui-textbox" label="报警类型：" id="alarm_type" name="alarm_type" labelPosition="left" data-options="readonly:true" style="width:250px;height:24px">
						</div>
					</div>
    				<div data-options="region:'center',title:'告警联动'">
    					<div id="tt" class="easyui-tabs" data-options="fit:true">
				    <div title="摄像机预置位" >
				         <table id="camera_preset"></table>
				         <div id="camera_preset_tools" style="display: none;">
				         	<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add-t" plain="true" onclick="add_camera_preset_linkage()">添加</a>
							<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove-t" plain="true" onclick="del_camera_preset_linkage()">删除</a>
							<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit-t" plain="true" onclick="changeRecordLinkage(1)">关联录像</a>
							<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit-t" plain="true" onclick="changeRecordLinkage(0)">取消录像</a>
				         </div>
				         
				         <div id="dlg_camera_preset" class="easyui-dialog" title="摄像机预置位信息" style="display:none;width:360px;height:480px;" data-options="closed:true,iconCls:'ico i-add',resizable:true,modal:true,buttons:[{
							text:'保存',
							handler:function(){
								save_camera_preset_linkage();
							} 
							},{
								text:'取消',
								handler:function(){$('#dlg_camera_preset').dialog('close')}
							}]">
			
			         		<ul id="camrea_preset_tree"  class="ztree"></ul>
						</div>
				    </div>
				    <div title="告警输出" >
				        <table id="alarm_out"></table>
				         <div  id="alarm_out_tools">
				         <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add-t" plain="true" onclick="">添加</a>
						 <a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove-t" plain="true" onclick="">删除</a>
						 </div>
						 
						 <div id="dlg_alarm_out" class="easyui-dialog" title="报警输出" style="display:none;width:360px;height:480px;" data-options="closed:true,iconCls:'ico i-add',resizable:true,modal:true,buttons:[{
							text:'保存',
							handler:function(){
							}
							},{
								text:'取消',
								handler:function(){$('#dlg_camera_preset').dialog('close')}
							}]">
			
			         		<ul id="alarm_out_tree"  class="ztree"></ul>
						</div>
						 
				    </div>
   
				</div>
    				
    				</div>
				</div>
			</div>		

				</div>

				<div title="IO报警">
					<table id="dg_io"></table>
					<div id="io_toolbar" style="display: none;">
						<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add-t" plain="true" onclick="opendlg_io()">添加</a>
						<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove-t" plain="true" onclick="delIoAlarmCfg()">删除</a>
						<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit-t" plain="true" onclick="changeAlarmLevel(0,2)">一般告警</a>
						<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit-t" plain="true" onclick="changeAlarmLevel(1,2)">严重告警</a>
					</div>
			<div id="dlg_io" class="easyui-dialog" title="IO告警信息" style="display:none;width:480px;height:480px;" data-options="closed:true,iconCls:'ico i-add',resizable:true,modal:true,buttons:[{
				text:'保存',
				handler:function(){
				   save_io_alarm_cfg();
				} 
			},{
				text:'取消',
				handler:function(){$('#dlg_io').dialog('close')}
			}]">
			
				<ul id="io_tree"  class="ztree"></ul>
			
		    </div>
				</div>

				<div title="环境量报警">
					<table id="dg_env"></table>
					<div id="env_toolbar" style="display: none;">
						<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-add-t" plain="true" onclick="opendlg_env()">添加</a>
						<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-remove-t" plain="true" onclick="delEnvAlarmCfg()">删除</a>
						<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit-t" plain="true" onclick="changeAlarmLevel(0,3)">一般告警</a>
						<a href="javascript:void(0)" class="easyui-linkbutton" iconCls="icon-edit-t" plain="true" onclick="changeAlarmLevel(1,3)">严重告警</a>
					</div>
					
						<div id="dlg_env" class="easyui-dialog" title="环境量告警信息" style="display:none;width:480px;height:480px;" data-options="closed:true,iconCls:'ico i-add',resizable:true,modal:true,buttons:[{
				text:'保存',
				handler:function(){
				   save_env_alarm_cfg();
				}
			},{
				text:'取消',
				handler:function(){$('#dlg_env').dialog('close')}
			}]">
					<ul id="env_tree"  class="ztree"></ul>
			
					</div>
				</div>

			</div>
		</div>

	</div>
</div>
</div>

<script>
	
	var _region_id = 0;
	var  _camera_cfg_id = 0;
	
	function opendlg_camera()
	{
		var treeObj = $.fn.zTree.getZTreeObj("region_tree");
		var nodes = treeObj.getSelectedNodes(true);
		if(nodes.length==0){
			top.$.messager.alert('提示信息', '请选择一个区域!');
			return ;
		}
		_region_id = nodes[0].id;
        
		var treeObj = $.fn.zTree.getZTreeObj("camrea_tree");
		treeObj.reAsyncChildNodes(null, "refresh");
		
		$('#dlg_cam').dialog('open');	
	}
	
	
	function opendlg_io()
	{
		var treeObj = $.fn.zTree.getZTreeObj("region_tree");
		var nodes = treeObj.getSelectedNodes(true);
		if(nodes.length==0){
			top.$.messager.alert('提示信息', '请选择一个区域!');
			return ;
		}
		_region_id = nodes[0].id;
        
		var treeObj = $.fn.zTree.getZTreeObj("io_tree");
		treeObj.reAsyncChildNodes(null, "refresh");
		$('#dlg_io').dialog('open');	
	}
	
	
	function opendlg_env()
	{
	   		var treeObj = $.fn.zTree.getZTreeObj("region_tree");
		var nodes = treeObj.getSelectedNodes(true);
		if(nodes.length==0){
			top.$.messager.alert('提示信息', '请选择一个区域!');
			return ;
		}
		_region_id = nodes[0].id;
        
		var treeObj = $.fn.zTree.getZTreeObj("env_tree");
		treeObj.reAsyncChildNodes(null, "refresh");
	
		$('#dlg_env').dialog('open');	
	}
	
	function init_region_tree() {
		var region_setting = {
			data: {
				simpleData: {
					enable: true,
					idKey: "id",
					pIdKey: "pid",
					rootPId: 1
				}
			},
			async: {
				enable: true,
				dataType: "json",
				url: "../region/region_tree"
			},
			callback: {
				onClick: zTreeOnClick
			}
		};
		$.fn.zTree.init($("#region_tree"), region_setting);
	}

	function init_camrea_preset_tree() {
		var preset_setting = {
			data: {
				simpleData: {
					enable: true,
					idKey: "id",
					pIdKey: "pid",
					rootPId: 1
				}
			},
			async: {
				enable: true,
				dataType: "json",
				url: "camera_preset_tree"
			},
			callback: {
				
			},
			check: {
				enable: true,
				chkStyle: "radio",
				radioType: "level"
			}
		
		};
		$.fn.zTree.init($("#camrea_preset_tree"), preset_setting);
	}



	function zTreeOnClick(event, treeId, treeNode) {
		_region_id = treeNode.id;
		$('#dg_camera').datagrid('reload');
		$('#dg_io').datagrid('reload');
		$('#dg_env').datagrid('reload');
	};

	
	function init_camera_tree() {
		var cam_setting = {
			data: {
				simpleData: {
					enable: true,
					idKey: "id",
					pIdKey: "pid",
					rootPId: 1
				}
			},
			async: {
				enable: true,
				dataType: "json",
				url: "camera_tree"
			},
			check: {
				enable: true
			},
			callback: {}
		};
		$.fn.zTree.init($("#camrea_tree"), cam_setting);
	}
	
	function init_io_tree() {
		var io_setting = {
			data: {
				simpleData: {
					enable: true,
					idKey: "id",
					pIdKey: "pid",
					rootPId: 1
				}
			},
			async: {
				enable: true,
				dataType: "json",
				url: "io_tree"
			},
			check: {
				enable: true
			},
			callback: {}
		};
		$.fn.zTree.init($("#io_tree"), io_setting);
	}
	
	function init_env_tree() {
		var env_setting = {
			data: {
				simpleData: {
					enable: true,
					idKey: "id",
					pIdKey: "pid",
					rootPId: 1
				}
			},
			async: {
				enable: true,
				dataType: "json",
				url: "env_tree"
			},
			check: {
				enable: true
			},
			callback: {}
		};
		$.fn.zTree.init($("#env_tree"), env_setting);
	}
	
	
	
	
	function  save_camera_alarm_cfg()
	{
		var treeObj = $.fn.zTree.getZTreeObj("camrea_tree");
		var nodes = treeObj.getCheckedNodes(true);
		if(nodes.length < 1){
			top.$.messager.alert('提示信息', '请选择至少提条告警类型!');
			return ;
		}
		var param ='';
		for(var i=0; i<nodes.length;i++ )
		{
		    var node = nodes[i];
			if( node.check_Child_State == -1 && node.realId !== 0 )
			{
				param += node.resCode +'_'+node.realId+',';
			}
		}
		param = param.substring(0,param.length-1);
		
		$.ajax({
			type: 'POST',
			url: 'add_camera_alarm_cfg',
			dataType: 'json',
			data: { params : param,region_id:_region_id },
			success: function(data, textStatus) {
				top.$.messager.alert('提示信息', '添加告警配置成功!');
				$('#dg_camera').datagrid('reload');
				$('#dlg_cam').dialog('close');
			},
			error: function() {
				top.$.messager.alert('错误', '服务器错误!');
			}
		});

	}
	
	
	function  save_io_alarm_cfg()
	{
		var treeObj = $.fn.zTree.getZTreeObj("io_tree");
		var nodes = treeObj.getCheckedNodes(true);
		if(nodes.length < 1){
			top.$.messager.alert('提示信息', '请选择至少提条告警类型!');
			return ;
		}
		var param ='';
		for(var i=0; i<nodes.length;i++ )
		{
		    var node = nodes[i];
			if( node.check_Child_State == -1 && node.realId !== 0 )
			{
				param += node.resCode +'_'+node.realId+',';
			}
		}
		param = param.substring(0,param.length-1);
		
		$.ajax({
			type: 'POST',
			url: 'add_io_alarm_cfg',
			dataType: 'json',
			data: { params : param,region_id:_region_id },
			success: function(data, textStatus) {
				top.$.messager.alert('提示信息', '添加告警配置成功!');
				$('#dg_io').datagrid('reload');
				$('#dlg_io').dialog('close');
			},
			error: function() {
				top.$.messager.alert('错误', '服务器错误!');
			}
		});
	}
	
	function  save_env_alarm_cfg()
	{
		var treeObj = $.fn.zTree.getZTreeObj("env_tree");
		var nodes = treeObj.getCheckedNodes(true);
		if(nodes.length < 1){
			top.$.messager.alert('提示信息', '请选择至少提条告警类型!');
			return ;
		}
		var param ='';
		for(var i=0; i<nodes.length;i++ )
		{
		    var node = nodes[i];
			if( node.check_Child_State == -1 )
			{
				param += node.resCode +'_'+node.realId+',';
			}
		}
		param = param.substring(0,param.length-1);
		
		$.ajax({
			type: 'POST',
			url: 'add_env_alarm_cfg',
			dataType: 'json',
			data: { params : param,region_id:_region_id },
			success: function(data, textStatus) {
				top.$.messager.alert('提示信息', '添加告警配置成功!');
				$('#dg_env').datagrid('reload');
				$('#dlg_env').dialog('close');
			},
			error: function() {
				top.$.messager.alert('错误', '服务器错误!');
			}
		});
	}
	
	
	
	function  delAlarmCfg()
	{
		var  nodes = $('#dg_camera').datagrid("getChecked");
		if(nodes.length < 1){
			top.$.messager.alert('提示信息', '请选择至少选择一条记录!');
			return ;
		}
		
		var  ids = '';
		for(var i=0; i < nodes.length; i++){
			ids +=nodes[i].id+',';
		}
		ids = ids.substring(0,ids.length-1);
		
		top.$.messager.confirm('删除告警配置', '请确认 是否要删除告警配置    ?', function(flag) {
			if(flag) {
				$.ajax({
					type: 'POST',
					url: 'delAlarmCfg',
					dataType: 'json',
					data: {ids:ids},
					success: function(data, textStatus) {
						top.$.messager.alert('提示信息', '删除告警配置成功!');
						$('#dg_camera').datagrid('reload');
					},
					error: function() {
						top.$.messager.alert('错误', '服务器错误!');
					}
				});
			}
		});
		
	}
	
	
	function  delIoAlarmCfg()
	{
		var  nodes = $('#dg_io').datagrid("getChecked");
		if(nodes.length < 1){
			top.$.messager.alert('提示信息', '请选择至少选择一条记录!');
			return ;
		}
		var  ids = '';
		for(var i=0; i < nodes.length; i++){
			ids +=nodes[i].id+',';
		}
		ids = ids.substring(0,ids.length-1);
		
		top.$.messager.confirm('删除告警配置', '请确认 是否要删除告警配置    ?', function(flag) {
			if(flag) {
				$.ajax({
					type: 'POST',
					url: 'delIoAlarmCfg',
					dataType: 'json',
					data: {ids:ids},
					success: function(data, textStatus) {
						top.$.messager.alert('提示信息', '删除告警配置成功!');
						$('#dg_io').datagrid('reload');
					},
					error: function() {
						top.$.messager.alert('错误', '服务器错误!');
}
});
}
});

}


function  delEnvAlarmCfg()
	{
		var  nodes = $('#dg_env').datagrid("getChecked");
		if(nodes.length < 1){
			top.$.messager.alert('提示信息', '请选择至少选择一条记录!');
			return ;
		}
		var  ids = '';
		for(var i=0; i < nodes.length; i++){
			ids +=nodes[i].id+',';
		}
		ids = ids.substring(0,ids.length-1);
		
		top.$.messager.confirm('删除告警配置', '请确认 是否要删除告警配置    ?', function(flag) {
			if(flag) {
				$.ajax({
					type: 'POST',
					url: 'delIoAlarmCfg',
					dataType: 'json',
					data: {ids:ids},
					success: function(data, textStatus) {
						top.$.messager.alert('提示信息', '删除告警配置成功!');
						$('#dg_env').datagrid('reload');
					},
					error: function() {
						top.$.messager.alert('错误', '服务器错误!');
}
});
}
});

}





function changeAlarmLevel(level,type) {
	var nodes = null;
	if(type ==1){
	   nodes = $('#dg_camera').datagrid("getChecked");
	}else if(type==2){
	   nodes = $('#dg_io').datagrid("getChecked");
	}else{ 
	   nodes = $('#dg_env').datagrid("getChecked");
	}
	
	if(nodes.length < 1) {
		top.$.messager.alert('提示信息', '请选择至少选择一条记录!');
		return;
	}
	var ids = '';
	for(var i = 0; i < nodes.length; i++) {
		ids += nodes[i].id + ',';
	}
	ids = ids.substring(0, ids.length - 1);

	top.$.messager.confirm('修改告警级别', '请确认 是否要修改告警级别    ?', function(flag) {
		if(flag) {
			$.ajax({
				type: 'POST',
				url: 'changeAlarmLevel',
				dataType: 'json',
				data: { level: level, ids: ids },
				success: function(data, textStatus) {
					top.$.messager.alert('提示信息', '修改告警级别成功!');
					$('#dg_camera').datagrid('reload');
					$('#dg_io').datagrid('reload');
					$('#dg_env').datagrid('reload');
				},
				error: function() {
					top.$.messager.alert('错误', '服务器错误!');
				}
			});
		}
	});

}



function get_camera_alarm_type_str(value) {

	if(value == 1) {
		return'设备失效';
	} else if(value == 2) {
		return '视频遮挡告警';
	} else if(value == 3) {
		return '视频丢失告警';
	} else if(value == 4) {
		return '视频移动侦测告警';
}

}

function add_camera_preset_linkage()
{
	var treeObj = $.fn.zTree.getZTreeObj("camrea_preset_tree");
	treeObj.reAsyncChildNodes(null, "refresh");

   $('#dlg_camera_preset').dialog('open');
}

function del_camera_preset_linkage()
{
	var  nodes = $('#camera_preset').datagrid("getChecked");
		if(nodes.length < 1){
			top.$.messager.alert('提示信息', '请选择至少选择一条记录!');
			return ;
		}
		
		var  ids = '';
		for(var i=0; i < nodes.length; i++){
			ids +=nodes[i].id+',';
		}
		ids = ids.substring(0,ids.length-1);
		
		top.$.messager.confirm('删除告警配置', '请确认 是否要删除告警配置    ?', function(flag) {
			if(flag) {
				$.ajax({
					type: 'POST',
					url: 'del_camera_preset_linkage',
					dataType: 'json',
					data: {ids:ids},
					success: function(data, textStatus) {
						top.$.messager.alert('提示信息', '删除告警配置成功!');
						$('#camera_preset').datagrid('reload');
					},
					error: function() {
						top.$.messager.alert('错误', '服务器错误!');
					}
				});
			}
		});
		
}


function changeRecordLinkage(is_record)
{
		var  nodes = $('#camera_preset').datagrid("getChecked");
		if(nodes.length < 1){
			top.$.messager.alert('提示信息', '请选择至少选择一条记录!');
			return ;
		}
		
		var  ids = '';
		for(var i=0; i < nodes.length; i++){
			ids +=nodes[i].id+',';
		}
		ids = ids.substring(0,ids.length-1);
		
		top.$.messager.confirm('修改是否关联录像', '请确认 是否要修改告警关联录像    ?', function(flag) {
			if(flag) {
				$.ajax({
					type: 'POST',
					url: 'changeRecordLinkage',
					dataType: 'json',
					data: {ids:ids, is_record: is_record},
					success: function(data, textStatus) {
						top.$.messager.alert('提示信息', '修改告警关联录像成功!');
						$('#camera_preset').datagrid('reload');
					},
					error: function() {
						top.$.messager.alert('错误', '服务器错误!');
					}
				});
			}
		});
}

function save_camera_preset_linkage()
{
	var treeObj = $.fn.zTree.getZTreeObj("camrea_preset_tree");
	var nodes = treeObj.getCheckedNodes(true);
	var preset_ids = '';
	for(var i=0;i<nodes.length;i++)
	{
		var node = nodes[i];
		if(node.realId != 0 && node.check_Child_State ==-1 ){
		   preset_ids += node.realId + ',';
		}
	}
	if(preset_ids == ''){
	    top.$.messager.alert('提示信息', '请至少选择一个摄像机预置位!');
		return;
	}else{
	   preset_ids = preset_ids.substring(0,(preset_ids.length -1));
	}
	$.ajax({
		type: 'POST',
		url: 'save_camera_preset_linkage',
		dataType: 'json',
		data: { ids: preset_ids,cfg_id: _camera_cfg_id },
		success: function(data, textStatus) {
		    $('#dlg_camera_preset').dialog('close');
		    $('#camera_preset').datagrid("reload");
		    
		    top.$.messager.alert('提示信息', '关联预置位配置成功!');
		},
		error: function() {
			top.$.messager.alert('错误', '服务器错误!');
		}
	});
}


function alarmLinkage(id,type) {
	_camera_cfg_id = id;
	$.ajax({
		type: 'POST',
		url: 'getAlarmCfgById',
		dataType: 'json',
		data: { id: id  , type :type},
		success: function(data, textStatus) {
			$('#camera_name').textbox('setValue', data.name);
			$('#alarm_type').textbox('setValue', get_camera_alarm_type_str(data.alarm_type));
			$('#camera_preset').datagrid('reload');
			$('#dlg_linkage').dialog('open');
		},
		error: function() {
			top.$.messager.alert('错误', '服务器错误!');
		}
	});
}

function init_camera_preset() {
	$('#camera_preset').datagrid({
			url: 'get_camera_linkage_preset',
			fitColumns: true,
			fit: true,
			columns: [
				[
					{ field: 'ck', checkbox: true, width: 20 },
					{ field: 'name', title: '摄像机名称', width: 150 },
					{ field: 'preset_index', title: '预置位', width: 50},
					{ field: 'index_name', title: '预置位名称', width: 120},
					{ field: 'is_record', title: '关联录像', width: 50, formatter: function(value, row, index){
						if(value==0){
							return '否';
						}else{
							return '是';
						}
					}}
				]
			],
			onBeforeLoad: function(param) {
				param.queryMap = {
					cfg_id:_camera_cfg_id
				};
			},
			toolbar: '#camera_preset_tools',
			pagination: false,
			rownumbers: false,
			border: false,
			singleSelect: false
		});
	}
	
	function init_alarm_out() {
		$('#alarm_out').datagrid({
			url: '',
			fitColumns: true,
			fit: true,
			columns: [
				[
					{ field: 'ck', checkbox: true, width: 20 },
					{ field: 'name', title: '名称', width: 150 },
					{ field: 'alarm_type', title: '区域', width: 150}
				]
			],
			onBeforeLoad: function(param) {
				param.queryMap = {};
			},
			onClickRow: function(index, row) {

			},
			toolbar: '#alarm_out_tools',
			pagination: false,
			rownumbers: false,
			border: false,
			singleSelect: false
		});
	}
	
	
	
	function init_dg_camera() {
		$('#dg_camera').datagrid({
			url: 'getCameraCfg',
			fitColumns: true,
			fit: true,
			columns: [
				[
					{ field: 'ck', checkbox: true, width: 20 },
					{ field: 'name', title: '摄像机名称', width: 150 ,formatter:function(value,row,index){
						return '<a href="javascript:void(0);" onclick="alarmLinkage('+row.id+',1)">'+value+'</a>';
					}
					},
					{ field: 'alarm_type', title: '报警类型', width: 150 ,formatter: function(value, row, index) {
                  	  if(value==1){
                		  return  '设备失效';
                	  }else if(value==2){
                		  return  '视频遮挡告警';
                	  }else if(value==3){
                		  return '视频丢失告警';
                	  }else if(value==4){
                		  return '视频移动侦测告警';
                	  }
                  }},
					{ field: 'alarm_level', title: '报警级别', width: 50 
                      ,
                      formatter: function(value, row, index) {
                    	  if(value==0){
                    		  return  '一般告警';
                    	  }else{
                    		  return  '严重告警';
                    	  }
                      }
					}
				]
			],
			onBeforeLoad: function(param) {
				param.queryMap = {
						region_id : _region_id
						
				};
			},
			onClickRow: function(index, row) {

			},
			toolbar: '#camera_toolbar',
			pagination: false,
			rownumbers: false,
			border: false,
			singleSelect: false
		});
	}

	function init_dg_io() {
		$('#dg_io').datagrid({
			url: 'getIoCfg',
			fit: true,
			fitColumns: true,
			columns: [
				[
					{ field: 'ck', checkbox: true, width: 20 },
					{ field: 'name', title: 'IO设备名称', width: 150 ,formatter:function(value,row,index){
						return '<a href="javascript:void(0);" onclick="alarmLinkage('+row.id+',2)">'+value+'</a>';
					}
					},
					{ field: 'alarm_type', title: '报警类型', width: 150 ,formatter: function(value, row, index) 
						{
							 if(value==1){
                		  		return  '设备失效';
                	  		}else if(value==4){
                		  		return  '水浸告警';
                	  		}else if(value==5){
                		  		return '红外探测告警';
                	  		}else if(value==7){
                			  	return '新增设备告警';
                	  		}else if(value==8){
                			  	return '烟雾传感器告警';
                	  		}else if(value==10){
                			  	return '通风设备告警';
                	  		}else if(value==14){
                			  	return '电子围栏告警';
                	  		}else if(value==15){
                			  	return '火灾报警系统告警';
                	  		}
						}
					},
					{ field: 'alarm_level', title: '报警级别', width: 50 ,formatter: function(value, row, index) {
                    	  if(value==0){
                    		  return  '一般告警';
                    	  }else{
                    		  return  '严重告警';
                    	  }
                      }
					}
				]
			],
			onBeforeLoad: function(param) {
				param.queryMap = {	region_id : _region_id };
			},
			onClickRow: function(index, row) {

			},
			toolbar: '#io_toolbar',
			pagination: false,
			rownumbers: false,
			border: false,
			singleSelect: false
		});
	}

	function init_dg_env() {
		$('#dg_env').datagrid({
			url: 'getEnvCfg',
			fit: true,
			fitColumns: true,
			columns: [
				[
					{ field: 'ck', checkbox: true, width: 20 },
					{ field: 'name', title: '动环设备名称', width: 150,formatter:function(value,row,index){
						return '<a href="javascript:void(0);" onclick="alarmLinkage('+row.id+',3)">'+value+'</a>';
						}
					},
					{ field: 'alarm_type', title: '报警类型', width: 150 ,formatter: function(value, row, index) 
						{
						 if(value==255){
           		  			return  '设备失效';
           	  			}else if(value==0){
           		  			return  '温度告警';
           	  			}else if(value==1){
           		  			return '湿度告警';
           	  			}else if(value==3){
           			  		return '风速告警';
           	  			}
					}
					  
					},
					{ field: 'alarm_level', title: '报警级别', width: 50 ,formatter: function(value, row, index) {
                  	  if(value==0){
                		  return  '一般告警';
                	  }else{
                		  return  '严重告警';
                	  }
                  	 }
					}
				]
			],
			onBeforeLoad: function(param) {
				param.queryMap = {region_id : _region_id };
			},
			onClickRow: function(index, row) {

			},
			toolbar: '#env_toolbar',
			pagination: false,
			rownumbers: false,
			border: false,
			singleSelect: false
		});
	}

	$(document).ready(function() {
		init_dg_camera();
		init_dg_io();
		init_dg_env();
		init_region_tree();
		init_camera_tree();
		init_io_tree();
		init_env_tree();
		init_camera_preset();
		init_alarm_out();
		init_camrea_preset_tree();

	});
</script>

<%@ include file="exp/footer.jsp"%>