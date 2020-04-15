package com.consion.designpartten.原型模式;

/**
 * @author Consion
 * @create 2020-04-09 20:42
 */
public class Mail implements Cloneable{
    private String receiver;
    private String subject;
    //称谓
    private String appllation;
    private String context;
    private String tail;
    public Mail(AdvTemplate advTemplate) {
        this.context = advTemplate.getAdvContext();
        this.subject = advTemplate.getAdvSubject();
    }

    public String getReceiver() {
        return receiver;
    }

    public void setReceiver(String receiver) {
        this.receiver = receiver;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getAppllation() {
        return appllation;
    }

    public void setAppllation(String appllation) {
        this.appllation = appllation;
    }

    public String getContext() {
        return context;
    }

    public void setContext(String context) {
        this.context = context;
    }

    public String getTail() {
        return tail;
    }

    public void setTail(String tail) {
        this.tail = tail;
    }

    @Override
    protected Mail clone() {
        try {
            return (Mail) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
