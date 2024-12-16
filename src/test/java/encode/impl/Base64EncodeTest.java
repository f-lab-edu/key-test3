package encode.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Base64EncodeTest {

  @Test
  @DisplayName("Hello World!을 입력하면 SGVsbG8gV29ybGQh를 반환한다.")
  void base64Test1() {
    Base64Encode base64 = new Base64Encode();
    String str = base64.encode("Hello World!");
    assertThat(str).isEqualTo("SGVsbG8gV29ybGQh");
  }

  @Test
  @DisplayName("if-else-if을 입력하면 aWYtZWxzZS1pZg==를 반환한다.")
  void base64Test2() {
    Base64Encode base64 = new Base64Encode();
    String str = base64.encode("if-else-if");
    assertThat(str).isEqualTo("aWYtZWxzZS1pZg==");
  }

}
