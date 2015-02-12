package demo;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContextInitializer;
import org.springframework.context.ConfigurableApplicationContext;

import com.stfciz.aws.s3.configuration.ApplicationConfigurationBeanPostProcessor;

@SpringBootApplication
public class AwsDemoApplication {

  /**
   * 
   * @param args
   * @throws Exception
   */
  public static void main(String[] args) throws Exception {
    new SpringApplicationBuilder(AwsDemoApplication.class)
      .initializers(new ApplicationContextInitializer<ConfigurableApplicationContext>() {
        @Override
        public void initialize(ConfigurableApplicationContext applicationContext) {
          applicationContext.addBeanFactoryPostProcessor(new ApplicationConfigurationBeanPostProcessor(AppConfig.class));
        }
      })
      .build().run(args);
  }
}
