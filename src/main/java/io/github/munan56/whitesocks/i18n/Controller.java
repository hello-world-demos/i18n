package io.github.munan56.whitesocks.i18n;

import io.github.munan56.whitesocks.common.core.model.Response;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/")
public class Controller {


    @RequestMapping("/spring")
    public Response<Boolean> spring(){
        return Response.no(I18nErrors.ID_IS_NOT_ALLOWED);
    }
    @RequestMapping("/spring2")
    public Response<Boolean> spring2(){
        return Response.no(I18nErrors.ID_IS_NOT_ALLOWED2,"换一个Id","或者联系管理员");
    }

    @RequestMapping("/hiber")
    public Response<Boolean> hiber(UserInput userInput){
        return Response.no(I18nErrors.ID_IS_NOT_ALLOWED2,"换一个Id","或者联系管理员");
    }


}
