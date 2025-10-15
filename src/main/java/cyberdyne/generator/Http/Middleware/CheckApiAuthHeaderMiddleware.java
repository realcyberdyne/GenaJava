package cyberdyne.generator.Http.Middleware;

import cyberdyne.generator.Reponse.Models.UserAuthModel;
import org.json.JSONObject;

public class CheckApiAuthHeaderMiddleware
{


    //Get auth check middleware function start
    public static boolean GetApiAuthCheck(JSONObject Headers)
    {
        try
        {
            String AuthToken = Headers.get("auth").toString();
            new UserAuthModel(AuthToken);
            return true;
        }
        catch (Exception e)
        {
            System.out.println("Auth Error");
        }

        return false;
    }
    //Get auth check middleware function end


}
