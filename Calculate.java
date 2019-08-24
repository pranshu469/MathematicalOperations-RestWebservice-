package com.json;

import java.sql.Statement;

public class Calculate
{
    public int x;
    public int y;
    public int result;
    public String action;
    public String resultstr;

    
    public String calc() 
    {
      
        

        if(action.equals("add"))
        {  
            this.result = this.x+this.y;
            System.out.println(result);
            try{
            String t1="add";
            Statement s=GenericResource.c.createStatement();
            s.executeUpdate("insert into "+GenericResource.p.getProperty("tb")+" values('"+t1+"','"+x+"','"+y+"','"+result+"')");
            
        } catch (Exception e) {System.out.println(e);}
            this.resultstr=String.valueOf(result);
        }
        
        

        if(action.equals("sub"))
        { 
        this.result = this.x-this.y;
        System.out.println(result);
        try{
        String t1="sub";
        Statement s=GenericResource.c.createStatement();
        s.executeUpdate("insert into "+GenericResource.p.getProperty("tb")+" values('"+t1+"','"+x+"','"+y+"','"+result+"')");
        
        } catch (Exception e) {System.out.println(e);}
         this.resultstr=String.valueOf(result);
        }
         



        if(action.equals("mul"))
        {
        this.result = this.x*this.y;
        System.out.println(result);
        try{
        String t1="mul";
        Statement s=GenericResource.c.createStatement();
        s.executeUpdate("insert into "+GenericResource.p.getProperty("tb")+" values('"+t1+"','"+x+"','"+y+"','"+result+"')");
        
        } catch (Exception e) {System.out.println(e);}
         this.resultstr=String.valueOf(result);
        }
 



        if(action.equals("div"))
        { 
        this.result = this.x/this.y;
        System.out.println(result);
        try{
        String t1="div";
        Statement s=GenericResource.c.createStatement();
        s.executeUpdate("insert into "+GenericResource.p.getProperty("tb")+" values('"+t1+"','"+x+"','"+y+"','"+result+"')");
        
        } catch (Exception e) {System.out.println(e);}
         this.resultstr=String.valueOf(result);
        }
 

        
        if(!action.equals("add") && !action.equals("sub") && !action.equals("mul") && !action.equals("div"))
        {
            this.resultstr=action+" action is not supported by web service";
        }
    
        return resultstr;
        
       
    }
    
}
     
