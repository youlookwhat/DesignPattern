package com.example.jingbin.designpattern.command;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.example.jingbin.designpattern.R;
import com.example.jingbin.designpattern.app.AppConstant;
import com.example.jingbin.designpattern.app.EMTagHandler;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * 命令模式:
 * 定义：将"请求"封装成对象，以便使用不同的请求、队列或者日志来参数化其他对象。命令模式也支持可撤销的操作。
 * 简化: 将请求封装成对象，将动作请求者和动作执行者解耦。
 * 命令模式的核心就是把命令封装成类，对于命令执行者不需要知道现在执行的具体是什么命令。
 * <p>
 * 假设现在有电视、电脑、电灯等家电，现在需要你做个遥控器控制所有家电的开关，
 * 要求做到每个按钮对应的功能供用户个性化，对于新买入家电要有非常强的扩展性。
 */
public class CommandActivity extends AppCompatActivity implements View.OnClickListener {

    @BindView(R.id.tv_define)
    TextView tvDefine;
    @BindView(R.id.activity_command)
    LinearLayout activityCommand;
    @BindView(R.id.bt_command)
    Button btCommand;
    @BindView(R.id.bt_zero)
    Button btZero;
    @BindView(R.id.bt_three)
    Button btThree;
    @BindView(R.id.bt_six)
    Button btSix;
    @BindView(R.id.bt_one)
    Button btOne;
    @BindView(R.id.bt_four)
    Button btFour;
    @BindView(R.id.bt_seven)
    Button btSeven;
    @BindView(R.id.bt_two)
    Button btTwo;
    @BindView(R.id.bt_five)
    Button btFive;
    @BindView(R.id.bt_no)
    Button btNo;

    private ControlPanel controlPanel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_command);
        ButterKnife.bind(this);
        setTitle("命令模式");

        tvDefine.setText(EMTagHandler.fromHtml(AppConstant.COMMAND_DEFINE));
        setCommands();
        initListener();
    }

    private void initListener() {
        btZero.setOnClickListener(this);
        btOne.setOnClickListener(this);
        btTwo.setOnClickListener(this);
        btThree.setOnClickListener(this);
        btFour.setOnClickListener(this);
        btFive.setOnClickListener(this);
        btSix.setOnClickListener(this);
        btSeven.setOnClickListener(this);
        btNo.setOnClickListener(this);
    }

    private void setCommands() {
        /**
         * 三个家电
         */
        Door door = new Door();
        Light light = new Light();
        Computer computer = new Computer();

        /**
         * 一个控制器,假设是我们的APP界面
         */
        controlPanel = new ControlPanel();
        controlPanel.setCommands(0, new DoorOpenCommand(door));// 开门
        controlPanel.setCommands(3, new DoorCloseCommand(door));// 关门
        controlPanel.setCommands(1, new LightOnCommand(light));// 开灯
        controlPanel.setCommands(4, new LightOffCommand(light));// 关灯
        controlPanel.setCommands(2, new ComputerOnCommand(computer));// 开电脑
        controlPanel.setCommands(5, new ComputerOffCommand(computer));// 关电脑
//        controlPanel.keyPressed(8);//这个没有设置命令,但不会出问题,因为我们的NoCommand的功劳

        QuickCommand quickOpenCommand = new QuickCommand(new Command[]{new LightOnCommand(light), new ComputerOnCommand(computer), new DoorOpenCommand(door)});
        QuickCommand quickCloseCommand = new QuickCommand(new Command[]{new LightOffCommand(light), new ComputerOffCommand(computer), new DoorCloseCommand(door)});
        controlPanel.setCommands(6, quickOpenCommand);
        controlPanel.setCommands(7, quickCloseCommand);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_zero:
                controlPanel.keyPressed(0);
                break;
            case R.id.bt_one:
                controlPanel.keyPressed(1);
                break;
            case R.id.bt_two:
                controlPanel.keyPressed(2);
                break;
            case R.id.bt_three:
                controlPanel.keyPressed(3);
                break;
            case R.id.bt_four:
                controlPanel.keyPressed(4);
                break;
            case R.id.bt_five:
                controlPanel.keyPressed(5);
                break;
            case R.id.bt_six:
                controlPanel.keyPressed(6);
                break;
            case R.id.bt_seven:
                controlPanel.keyPressed(7);
                break;
            case R.id.bt_no:
                controlPanel.keyPressed(8);
                break;
            case R.id.bt_command:

                break;
            default:
                break;
        }
    }
}
