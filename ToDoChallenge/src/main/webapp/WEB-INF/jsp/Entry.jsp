<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
	<link href="webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet"/>
	<script src="webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.0.0/js/jquery.min.js"></script>

</head>
<body>



<div class="jumbotron text-center" style="margin-bottom:0">

  <h1>Welcome ToDo Web Application</h1>
 
</div>
 <form:form modelAttribute="form2">
<div class = "container-fluid" style="margin-top:30">
	<div class = "container">
	    
  		
  		<div class="row">
  		<div class = "col-lg-8">
       	 <form:errors path="" element="div" />
            <form:label path="User" >Please insert Name:</form:label>
            <br/>
        	 <form:input path="User" class="form-control" placeholder="Please insert User Name"/>
             <form:errors path="User" />
        
  		 <input type="submit" class="btn btn-primary form-control" value = "Save or Open New User"/>
  		
  		</div>
  		
  		
  		
  		
  		
  	
  	
  	
      
   
	</div>
	
</div>
  </form:form>
   
</body>
</html>
