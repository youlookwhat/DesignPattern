package com.example.jingbin.designpattern.app;

/**
 * Created by jingbin on 2016/10/30.
 */

public class AppConstant {

    public final static String STRATEGY_DEFINE = "_<em>策略模式（Strategy Pattern）</em>：定义了算法族，分别封装起来，让它们之间可相互替换，此模式让算法的变化独立于使用算法的客户。";
    public final static String SINGLETON_DEFINE = "_<em>单例模式（Singleton Pattern）</em>：主要是为了避免因为创建了多个实例造成资源的浪费，且多个实例由于多次调用容易导致结果出现错误，而使用单例模式能够保证整个应用中有且只有一个实例。";
    public final static String OBSERVER_DEFINE = "_<em>观察者模式（Observer Pattern）</em>：定义了对象之间的一对多的依赖，这样一来，当一个对象改变时，它的所有的依赖者都会收到通知并自动更新。";
    public final static String ADAPTER_DEFINE = "_<em>适配器模式（Adapter Pattern）</em>定义：将一个类的接口转换成客户期望的另一个接口，适配器让原本接口不兼容的类可以相互合作。这个定义还好，说适配器的功能就是把一个接口转成另一个接口。";
    public final static String COMMAND_DEFINE = "_<em>命令模式（Command Pattern）</em>定义：将“请求”封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。(简化: <b>将请求封装成对象，将动作请求者和动作执行者解耦。</b>)";
}
