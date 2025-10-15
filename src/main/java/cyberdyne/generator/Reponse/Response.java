package cyberdyne.generator.Reponse;

import cyberdyne.generator.Reponse.Models.ResponseModel;

public class Response
{

    public static ResponseModel Redirect(String url)
    {
//        return new ResponseModel("308","text/html"+"\n"+"location:"+url,"");
        return new ResponseModel("200","text/html","<script> window.location.href='"+url+"'; </script>");
    }

}
