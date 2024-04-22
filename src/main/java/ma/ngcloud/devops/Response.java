package ma.ngcloud.devops;

public class Response {


    private String message;
    private String environment;

    public Response() {
    }
    public Response(String message, String environment) {
        this.message = message;
        this.environment = environment;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }
}
