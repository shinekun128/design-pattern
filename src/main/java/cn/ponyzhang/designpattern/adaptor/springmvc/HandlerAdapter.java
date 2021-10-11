package cn.ponyzhang.designpattern.adaptor.springmvc;

public interface HandlerAdapter {
    public boolean support(Object Handler);
    public void handler(Object handler);
}

class SimpleHandlerAdapter implements HandlerAdapter{

    @Override
    public boolean support(Object handler) {
        return (handler instanceof SimpleController);
    }

    @Override
    public void handler(Object handler) {
        ((SimpleController)handler).doSimpleHandler();
    }
}
class AnnotationHandlerAdapter  implements HandlerAdapter{

    @Override
    public boolean support(Object handler) {
        return (handler instanceof AnnotationController);
    }

    @Override
    public void handler(Object handler) {
        ((AnnotationController)handler).doAnnotationController();
    }
}
class HttpHandlerAdapter  implements HandlerAdapter{

    @Override
    public boolean support(Object handler) {
        return (handler instanceof HttpController);
    }

    @Override
    public void handler(Object handler) {
        ((HttpController)handler).doHttpHandler();
    }
}
