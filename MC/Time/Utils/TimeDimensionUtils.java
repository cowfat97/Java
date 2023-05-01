package MC.Time.Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;


/**
 * 时间维度处理工具类
 */
public class TimeDimensionUtils {

    public static final DateTimeFormatter YYYYMMDD = DateTimeFormatter.ofPattern("yyyyMMdd");
    public static final DateTimeFormatter YYYY_MM_DD = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /**
     * 参数化获取日期
     */
    public static void main(String[] args) {

        List<String> dataList = transDate("20230430", "20220630", YYYYMMDD, YYYYMMDD);

        System.out.println(dataList);
    }

    /**
     *
     */
    public static List<String> transDate(String startDate, String endDate, DateTimeFormatter pattern, DateTimeFormatter returnPattern) {

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

}
