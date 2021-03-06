package com.bonc.file;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

public class DirList {
    public static void main(String[] args) {
        File path = new File(".");

        String[] list = path.list(new DirFilter("\\d"));
        Arrays.sort(list,String.CASE_INSENSITIVE_ORDER);
        for (int i = 0; i < list.length; i++) {
            String s = list[i];
            System.out.println(s);
        }
    }
}

/**
 * 文件名过滤器
 */
class DirFilter implements FilenameFilter{
    private Pattern pattern;

    public DirFilter(String regex) {
        this.pattern = Pattern.compile(regex);
    }

    @Override
    public boolean accept(File dir, String name) {
        return pattern.matcher(name).matches();
    }
}
