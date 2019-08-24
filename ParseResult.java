
package com.json;

import org.json.JSONObject;


public class ParseResult
{
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
