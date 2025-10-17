package uk.gov.gchq.palisade.resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.util.HashMap;
import java.util.Map;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import uk.gov.gchq.palisade.resource.impl.DirectoryResourceFactory;
import uk.gov.gchq.palisade.resource.impl.FileResource;
import uk.gov.gchq.palisade.resource.impl.FileResourceFactory;

class AbstractLeafResourceDiffblueTest {
  /**
   * Test {@link AbstractLeafResource#type(String)}.
   *
   * <p>Method under test: {@link AbstractLeafResource#type(String)}
   */
  @Test
  @DisplayName("Test type(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AbstractLeafResource AbstractLeafResource.type(String)"})
  void testType() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    // Act
    FileResource actualTypeResult = createFileResourceResult.type("Type");

    // Assert
    assertEquals("Type", createFileResourceResult.getType());
    assertSame(createFileResourceResult, actualTypeResult);
  }

  /**
   * Test {@link AbstractLeafResource#serialisedFormat(String)}.
   *
   * <p>Method under test: {@link AbstractLeafResource#serialisedFormat(String)}
   */
  @Test
  @DisplayName("Test serialisedFormat(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AbstractLeafResource AbstractLeafResource.serialisedFormat(String)"})
  void testSerialisedFormat() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    // Act
    FileResource actualSerialisedFormatResult =
        createFileResourceResult.serialisedFormat("Serialised Format");

    // Assert
    assertEquals("Serialised Format", createFileResourceResult.getSerialisedFormat());
    assertSame(createFileResourceResult, actualSerialisedFormatResult);
  }

  /**
   * Test {@link AbstractLeafResource#connectionDetail(ConnectionDetail)}.
   *
   * <ul>
   *   <li>Given createFileResource.
   *   <li>Then return createFileResource.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLeafResource#connectionDetail(ConnectionDetail)}
   */
  @Test
  @DisplayName(
      "Test connectionDetail(ConnectionDetail); given createFileResource; then return createFileResource")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "AbstractLeafResource AbstractLeafResource.connectionDetail(ConnectionDetail)"
  })
  void testConnectionDetail_givenCreateFileResource_thenReturnCreateFileResource() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();
    ConnectionDetail connectionDetail = mock(ConnectionDetail.class);

    // Act
    FileResource actualConnectionDetailResult =
        createFileResourceResult.connectionDetail(connectionDetail);

    // Assert
    assertSame(createFileResourceResult, actualConnectionDetailResult);
    assertSame(connectionDetail, createFileResourceResult.getConnectionDetail());
  }

  /**
   * Test {@link AbstractLeafResource#attributes(Map)}.
   *
   * <p>Method under test: {@link AbstractLeafResource#attributes(Map)}
   */
  @Test
  @DisplayName("Test attributes(Map)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AbstractLeafResource AbstractLeafResource.attributes(Map)"})
  void testAttributes() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    // Act
    FileResource actualAttributesResult = createFileResourceResult.attributes(new HashMap<>());

    // Assert
    assertSame(createFileResourceResult, actualAttributesResult);
  }

  /**
   * Test {@link AbstractLeafResource#attribute(String, String)}.
   *
   * <p>Method under test: {@link AbstractLeafResource#attribute(String, String)}
   */
  @Test
  @DisplayName("Test attribute(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"AbstractLeafResource AbstractLeafResource.attribute(String, String)"})
  void testAttribute() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    // Act
    FileResource actualAttributeResult = createFileResourceResult.attribute("Attribute Key", "42");

    // Assert
    assertSame(createFileResourceResult, actualAttributeResult);
  }

  /**
   * Test {@link AbstractLeafResource#getType()}.
   *
   * <p>Method under test: {@link AbstractLeafResource#getType()}
   */
  @Test
  @DisplayName("Test getType()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AbstractLeafResource.getType()"})
  void testGetType() {
    // Arrange, Act and Assert
    assertNull(FileResourceFactory.createFileResource().getType());
  }

  /**
   * Test {@link AbstractLeafResource#setType(String)}.
   *
   * <ul>
   *   <li>When {@code Type}.
   *   <li>Then createFileResource Type is {@code Type}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLeafResource#setType(String)}
   */
  @Test
  @DisplayName("Test setType(String); when 'Type'; then createFileResource Type is 'Type'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractLeafResource.setType(String)"})
  void testSetType_whenType_thenCreateFileResourceTypeIsType() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    // Act
    createFileResourceResult.setType("Type");

    // Assert
    assertEquals("Type", createFileResourceResult.getType());
  }

  /**
   * Test {@link AbstractLeafResource#getSerialisedFormat()}.
   *
   * <p>Method under test: {@link AbstractLeafResource#getSerialisedFormat()}
   */
  @Test
  @DisplayName("Test getSerialisedFormat()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"String AbstractLeafResource.getSerialisedFormat()"})
  void testGetSerialisedFormat() {
    // Arrange, Act and Assert
    assertNull(FileResourceFactory.createFileResource().getSerialisedFormat());
  }

  /**
   * Test {@link AbstractLeafResource#setSerialisedFormat(String)}.
   *
   * <ul>
   *   <li>Then createFileResource SerialisedFormat is {@code Serialised Format}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLeafResource#setSerialisedFormat(String)}
   */
  @Test
  @DisplayName(
      "Test setSerialisedFormat(String); then createFileResource SerialisedFormat is 'Serialised Format'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractLeafResource.setSerialisedFormat(String)"})
  void testSetSerialisedFormat_thenCreateFileResourceSerialisedFormatIsSerialisedFormat() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    // Act
    createFileResourceResult.setSerialisedFormat("Serialised Format");

    // Assert
    assertEquals("Serialised Format", createFileResourceResult.getSerialisedFormat());
  }

  /**
   * Test {@link AbstractLeafResource#getConnectionDetail()}.
   *
   * <ul>
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLeafResource#getConnectionDetail()}
   */
  @Test
  @DisplayName("Test getConnectionDetail(); then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"ConnectionDetail AbstractLeafResource.getConnectionDetail()"})
  void testGetConnectionDetail_thenReturnNull() {
    // Arrange, Act and Assert
    assertNull(FileResourceFactory.createFileResource().getConnectionDetail());
  }

  /**
   * Test {@link AbstractLeafResource#setConnectionDetail(ConnectionDetail)}.
   *
   * <ul>
   *   <li>Then createFileResource ConnectionDetail is {@link ConnectionDetail}.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLeafResource#setConnectionDetail(ConnectionDetail)}
   */
  @Test
  @DisplayName(
      "Test setConnectionDetail(ConnectionDetail); then createFileResource ConnectionDetail is ConnectionDetail")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractLeafResource.setConnectionDetail(ConnectionDetail)"})
  void testSetConnectionDetail_thenCreateFileResourceConnectionDetailIsConnectionDetail() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();
    ConnectionDetail connectionDetail = mock(ConnectionDetail.class);

    // Act
    createFileResourceResult.setConnectionDetail(connectionDetail);

    // Assert
    assertSame(connectionDetail, createFileResourceResult.getConnectionDetail());
  }

  /**
   * Test {@link AbstractLeafResource#getAttributes()}.
   *
   * <p>Method under test: {@link AbstractLeafResource#getAttributes()}
   */
  @Test
  @DisplayName("Test getAttributes()")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Map AbstractLeafResource.getAttributes()"})
  void testGetAttributes() {
    // Arrange, Act and Assert
    assertTrue(FileResourceFactory.createFileResource().getAttributes().isEmpty());
  }

  /**
   * Test {@link AbstractLeafResource#getAttribute(String)}.
   *
   * <p>Method under test: {@link AbstractLeafResource#getAttribute(String)}
   */
  @Test
  @DisplayName("Test getAttribute(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Object AbstractLeafResource.getAttribute(String)"})
  void testGetAttribute() {
    // Arrange, Act and Assert
    assertNull(FileResourceFactory.createFileResource().getAttribute("Attribute Key"));
  }

  /**
   * Test {@link AbstractLeafResource#isAttributeSet(String)}.
   *
   * <p>Method under test: {@link AbstractLeafResource#isAttributeSet(String)}
   */
  @Test
  @DisplayName("Test isAttributeSet(String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"java.lang.Boolean AbstractLeafResource.isAttributeSet(String)"})
  void testIsAttributeSet() {
    // Arrange, Act and Assert
    assertFalse(FileResourceFactory.createFileResource().isAttributeSet("Attribute Key"));
  }

  /**
   * Test {@link AbstractLeafResource#setAttribute(String, String)}.
   *
   * <p>Method under test: {@link AbstractLeafResource#setAttribute(String, String)}
   */
  @Test
  @DisplayName("Test setAttribute(String, String)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"void AbstractLeafResource.setAttribute(String, String)"})
  void testSetAttribute() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    // Act
    createFileResourceResult.setAttribute("Attribute Key", "42");

    // Assert
    Map<String, String> attributes = createFileResourceResult.getAttributes();
    assertEquals(1, attributes.size());
    assertEquals("42", attributes.get("Attribute Key"));
  }

  /**
   * Test {@link AbstractLeafResource#equals(Object)}, and {@link AbstractLeafResource#hashCode()}.
   *
   * <ul>
   *   <li>When other is equal.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractLeafResource#equals(Object)}
   *   <li>{@link AbstractLeafResource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is equal; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractLeafResource.equals(Object)",
    "int AbstractLeafResource.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsEqual_thenReturnEqual() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();
    FileResource createFileResourceResult2 = FileResourceFactory.createFileResource();

    // Act and Assert
    assertEquals(createFileResourceResult, createFileResourceResult2);
    assertEquals(createFileResourceResult.hashCode(), createFileResourceResult2.hashCode());
  }

  /**
   * Test {@link AbstractLeafResource#equals(Object)}, and {@link AbstractLeafResource#hashCode()}.
   *
   * <ul>
   *   <li>When other is same.
   *   <li>Then return equal.
   * </ul>
   *
   * <p>Methods under test:
   *
   * <ul>
   *   <li>{@link AbstractLeafResource#equals(Object)}
   *   <li>{@link AbstractLeafResource#hashCode()}
   * </ul>
   */
  @Test
  @DisplayName("Test equals(Object), and hashCode(); when other is same; then return equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractLeafResource.equals(Object)",
    "int AbstractLeafResource.hashCode()"
  })
  void testEqualsAndHashCode_whenOtherIsSame_thenReturnEqual() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    // Act and Assert
    assertEquals(createFileResourceResult, createFileResourceResult);
    int expectedHashCodeResult = createFileResourceResult.hashCode();
    assertEquals(expectedHashCodeResult, createFileResourceResult.hashCode());
  }

  /**
   * Test {@link AbstractLeafResource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractLeafResource.equals(Object)",
    "int AbstractLeafResource.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    // Act and Assert
    assertNotEquals(createFileResourceResult, DirectoryResourceFactory.createDirectoryResource());
  }

  /**
   * Test {@link AbstractLeafResource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractLeafResource.equals(Object)",
    "int AbstractLeafResource.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual2() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();

    // Act and Assert
    assertNotEquals(createFileResourceResult, new FileResource());
  }

  /**
   * Test {@link AbstractLeafResource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractLeafResource.equals(Object)",
    "int AbstractLeafResource.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual3() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();
    createFileResourceResult.setType("file:///test/directory/testfile.txt");

    // Act and Assert
    assertNotEquals(createFileResourceResult, FileResourceFactory.createFileResource());
  }

  /**
   * Test {@link AbstractLeafResource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractLeafResource.equals(Object)",
    "int AbstractLeafResource.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual4() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();
    createFileResourceResult.setSerialisedFormat("file:///test/directory/testfile.txt");

    // Act and Assert
    assertNotEquals(createFileResourceResult, FileResourceFactory.createFileResource());
  }

  /**
   * Test {@link AbstractLeafResource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractLeafResource.equals(Object)",
    "int AbstractLeafResource.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual5() {
    // Arrange
    FileResource createFileResourceResult = FileResourceFactory.createFileResource();
    createFileResourceResult.setConnectionDetail(mock(ConnectionDetail.class));

    // Act and Assert
    assertNotEquals(createFileResourceResult, FileResourceFactory.createFileResource());
  }

  /**
   * Test {@link AbstractLeafResource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is different.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is different; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractLeafResource.equals(Object)",
    "int AbstractLeafResource.hashCode()"
  })
  void testEquals_whenOtherIsDifferent_thenReturnNotEqual6() {
    // Arrange
    HashMap<String, String> attributes = new HashMap<>();
    attributes.put("Key", "42");

    FileResource createFileResourceResult = FileResourceFactory.createFileResource();
    createFileResourceResult.setAttributes(attributes);

    // Act and Assert
    assertNotEquals(createFileResourceResult, FileResourceFactory.createFileResource());
  }

  /**
   * Test {@link AbstractLeafResource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is {@code null}.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is 'null'; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractLeafResource.equals(Object)",
    "int AbstractLeafResource.hashCode()"
  })
  void testEquals_whenOtherIsNull_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(FileResourceFactory.createFileResource(), null);
  }

  /**
   * Test {@link AbstractLeafResource#equals(Object)}.
   *
   * <ul>
   *   <li>When other is wrong type.
   *   <li>Then return not equal.
   * </ul>
   *
   * <p>Method under test: {@link AbstractLeafResource#equals(Object)}
   */
  @Test
  @DisplayName("Test equals(Object); when other is wrong type; then return not equal")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "boolean AbstractLeafResource.equals(Object)",
    "int AbstractLeafResource.hashCode()"
  })
  void testEquals_whenOtherIsWrongType_thenReturnNotEqual() {
    // Arrange, Act and Assert
    assertNotEquals(
        FileResourceFactory.createFileResource(), "Different type to AbstractLeafResource");
  }
}
