# testNGExample

## testNG简介
[TestNG](https://testng.org/doc/index.html)是一个受JUnit和NUnit启发的测试框架，但引入了一些新功能，使其功能更强大，相对于JUnit来说，xml的配置使的testNG对于不同测试之间的依赖程度有更好的把控性。

### 用testNG做api测试

#### 本地运行
配置文件``configure.yaml``里面是关于用户和网关的配置，``TestBase.java``中根据自身业务需求写了一个认证机制，模拟用户登录获取token放入请求中，测试只要继承``TestBase``，请求就自带认证后的token头信息。

运行命令
```sh run.sh```
进行测试，报告存在于``/target/surefire-reports``下。

#### 打包运行
```
mvn package
java -jar ./target/app-fat-tests.jar
```
报告存在于``test-output``文件夹下