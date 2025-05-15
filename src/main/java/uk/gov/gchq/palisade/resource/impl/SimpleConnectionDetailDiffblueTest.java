package uk.gov.gchq.palisade.resource.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import com.diffblue.cover.annotations.MethodsUnderTest;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

class SimpleConnectionDetailDiffblueTest {
  /**
   * Test getters and setters.
   * <p>
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link SimpleConnectionDetail}
   *   <li>{@link SimpleConnectionDetail#setServiceName(String)}
   *   <li>{@link SimpleConnectionDetail#toString()}
   *   <li>{@link SimpleConnectionDetail#getServiceName()}
   * </ul>
   */
  @Test
  @DisplayName("Test getters and setters")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void SimpleConnectionDetail.<init>()", "String SimpleConnectionDetail.getServiceName()",
      "void SimpleConnectionDetail.setServiceName(String)", "String SimpleConnectionDetail.toString()"})
  void testGettersAndSetters() {
    // Arrange and Act
    SimpleConnectionDetail actualSimpleConnectionDetail = new SimpleConnectionDetail();
    actualSimpleConnectionDetail.setServiceName("Service Name");
    actualSimpleConnectionDetail.toString();

    // Assert
    assertEquals("Service Name", actualSimpleConnectionDetail.getServiceName());
  }

  /**
   * Test {@link SimpleConnectionDetail#serviceName(String)}.
   * <p>
   * Method under test: {@link SimpleConnectionDetail#serviceName(String)}
   */
  @Test
  @DisplayName("Test serviceName(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"SimpleConnectionDetail SimpleConnectionDetail.serviceName(String)"})
  void testServiceName() {
    // Arrange
    SimpleConnectionDetail simpleConnectionDetail = new SimpleConnectionDetail();

    // Act
    SimpleConnectionDetail actualServiceNameResult = simpleConnectionDetail.serviceName("Service Name");

    // Assert
    assertEquals("Service Name", simpleConnectionDetail.getServiceName());
    assertSame(simpleConnectionDetail, actualServiceNameResult);
  }

  /**
   * Test {@link SimpleConnectionDetail#createConnection()}.
   * <p>
   * Method under test: {@link SimpleConnectionDetail#createConnection()}
   */
  @Test
  @DisplayName("Test createConnection()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String SimpleConnectionDetail.createConnection()"})
  void testCreateConnection() {
    // Arrange, Act and Assert
    assertNull((new SimpleConnectionDetail()).createConnection());
  }

  /**
   * Test {@link SimpleConnectionDetail#equals(Object)}, and {@link SimpleConnectionDetail#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SimpleConnectionDetail#equals(Object)}
   *   <li>{@link SimpleConnectionDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SimpleConnectionDetail.equals(Object)", "int SimpleConnectionDetail.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    SimpleConnectionDetail simpleConnectionDetail = new SimpleConnectionDetail();
    simpleConnectionDetail.setServiceName("Service Name");

    SimpleConnectionDetail simpleConnectionDetail2 = new SimpleConnectionDetail();
    simpleConnectionDetail2.setServiceName("Service Name");

    // Act and Assert
    assertEquals(simpleConnectionDetail, simpleConnectionDetail2);
    int expectedHashCodeResult = simpleConnectionDetail.hashCode();
    assertEquals(expectedHashCodeResult, simpleConnectionDetail2.hashCode());
  }

  /**
   * Test {@link SimpleConnectionDetail#equals(Object)}, and {@link SimpleConnectionDetail#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link SimpleConnectionDetail#equals(Object)}
   *   <li>{@link SimpleConnectionDetail#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SimpleConnectionDetail.equals(Object)", "int SimpleConnectionDetail.hashCode()"})
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
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleConnectionDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SimpleConnectionDetail.equals(Object)", "int SimpleConnectionDetail.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SimpleConnectionDetail simpleConnectionDetail = new SimpleConnectionDetail();
    simpleConnectionDetail.setServiceName("Service Name");

    // Act and Assert
    assertNotEquals(simpleConnectionDetail, new SimpleConnectionDetail());
  }

  /**
   * Test {@link SimpleConnectionDetail#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleConnectionDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SimpleConnectionDetail.equals(Object)", "int SimpleConnectionDetail.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SimpleConnectionDetail(), null);
  }

  /**
   * Test {@link SimpleConnectionDetail#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link SimpleConnectionDetail#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean SimpleConnectionDetail.equals(Object)", "int SimpleConnectionDetail.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SimpleConnectionDetail(), "Different type to SimpleConnectionDetail");
  }
}
