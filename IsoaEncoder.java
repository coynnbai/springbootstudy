package sample.logback;

import org.slf4j.LoggerFactory;

import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.pattern.PatternLayoutEncoderBase;

public class IsoaEncoder  extends PatternLayoutEncoderBase<ILoggingEvent>{


	@Override
	public void start() {
		

		IsoaLayout patternLayout = new IsoaLayout();
        patternLayout.setContext(context);
        
        patternLayout.setPattern(getPattern());
        patternLayout.setOutputPatternAsHeader(outputPatternAsHeader);
        patternLayout.start();
        this.layout = patternLayout;
		super.start();
	}
	
}
