package uk.gov.gchq.palisade.resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.Test;
import uk.gov.gchq.palisade.resource.impl.DirectoryResource;
import uk.gov.gchq.palisade.resource.impl.FileResource;

class AbstractLeafResourceDiffblueTest {
  /**
   * Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FileResource(), 1);
    assertNotEquals(new FileResource(), mock(DirectoryResource.class));
  }

  /**
   * Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setId("42");

    // Act and Assert
    assertNotEquals(fileResource, new FileResource());
  }

  /**
   * Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setType("42");
    fileResource.setId("42");

    FileResource fileResource2 = new FileResource();
    fileResource2.setId("42");

    // Act and Assert
    assertNotEquals(fileResource, fileResource2);
  }

  /**
   * Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setSerialisedFormat("42");
    fileResource.setId("42");

    FileResource fileResource2 = new FileResource();
    fileResource2.setId("42");

    // Act and Assert
    assertNotEquals(fileResource, fileResource2);
  }

  /**
   * Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));
    fileResource.setId("42");

    FileResource fileResource2 = new FileResource();
    fileResource2.setId("42");

    // Act and Assert
    assertNotEquals(fileResource, fileResource2);
  }

  /**
   * Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FileResource(), null);
  }

  /**
   * Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FileResource(), "Different type to AbstractLeafResource");
  }

  /**
   * Method under test: {@link AbstractLeafResource#type(String)}
   */
  @Test
  void testType() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act
    FileResource actualTypeResult = fileResource.type("Type");

