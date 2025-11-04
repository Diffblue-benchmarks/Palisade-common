package uk.gov.gchq.palisade.util;

import static org.junit.jupiter.api.Assertions.assertThrows;
import org.junit.jupiter.api.Test;

class AbstractResourceBuilderDiffblueTest {
  /**
   * Method under test: {@link AbstractResourceBuilder#create(String)}
   */
  @Test
  void testCreate() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> AbstractResourceBuilder.create("Uri String"));
  }
}
