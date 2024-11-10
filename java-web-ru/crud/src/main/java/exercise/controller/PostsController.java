package exercise.controller;

import static io.javalin.rendering.template.TemplateUtil.model;

import exercise.dto.posts.PostsPage;
import exercise.dto.posts.PostPage;
import exercise.repository.PostRepository;

import io.javalin.http.Context;
import io.javalin.http.NotFoundResponse;

public class PostsController {

    // BEGIN
    public static void index(Context ctx) {
        var pageNumber = ctx.queryParamAsClass("page", Integer.class).getOrDefault(1);
        var pageSize = 5;

        var posts = PostRepository.findAll(pageNumber, pageSize);
        var page = new PostsPage(posts, pageNumber);

        ctx.render("posts/index.jte", model("page", page));
    }

    public static void post(Context ctx) {
        Long id = Long.valueOf(ctx.pathParam("id"));

        var user = PostRepository.find(id)
                .orElseThrow(() -> new NotFoundResponse("Entity with id = " + id + " not found"));
        var page = new PostPage(user);

        ctx.render("posts/show.jte", model("page", page));
    }
    // END
}
