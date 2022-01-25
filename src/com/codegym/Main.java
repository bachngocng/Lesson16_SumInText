package com.codegym;

import java.io.File;

public class Main {

    public static void main(String[] args) {
        File file = new File("E:\\CodeGym\\MODULE 2\\Lesson16");
        if (file.exists()) {
            System.out.println("File này đã tồn tại");
        }
        if(file.isDirectory()){
            for (File f: file.listFiles()) {
                System.out.println(f.getName());
            }
        }
    }
}
