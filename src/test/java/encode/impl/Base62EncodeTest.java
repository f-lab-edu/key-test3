package encode.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Base62EncodeTest {

  @Test
  @DisplayName("Hello World!을 입력하면 T8dgcjRGkZ3aysdN를 반환한다.")
  void base62Test() {
    Base62Encode base62 = new Base62Encode();
    String encode62 = base62.encode("Hello World!");
    assertThat(encode62).isEqualTo("T8dgcjRGkZ3aysdN");
  }
}