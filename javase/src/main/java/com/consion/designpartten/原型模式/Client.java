package com.consion.designpartten.原型模式;

import java.util.Random;

/**
 * @author Consion
 * @create 2020-04-09 20:45
 * 此方式如果邮件数量过多，使用多线程方式发送，会导致第一个邮件还没有发送，第二个mail对象又被修改了收件人和标题字段。
 *
 */
public class Client {
    //发送数量
    private static final int MAX_COUNT = 6;
    public static void main(String[] args) {
       //模拟发送邮件
        int i = 0;
        Mail mail = new Mail(new AdvTemplate());
        mail.setTail("XX银行版权所有");
        while (i < MAX_COUNT) {
           Mail mailClone = mail = mail.clone();
            mailClone.setAppllation(getRandString(5) + " 先生（女士）");
            mailClone.setReceiver(getRandString(5) + "@" + getRandString(8) + ".com");
            //发送邮件
            sendMail(mailClone);
            i++;
        }


    }

    private static void sendMail(Mail mail) {
        // 为什么会产生2个线程输出的mail的收件人和标题相同，原因是多个线程共享一个mail对象，
        // 线程1获得时间片输出后，线程2紧接着获得了时间片
        new Thread(()-> {
            System.out.println("标题：" + mail.getSubject() + "\t收件人：" + mail.getReceiver() + "\t...发送成功！");
        }).start();

    }

    public static String getRandString(int maxLength) {
        String source = "abcdefghijklmnopqrstuvwxyz";
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < maxLength; i++) {
            sb.append(source.charAt(random.nextInt(source.length())));
        }
        return sb.toString();
    }
}
