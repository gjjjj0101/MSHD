package com.mshd.system.server;

import com.alibaba.excel.EasyExcel;
import com.mshd.common.core.domain.Code;
import org.junit.Test;

import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class writeExcel {
    public List<Code> setData(){
        Scanner sc = new Scanner(System.in);
        String str = null ;

        List<Code> list =new ArrayList<>();
        Code code = new Code();
        code.setId(sc.next());
        code.setLocation(sc.next());

        code.setTime(sc.next());
        code.setSource(sc.next());
        code.setFile(sc.next());
        code.setLable(sc.next());
        code.setDescrition(sc.next());
        list.add(code);
        return list;


    }
//    @Test
//    public void contextLoads(){
//        EasyExcel.write("地震信息表（测试）.xlsx",Code.class).sheet().doWrite(setData());
//    }
public static void main(String[] args){
    writeExcel a = new writeExcel ();
    List<Code> list =a.setData();
    EasyExcel.write("地震信息表（测试）.xlsx",Code.class).sheet().doWrite(list);
}
}

