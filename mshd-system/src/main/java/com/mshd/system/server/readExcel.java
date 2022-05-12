package com.mshd.system.server;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import com.alibaba.excel.support.ExcelTypeEnum;
import com.mshd.common.core.domain.Code;
import com.alibaba.excel.*;
import org.junit.Test;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;
@Controller
@RequestMapping("/read_excel")
public class readExcel {
    @Test
    public void readexcel() throws Exception{
        List<Code> list = new ArrayList<>();
        EasyExcel.read("地震数据" + ExcelTypeEnum.XLSX.getValue(), Code.class, new AnalysisEventListener<Code>() {
            @Override
            public void invoke(Code data, AnalysisContext analysisContext) {
                list.add(data);
            }

            @Override
            public void doAfterAllAnalysed(AnalysisContext analysisContext) {
              System.out.println("读取完成");
            }
        }).sheet().doRead();
        list.forEach(System.out::println);
    }
}
