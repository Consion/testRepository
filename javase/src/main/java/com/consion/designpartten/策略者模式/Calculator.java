package com.consion.designpartten.策略者模式;

/**
 * @author Consion
 * @create 2020-04-28 12:54
 */
public enum Calculator {
    ADD("+"){
        @Override
        public int exec(int a, int b) {
            return a + b;
        }
    },
    SUB("-"){
        @Override
        public int exec(int a, int b) {
            return a - b;
        }
    }
    ;
    private String value;

    Calculator(String value) {
        this.value = value;
    }

    public abstract int exec(int a, int b);
}
