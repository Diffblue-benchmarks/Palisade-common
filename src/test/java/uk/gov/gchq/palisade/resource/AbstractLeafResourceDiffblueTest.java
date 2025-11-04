package uk.gov.gchq.palisade.resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import uk.gov.gchq.palisade.resource.impl.FileResource;

class AbstractLeafResourceDiffblueTest {
  /**
   * Test {@link AbstractLeafResource#type(String)}.
   * <p>
   * Method under test: {@link AbstractLeafResource#type(String)}
   */
  @Test
  @DisplayName("Test type(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"AbstractLeafResource AbstractLeafResource.type(String)"})
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
   * Test {@link AbstractLeafResource#serialisedFormat(String)}.
   * <p>
   * Method under test: {@link AbstractLeafResource#serialisedFormat(String)}
   */
  @Test
  @DisplayName("Test serialisedFormat(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"AbstractLeafResource AbstractLeafResource.serialisedFormat(String)"})
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
   * Test {@link AbstractLeafResource#connectionDetail(ConnectionDetail)}.
   * <ul>
   *   <li>Given {@link FileResource} (default constructor).</li>
   *   <li>Then return {@link FileResource} (default constructor).</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLeafResource#connectionDetail(ConnectionDetail)}
   */
  @Test
  @DisplayName("Test connectionDetail(ConnectionDetail); given FileResource (default constructor); then return FileResource (default constructor)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"AbstractLeafResource AbstractLeafResource.connectionDetail(ConnectionDetail)"})
  void testConnectionDetail_givenFileResource_thenReturnFileResource() {
    // Arrange
    FileResource fileResource = new FileResource();
    ConnectionDetail connectionDetail = mock(ConnectionDetail.class);

    // Act and Assert
    assertSame(fileResource, fileResource.connectionDetail(connectionDetail));
    assertSame(connectionDetail, fileResource.getConnectionDetail());
  }

  /**
   * Test {@link AbstractLeafResource#attributes(Map)}.
   * <p>
   * Method under test: {@link AbstractLeafResource#attributes(Map)}
   */
  @Test
  @DisplayName("Test attributes(Map)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"AbstractLeafResource AbstractLeafResource.attributes(Map)"})
  void testAttributes() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act and Assert
    assertSame(fileResource, fileResource.attributes(new HashMap<>()));
  }

  /**
   * Test {@link AbstractLeafResource#attribute(String, String)}.
   * <p>
   * Method under test: {@link AbstractLeafResource#attribute(String, String)}
   */
  @Test
  @DisplayName("Test attribute(String, String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"AbstractLeafResource AbstractLeafResource.attribute(String, String)"})
  void testAttribute() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act and Assert
    assertSame(fileResource, fileResource.attribute("Attribute Key", "42"));
  }

  /**
   * Test {@link AbstractLeafResource#getType()}.
   * <p>
   * Method under test: {@link AbstractLeafResource#getType()}
   */
  @Test
  @DisplayName("Test getType()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String AbstractLeafResource.getType()"})
  void testGetType() {
    // Arrange, Act and Assert
    assertNull((new FileResource()).getType());
  }

  /**
   * Test {@link AbstractLeafResource#setType(String)}.
   * <p>
   * Method under test: {@link AbstractLeafResource#setType(String)}
   */
  @Test
  @DisplayName("Test setType(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLeafResource.setType(String)"})
  void testSetType() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act
    fileResource.setType("Type");

    // Assert
    assertEquals("Type", fileResource.getType());
  }

  /**
   * Test {@link AbstractLeafResource#getSerialisedFormat()}.
   * <p>
   * Method under test: {@link AbstractLeafResource#getSerialisedFormat()}
   */
  @Test
  @DisplayName("Test getSerialisedFormat()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"String AbstractLeafResource.getSerialisedFormat()"})
  void testGetSerialisedFormat() {
    // Arrange, Act and Assert
    assertNull((new FileResource()).getSerialisedFormat());
  }

  /**
   * Test {@link AbstractLeafResource#setSerialisedFormat(String)}.
   * <p>
   * Method under test: {@link AbstractLeafResource#setSerialisedFormat(String)}
   */
  @Test
  @DisplayName("Test setSerialisedFormat(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLeafResource.setSerialisedFormat(String)"})
  void testSetSerialisedFormat() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act
    fileResource.setSerialisedFormat("Serialised Format");

    // Assert
    assertEquals("Serialised Format", fileResource.getSerialisedFormat());
  }

  /**
   * Test {@link AbstractLeafResource#setConnectionDetail(ConnectionDetail)}.
   * <ul>
   *   <li>Then {@link FileResource} (default constructor) ConnectionDetail is {@link ConnectionDetail}.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLeafResource#setConnectionDetail(ConnectionDetail)}
   */
  @Test
  @DisplayName("Test setConnectionDetail(ConnectionDetail); then FileResource (default constructor) ConnectionDetail is ConnectionDetail")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLeafResource.setConnectionDetail(ConnectionDetail)"})
  void testSetConnectionDetail_thenFileResourceConnectionDetailIsConnectionDetail() {
    // Arrange
    FileResource fileResource = new FileResource();
    ConnectionDetail connectionDetail = mock(ConnectionDetail.class);

    // Act
    fileResource.setConnectionDetail(connectionDetail);

    // Assert
    assertSame(connectionDetail, fileResource.getConnectionDetail());
  }

  /**
   * Test {@link AbstractLeafResource#getAttributes()}.
   * <p>
   * Method under test: {@link AbstractLeafResource#getAttributes()}
   */
  @Test
  @DisplayName("Test getAttributes()")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Map AbstractLeafResource.getAttributes()"})
  void testGetAttributes() {
    // Arrange, Act and Assert
    assertTrue((new FileResource()).getAttributes().isEmpty());
  }

  /**
   * Test {@link AbstractLeafResource#getAttribute(String)}.
   * <p>
   * Method under test: {@link AbstractLeafResource#getAttribute(String)}
   */
  @Test
  @DisplayName("Test getAttribute(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"Object AbstractLeafResource.getAttribute(String)"})
  void testGetAttribute() {
    // Arrange, Act and Assert
    assertNull((new FileResource()).getAttribute("Attribute Key"));
  }

  /**
   * Test {@link AbstractLeafResource#isAttributeSet(String)}.
   * <p>
   * Method under test: {@link AbstractLeafResource#isAttributeSet(String)}
   */
  @Test
  @DisplayName("Test isAttributeSet(String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"java.lang.Boolean AbstractLeafResource.isAttributeSet(String)"})
  void testIsAttributeSet() {
    // Arrange, Act and Assert
    assertFalse((new FileResource()).isAttributeSet("Attribute Key"));
  }

  /**
   * Test {@link AbstractLeafResource#setAttribute(String, String)}.
   * <p>
   * Method under test: {@link AbstractLeafResource#setAttribute(String, String)}
   */
  @Test
  @DisplayName("Test setAttribute(String, String)")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"void AbstractLeafResource.setAttribute(String, String)"})
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
   * Test {@link AbstractLeafResource#equals(Object)}, and {@link AbstractLeafResource#hashCode()}.
   * <ul>
   *   <li>When other is equal.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractLeafResource#equals(Object)}
   *   <li>{@link AbstractLeafResource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLeafResource.equals(Object)", "int AbstractLeafResource.hashCode()"})
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
   * Test {@link AbstractLeafResource#equals(Object)}, and {@link AbstractLeafResource#hashCode()}.
   * <ul>
   *   <li>When other is same.</li>
   *   <li>Then return equal.</li>
   * </ul>
   * <p>
   * Methods under test:
   * <ul>
   *   <li>{@link AbstractLeafResource#equals(Object)}
   *   <li>{@link AbstractLeafResource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLeafResource.equals(Object)", "int AbstractLeafResource.hashCode()"})
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FileResource fileResource = new FileResource();

    // Act and Assert
    assertEquals(fileResource, fileResource);
    int expectedHashCodeResult = fileResource.hashCode();
    assertEquals(expectedHashCodeResult, fileResource.hashCode());
  }

  /**
   * Test {@link AbstractLeafResource#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLeafResource.equals(Object)", "int AbstractLeafResource.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FileResource(), 1);
  }

  /**
   * Test {@link AbstractLeafResource#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLeafResource.equals(Object)", "int AbstractLeafResource.hashCode()"})
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    FileResource fileResource = new FileResource();
    fileResource.setId("42");

    // Act and Assert
    assertNotEquals(fileResource, new FileResource());
  }

  /**
   * Test {@link AbstractLeafResource#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLeafResource.equals(Object)", "int AbstractLeafResource.hashCode()"})
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
   * Test {@link AbstractLeafResource#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLeafResource.equals(Object)", "int AbstractLeafResource.hashCode()"})
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
   * Test {@link AbstractLeafResource#equals(Object)}.
   * <ul>
   *   <li>When other is different.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLeafResource.equals(Object)", "int AbstractLeafResource.hashCode()"})
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
   * Test {@link AbstractLeafResource#equals(Object)}.
   * <ul>
   *   <li>When other is {@code null}.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLeafResource.equals(Object)", "int AbstractLeafResource.hashCode()"})
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FileResource(), null);
  }

  /**
   * Test {@link AbstractLeafResource#equals(Object)}.
   * <ul>
   *   <li>When other is wrong type.</li>
   *   <li>Then return not equal.</li>
   * </ul>
   * <p>
   * Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("MaintainedByDiffblue")
  @MethodsUnderTest({"boolean AbstractLeafResource.equals(Object)", "int AbstractLeafResource.hashCode()"})
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(new FileResource(), "Different type to AbstractLeafResource");
  }
}
