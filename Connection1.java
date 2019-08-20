
package com.json;

import static com.json.GenericResource.p;
import java.io.FileInputStream;
import java.sql.DriverManager;
import java.util.Properties;
import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Connection1
{
    private static final Logger logger=Logger.getLogger(Connection1.class.getName());
    
    public void conn()
    {
        String path="C:\\Users\\Pranshu\\Documents\\NetBeansProjects\\19-06-19\\RestJson_2\\src\\java\\com\\json\\JSON.properties";

             PropertyConfigurator.configure(path);
             p = new Properties();
            try{
                    GenericResource.is = new FileInputStream(path);
                } 
                catch (Exception e) 
                {
                     logger.error(e);
                }

            try {
                     p.load( GenericResource.is);
                }
                catch (Exception e) 
                {
                      logger.error(e);
                }

            try{
                Class.forName("oracle.jdbc.driver.OracleDriver");
                 GenericResource.c=DriverManager.getConnection(p.getProperty("url"), p.getProperty("username"), p.getProperty("password"));
               }
                catch(Exception e)
                { 
                     logger.error(e);
                }

    }
}
