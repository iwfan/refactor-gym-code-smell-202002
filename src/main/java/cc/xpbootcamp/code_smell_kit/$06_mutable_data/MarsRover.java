package cc.xpbootcamp.code_smell_kit.$06_mutable_data;

import java.util.List;

public class MarsRover {
    // 初始状态
    private RoverState initSate;
    //配置火星车需要执行的命令
    private List<Cmd> cmdList;

    public MarsRover(RoverState initSate, List<Cmd> cmdList) {
        this.initSate = initSate;
        this.cmdList = cmdList;
    }

    public RoverState getInitSate() {
        return initSate;
    }

    public void setInitSate(RoverState initSate) {
        this.initSate = initSate;
    }

    public List<Cmd> getCmdList() {
        return cmdList;
    }

    public void setCmdList(List<Cmd> cmdList) {
        this.cmdList = cmdList;
    }
}
