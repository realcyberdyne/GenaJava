package cyberdyne.generator.Http.Middleware;

import cyberdyne.generator.Config.Config;
import cyberdyne.generator.Functions.Hash;
import org.json.JSONObject;

import java.time.LocalDate;
import java.time.LocalTime;

public class CheckApiAuthCookieMiddleware
{

    //Get auth check middleware function start
    public static boolean GetApiAuthCheckCookie(JSONObject Headers)
    {
        try
        {
            String []Cookies=Headers.get("Cookie").toString().split(";");
            String AuthVal="";
            for (int i=0;i<Cookies.length;i++)
            {
                if(Cookies[i].contains("auth="))
                {
                    AuthVal=Cookies[i].split("=")[1];
                }
            }

            if(AuthVal.isEmpty())
            {
                return false;
            }
            else
            {
                //Get generate login token
                String token = (LocalDate.now().getDayOfMonth() * 850 + LocalTime.now().getHour() * 20) + Config.Http_User_Encript_Key;
                token = Hash.GetSha256(token);


                if(AuthVal.equals(token))
                {
                    return true;
                }
                else
                {
                    return false;
                }

            }
        }
        catch (Exception e)
        {
            System.out.println("Auth Error");
        }

        return false;
    }
    //Get auth check middleware function end


}
