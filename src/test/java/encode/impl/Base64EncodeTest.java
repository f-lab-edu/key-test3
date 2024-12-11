package encode.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Base64EncodeTest {

  @Test
  @DisplayName("base64 인코딩 테스트")
  void base64Test() {
    Base64Encode base64 = new Base64Encode();
    String str = base64.encode("Hello World!");
    assertThat(str).isEqualTo("SGVsbG8gV29ybGQh");
  }

}
