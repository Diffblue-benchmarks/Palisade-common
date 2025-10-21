package uk.gov.gchq.palisade.util;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.mockito.Mockito.mock;
import com.diffblue.cover.annotations.ManagedByDiffblue;
import com.diffblue.cover.annotations.MethodsUnderTest;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicLong;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
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
   *   <li>Given {@code "EmployeeDataAccessRule"}.
   * </ul>
   *
   * <p>Method under test: {@link RulesUtil#applyRulesToStream(Stream, User, Context, Rules,
   * AtomicLong, AtomicLong)}
   */
  @Test
  @DisplayName(
      "Test applyRulesToStream(Stream, User, Context, Rules, AtomicLong, AtomicLong); given '\"EmployeeDataAccessRule\"'")
  @Tag("ContributionFromDiffblue")
  @ManagedByDiffblue
  @MethodsUnderTest({
    "Stream RulesUtil.applyRulesToStream(Stream, User, Context, Rules, AtomicLong, AtomicLong)"
  })
  void testApplyRulesToStream_givenEmployeeDataAccessRule() {
    // Arrange
    ArrayList<Serializable> serializableList = new ArrayList<>();
    Stream<Serializable> records = serializableList.stream();
    User user = new User();
    Context context = new Context();

    Rules<Serializable> rules = new Rules<>();
    rules.addRule("\"EmployeeDataAccessRule\"", mock(Rule.class));
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
}
