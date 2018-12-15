package mytomcat;

import java.io.IOException;

public class FindGirlServlet extends MyServlet {

    @Override
    public void deGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.wrie("get girl...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.wrie("post girl...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
