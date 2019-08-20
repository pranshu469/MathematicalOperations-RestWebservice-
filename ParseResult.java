
package com.json;

import org.apache.log4j.Logger;
import org.json.JSONObject;


public class ParseResult
{
    private static final Logger logger=Logger.getLogger(ParseResult.class.getName());
    public static Calculate ParseResultMethod(String request) throws Exception
    {
      Calculate obj=new Calculate();
      JSONObject jsonobj=new JSONObject(request);
     
     
      obj.x=jsonobj.getInt("x");
      obj.y=jsonobj.getInt("y");
      obj.action=jsonobj.getString("action");
     
      return obj;
    }
}


/*for testing json string
{ 
               "x": 10, 
               "y":20, 
               "action": "add" 
  }
*/