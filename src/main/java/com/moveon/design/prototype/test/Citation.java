package com.moveon.design.prototype.test;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @ClassName Citation
 * @Description TODO
 * @Author huangzh
 * @Date 2024/7/24 16:38
 * @Version 1.0
 */
@Data
@AllArgsConstructor
public class Citation implements Cloneable{

//    private String name;

    private Student student;

    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }

    public void show() {
        System.out.println();
    }
}
