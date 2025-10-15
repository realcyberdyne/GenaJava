package cyberdyne.generator.Route;

import cyberdyne.generator.Controllers.HttpHandlerController;
import cyberdyne.generator.Reponse.Models.ResponseModel;

public class GetMapping
{

    public ResponseModel GetMappingHandler(String Path)
    {
        ResponseModel response=new ResponseModel();

        //Get Routes
        switch (Path)
        {
            case "/":
                response=new HttpHandlerController().Index();
        }

        return response;
    }

}
