package cyberdyne.generator.Route;

import cyberdyne.generator.Controllers.HttpHandlerController;
import cyberdyne.generator.Reponse.Models.ResponseModel;
import org.json.JSONObject;

public class Routes
{

    //Get handle Get request function start
    public static ResponseModel GetHandleGetMethod(String request,String []requests,JSONObject Header)
    {

        //Get splite first line
        String request_path=requests[0].split(" ")[1];

        //parametrs
        JSONObject parametrs_json=new JSONObject();
        if(request_path.toString().contains("?"))
        {
            String all_parametrs = request_path.toString().split("\\?")[1];
            String[] parametrs = all_parametrs.split("&");

            for (int i = 0; i < parametrs.length; i++) {
                String data[] = parametrs[i].split("=");
                parametrs_json.put(data[0], data[1]);
            }
        }

        return new GetMapping().GetMappingHandler(request_path);
    }
    //Get handle Get request function end


    //Get handle Post request function start
    public static ResponseModel GetHandlePostMethod(String request, String []requests, JSONObject Header)
    {
//        System.out.println(request.toString().trim());

        //Get splite first line
        String request_path=requests[0].split(" ")[1];

        //parametrs
        JSONObject parametrs_json=new JSONObject();
        if(request_path.toString().contains("?"))
        {
            String all_parametrs = request_path.toString().split("\\?")[1];
            String[] parametrs = all_parametrs.split("&");

            for (int i = 0; i < parametrs.length; i++)
            {
                String data[] = parametrs[i].split("=");
                parametrs_json.put(data[0], data[1]);
            }
        }

        if(parametrs_json.isEmpty())
        {
            String request_data_line=request.toString().trim().split("\n")[request.toString().trim().split("\n").length-1];

            String []para_sam=request_data_line.toString().split("\\?");
            String all_parametrs=para_sam[para_sam.length - 1];


            String[] parametrs;
            if(all_parametrs.isEmpty())
                parametrs = request_data_line.toString().split("&");
            else
                parametrs = all_parametrs.split("&");

            for (int i = 0; i < parametrs.length; i++)
            {
                String data[] = parametrs[i].split("=");
                parametrs_json.put(data[0], data[1]);
            }
        }


        return new PostMapping().GetMappingHandler(request_path);
    }
    //Get handle Post request function end


}
