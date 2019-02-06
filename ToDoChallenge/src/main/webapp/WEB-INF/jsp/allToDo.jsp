<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>

<head>
	<link href="webjars/bootstrap/4.0.0/css/bootstrap.css" rel="stylesheet"/>
	<script src="webjars/bootstrap/4.0.0/js/bootstrap.js"></script>
	<script src="webjars/jquery/3.0.0/js/jquery.js"></script>

  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.6/umd/popper.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.2.1/js/bootstrap.min.js"></script>
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
	
	
	
	<div class = "container-fluid">
	<div class = "container">
		<h1>ToDo List Page</h1>
	
		
		<ul  class="list-group">
		<c:forEach items="${allToDoList}" var="list">
		   <li class="list-group-item list-group-item-action">${list}</li>
		</c:forEach>
	</ul>
	
	
	</div>
	
	</div>
	
	
</body>
</html>
