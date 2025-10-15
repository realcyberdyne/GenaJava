package cyberdyne.generator;

import cyberdyne.generator.Conf.Config;
import cyberdyne.generator.Http.HttpServer;

public class Main
{
    public static void main(String[] args)
    {
        //Get read properties values
        new Config();
        System.out.println("Cyberdyne service : Config file is loaded");

        //Get begin http server
        new HttpServer();


    }
}