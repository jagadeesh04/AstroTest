package com.jag.astro;

import com.jag.astro.bo.Service;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Service service = new Service();
        
        System.out.println(service.getFinalResult());
        
        	System.out.println(service.getFinalResult().get("Mesha,Aswini,Mesha,Bharani"));
        
        
        
    }
}
