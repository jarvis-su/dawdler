package logging.formatter;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.SimpleFormatter;

/**
 * MySimpleFormatter
 *
 * @author Jarvis Su
 * @date 2/17/2016
 */

public class MySimpleFormatter extends SimpleFormatter {
    private SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    private StringBuilder sb = new StringBuilder();

    @Override
    public synchronized String format(LogRecord record) {
        Level level = record.getLevel();
        String time = sdf.format(new Date(record.getMillis()));
        String loggerName = record.getLoggerName();
        String message = record.getMessage();

        this.sb.append("[").append(level).append("]");
        this.sb.append(" ").append(time);
        this.sb.append(" ").append(loggerName);
        this.sb.append(" :").append(message);
        this.sb.append("\n");
        return sb.toString();
    }
}