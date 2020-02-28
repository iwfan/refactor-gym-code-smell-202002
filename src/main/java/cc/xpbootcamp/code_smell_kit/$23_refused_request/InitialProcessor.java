package cc.xpbootcamp.code_smell_kit.$23_refused_request;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class InitialProcessor implements Processor {
    @Override
    public void create(String json) {
        // to create something
    }

    @Override
    public void update(String json) {
        throw new NotImplementedException();
    }
}
