import static spark.Spark.*;

public class TEST {

	public static void main(String[] args) {
		get("/hello", (request, response) -> {
			Map<String, Object> attributes = new HashMape();
			attributes.put("message", "Hello World!"); 
		
		return new ModelAndView(attributes, "hello.ftl");
		}, new FreeMarkerEngine()); 
	}
}