    // Assert
    assertEquals("Type", fileResource.getType());
    assertSame(fileResource, actualTypeResult);
  }

  /**
   * Method under test: {@link AbstractLeafResource#type(String)}
   */
  @Test
  void testType2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));

    // Act
    FileResource actualTypeResult = fileResource.type("Type");

    // Assert
    assertEquals("Type", fileResource.getType());
    assertSame(fileResource, actualTypeResult);
  }

  /**
   * Method under test: {@link AbstractLeafResource#serialisedFormat(String)}
   */
  @Test
  void testSerialisedFormat() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act
    FileResource actualSerialisedFormatResult = fileResource.serialisedFormat("Serialised Format");

    // Assert
    assertEquals("Serialised Format", fileResource.getSerialisedFormat());
    assertSame(fileResource, actualSerialisedFormatResult);
  }

  /**
   * Method under test: {@link AbstractLeafResource#serialisedFormat(String)}
   */
  @Test
  void testSerialisedFormat2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));

    // Act
    FileResource actualSerialisedFormatResult = fileResource.serialisedFormat("Serialised Format");

    // Assert
    assertEquals("Serialised Format", fileResource.getSerialisedFormat());
    assertSame(fileResource, actualSerialisedFormatResult);
  }

  /**
   * Method under test:
   * {@link AbstractLeafResource#connectionDetail(ConnectionDetail)}
   */
  @Test
  void testConnectionDetail() {
    // Arrange
    FileResource fileResource = new FileResource();
    ConnectionDetail connectionDetail = mock(ConnectionDetail.class);

    // Act and Assert
    assertSame(fileResource, fileResource.connectionDetail(connectionDetail));
    assertSame(connectionDetail, fileResource.getConnectionDetail());
  }

  /**
   * Method under test: {@link AbstractLeafResource#attributes(Map)}
   */
  @Test
  void testAttributes() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act and Assert
    assertSame(fileResource, fileResource.attributes(new HashMap<>()));
  }

  /**
   * Method under test: {@link AbstractLeafResource#attributes(Map)}
   */
  @Test
  void testAttributes2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));

    // Act and Assert
    assertSame(fileResource, fileResource.attributes(new HashMap<>()));
  }

  /**
   * Method under test: {@link AbstractLeafResource#attribute(String, String)}
   */
  @Test
  void testAttribute() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act and Assert
    assertSame(fileResource, fileResource.attribute("Attribute Key", "42"));
  }

  /**
   * Method under test: {@link AbstractLeafResource#attribute(String, String)}
   */
  @Test
  void testAttribute2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));

    // Act and Assert
    assertSame(fileResource, fileResource.attribute("Attribute Key", "42"));
  }

  /**
   * Method under test: {@link AbstractLeafResource#getType()}
   */
  @Test
  void testGetType() {
    // Arrange, Act and Assert
    assertNull((new FileResource()).getType());
  }

  /**
   * Method under test: {@link AbstractLeafResource#getType()}
   */
  @Test
  void testGetType2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));

    // Act and Assert
    assertNull(fileResource.getType());
  }

  /**
   * Method under test: {@link AbstractLeafResource#setType(String)}
   */
  @Test
  void testSetType() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act
    fileResource.setType("Type");

    // Assert
    assertEquals("Type", fileResource.getType());
  }

  /**
   * Method under test: {@link AbstractLeafResource#setType(String)}
   */
  @Test
  void testSetType2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));

    // Act
    fileResource.setType("Type");

    // Assert
    assertEquals("Type", fileResource.getType());
  }

  /**
   * Method under test: {@link AbstractLeafResource#getSerialisedFormat()}
   */
  @Test
  void testGetSerialisedFormat() {
    // Arrange, Act and Assert
    assertNull((new FileResource()).getSerialisedFormat());
  }

  /**
   * Method under test: {@link AbstractLeafResource#getSerialisedFormat()}
   */
  @Test
  void testGetSerialisedFormat2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));

    // Act and Assert
    assertNull(fileResource.getSerialisedFormat());
  }

  /**
   * Method under test: {@link AbstractLeafResource#setSerialisedFormat(String)}
   */
  @Test
  void testSetSerialisedFormat() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act
    fileResource.setSerialisedFormat("Serialised Format");

    // Assert
    assertEquals("Serialised Format", fileResource.getSerialisedFormat());
  }

  /**
   * Method under test: {@link AbstractLeafResource#setSerialisedFormat(String)}
   */
  @Test
  void testSetSerialisedFormat2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));

    // Act
    fileResource.setSerialisedFormat("Serialised Format");

    // Assert
    assertEquals("Serialised Format", fileResource.getSerialisedFormat());
  }

  /**
   * Method under test: {@link AbstractLeafResource#getConnectionDetail()}
   */
  @Test
  void testGetConnectionDetail() {
    // Arrange
    ConnectionDetail connectionDetail = mock(ConnectionDetail.class);
    when(connectionDetail.createConnection()).thenReturn("Create Connection");

    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(connectionDetail);

    // Act
    String actualCreateConnectionResult = fileResource.getConnectionDetail().createConnection();

    // Assert
    verify(connectionDetail).createConnection();
    assertEquals("Create Connection", actualCreateConnectionResult);
  }

  /**
   * Method under test:
   * {@link AbstractLeafResource#setConnectionDetail(ConnectionDetail)}
   */
  @Test
  void testSetConnectionDetail() {
    // Arrange
    FileResource fileResource = new FileResource();
    ConnectionDetail connectionDetail = mock(ConnectionDetail.class);

    // Act
    fileResource.setConnectionDetail(connectionDetail);

    // Assert
    assertSame(connectionDetail, fileResource.getConnectionDetail());
  }

  /**
   * Method under test: {@link AbstractLeafResource#getAttributes()}
   */
  @Test
  void testGetAttributes() {
    // Arrange, Act and Assert
    assertTrue((new FileResource()).getAttributes().isEmpty());
  }

  /**
   * Method under test: {@link AbstractLeafResource#getAttributes()}
   */
  @Test
  void testGetAttributes2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));

    // Act and Assert
    assertTrue(fileResource.getAttributes().isEmpty());
  }

  /**
   * Method under test: {@link AbstractLeafResource#getAttribute(String)}
   */
  @Test
  void testGetAttribute() {
    // Arrange, Act and Assert
    assertNull((new FileResource()).getAttribute("Attribute Key"));
  }

  /**
   * Method under test: {@link AbstractLeafResource#getAttribute(String)}
   */
  @Test
  void testGetAttribute2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));

    // Act and Assert
    assertNull(fileResource.getAttribute("Attribute Key"));
  }

  /**
   * Method under test: {@link AbstractLeafResource#isAttributeSet(String)}
   */
  @Test
  void testIsAttributeSet() {
    // Arrange, Act and Assert
    assertFalse((new FileResource()).isAttributeSet("Attribute Key"));
  }

  /**
   * Method under test: {@link AbstractLeafResource#isAttributeSet(String)}
   */
  @Test
  void testIsAttributeSet2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));

    // Act and Assert
    assertFalse(fileResource.isAttributeSet("Attribute Key"));
  }

  /**
   * Method under test: {@link AbstractLeafResource#setAttribute(String, String)}
   */
  @Test
  void testSetAttribute() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act
    fileResource.setAttribute("Attribute Key", "42");

    // Assert
    Map<String, String> attributes = fileResource.getAttributes();
    assertEquals(1, attributes.size());
    assertEquals("42", attributes.get("Attribute Key"));
  }

  /**
   * Method under test: {@link AbstractLeafResource#setAttribute(String, String)}
   */
  @Test
  void testSetAttribute2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setConnectionDetail(mock(ConnectionDetail.class));

    // Act
    fileResource.setAttribute("Attribute Key", "42");

    // Assert
    Map<String, String> attributes = fileResource.getAttributes();
    assertEquals(1, attributes.size());
    assertEquals("42", attributes.get("Attribute Key"));
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractLeafResource#equals(Object)}
   *   <li>{@link AbstractLeafResource#hashCode()}
   * </ul>
   */
  @Test
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setId("42");

    FileResource fileResource2 = new FileResource();
    fileResource2.setId("42");

    // Act and Assert
    assertEquals(fileResource, fileResource2);
    int expectedHashCodeResult = fileResource.hashCode();
    assertEquals(expectedHashCodeResult, fileResource2.hashCode());
  }

  /**
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractLeafResource#equals(Object)}
   *   <li>{@link AbstractLeafResource#hashCode()}
   * </ul>
   */
  @Test
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act and Assert
    assertEquals(fileResource, fileResource);
    int expectedHashCodeResult = fileResource.hashCode();
    assertEquals(expectedHashCodeResult, fileResource.hashCode());
  }
}
