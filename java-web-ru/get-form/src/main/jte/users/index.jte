@import exercise.dto.users.UsersPage
@param UsersPage page

@template.layout.page(
    content = @`
        <form action="/users" method="get">
            <input type="search" name="term" value="${page.getTerm()}" />
            <input type="submit" value="Search" />
        </form>
        @if(!page.getUsers().isEmpty())
            <h2>${page.getTerm()}</h2>
            @for(var user : page.getUsers())
                <tr>
                    <td>
                        ${user.getId()}
                    </td>
                    <td>
                        ${user.getFirstName()}
                    </td>
                    <td>
                        ${user.getLastName()}
                    </td>
                </tr>
            @endfor
        @endif
    `
)