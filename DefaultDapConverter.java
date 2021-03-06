package sample.logback;

import ch.qos.logback.classic.pattern.ClassicConverter;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class DefaultDapConverter extends ClassicConverter {
	@Override
	public String convert(ILoggingEvent event) {
		return event.getLoggerContextVO().getName();
	}
}
