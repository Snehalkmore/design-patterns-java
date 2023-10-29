package practice.builder.designpattern.httpclient;

public class Test {

	public static void main(String[] args) {

		HttpClient client = new HttpClient.HttpClientBuilder()
				.url("/test")
				.body("PAYLOAD")
				.method("POST")
				.password("abc")
				.username("abc")
				.headers("abc").build();
		
		System.out.println(client);
	}

}
