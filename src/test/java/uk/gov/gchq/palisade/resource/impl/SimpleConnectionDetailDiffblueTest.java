package uk.gov.gchq.palisade.resource.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SimpleConnectionDetailDiffblueTest {
  /**
   * Test getters and setters.
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>default or parameterless constructor of {@link SimpleConnectionDetail}
   *   <li>{@link SimpleConnectionDetail#setServiceName(String)}
   *   <li>{@link SimpleConnectionDetail#toString()}
   *   <li>{@link SimpleConnectionDetail#getServiceName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "void SimpleConnectionDetail.<init>()",
    "String SimpleConnectionDetail.getServiceName()",
    "void SimpleConnectionDetail.setServiceName(String)",
    "String SimpleConnectionDetail.toString()"
  })
  void testGettersAndSetters() {
    // Arrange and Act
    SimpleConnectionDetail actualSimpleConnectionDetail = new SimpleConnectionDetail();
    actualSimpleConnectionDetail.setServiceName("\"DataAccessService\"");
    actualSimpleConnectionDetail.toString();

    // Assert
    assertEquals("\"DataAccessService\"", actualSimpleConnectionDetail.getServiceName());
  }

  /**
   * Test {@link SimpleConnectionDetail#serviceName(String)}.
   *
   * <p>Method under test: {@link SimpleConnectionDetail#serviceName(String)}
   */
  @Test
  @DisplayName("Test serviceName(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"SimpleConnectionDetail SimpleConnectionDetail.serviceName(String)"})
  void testServiceName() {
    // Arrange
    SimpleConnectionDetail simpleConnectionDetail = new SimpleConnectionDetail();

    // Act
    SimpleConnectionDetail actualServiceNameResult =
        simpleConnectionDetail.serviceName("\"https://palisade.gov.uk/data-service\"");

    // Assert
    assertEquals(
        "\"https://palisade.gov.uk/data-service\"", simpleConnectionDetail.getServiceName());
    assertSame(simpleConnectionDetail, actualServiceNameResult);
  }

  /**
   * Test {@link SimpleConnectionDetail#createConnection()}.
   *
   * <p>Method under test: {@link SimpleConnectionDetail#createConnection()}
   */
  @Test
  @DisplayName("Test createConnection()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String SimpleConnectionDetail.createConnection()"})
  void testCreateConnection() {
    // Arrange, Act and Assert
    assertNull(new SimpleConnectionDetail().createConnection());
  }

  /**
   * Test {@link SimpleConnectionDetail#equals(Object)}, and {@link
   * SimpleConnectionDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SimpleConnectionDetail#equals(Object)}
   *   <li>{@link SimpleConnectionDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleConnectionDetail.equals(Object)",
    "int SimpleConnectionDetail.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SimpleConnectionDetail simpleConnectionDetail = new SimpleConnectionDetail();
    simpleConnectionDetail.setServiceName("\"DataAccessService\"");

    SimpleConnectionDetail simpleConnectionDetail2 = new SimpleConnectionDetail();
    simpleConnectionDetail2.setServiceName("\"DataAccessService\"");

    // Act and Assert
    assertEquals(simpleConnectionDetail, simpleConnectionDetail2);
    assertEquals(simpleConnectionDetail.hashCode(), simpleConnectionDetail2.hashCode());
  }

  /**
   * Test {@link SimpleConnectionDetail#equals(Object)}, and {@link
   * SimpleConnectionDetail#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link SimpleConnectionDetail#equals(Object)}
   *   <li>{@link SimpleConnectionDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleConnectionDetail.equals(Object)",
    "int SimpleConnectionDetail.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SimpleConnectionDetail simpleConnectionDetail = new SimpleConnectionDetail();

    // Act and Assert
    assertEquals(simpleConnectionDetail, simpleConnectionDetail);
    int expectedHashCodeResult = simpleConnectionDetail.hashCode();
    assertEquals(expectedHashCodeResult, simpleConnectionDetail.hashCode());
  }

  /**
   * Test {@link SimpleConnectionDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleConnectionDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleConnectionDetail.equals(Object)",
    "int SimpleConnectionDetail.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SimpleConnectionDetail simpleConnectionDetail = new SimpleConnectionDetail();
    simpleConnectionDetail.setServiceName("\"DataAccessService\"");

    // Act and Assert
    assertNotEquals(simpleConnectionDetail, new SimpleConnectionDetail());
  }

  /**
   * Test {@link SimpleConnectionDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleConnectionDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleConnectionDetail.equals(Object)",
    "int SimpleConnectionDetail.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SimpleConnectionDetail(), null);
  }

  /**
   * Test {@link SimpleConnectionDetail#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link SimpleConnectionDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean SimpleConnectionDetail.equals(Object)",
    "int SimpleConnectionDetail.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SimpleConnectionDetail(), "Different type to SimpleConnectionDetail");
  }
}
