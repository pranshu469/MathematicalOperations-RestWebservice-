package com.json;


import java.io.InputStream;
import java.sql.Connection;

import java.util.Properties;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.UriInfo;
import javax.ws.rs.Produces;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.MediaType;


@Path("generic")
@SuppressWarnings("UseSpecificCatch")
public class GenericResource {
    
    static Properties p;
    static InputStream is;
    static Connection c;
   
    
    
    @Context
    private UriInfo context;

    
    public GenericResource() {
          
    }

    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public String getJson() {
        
        throw new UnsupportedOperationException();
    }

    
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public static String postJson(String content) 
    {
        
        String show=null;
              
        try{
             if(c==null)
            {
            Connection1 conobj=new Connection1();
            conobj.conn();
            }
            Calculate obj=ParseResult.ParseResultMethod(content);
            String i=obj.calc();
            show="{\"result is\":\""+i+"\"}";
            System.out.println(show);
            
        }
         catch(Exception e){
             show="check your input : action must be a string & x and y shoud be integers";System.out.println(e);
         }
        
        return show;
     }
         
    
}
