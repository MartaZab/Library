<html>
<head>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>

<body>
<h2>Library</h2>

<div class="container">
<form action="/HomeServlet">
    <table class="table">
        <thead>
        <tr>
            <th>Id</th>
            <th>Title</th>
            <th>ISBN</th>
            <th>Author</th>
            <th>Type</th>
            <th>Release</th>
            <th>Pages</th>
            <th>Borrower</th>
            <th>Radio button</th>
        </tr>
        </thead>
        <tbody>
        <tr>
            <td>1</td>
            <td>Pan Tadeusz</td>
            <td>1234-56-456-23</td>
            <td>Adam Mickiewicz</td>
            <td>History</td>
            <td>1980-09-01</td>
            <td>200</td>
            <td>Ala Kowalska</td>
            <td> <input type="radio" name="button" ><br></td>
        </tr>
        </tbody>
    </table>

    <br>
    <br>
</form>
</div>
<a href="addBook.jsp"><button type="button" class="btn btn-outline-success" name = "action">ADD</button></a>
<a href="editBook.jsp"><button type="button" class="btn btn-outline-warning" name = "action">EDIT</button></a>
<button type="button" class="btn btn-outline-primary" name = "action">SHOW</button>
<button type="button" class="btn btn-outline-danger" name = "action">Delete</button>

</body>
</html>
