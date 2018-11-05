package org.springframework.test.web.server.samples.context;

public class WebContextLoader extends GenericWebContextLoader {

    public WebContextLoader() {
        super("src/test/resources/META-INF/web-resources", false);
    }

}
