<% String path = application.getContextPath();%>
<html>
<head>
    <title>Show Rankings</title>
    <link rel="stylesheet" href="style.css" type="text/css" />	
</head>
<body>
    <div id="page">
		<div id="logo">
			<h1><a href="/" id="logoLink"></a></h1>
		</div>
		<div id="nav">
			<ul>
				<li><a href="index.jsp">Show Rankings</a></li>                     
			</ul>	
		</div>
		<div id="content">
                        <img src="logo.jpg" alt="logo" style="width:304px;height:228px;">
			<h2>Show Rankings</h2>
			<form action="<%=path%>/sortData" method="post">    
                                <div>
                                    <label for="teamName">Team Number:</label>
                                    <input type="number" name="teamNumber" id="teamNumber" required/>
                                 </div> 
                                <br>
                                <div class="button">
                                    <button type="submit">Show Rankings</button>
                                </div>
                            </form>
	</div>
    </div>
</body>
</html>