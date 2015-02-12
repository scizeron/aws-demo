package demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AwsDemoController {

  @Autowired
  private AppConfig appConfig;
  
  @RequestMapping(value={"/", "/config"})
  public AppConfig config() {
    return this.appConfig;
  }
}
