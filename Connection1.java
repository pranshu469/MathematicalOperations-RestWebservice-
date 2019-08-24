
package com.json;

import static com.json.GenericResource.p;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.util.Properties;


public class Connection1
{
    
    public void conn()
    {
        //machine dependent
        String path="C:\\Users\\Pranshu\\Documents\\NetBeansProjects\\19-06-19\\RestJson_2\\src\\java\\com\\json\\JSON.properties";

             p = new Properties();
            try{
                    GenericResource.is = new FileInputStream(path);
                } 
                catch (Exception e) 
                {
                     System.out.println(e);
                }

            try {
                     p.load( GenericResource.is);
                }
                catch (Exception e) 
                {
                      System.out.println(e);
                }

            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                 GenericResource.c=DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"), p.getProperty("password"));
               }
                catch(Exception e)
                { 
                     System.out.println(e);
                }

    }
}
