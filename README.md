# DesignPattern
##Java 设计模式（观察者模式、工厂模式、策略模式等）
> 设计模式（Design pattern）是一套被反复使用、多数人知晓的、经过分类编目的、代码设计经验的总结。

###主要参照张鸿洋的CSDN博客所写：
>[http://blog.csdn.net/lmj623565791/article/category/2206597](http://blog.csdn.net/lmj623565791/article/category/2206597)

###一. Blog Catalogue：
####1. [设计模式 观察者模式 以微信公众服务为例](http://blog.csdn.net/lmj623565791/article/details/24179699)

####2. [设计模式 工厂模式 从卖肉夹馍说起](http://blog.csdn.net/lmj623565791/article/details/24460585)

####3. [设计模式 单例设计模式(Singleton Pattern)完全解析](http://blog.csdn.net/dmk877/article/details/50311791)

-----
###二. 简单解释
####1. 观察者模式
 - 定义了对象之间的一对多的依赖，这样一来，当一个对象改变时，它的所有的依赖者都会收到通知并自动更新。

 - 对于JDK或者Andorid中都有很多地方实现了观察者模式，比如XXXView.addXXXListenter ， 当然了 XXXView.setOnXXXListener不一定是观察者模式，因为观察者模式是一种一对多的关系，对于setXXXListener是1对1的关系，应该叫回调。

 - 专题接口：[Subject.java](https://github.com/youlookwhat/DesignPattern/blob/master/app/src/main/java/com/example/jingbin/designpattern/observer/interfaces/Subject.java) ;  3D服务号的实现类：[ObjectFor3D.java](https://github.com/youlookwhat/DesignPattern/blob/master/app/src/main/java/com/example/jingbin/designpattern/observer/classs/ObjectFor3D.java)
 - 所有观察者需要实现此接口:[Observer.java](https://github.com/youlookwhat/DesignPattern/blob/master/app/src/main/java/com/example/jingbin/designpattern/observer/interfaces/Observer.java)

--
####2. 工厂模式
简单列一下这个模式的家族：

- 1、静态工厂模式

	- 这个最常见了，项目中的辅助类，TextUtil.isEmpty等，类+静态方法。

- 2、简单工厂模式（店里买肉夹馍）

	- 根据类型直接创建肉夹馍：[SimpleRoujiaMoFactory.java](https://github.com/youlookwhat/DesignPattern/blob/master/app/src/main/java/com/example/jingbin/designpattern/factory/classs/SimpleRoujiaMoFactory.java)

- 3、工厂方法模式（开分店）
	-  定义：定义一个创建对象的接口，但由子类决定要实例化的类是哪一个。工厂方法模式把类实例化的过程推迟到子类。
	-  对比定义：
  	 - 1、定义了创建对象的一个接口：public abstract RouJiaMo sellRoujiaMo(String type);
 	 - 2、由子类决定实例化的类，可以看到我们的馍是子类生成的。
 - 提供创建肉夹馍店抽象方法：[RoujiaMoStore.java](https://github.com/youlookwhat/DesignPattern/blob/master/app/src/main/java/com/example/jingbin/designpattern/factory/gcff/RoujiaMoStore.java)
 - 具体实现抽象方法：[XianRoujiaMoStore.java](https://github.com/youlookwhat/DesignPattern/blob/master/app/src/main/java/com/example/jingbin/designpattern/factory/gcff/XianRoujiaMoStore.java)
 - 分店依旧使用简单工厂模式：[XianSimpleRoujiaMoFactory.java](https://github.com/youlookwhat/DesignPattern/blob/master/app/src/main/java/com/example/jingbin/designpattern/factory/gcff/XianSimpleRoujiaMoFactory.java)

- 4、抽象工厂模式（使用官方提供的原料）
	 - 定义：提供一个接口，用于创建相关的或依赖对象的家族，而不需要明确指定具体类。
	 - 对比定义：
	 	- 1、提供一个接口：public interface RouJiaMoYLFactroy
	 	- 2、用于创建相关的或依赖对象的家族 public Meat createMeat();public YuanLiao createYuanliao();我们接口用于创建一系列的原材料。
	 - 创建用于提供原料的接口工厂：[RoujiaMoYLFactory.java](https://github.com/youlookwhat/DesignPattern/blob/master/app/src/main/java/com/example/jingbin/designpattern/factory/cxgc/RoujiaMoYLFactory.java)
	 - 各自分店实现接口，完成原料提供：[XianRoujiaMoYLFoctory.java](https://github.com/youlookwhat/DesignPattern/blob/master/app/src/main/java/com/example/jingbin/designpattern/factory/cxgc/XianRoujiaMoYLFoctory.java)
	 - 准备时，使用官方的原料：[RoujiaMo.java](https://github.com/youlookwhat/DesignPattern/blob/master/app/src/main/java/com/example/jingbin/designpattern/factory/cxgc/RoujiaMo.java)

--
####3. 单例设计模式
 - 单例模式主要是为了避免因为创建了多个实例造成资源的浪费，且多个实例由于多次调用容易导致结果出现错误，而**使用单例模式能够保证整个应用中有且只有一个实例**。
 - 定义：只需要三步就可以保证对象的唯一性
   - (1) 不允许其他程序用new对象。
   - (2) 在该类中创建对象
   - (3) 对外提供一个可以让其他程序获取该对象的方法
- 对比定义：
  - (1) 私有化该类的构造函数
  - (2) 通过new在本类中创建一个本类对象
  - (3) 定义一个公有的方法，将在该类中所创建的对象返回
- 饿汉式[可用]：[SingletonEHan.java](https://github.com/youlookwhat/DesignPattern/blob/master/app/src/main/java/com/example/jingbin/designpattern/singleton/ehan/SingletonEHan.java)
- 含懒汉式[双重校验锁 推荐用]：[SingletonLanHan.java](https://github.com/youlookwhat/DesignPattern/blob/master/app/src/main/java/com/example/jingbin/designpattern/singleton/lanhan/SingletonLanHan.java)

  ```java
 private SingletonLanHan() {}
 private static SingletonLanHan singletonLanHanFour;
public static SingletonLanHan getSingletonLanHanFour() {
    if (singletonLanHanFour == null) {
        synchronized (SingletonLanHan.class) {
            if (singletonLanHanFour == null) {
                singletonLanHanFour = new SingletonLanHan();
            }
        }
    }
    return singletonLanHanFour;
}
    
 ```
	 
- 内部类[推荐用]：[SingletonIn.java](https://github.com/youlookwhat/DesignPattern/blob/master/app/src/main/java/com/example/jingbin/designpattern/singleton/inclass/SingletonIn.java)
- 枚举[推荐用]：[SingletonEnum.java](https://github.com/youlookwhat/DesignPattern/blob/master/app/src/main/java/com/example/jingbin/designpattern/singleton/enums/SingletonEnum.java)
 
--

---

###三. Thanks
- [CSDN:张鸿洋](http://blog.csdn.net/lmj623565791)