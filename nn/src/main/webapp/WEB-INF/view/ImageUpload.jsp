<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<html>
<head>
    <title>Spring MVC Multiple File Upload</title>
<script
src="http://ajax.googleapis.com/ajax/libs/jquery/1.8.2/jquery.min.js"></script>
<script>
$(document).ready(function() {
    //add more file components if Add is clicked
    $('#addFile').click(function() {
        var fileIndex = $('#fileTable tr').children().length - 1;
        $('#fileTable').append(
                '<tr><td>'+
                '   <input type="file" name="files['+ fileIndex +']" />'+
                '</td></tr>');
    });
     
});
</script>
</head>
<body>
<h1>Spring Multiple File Upload example</h1>
 
<!--<form:form method="post" action="save1"
        modelAttribute="uploadForm" enctype="multipart/form-data">
 
    <p>Select files to upload. Press Add button to add more file inputs.</p>
 
    <input id="addFile" type="button" value="Add File" />
    <table id="fileTable">
        <tr>
            <td><input name="files" type="file" /></td>
        </tr>
        
    </table>
    <br/><input type="submit" value="Upload" />
</form:form> -->
<form method="post" enctype="multipart/form-data" action="save1">
		Upload File: <input type="file" name="file">
		<br /><br />
		Description: <input type="text" name="desc"/>
		<br/><br/><input type="submit" value="Upload"> 
	</form>
</body>
</html>