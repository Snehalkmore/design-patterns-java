package practice.builder.designpattern.httpclient;

public class HttpClient {
	
	private String url;
	private String headers;
	private String username;
	private String password;
	private String method;
    private String body;
    
    public HttpClient(HttpClientBuilder httpClientBuilder) {
    	this.url = httpClientBuilder.url;
    	this.headers = httpClientBuilder.headers;
    	this.username = httpClientBuilder.username;
    	this.password = httpClientBuilder.password;
    	this.method = httpClientBuilder.method;
    	this.body = httpClientBuilder.body;
	}
    
     public static class HttpClientBuilder{
    	 	private String url;
    		private String headers;
    		private String username;
    		private String password;
    		private String method;
    	    private String body;
    	    
    	    public HttpClientBuilder url(String url) {
    	    	this.url = url;
    	    	return this;
    	    }
    	    
    	    public HttpClientBuilder headers(String headers) {
    	    	this.headers = headers;
    	    	return this;
    	    }
    	    
    	    public HttpClientBuilder username(String usrname) {
    	    	this.username = usrname;
    	    	return this;
    	    }
    	    
    	    public HttpClientBuilder password(String password) {
    	    	this.password = password;
    	    	return this;
    	    }
    	   
    	    public HttpClientBuilder method(String method) {
    	    	this.method = method;
    	    	return this;
    	    }
    	    
    	    public HttpClientBuilder body(String body) {
    	    	this.body = body;
    	    	return this;
    	    }
    	    
    	    public HttpClient build() {
    	    	return new HttpClient(this);
    	    }
     }

	@Override
	public String toString() {
		return "HttpClient [url=" + url + ", headers=" + headers + ", username=" + username + ", password=" + password
				+ ", method=" + method + ", body=" + body + "]";
	}
     
     
	
}
