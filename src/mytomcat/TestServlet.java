package mytomcat;

import java.io.IOException;

@SuppressWarnings("unused")
public class TestServlet extends MyServlet {

    @Override
    public void deGet(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.wrie("get world...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void doPost(MyRequest myRequest, MyResponse myResponse) {
        try {
            myResponse.wrie("post world...");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
