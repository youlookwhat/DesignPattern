# DesignPattern
##Java 设计模式（观察者模式、策略模式等）
###参照Hongyang的CSDN博客所写：
>[http://blog.csdn.net/lmj623565791/article/category/2206597](http://blog.csdn.net/lmj623565791/article/category/2206597)

###一. Blog Catalogue：
####1. [设计模式 观察者模式 以微信公众服务为例](http://blog.csdn.net/lmj623565791/article/details/24179699)

####2. [设计模式 工厂模式 从卖肉夹馍说起](http://blog.csdn.net/lmj623565791/article/details/24460585)

###二. 简单解释
####1. 观察者模式
> - 定义了对象之间的一对多的依赖，这样一来，当一个对象改变时，它的所有的依赖者都会收到通知并自动更新。

> - 对于JDK或者Andorid中都有很多地方实现了观察者模式，比如XXXView.addXXXListenter ， 当然了 XXXView.setOnXXXListener不一定是观察者模式，因为观察者模式是一种一对多的关系，对于setXXXListener是1对1的关系，应该叫回调。

####1. 工厂模式
简单列一下这个模式的家族：

1、静态工厂模式

> - 这个最常见了，项目中的辅助类，TextUtil.isEmpty等，类+静态方法。

2、简单工厂模式

> - [SimpleRoujiaMoFactory.java](https://github.com/youlookwhat/DesignPattern/blob/master/app/src/main/java/com/example/jingbin/designpattern/factory/classs/SimpleRoujiaMoFactory.java)