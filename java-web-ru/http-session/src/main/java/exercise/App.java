package exercise;

import io.javalin.Javalin;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

public final class App {

    private static final List<Map<String, String>> USERS = Data.getUsers();

    public static Javalin getApp() {

        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });

        // BEGIN
        app.get("/users", ctx -> {
            var page = ctx.queryParamAsClass("page", Long.class).getOrDefault(1L);
            long per = ctx.queryParamAsClass("per", Long.class).getOrDefault(5L);
            var users = USERS.stream().skip((page - 1) * per).limit(per).toArray();

            ctx.json(users);
        });
        // END

        return app;

    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
