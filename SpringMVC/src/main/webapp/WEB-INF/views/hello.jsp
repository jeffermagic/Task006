<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> Hello Page</title>

</head>
<body onload="load()">
<input type = "hidden" id = "user_id">
Name: <input type="text" id="name" required = "required" name="user_name"><br>
Email: <input type= "email" id ="email" required="required" name="email"><br> 

<button onclick="submit();">Submit</button>
<table id="table" border=1>
<tr><th> Name </th><th> Email </th> <th> Edit </th> <th> Delete </th>
 </tr>
</table>
<script type ="text/javascript">
data="";
submit = function() {
$.ajax({
url:'saveOrUpdate',
type:'POST',
data:{user_id:$("#user_id").val(),user_name:$('#name').val(),email
success: function(response){
alert(response.message);
load();
}
});
}

delete_=function(id){
$.ajax({
url:'delete',
type:'POST',
data:{user_id:id},
success: function(response){
alert(response,message);
load();
}
}); 
}

edit = function (index){
$("#user_id").val(data[index].user_id);
$("#name").val(data[index].user_name);
$("#email").val(data[index].user_email);
}

load =function(){
	$.ajax({
		url:'list',
		type:'POST',
		success: function(response){
			data=response.data;
			$('.tr').remove();
			for(i=0; i<response.data.length;i++){
				$("#table").append("<tr class='tr'><td> "+response.data[i].user_name+"</td> onclick=delete_("+response.data[i].user_id+");'> Delete </a> </td> </tr>);
			}
			}
	});
		}
	


	




</script>
<h3>Hello Page</h3>
</body>
</html>