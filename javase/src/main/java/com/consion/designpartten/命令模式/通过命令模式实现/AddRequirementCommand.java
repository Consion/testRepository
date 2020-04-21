package com.consion.designpartten.命令模式.通过命令模式实现;

/**
 * @author Consion
 * @create 2020-04-16 13:02
 */
public class AddRequirementCommand extends Command {
    @Override
    void execute() {
        super.requirementGroup.find();
        super.requirementGroup.add();
        super.requirementGroup.plan();
    }
}
