package cyberdyne.generator.Controllers;

import cyberdyne.generator.Reponse.Models.ResponseModel;
import cyberdyne.generator.Http.Handlers.View.HttpView;

public class HttpHandlerController
{

    //Get home page start
    public ResponseModel Index()
    {
        return new ResponseModel("200","text/html",new HttpView().View("Index"));
    }
    //Get home page end

}
