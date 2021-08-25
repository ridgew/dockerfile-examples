对应文章：[Java程序制作Docker Image推荐方案](https://segmentfault.com/a/1190000016449865)

[映射 /error 到自定义且实现了ErrorController的Controller](https://www.cnblogs.com/yaoyuan2/p/11880375.html)


Java程序制作Docker Image推荐方案
https://segmentfault.com/a/1190000016449865

docker run -p 8080:8080 chanjarster/dockerfile-java-examples-1:1.0-SNAPSHOT

docker run -p 8080:8080 -e JAVA_OPTS='-Xmx128M -Xms128M -Dabc=xyz -Ddef=uvw' chanjarster/dockerfile-java-examples-1:1.0-SNAPSHOT

docker run -p 8080:8080 chanjarster/dockerfile-java-examples-1:1.0-SNAPSHOT --debug

docker build -t chanjarster/dockerfile-java-examples-1:1.0-SNAPSHOT --build-arg NAME=javaAppTest --build-arg VERSION=1.0 --build-arg JAR_FILE=java-examples-1-1.0-SNAPSHOT.jar .

docker run -d --name javaAppTest -p 8080:8080 chanjarster/dockerfile-java-examples-1:1.0-SNAPSHOT 
