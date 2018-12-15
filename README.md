# 简单实现Tomcat

## 提供 Socket 服务

Tomcat 的启动，必然是 Socket 服务，只不过它支持 HTTP 协议而已。

## 进行请求的分发

一个 Tomcat 可以为多个 Web 应用提供服务，那么很显然，Tomcat 可以把 URL 下发到不同的Web应用。

## 需要把请求和响应封装成 request / response

我们在 Web 应用这一层，可从来没有封装过 request/response 的，我们都是直接使用的，这就是因为 Tomcat 已经为你做好了。