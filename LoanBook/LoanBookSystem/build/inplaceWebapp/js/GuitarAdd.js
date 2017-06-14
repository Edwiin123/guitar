$(document).ready(function(){
	$("#instruct_select").change(function(){
		if($(this.val()=="曼陀林")){
			$("#numString").hide();
			$("#style").show();
		}
	})
	function init(){
		alert("fangfa");
	}
	var map={};
	var key;
	var value;
	var str;
	$("#instruct input").each(function(){
		value=$(this).value;
		key=$(this).attr("name");
		map[key]=value;
		str=Json.stringify(map)
	});
	alert(str);
	$("#instructAdd").click(function(){
		alert("hh");
		$.ajax({
			type:"POST",
			url:"instruct_add",
			dateType:"json",
			contentType:"application/x-www-form-urlencoded; charset=UTF-8",
			data:{"map":str},
			success:function(data){
				$.html("<p>添加成功</p>").css(color,red);
			},
			error:function(data){
				$.html("<p>添加失败</p>").css(color,red);
			}
		})
	})
})	