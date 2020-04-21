package com.consion.designpartten.命令模式.通过命令模式实现;

/**
 * @author Consion
 * @create 2020-04-16 12:59
 */
public abstract class Command {
    Group requirementGroup = new RequirementGroup();
    Group pageGroup = new PageGroup();
    Group codeGroup = new CodeGroup();
    abstract void execute();
}
