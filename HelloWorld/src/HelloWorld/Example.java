package HelloWorld;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.osgi.service.component.annotations.Component;

import osgi.enroute.configurer.api.RequireConfigurerExtender;
import osgi.enroute.webserver.capabilities.RequireWebServerExtender;

//@RequireAngularWebResource(resource={"angular.js","angular-resource.js", "angular-route.js"}, priority=1000)
//@RequireBootstrapWebResource(resource="css/bootstrap.css")
@RequireWebServerExtender
@RequireConfigurerExtender
@Component(name="HelloWorld")
public class Example {

	@GET
	@Path("/hello")
	@Produces(MediaType.TEXT_PLAIN)
	public String greeting() {
		return "hello";
	}

	@GET
	@Path("/goodbye")
	@Produces(MediaType.TEXT_PLAIN)
	public String separate() {
		return "goodbye";
	}

}
