package com.intellij.lang.javascript.linter.tslint;

import com.intellij.testFramework.fixtures.LightPlatformCodeInsightFixtureTestCase;

import java.util.List;

/**
 * @author Irina.Chernushina on 10/1/2015.
 */
public class TsLintConfigCompletionTest extends LightPlatformCodeInsightFixtureTestCase {


  @Override
  protected String getTestDataPath() {
    return TsLintTestUtil.BASE_TEST_DATA_PATH + "/config/completion";
  }

  public void testTopLevelRules() throws Exception {
    List<String> result = myFixture.getCompletionVariants("/topLevelRules/tslint.json");
    final String[] variants = {"\"max-classes-per-file\"", "\"max-file-line-count\"",
      "\"max-line-length\""};
    assertContainsOrdered(result, variants);
  }

  public void testMemberOrdering() throws Exception {
    List<String> result = myFixture.getCompletionVariants("/memberOrdering/tslint.json");
    final String[] variants = {"\"fields-first\"", "\"instance-sandwich\"", "\"statics-first\""};
    assertContainsOrdered(result, variants);
  }

  public void testTypedefWhitespace() throws Exception {
    List<String> result = myFixture.getCompletionVariants("/typedefWhitespace/tslint.json");
    final String[] variants = {"\"call-signature\"", "\"index-signature\"", "\"parameter\"", "\"property-declaration\"",
      "\"variable-declaration\""};
    assertContainsOrdered(result, variants);
  }

  public void testTypedefWhitespaceValues() throws Exception {
    List<String> result = myFixture.getCompletionVariants("/typedefWhitespaceValues/tslint.json");
    final String[] variants = {"nospace", "space"};

    assertContainsOrdered(result, variants);
  }
}