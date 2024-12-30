<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>My JSP Page</title>
    <link rel="stylesheet" type="text/css" href="style.css">
</head>
<body
   <%-- <div class="form-container">
            <form action="add" method="post">
                <h2>Calculator</h2>
                <div class="form-group">
                    <label for="num1">Enter first number : </label>
                    <input type="text" id="num1" name="num1"><br>
                </div>
                <div class="form-group">
                    <label for="num2">Enter second number : </label>
                    <input type="text" id="num2" name="num2"><br>
                </div>
                <button type="submit">Add</button>
            </form>
    </div> --%>
   <div class="form-container">
                       <form action="addPerson">
                           <h2>Add records..</h2>
                           <div class="form-group">
                               <label for="pid">Enter ID : </label>
                               <input type="text" id="pid" name="pid"><br>
                           </div>
                           <div class="form-group">
                               <label for="pname">Enter Name : </label>
                               <input type="text" id="pname" name="pname"><br>
                           </div>
                           <button type="submit">Submit</button>
                       </form>
   </div>
</body>
</html>