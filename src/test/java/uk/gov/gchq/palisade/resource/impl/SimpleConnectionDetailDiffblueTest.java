package uk.gov.gchq.palisade.resource.impl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import org.junit.jupiter.api.Test;

class SimpleConnectionDetailDiffblueTest {
  /**
   * Method under test: {@link SimpleConnectionDetail#serviceName(String)}
   */
  @Test
  void testServiceName() {
    // Arrange
    SimpleConnectionDetail simpleConnectionDetail = new SimpleConnectionDetail();

    // Act
    SimpleConnectionDetail actualServiceNameResult = simpleConnectionDetail.serviceName("Service Name");

    // Assert
    assertEquals("Service Name", simpleConnectionDetail.getServiceName());
    assertEquals("Service Name", actualServiceNameResult.getServiceName());
    assertSame(simpleConnectionDetail, actualServiceNameResult);
  }

  /**
   * Method under test: {@link SimpleConnectionDetail#createConnection()}
   */
  @Test
  void testCreateConnection() {
    // Arrange, Act and Assert
    assertNull((new SimpleConnectionDetail()).createConnection());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link SimpleConnectionDetail#equals(Object)}
   *   <li>{@link SimpleConnectionDetail#hashCode()}
   * </ul>
   */
  @Test
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
   * Methods under test:
   * <ul>
   *   <li>{@link SimpleConnectionDetail#equals(Object)}
   *   <li>{@link SimpleConnectionDetail#hashCode()}
   * </ul>
   */
  @Test
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    SimpleConnectionDetail simpleConnectionDetail = new SimpleConnectionDetail();

    // Act and Assert
    assertEquals(simpleConnectionDetail, simpleConnectionDetail);
    int expectedHashCodeResult = simpleConnectionDetail.hashCode();
    assertEquals(expectedHashCodeResult, simpleConnectionDetail.hashCode());
  }

  /**
   * Method under test: {@link SimpleConnectionDetail#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    SimpleConnectionDetail simpleConnectionDetail = new SimpleConnectionDetail();
    simpleConnectionDetail.setServiceName("Service Name");

    // Act and Assert
    assertNotEquals(simpleConnectionDetail, new SimpleConnectionDetail());
  }

  /**
   * Method under test: {@link SimpleConnectionDetail#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SimpleConnectionDetail(), null);
  }

  /**
   * Method under test: {@link SimpleConnectionDetail#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new SimpleConnectionDetail(), "Different type to SimpleConnectionDetail");
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>default or parameterless constructor of {@link SimpleConnectionDetail}
   *   <li>{@link SimpleConnectionDetail#setServiceName(String)}
   *   <li>{@link SimpleConnectionDetail#toString()}
   *   <li>{@link SimpleConnectionDetail#getServiceName()}
   * </ul>
   */
  @Test
  void testGettersAndSetters() {
    // Arrange and Act
    SimpleConnectionDetail actualSimpleConnectionDetail = new SimpleConnectionDetail();
    actualSimpleConnectionDetail.setServiceName("Service Name");
    actualSimpleConnectionDetail.toString();

    // Assert that nothing has changed
    assertEquals("Service Name", actualSimpleConnectionDetail.getServiceName());
  }
}
