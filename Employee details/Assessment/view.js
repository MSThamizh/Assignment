
function delete_row(no)
{
 document.getElementById("row"+no+"").outerHTML="";
}

function add_row()
{
 var new_name=document.getElementById("new_name").value;
 var new_empid=document.getElementById("new_empid").value;
 var new_skill=document.getElementById("new_skill").value;
 var new_department=document.getElementById("new_department").value;
 var new_salary=document.getElementById("new_salary").value;
	
 var table=document.getElementById("data_table");
 var table_len=table.rows.length;
 var row = table.insertRow(table_len).outerHTML="<tr id='row"+table_len+"'><td id='name_row"+table_len+"'>"+new_name+"</td><td id='name_empid"+table_len+"'>"+new_empid+"</td><td id='skill_row"+table_len+"'>"+new_skill+"</td><td id='department_row"+table_len+"'>"+new_department+"</td><td id='salary_row"+table_len+"'>"+new_salary+"</td></tr>";

 document.getElementById("new_name").value="";
 document.getElementById("new_empid").value="";
 document.getElementById("new_skill").value="";
 document.getElementById("new_department").value="";
 document.getElementById("new_salary").value="";
}