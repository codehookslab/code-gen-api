package com.codehookslab.codegen;

import java.io.File;
import java.util.Arrays;

public class TestRunner {

    public static void main(String[] args) {
        File file = new File("D:/code-gen-demo/packages/entities");
        Arrays.stream(file.list()).forEach(e->{
            System.out.println(e);
            String name = e.replace(".java", "");
            new File("D:/code-gen-demo/packages/entities/"+name).mkdirs();
        });
    }
}
