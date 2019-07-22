package com.lnt.webservices;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.QueryParam;

@Path("/sub")
public class ByeService {
	@GET
	public String sayBye(@QueryParam("no1") int no1,@QueryParam("no2") int no2) {
		int res=no1-no2;
		Integer in=new Integer(res);
		String res1=in.toString();
		return res1;
		
	}

}
