package in.ck.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import in.ck.AppConfig;
import in.ck.beans.ReportService;

public class Test {
 public static void main(String[] args) {
	ApplicationContext context
	= new AnnotationConfigApplicationContext(AppConfig.class);
ReportService service= context.getBean(ReportService.class);
 service.generateReport();
 }
}
