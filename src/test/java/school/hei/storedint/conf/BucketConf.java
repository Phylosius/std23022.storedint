package school.hei.storedint.conf;

import org.springframework.test.context.DynamicPropertyRegistry;
import school.hei.storedint.PojaGenerated;

@PojaGenerated
public class BucketConf {

  void configureProperties(DynamicPropertyRegistry registry) {
    registry.add("aws.s3.bucket", () -> "dummy-bucket");
  }
}
