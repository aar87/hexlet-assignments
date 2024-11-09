@import exercise.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
    content = @`
        <section>
            <h1>Список пользователей</h1>
            @if(page.getUsers() == null || page.getUsers().isEmpty())
                <p>Нет пользователей =(</p>
            @else
                @for(var user: page.getUsers())
                    <div>
                        <h2>${user.getFirstName()} ${user.getLastName()}</h2>
                        <p>${user.getEmail()}</p>
                    </div>
                @endfor
            @endif
        </section>
`
)
