1.dubbo集成springboot三个关键注解:
  @EnableDubbo(使dubbo生效) 
  @Reference(从zookeeper获取服务) 
  @Service(dubbo提供,和spring提供的注意区别开,作用是将对外提供的服务注册到zookeeper)

2.配置生效优先级:jvm运行参数->dubbo.properties->application.properties
