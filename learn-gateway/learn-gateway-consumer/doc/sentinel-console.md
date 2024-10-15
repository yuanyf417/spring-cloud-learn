## sentinel控制台安装
> https://github.com/alibaba/Sentinel/wiki/%E6%8E%A7%E5%88%B6%E5%8F%B0
1. 下载
2. 启动
```
java -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard.jar
```
- -Dserver.port=8080 用于指定 Sentinel 控制台端口为 8080