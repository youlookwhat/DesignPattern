package com.example.jingbin.designpattern.chainofresponsibility;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.AppConstant;
import com.example.jingbin.designpattern.app.EMTagHandler;
import com.example.jingbin.designpattern.chainofresponsibility.impl.ConsoleLogger;
import com.example.jingbin.designpattern.chainofresponsibility.impl.ErrorLogger;
import com.example.jingbin.designpattern.chainofresponsibility.impl.FileLogger;
import com.example.jingbin.designpattern.databinding.ActivityChainOfResponsibilityBinding;

/**
 * @author jingbin
 * 责任链模式（Chain of Responsibility Pattern）为请求创建了一个接收者对象的链。
 * 这种模式给予请求的类型，对请求的发送者和接收者进行解耦。这种类型的设计模式属于行为型模式。
 * <p>
 * 在这种模式中，通常每个接收者都包含对另一个接收者的引用。
 * 如果一个对象不能处理该请求，那么它会把相同的请求传给下一个接收者，依此类推。
 * <p>
 * 主要解决：
 * 职责链上的处理者负责处理请求，客户只需要将请求发送到职责链上即可，
 * 无须关心请求的处理细节和请求的传递，所以职责链将请求的发送者和请求的处理者解耦了。
 */
public class ChainOfResponsibilityActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityChainOfResponsibilityBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_chain_of_responsibility);
        setTitle("责任链模式");
        binding.tvDefine.setText(EMTagHandler.fromHtml(AppConstant.CHAIN_OF_RESPONSIBILITY_DEFINE));

        // 3. 创建不同类型的记录器。赋予它们不同的错误级别，并在每个记录器中设置下一个记录器。每个记录器中的下一个记录器代表的是链的一部分。
        final AbstractLogger logger = getChainOfLoggers();
        binding.btInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ---: Standard Console::Logger  this is an information.
                logger.logMessage(AbstractLogger.INFO, "this is an information.");
            }
        });
        binding.btDebug.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ---: File::Logger  this is a debug level information.
                // ---: Standard Console::Logger  this is a debug level information.
                logger.logMessage(AbstractLogger.DEBUG, "this is a debug level information.");
            }
        });
        binding.btError.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // ---: Error Console::Logger  this is a error level information.
                // ---: File::Logger  this is a error level information.
                // ---: Standard Console::Logger  this is a error level information.
                logger.logMessage(AbstractLogger.ERROR, "this is a error level information.");
            }
        });

    }

    public static AbstractLogger getChainOfLoggers() {
        ErrorLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        FileLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        ConsoleLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);
        return errorLogger;
    }


}
