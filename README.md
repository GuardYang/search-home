# search-home
springboot+jpa+security+redis+mysql+elasticsearch+zookeeper+kafka+nginx+集成化工具(七牛云储+阿里云+美洽+百度地图)


开发条件:
springboot  用做基础框架 (可用spring+springMVC替代)
jpa 数据持久化处理 (可用mybatis等系列框架替换)
springsecurity 处理角色权限管理 (可用shiro替代)
springSchedual 监控任务
spring Mail 报警系统
redis 处理session缓存和数据缓存 (可用mongodb替代)
mysql 数据等存储与供应 (可用orecal替代)
elasticsearch 搜索引擎 针对大流量数据 使用es做数据处理较优 (可用solr等代替)
zookeeper 作为服务注册中心 
kafka消息中间件 注册服务后 实现批量发送到es 顺序读写持久化 O(1)的复杂度使性能优化  (可用MQ替代)
nginx 用作负载均衡和反向代理 (可以nginx集群化或nginx+tomcat配置负载均衡)

集成化工具:
七牛云处理上传数据的云存储
阿里云短信服务实现短信认证
美洽人工客服系统
百度地图实现地图索引

调试工具
postman/insomnia  请求测试
switchHosts! 域名解析
docker/虚拟机 拉取镜像 (es,redis,zookeeper,kafka,nginx,logstash)
idea 开发
maven 构建项目
kibana+elasticsearch es调控和监视
hbuider 前端开发
logstash 日志搜集分析









