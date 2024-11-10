@import exercise.dto.LoginPage
@import exercise.util.NamedRoutes
@param LoginPage page

@template.layout.page(
content = @`
    @if(page.getError() != null)
        <p>${page.getError()}</p>
    @endif
    <form action="${NamedRoutes.loginPath()}" method="post">
        <input type="text" placeholder="Name" name="name" required value="${page.getName()}"/>
        <input type="password" placeholder="Password" name="password" required/>
        <input type="submit" value="Войти"/>
    </form>
`)
