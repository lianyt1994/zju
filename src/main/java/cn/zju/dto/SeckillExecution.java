package cn.zju.dto;

import cn.zju.bean.SuccessKilled;
import cn.zju.enums.SeckillStateEnum;

public class SeckillExecution {

    //商品id
    private long seckillId;

    //秒杀状态
    private int state;

    //状态描述
    private String stateInfo;

    private SeckillStateEnum seckillStateEnum;

    //成功秒杀编号
    private SuccessKilled successKilled;

    public SeckillExecution(long seckillId, SeckillStateEnum state, SuccessKilled successKilled) {
        this.seckillId = seckillId;
        this.state = state.getState();
        this.stateInfo = state.getStateInfo();
        this.successKilled = successKilled;
    }

    public SeckillExecution(long seckillId, SeckillStateEnum state, String stateInfo) {
        this.seckillId = seckillId;
        this.state = state.getState();
        this.stateInfo = stateInfo;
    }

    public SeckillExecution(long seckillId, SeckillStateEnum seckillStateEnum) {
        this.seckillId = seckillId;
        this.seckillStateEnum = seckillStateEnum;
    }

    public SeckillStateEnum getSeckillStateEnum() {
        return seckillStateEnum;
    }

    public void setSeckillStateEnum(SeckillStateEnum seckillStateEnum) {
        this.seckillStateEnum = seckillStateEnum;
    }

    public long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(long seckillId) {
        this.seckillId = seckillId;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }

    public String getStateInfo() {
        return stateInfo;
    }

    public void setStateInfo(String stateInfo) {
        this.stateInfo = stateInfo;
    }

    public SuccessKilled getSuccessKilled() {
        return successKilled;
    }

    public void setSuccessKilled(SuccessKilled successKilled) {
        this.successKilled = successKilled;
    }

    @Override
    public String toString() {
        return "SeckillExecution{" +
                "seckillId=" + seckillId +
                ", state=" + state +
                ", stateInfo='" + stateInfo + '\'' +
                ", successKilled=" + successKilled +
                '}';
    }
}
