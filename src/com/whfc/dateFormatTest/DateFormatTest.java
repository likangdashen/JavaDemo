package com.whfc.dateFormatTest;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

/**
 * @Author: ；kang
 * @Description:
 * @Date:Create：in 2019/10/21 15:11
 * @Version：1.0
 */
public class DateFormatTest {

    public static void main(String[] args) {

        //01 转化的特定格式String字符串为Date
        String dateStr = "2019-10-21 15:16:35";
        System.out.println("转换前的String类型:" + dateStr);
        Date date = stringTODate(dateStr);
        System.out.println("转换后的Date类型:" + date);

        System.out.println("==========================================");

        //02 转化Date为String字符串
        // 获取系统目前时间
        Date strDate = Date.from(Instant.now());
        System.out.println("转换前的Date类型" + strDate );
        String str = dateTOString(strDate);
        System.out.println("转换后的String类型" + str );

    }


    //01 转化的特定格式String字符串为Date
   public static String dateTOString(Date date){
       DateFormat dateStr = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
       String format = dateStr.format(date);
       return format;
   }


    //02 转化Date为String字符串
    public static Date stringTODate(String str){
        DateFormat date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date dataStr = null;
        try {
            dataStr =  date.parse(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return dataStr;
    }

}
