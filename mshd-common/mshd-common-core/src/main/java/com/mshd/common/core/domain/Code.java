package com.mshd.common.core.domain;

import java.util.Date;
import java.io.Serializable;
import com.alibaba.excel.annotation.ExcelProperty;
import com.alibaba.excel.annotation.format.DateTimeFormat;
import com.alibaba.excel.annotation.write.style.ContentFontStyle;
import com.alibaba.excel.annotation.write.style.HeadRowHeight;
/**
 * 编码内容
 */
public class Code implements Serializable{
    /*
     编号
    */
    @ExcelProperty(value ={ "地震数据","编号"})
    public String Id;
    /*
     参考位置
     */
    @ExcelProperty(value ={ "地震数据","参考位置"})
    public String Location;
    /*
     时间
     */
    @ExcelProperty(value ={ "地震数据","时间"})
    public String Time;
    /*
    数据源
    */
    @ExcelProperty(value ={ "地震数据","数据源"})
    public String Source;
    /*
    数据载体
    * */
    @ExcelProperty(value ={ "地震数据","数据载体"})
    public String File;
    /*
    * 标签
    * */
    @ExcelProperty(value ={ "地震数据","标签"})
    public String lable;
    /*
    * 描述
    * */
    @ExcelProperty(value ={ "地震数据","描述"})
    public String Descrition;

    public String getId() {
        return this.Id;
    }

    public void setId(String id) {
        this.Id = id;
    }

    public String getLocation() {
        return this.Location;
    }

    public void setLocation(String location) {
        this.Location = location;
    }

    public String getTime() {
        return Time;
    }

    public void setTime(String time) {
        Time = time;
    }

    public String getSource() {
        return this.Source;
    }

    public void setSource(String source) {
        this.Source = source;
    }

    public String getFile() {
        return this.File;
    }

    public void setFile(String file) {
        this.File = file;
    }

    public String getLable() {
        return this.lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public String getDescrition() {
        return this.Descrition;
    }

    public void setDescrition(String descrition) {
        this.Descrition = descrition;

    }

    @Override
    public String toString() {
        return "Code{" +
                "Id='" + Id + '\'' +
                ", Location='" + Location + '\'' +
                ", Time=" + Time +
                ", Source='" + Source + '\'' +
                ", File='" + File + '\'' +
                ", lable='" + lable + '\'' +
                ", Descrition='" + Descrition + '\'' +
                '}';
    }
}
