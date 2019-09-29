<%--
  Created by IntelliJ IDEA.
  User: Marta
  Date: 28.09.2019
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>

    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <title>Add</title>
</head>

<body>
<div class="jumbotron text-center">

    <form>
        <div class="form-row">
            <div class="form-group col-md-6">
                <label for="inputTitle">Title</label>
                <input type="text" class="form-control" id="inputTitle">
            </div>
            <div class="form-group col-md-4">
                <label for="inputCategory">Category</label>
                <select id="inputCategory" class="form-control">
                    <option selected>Choose...</option>
                    <option>History</option>
                    <option>Fantasy</option>
                    <option>Drama</option>
                    <option>SF</option>
                </select>
            </div>
            <div class="form-group col-md-6">
                <label for="inputISBN">ISBN</label>
                <input type="text" class="form-control" id="inputISBN">
            </div>
            <div class="form-group col-md-6">
                <label for="inputRelease">Release</label>
                <input type="date" class="form-control" id="inputRelease">
            </div>
            <div class="form-group col-md-6">
                <label for="inputPages">Pages</label>
                <input type="number" class="form-control" id="inputPages">
            </div>
            <div class="form-group col-md-6">
                <label for="inputAuthor">Author</label>
                <select id="inputAuthor" class="form-control">
                    <option selected>Choose...</option>
                    <option>...</option>
                    <option>Adam Mickiewicz</option>
                    <option>Juliusz Słowacki</option>
                    <option>Eliza Orzeszkowa</option>
                    <option>Witold Gombrowicz</option>
                    <option>Aleksander Fredro</option>
                </select>
            </div>
            <div class="form-group col-md-12">
                <label for="inputSummary">Summary</label>
                <input type="text" class="form-control" id="inputSummary">
            </div>
        </div>
    </form>

    <button type="submit" class="btn btn-warning" >Edit</button>
    <a href="index.jsp"><button type="button" class="btn btn-secondary">Cancel</button></a>

</div>
</body>
</html>
