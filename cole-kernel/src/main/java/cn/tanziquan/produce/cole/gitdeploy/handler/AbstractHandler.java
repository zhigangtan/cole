package cn.tanziquan.produce.cole.gitdeploy.handler;

import cn.tanziquan.produce.cole.gitdeploy.dto.handler.RequestConext;
import cn.tanziquan.produce.cole.gitdeploy.dto.handler.ResponseDto;

/**
 * AbstractHandler
 *
 * @author zhigang.tan
 * @version 0.0.1
 */
public abstract class AbstractHandler {


    private AbstractHandler nextHandler;

    public abstract ResponseDto response(RequestConext conext);

    public void setNextHandler(AbstractHandler handler) {
        this.nextHandler = handler;
    }

    public final ResponseDto handleRequest(RequestConext request) {
        ResponseDto response = null;
        response = this.response(request);
        if (this.nextHandler != null) {
            this.nextHandler.handleRequest(request);
        } else {
            System.out.println("-----没有合适的处理器-----");
        }

        return response;
    }

}
