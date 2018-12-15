package mytomcat;

import java.io.IOException;
import java.io.OutputStream;

class MyResponse {

    private OutputStream outputStream;

    MyResponse(OutputStream outputStream) {
        this.outputStream = outputStream;
    }

    @SuppressWarnings({"StringBufferReplaceableByString", "StringBufferMayBeStringBuilder"})
    void wrie(String content) throws IOException {
        StringBuffer httpResponse = new StringBuffer();
        httpResponse.append("HTTP/1.1 200 OK\n")
                .append("Content-Type: text/html\n")
                .append("\r\n")
                .append("<html><body>")
                .append(content)
                .append("</body></html>");
        outputStream.write(httpResponse.toString().getBytes());
        outputStream.close();
    }

}