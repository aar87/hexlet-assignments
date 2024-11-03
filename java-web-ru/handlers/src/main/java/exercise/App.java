package exercise;

import io.javalin.Javalin;

import java.lang.reflect.Array;
import java.util.List;

public final class App {

    public static Javalin getApp() {

        // BEGIN

        List<String> phone = List.of("1231233", "12313123123", "1312312323");
        List<String> domains = List.of("d1231233", "d12313123123", "d1312312323");

        var app = Javalin.create();
        app.get("/phones", ctx -> ctx.json(phone));
        app.get("/domains", ctx -> ctx.json(domains));

        return app;
        // END
    }

    public static void main(String[] args) {
        Javalin app = getApp();
        app.start(7070);
    }
}
