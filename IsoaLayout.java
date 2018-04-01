package sample.logback;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestAttributes;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import ch.qos.logback.classic.PatternLayout;
import ch.qos.logback.classic.spi.ILoggingEvent;

public class IsoaLayout extends PatternLayout {
	
	static{
		defaultConverterMap.put("dap", DefaultDapConverter.class.getName());
	}
	
	@Override
	public void start() {
		super.start();
	}
	
	public IsoaLayout() {
		super();
	}

	public static void request(){
		RequestAttributes ra = RequestContextHolder.getRequestAttributes();
		if(ra != null)
		{
			ServletRequestAttributes sra = (ServletRequestAttributes)ra;
	        HttpServletRequest request = sra.getRequest();
	        
		}
	}
	


	@Override
	public String doLayout(ILoggingEvent event) {
		
		
        
        		
		System.out.println("coynn"+context.getName());
		return super.doLayout(event);
	}
}
