<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">

    <title>SPEND</title>
</head>
<body>
<h1 style="text-align: center" >My spends list</h1>
<div>
    <table class="table" table-hover table-sm>
        <thead  class="thead-light">
        <tr>
            <th scope="col">ID </th>
            <th scope="col">NAME </th>
            <th scope="col">DESCRIPTION </th>
            <th scope="col">DELETE </th>
            <th scope="col">UPDATE </th>
        </tr>
        </thead>
        <#list spends as spend>
            <tr>
                <td>${spend.id}</td>
                <td>${spend.name}</td>
                <td>${spend.desc}</td>
                <td><a href="/web/spend/delete/${spend.id}" class="btn btn-outline-danger" type="button" onclick="return confirm('Are you shore?');"/>Delete</td>
                <td><a href="/web/spend/update/${spend.id}" class="btn btn-outline-warning" type="button" onclick="return confirm('Are you shore?');"/>Update</td>

            </tr>
        </#list>

    </table>
</div>
<style>
    table, th, td {
        border: 1px solid gainsboro;
        width: auto;
        align-items: center;
    }
</style>
</body>
</html>