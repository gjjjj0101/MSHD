package com.mshd.system.server;

import com.mshd.common.core.domain.Code;
import org.yaml.snakeyaml.reader.UnicodeReader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class readtxt {

    public static Map<String,String> readFromTxtLine(String fileName) {
        List<Code> list = new ArrayList<>();
        BufferedReader reader = null;
        Map<String,String> map = new HashMap<String,String>();
        try{
            FileInputStream fileInputStream = new FileInputStream(new File(fileName));
            UnicodeReader unicodeReader = new UnicodeReader(fileInputStream);
            reader = new BufferedReader(unicodeReader);
            String tempString = null;
            int line = 1;
            while ((tempString = reader.readLine()) != null) {
                System.out.println("line " + line + ": " + tempString.trim());
                line++;
            }
            reader.close();
        }catch (IOException e){
            e.printStackTrace();
        }finally {
            if (reader != null){
                try{
                    reader.close();
                }catch (IOException e1){

                }
            }
        }
        return map;
    }
    public static void main(String[] args){
        readtxt a = new readtxt();
        a.readFromTxtLine("C:\\Users\\YYH\\Desktop\\大三\\项目管理\\MSHD\\mshd-system\\地震数据.txt");
    }
}
