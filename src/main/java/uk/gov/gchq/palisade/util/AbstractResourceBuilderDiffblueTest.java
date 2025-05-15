package uk.gov.gchq.palisade.util;

import static org.junit.jupiter.api.Assertions.assertThrows;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class AbstractResourceBuilderDiffblueTest {
  /**
   * Test {@link AbstractResourceBuilder#create(String)} with {@code uriString}.
   * <ul>
   *   <li>When {@code Uri String}.</li>
   *   <li>Then throw {@link IllegalArgumentException}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractResourceBuilder#create(String)}
   */
  @Test
  @DisplayName("Test create(String) with 'uriString'; when 'Uri String'; then throw IllegalArgumentException")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"uk.gov.gchq.palisade.resource.Resource AbstractResourceBuilder.create(String)"})
  void testCreateWithUriString_whenUriString_thenThrowIllegalArgumentException() {
    // Arrange, Act and Assert
    assertThrows(IllegalArgumentException.class, () -> AbstractResourceBuilder.create("Uri String"));
  }
}
