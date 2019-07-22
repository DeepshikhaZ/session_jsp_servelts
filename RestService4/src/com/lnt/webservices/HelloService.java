package com.lnt.webservices;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/hello")
public class HelloService {
//String res="";
	@GET
	public String sayHello(@QueryParam("no1") int no1,@QueryParam("no2") int no2) {
		
         int res1=no1+no2;
         Integer intInstance = new Integer(res1); 
         String res=intInstance.toString();
		return res;
		
	
	}

	@Path("/sub")
	@GET
	public String sayBye(@QueryParam("no1") int no1,@QueryParam("no2") int no2)
	{
		int res1=no1-no2;
		Integer intInstance=new Integer(res1);
		String res=intInstance.toString();
		return res;
		
		
		
		
	}
	
}

	
	
