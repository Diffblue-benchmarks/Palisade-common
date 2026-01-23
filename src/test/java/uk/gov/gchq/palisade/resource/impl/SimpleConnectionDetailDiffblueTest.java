package uk.gov.gchq.palisade.resource.impl;

import static org.junit.jupiter.api.Assertions.assertNull;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SimpleConnectionDetailDiffblueTest {
  /**
   * Test new {@link SimpleConnectionDetail} (default constructor).
   *
   * <p>Method under test: default or parameterless constructor of {@link SimpleConnectionDetail}
   */
  @Test
  @DisplayName("Test new SimpleConnectionDetail (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void SimpleConnectionDetail.<init>()"})
  void testNewSimpleConnectionDetail() {
    // Arrange, Act and Assert
    assertNull(new SimpleConnectionDetail().getServiceName());
  }
}
