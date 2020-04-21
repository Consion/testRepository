package com.consion.designpartten.命令模式.通过命令模式实现;

/**
 * @author Consion
 * @create 2020-04-16 13:01
 */
public class DeletePageCommand extends Command {
    @Override
    void execute() {
        super.pageGroup.find();
        super.pageGroup.delete();
        super.pageGroup.plan();
    }
}
