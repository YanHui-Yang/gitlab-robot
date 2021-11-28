# gitlab-robot

PS：这是一个 gitlab webhook 机器人

## 效果图

![image-20211128114736561](https://gitee.com/YanHui-Yang/blog-img/raw/master/img/image-20211128114736561.png)

## 部署方式

1. maven package 出来一个 jar，上传到服务器

2. 编写 Dockerfile

```dockerfile
FROM openjdk:8-jdk-alpine
WORKDIR app
ADD gitlab-robot-v0.0.1.jar /app/app.jar
EXPOSE 7004
CMD java -jar /app/app.jar
```

![image-20211128114859477](https://gitee.com/YanHui-Yang/blog-img/raw/master/img/image-20211128114859477.png)

3. 部署（我程序的端口设置为6608，所以 docker run 的时候直接映射6608端口）

```shell
docker build -t robot .

docker run --name robot -d -p 8099:6608 robot
```



## 使用方式

在 gitlab 的这个地方填写你部署的地址

```
格式：http://IP号:端口号/robot/push/机器人id
```

![image-20211128115711023](https://gitee.com/YanHui-Yang/blog-img/raw/master/img/image-20211128115711023.png)



## Q&A 机器人 id 在哪里找？

![image-20211128115906775](https://gitee.com/YanHui-Yang/blog-img/raw/master/img/image-20211128115906775.png)

![image-20211128115933421](https://gitee.com/YanHui-Yang/blog-img/raw/master/img/image-20211128115933421.png)

