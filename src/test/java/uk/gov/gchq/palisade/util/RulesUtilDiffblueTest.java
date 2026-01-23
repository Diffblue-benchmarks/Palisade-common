package uk.gov.gchq.palisade.util;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.ArgumentMatchers.isA;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import uk.gov.gchq.palisade.Context;
import uk.gov.gchq.palisade.rule.Rule;
import uk.gov.gchq.palisade.rule.Rules;
import uk.gov.gchq.palisade.user.User;

class RulesUtilDiffblueTest {
  /**
   * Test {@link RulesUtil#applyRulesToStream(Stream, User, Context, Rules, AtomicLong,
   * AtomicLong)}.
   *
   * <ul>
   *   <li>Given {@code 42}.
   *   <li>When {@link Rules} (default constructor) addRule {@code 42} and {@link Rule}.
   * </ul>
   *
   * <p>Method under test: {@link RulesUtil#applyRulesToStream(Stream, User, Context, Rules,
   * AtomicLong, AtomicLong)}
   */
  @Test
  @DisplayName(
      "Test applyRulesToStream(Stream, User, Context, Rules, AtomicLong, AtomicLong); given '42'; when Rules (default constructor) addRule '42' and Rule")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Stream RulesUtil.applyRulesToStream(Stream, User, Context, Rules, AtomicLong, AtomicLong)"
  })
  void testApplyRulesToStream_given42_whenRulesAddRule42AndRule() {
    // Arrange
    ArrayList<Serializable> serializableList = new ArrayList<>();
    Stream<Serializable> records = serializableList.stream();
    User user = new User();
    Context context = new Context();

    Rules<Serializable> rules = new Rules<>();
    rules.addRule("42", mock(Rule.class));
    AtomicLong recordsProcessed = new AtomicLong();

    // Act
    Stream<Serializable> actualApplyRulesToStreamResult =
        RulesUtil.applyRulesToStream(
            records, user, context, rules, recordsProcessed, new AtomicLong());

    // Assert
    assertTrue(actualApplyRulesToStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link RulesUtil#applyRulesToStream(Stream, User, Context, Rules, AtomicLong,
   * AtomicLong)}.
   *
   * <ul>
   *   <li>When {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link RulesUtil#applyRulesToStream(Stream, User, Context, Rules,
   * AtomicLong, AtomicLong)}
   */
  @Test
  @DisplayName(
      "Test applyRulesToStream(Stream, User, Context, Rules, AtomicLong, AtomicLong); when 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Stream RulesUtil.applyRulesToStream(Stream, User, Context, Rules, AtomicLong, AtomicLong)"
  })
  void testApplyRulesToStream_whenNull() {
    // Arrange
    ArrayList<Serializable> serializableList = new ArrayList<>();
    Stream<Serializable> records = serializableList.stream();
    User user = new User();
    Context context = new Context();
    AtomicLong recordsProcessed = new AtomicLong();

    // Act
    Stream<Serializable> actualApplyRulesToStreamResult =
        RulesUtil.applyRulesToStream(
            records, user, context, null, recordsProcessed, new AtomicLong());

    // Assert
    assertTrue(actualApplyRulesToStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link RulesUtil#applyRulesToStream(Stream, User, Context, Rules, AtomicLong,
   * AtomicLong)}.
   *
   * <ul>
   *   <li>When {@link Rules} (default constructor).
   * </ul>
   *
   * <p>Method under test: {@link RulesUtil#applyRulesToStream(Stream, User, Context, Rules,
   * AtomicLong, AtomicLong)}
   */
  @Test
  @DisplayName(
      "Test applyRulesToStream(Stream, User, Context, Rules, AtomicLong, AtomicLong); when Rules (default constructor)")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Stream RulesUtil.applyRulesToStream(Stream, User, Context, Rules, AtomicLong, AtomicLong)"
  })
  void testApplyRulesToStream_whenRules() {
    // Arrange
    ArrayList<Serializable> serializableList = new ArrayList<>();
    Stream<Serializable> records = serializableList.stream();
    User user = new User();
    Context context = new Context();
    Rules<Serializable> rules = new Rules<>();
    AtomicLong recordsProcessed = new AtomicLong();

    // Act
    Stream<Serializable> actualApplyRulesToStreamResult =
        RulesUtil.applyRulesToStream(
            records, user, context, rules, recordsProcessed, new AtomicLong());

    // Assert
    assertTrue(actualApplyRulesToStreamResult.limit(5).collect(Collectors.toList()).isEmpty());
  }

  /**
   * Test {@link RulesUtil#applyRulesToItem(Serializable, User, Context, Rules)}.
   *
   * <ul>
   *   <li>Given {@link Rule} {@link Rule#apply(Serializable, User, Context)} return {@code null}.
   *   <li>Then return {@code null}.
   * </ul>
   *
   * <p>Method under test: {@link RulesUtil#applyRulesToItem(Serializable, User, Context, Rules)}
   */
  @Test
  @DisplayName(
      "Test applyRulesToItem(Serializable, User, Context, Rules); given Rule apply(Serializable, User, Context) return 'null'; then return 'null'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Serializable RulesUtil.applyRulesToItem(Serializable, User, Context, Rules)"})
  void testApplyRulesToItem_givenRuleApplyReturnNull_thenReturnNull() {
    // Arrange
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/mm/dd");
    User user = new User();
    Context context = new Context();

    Rule<Serializable> rule = mock(Rule.class);
    when(rule.apply(Mockito.<Serializable>any(), Mockito.<User>any(), Mockito.<Context>any()))
        .thenReturn(null);

    Rules<Serializable> rules = new Rules<>();
    rules.addRule("]", rule);
    rules.addRule("Id", mock(Rule.class));
    rules.addRule("42", mock(Rule.class));

    // Act
    Serializable actualApplyRulesToItemResult =
        RulesUtil.applyRulesToItem(simpleDateFormat, user, context, rules);

    // Assert
    verify(rule).apply(isA(Serializable.class), isA(User.class), isA(Context.class));
    assertNull(actualApplyRulesToItemResult);
  }

  /**
   * Test {@link RulesUtil#applyRulesToItem(Serializable, User, Context, Rules)}.
   *
   * <ul>
   *   <li>Then return {@link SimpleDateFormat#SimpleDateFormat(String)} with {@code yyyy/mm/dd}.
   * </ul>
   *
   * <p>Method under test: {@link RulesUtil#applyRulesToItem(Serializable, User, Context, Rules)}
   */
  @Test
  @DisplayName(
      "Test applyRulesToItem(Serializable, User, Context, Rules); then return SimpleDateFormat(String) with 'yyyy/mm/dd'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Serializable RulesUtil.applyRulesToItem(Serializable, User, Context, Rules)"})
  void testApplyRulesToItem_thenReturnSimpleDateFormatWithYyyyMmDd() {
    // Arrange
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/mm/dd");
    User user = new User();
    Context context = new Context();

    Rule<Serializable> rule = mock(Rule.class);
    when(rule.apply(Mockito.<Serializable>any(), Mockito.<User>any(), Mockito.<Context>any()))
        .thenReturn(new SimpleDateFormat("yyyy/mm/dd"));

    Rules<Serializable> rules = new Rules<>();
    rules.addRule("42", rule);

    // Act
    Serializable actualApplyRulesToItemResult =
        RulesUtil.applyRulesToItem(simpleDateFormat, user, context, rules);

    // Assert
    verify(rule).apply(isA(Serializable.class), isA(User.class), isA(Context.class));
    assertTrue(actualApplyRulesToItemResult instanceof SimpleDateFormat);
    assertEquals(simpleDateFormat, actualApplyRulesToItemResult);
  }

  /**
   * Test {@link RulesUtil#applyRulesToItem(Serializable, User, Context, Rules)}.
   *
   * <ul>
   *   <li>When {@code null}.
   *   <li>Then NumberFormat return {@link DecimalFormat}.
   * </ul>
   *
   * <p>Method under test: {@link RulesUtil#applyRulesToItem(Serializable, User, Context, Rules)}
   */
  @Test
  @DisplayName(
      "Test applyRulesToItem(Serializable, User, Context, Rules); when 'null'; then NumberFormat return DecimalFormat")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Serializable RulesUtil.applyRulesToItem(Serializable, User, Context, Rules)"})
  void testApplyRulesToItem_whenNull_thenNumberFormatReturnDecimalFormat() {
    // Arrange
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/mm/dd");
    User user = new User();

    // Act
    Serializable actualApplyRulesToItemResult =
        RulesUtil.applyRulesToItem(simpleDateFormat, user, new Context(), null);

    // Assert
    assertTrue(
        ((SimpleDateFormat) actualApplyRulesToItemResult).getNumberFormat()
            instanceof DecimalFormat);
    assertTrue(actualApplyRulesToItemResult instanceof SimpleDateFormat);
    assertTrue(
        ((SimpleDateFormat) actualApplyRulesToItemResult).getCalendar()
            instanceof GregorianCalendar);
    assertEquals("yyyy/mm/dd", ((SimpleDateFormat) actualApplyRulesToItemResult).toPattern());
    assertTrue(((SimpleDateFormat) actualApplyRulesToItemResult).isLenient());
  }

  /**
   * Test {@link RulesUtil#applyRulesToItem(Serializable, User, Context, Rules)}.
   *
   * <ul>
   *   <li>When {@link Rules} (default constructor).
   *   <li>Then NumberFormat return {@link DecimalFormat}.
   * </ul>
   *
   * <p>Method under test: {@link RulesUtil#applyRulesToItem(Serializable, User, Context, Rules)}
   */
  @Test
  @DisplayName(
      "Test applyRulesToItem(Serializable, User, Context, Rules); when Rules (default constructor); then NumberFormat return DecimalFormat")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({"Serializable RulesUtil.applyRulesToItem(Serializable, User, Context, Rules)"})
  void testApplyRulesToItem_whenRules_thenNumberFormatReturnDecimalFormat() {
    // Arrange
    SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/mm/dd");
    User user = new User();
    Context context = new Context();

    // Act
    Serializable actualApplyRulesToItemResult =
        RulesUtil.applyRulesToItem(simpleDateFormat, user, context, new Rules<>());

    // Assert
    assertTrue(
        ((SimpleDateFormat) actualApplyRulesToItemResult).getNumberFormat()
            instanceof DecimalFormat);
    assertTrue(actualApplyRulesToItemResult instanceof SimpleDateFormat);
    assertTrue(
        ((SimpleDateFormat) actualApplyRulesToItemResult).getCalendar()
            instanceof GregorianCalendar);
    assertEquals("yyyy/mm/dd", ((SimpleDateFormat) actualApplyRulesToItemResult).toPattern());
    assertTrue(((SimpleDateFormat) actualApplyRulesToItemResult).isLenient());
  }
}
