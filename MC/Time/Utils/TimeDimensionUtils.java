package MC.Time.Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

/**
 * 时间维度处理工具类
 *
 * @author haoxinlei
 */
public class TimeDimensionUtils {

    /**
     * 获取近几个阶段的日期集合（月）
     * 根据日期类型判断
     */
    public static List<String> getStages(Integer type, String startDate, Integer num) {
        int months = type * num;

//        for (int i = 0; i < months; i++) {
//            LocalDate minusMonths = startLocalDate.minusMonths(i);
//            dateList.add(minusMonths.format(returnPattern));
//        }

        return null;
    }


    /**
     * 获取范围内日期（月份）集合
     */
    public static List<String> dateRange(String startDate, String endDate, DateTimeFormatter pattern, DateTimeFormatter returnPattern) {

        LocalDate startLocalDate = LocalDate.parse(startDate, pattern);
        LocalDate endLocalDate = LocalDate.parse(endDate, pattern);

        int startDateMonth = startLocalDate.getMonth().getValue();
        int endDateMonth = endLocalDate.getMonth().getValue();

        int startDateYear = startLocalDate.getYear();
        int endDateYear = endLocalDate.getYear();

        int months = (startDateYear - endDateYear) * 12 + (startDateMonth - endDateMonth);

        List<String> dateList = new ArrayList<>();


        for (int i = 0; i < months; i++) {
            LocalDate minusMonths = startLocalDate.minusMonths(i);
            dateList.add(minusMonths.format(returnPattern));
        }
        return dateList;
    }

    /**
     * 根据月份集合获得对应的日期集合
     */


}
