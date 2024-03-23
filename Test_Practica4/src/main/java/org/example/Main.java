package org.example;
import io.javalin.Javalin;

public class Main {
    public static void main(String[] args) {
        var app = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("Hello app1"))
                .start(8000);

        var app2 = Javalin.create(/*config*/)
                .get("/", ctx -> ctx.result("Hola app2"))
                .start(9000);
    }
}