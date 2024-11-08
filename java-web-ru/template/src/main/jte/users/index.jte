@import exercise.dto.users.UsersPage
@param UsersPage users

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
    <h1>Список пользователей</h1>
    <section>
        @if(users.getUsers().isEmpty())
            <p>Нет пользователей =(</p>
        @else
            @for(var user: users.getUsers())
                <div>
                    <h2>${user.getFirstName()} ${user.getLastName()}</h2>
                    <p>${user.getEmail()}</p>
                </div>
            @endfor
        @endif
    </section>
</body>
</html>
