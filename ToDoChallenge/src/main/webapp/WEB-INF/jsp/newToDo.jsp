<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
	<link href="webjars/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet"/>
	<script src="webjars/bootstrap/4.0.0/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.0.0/js/jquery.min.js"></script>

</head>
<body>
   <nav class="navbar navbar-expand-md bg-dark navbar-dark">
  <a class="navbar-brand" href="allToDo.html">ToDo</a>
  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#collapsibleNavbar">
    <span class="navbar-toggler-icon"></span>
  </button>
  <div class="collapse navbar-collapse" id="collapsibleNavbar">
    <ul class="navbar-nav">
      <li class="nav-item">
        <a class="nav-link" href="Entry.html">User Page</a>
      </li>
      <li class="nav-item">
        <a class="nav-link" href="newToDo.html">New ToDo</a>
      </li>
     
    </ul>
  </div>  
</nav>
<br>
	
        
    <form:form modelAttribute="form">
    
<div class="jumbotron text-center" style="margin-bottom:0">
  <h1>Add new ToDo</h1>
 
</div>
    	
        <form:errors path="" element="div" />
        <div class = "container-fluid">
        	<div class = "container">
      
        
        <div class = "row">
        <div class = "form-group col-lg-8">
        	 <label>Name:</label>
         	<form:input path="name" class="form-control"/><br>
      		 <label>Time:</label>
            <form:input path="time" class="form-control" placeHolder = "Please insert Time"/>
            <br/>
         	<form:label path="ToDo">ToDo</form:label>
         	<br/>
            <form:input path="ToDo" class="form-control" placeHolder = "Please Write Your ToDo"/>
            <form:errors path="ToDo" />
            <br/>
            <input type="submit"class="btn btn-success" value = "ToDo List"/>
        </div>
      
        </div>
        
        <div>
        
        </div>
        
        
        </div>
          </div>
        
    </form:form>
</body>
</html>
