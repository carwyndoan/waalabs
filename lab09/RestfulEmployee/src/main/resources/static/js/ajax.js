 
function makeAjaxCall(){
    let data = JSON.stringify(serializeObject($('#employeeForm')));

	$.ajax({
        type: "POST",
        url: "http://localhost:8080/employees",
        data: data,
        contentType: "application/json",
        dataType: "json",
		success: function(result) {
			$('#formInput').html("");
			$("#formInput").append( '<H3 align="center"> New Employee Information <H3>');
			$('#formInput').append("<H4 align='center'>First Name:  " + result.firstName  + "</h4>"  );
			$('#formInput').append("<H4 align='center'>Last Name: " + result.lastName  + "</h4>" );
			$('#formInput').append("<H4 align='center'>Email: " +  result.email + "</h4>");
			$("#formInput").append('<h4 align="center"> <a href="#" onclick="toggle_visibility(\'formInput\');resetForm(\'employeeForm\');"><b>EXIT</b> </a> </h4>');
			make_visible('formInput');
			make_hidden('errors');
		},
		error: function(XMLHttpRequest, textStatus, errorThrown) {
            make_visible('errors');
            make_hidden('formInput');
            $("#errors").empty();
            let errorObject = XMLHttpRequest.responseJSON;
            console.log(errorObject);
            if (errorObject.errorType === "ValidationError") {
                let errorMsg = '<h3> Error(s)!! </h3>';
                errorMsg += "<p>";
                var errorList = errorObject.errors;
                $.each(errorList, function(i, error) {
                    errorMsg = errorMsg + error.message + '<br>';
                });
                errorMsg += '</p>';
                $('#errors').append(errorMsg);
                $('#errors').show();
            } else {
                alert(errorObject.errors(0)); // "non" Validation
            }
		}
	});
}

toggle_visibility = function(id) {
    var element = document.getElementById(id);
    if(element.style.display == 'block')
    	element.style.display = 'none';
    else
    	element.style.display = 'block';
 }	

make_hidden = function(id) {
    var element = document.getElementById(id);
    element.style.display = 'none';
        }	   

make_visible = function(id) {
    var element = document.getElementById(id);
    element.style.display = 'block';
 }	   

resetForm = function(id) {
    var element = document.getElementById(id);
    $(element)[0].reset();

    }	  

// Translate form to array
// Then put in JSON format
function serializeObject (form)
{
    var jsonObject = {};
    var array = form.serializeArray();
    $.each(array, function() {
         	jsonObject[this.name] = this.value;
    });
    return jsonObject;
}

