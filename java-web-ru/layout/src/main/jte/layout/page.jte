@import gg.jte.Content
@param Content content

<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <header>
        <ul>
            <li>
                <a href="http://localhost:7070">Home</a>
                <a href="http://localhost:7070/users">Users</a>
            </li>
        </ul>
    </header>
    ${content}
    <footer>
        <h3>Application footer</h3>
    </footer>
</body>
</html>
