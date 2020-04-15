package com.consion.designpartten.工厂方法模式;

/**
 * @author Consion
 * @create 2020-04-10 13:35
 */
public enum HumanTypeEnum {
    BLACK_HUMAN(BlackHuman.class), WHITE_HUMAN(WhiteHuman.class), YELLOW_HUMAN(YellowHuman.class);

    HumanTypeEnum(Class<? extends Human> type) {
        this.type = type;
    }

    private Class<? extends Human> type;

    public Class<? extends Human> getType() {
        return type;
    }

    public void setType(Class<? extends Human> type) {
        this.type = type;
    }
}
