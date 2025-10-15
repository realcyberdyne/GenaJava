package cyberdyne.generator.Route;

import cyberdyne.generator.Controllers.HttpHandlerController;
import cyberdyne.generator.Reponse.Models.ResponseModel;

public class PostMapping
{

    public ResponseModel GetMappingHandler(String Path)
    {
        ResponseModel response=new ResponseModel();

        //Get Routes
        switch (Path.split("\\?")[0])
        {
//            case "/Login":
//                response=new HttpHandlerController().LoginDone(parametrs_json,Header);
//                break;
//            case "/LoginDone":
//                if(GetApiAuthCheckCookie(Header))
//                    response=new HttpHandlerController().AddHubDone(parametrs_json,Header);
//                else
//                    response=new ResponseModel("403","text/html", HttpView.View("403"));
//                break;
        }

        return response;
    }

}
