@import exercise.dto.users.UserPage
@param UserPage page

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
@if(page != null)
    <h1>Пользователь ${page.getUser().getId()}</h1>
    <section>
        <div>
            <h2>${page.getUser().getFirstName()} ${page.getUser().getLastName()}</h2>
            <p>${page.getUser().getEmail()}</p>
        </div>
    </section>
@else
    <h1>Такого пользователя не существует</h1>
@endif
</body>
</html>
