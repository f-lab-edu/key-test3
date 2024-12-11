package encode.impl;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class Base62EncodeTest {

  @Test
  @DisplayName("base62 인코딩 테스트")
  void base62Test() {
    Base62Encode base62 = new Base62Encode();
    String encode62 = base62.encode("Hello World!");
    assertThat(encode62).isEqualTo("T8dgcjRGkZ3aysdN");
  }
}