@import exercise.dto.users.UserPage
@param UserPage page

@template.layout.page(
    content = @`
        <section>
            @if(page.getUser() != null)
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
        </section>
    `
)
