package io.github.biezhi.rest;

import com.blade.Blade;

/**
 * @author biezhi
 *         2017/6/5
 */
public class Main {

    public static void main(String[] args) {
        Blade.me().devMode(false)
                .get("/hello", ((request, response) -> response.text("Hello World.")))
                .openMonitor(false).listen(8080).start();
    }
}
