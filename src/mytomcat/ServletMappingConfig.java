package mytomcat;

import java.util.ArrayList;
import java.util.List;

class ServletMappingConfig {

    static List<ServletMapping> servletMappingList = new ArrayList<>();

    static {
        servletMappingList.add(new ServletMapping("findGirl", "/girl", "mytomcat.FindGirlServlet"));
        servletMappingList.add(new ServletMapping("Test", "/test", "mytomcat.TestServlet"));
    }

}
