package mytomcat;

public abstract class MyServlet {

    public abstract void deGet(MyRequest myRequest, MyResponse myResponse);

    public abstract void doPost(MyRequest myRequest, MyResponse myResponse);

    void setvice(MyRequest myRequest, MyResponse myResponse) {
        if (myRequest.getMethod().equalsIgnoreCase("POST"))
            doPost(myRequest, myResponse);
        else if (myRequest.getMethod().equalsIgnoreCase("GET"))
            deGet(myRequest, myResponse);
    }

}
