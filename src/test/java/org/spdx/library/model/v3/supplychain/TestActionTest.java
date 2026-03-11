/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.supplychain;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3.ModelObjectV3;
import org.spdx.storage.IModelStore;
import org.spdx.storage.IModelStore.IdType;
import org.spdx.storage.IModelStore.IModelStoreLock;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Pattern;
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3.MockCopyManager;
import org.spdx.library.model.v3.MockModelStore;
import org.spdx.library.model.v3.SpdxConstantsV3;
import org.spdx.library.model.v3.SpdxModelInfoV3_0;
import org.spdx.library.model.v3.TestValuesGenerator;
import org.spdx.library.model.v3.UnitTestHelper;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.Agent;
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.DictionaryEntry;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.Location;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.core.SupportType;
import org.spdx.library.model.v3.extension.Extension;
import org.spdx.library.model.v3.supplychain.TestAction.TestActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class TestActionTest extends TestCase {

	static final String TEST_OBJECT_URI = "https://test.uri/testuri";
	
	TestValuesGenerator generator;
	
	protected void setUp() throws Exception {
		super.setUp();
		generator = new TestValuesGenerator(new MockModelStore(), new MockCopyManager());
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
		List<String> result = testTestAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.TestAction", testTestAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#Element(org.spdx.library.model.v3.supplychain.TestAction.TestActionBuilder)}.
	 */
	public void testTestActionTestActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForTestActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
		TestAction test2TestAction = generator.builderForTestActionTests("https://testObject2").build();
		assertTrue(testTestAction.equivalent(test2TestAction));
		assertTrue(test2TestAction.equivalent(testTestAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#setSuppliedBy}.
	 */
	public void testTestActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testTestAction.getSuppliedBy());
//		testTestAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testTestAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#setExtension}.
	 */
	public void testTestActionsetExtension() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testTestAction.getExtension());
//		testTestAction.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testTestAction.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#setCreationInfo}.
	 */
	public void testTestActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testTestAction.getCreationInfo());
//		testTestAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testTestAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#setIntendedUse}.
	 */
	public void testTestActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testTestAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testTestAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#setDescription}.
	 */
	public void testTestActionsetDescription() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testTestAction.getDescription());
		String newStringValue = "new description value";
		testTestAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#setBuiltTime}.
	 */
	public void testTestActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testTestAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testTestAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#setActionEndTime}.
	 */
	public void testTestActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testTestAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testTestAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#setComment}.
	 */
	public void testTestActionsetComment() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testTestAction.getComment());
		String newStringValue = "new comment value";
		testTestAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#setValidUntilTime}.
	 */
	public void testTestActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testTestAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testTestAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#setReleaseTime}.
	 */
	public void testTestActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testTestAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testTestAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#setName}.
	 */
	public void testTestActionsetName() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testTestAction.getName());
		String newStringValue = "new name value";
		testTestAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#setSummary}.
	 */
	public void testTestActionsetSummary() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testTestAction.getSummary());
		String newStringValue = "new summary value";
		testTestAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#setActionStartTime}.
	 */
	public void testTestActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testTestAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testTestAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#getActionLocation}.
	 */
	public void testTestActiongetActionLocations() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTestAction.getActionLocations())));
//		testTestAction.getActionLocations().clear();
//		testTestAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTestAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#getVerifiedUsing}.
	 */
	public void testTestActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTestAction.getVerifiedUsings())));
//		testTestAction.getVerifiedUsings().clear();
//		testTestAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTestAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#getExternalRef}.
	 */
	public void testTestActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTestAction.getExternalRefs())));
//		testTestAction.getExternalRefs().clear();
//		testTestAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTestAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#getOriginatedBy}.
	 */
	public void testTestActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTestAction.getOriginatedBys())));
//		testTestAction.getOriginatedBys().clear();
//		testTestAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTestAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#getExternalIdentifier}.
	 */
	public void testTestActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTestAction.getExternalIdentifiers())));
//		testTestAction.getExternalIdentifiers().clear();
//		testTestAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTestAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#getAdditionalInformation}.
	 */
	public void testTestActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTestAction.getAdditionalInformations())));
//		testTestAction.getAdditionalInformations().clear();
//		testTestAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTestAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#getStandardNames}.
	 */
	public void testTestActiongetStandardNames() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testTestAction.getStandardNames())));
		testTestAction.getStandardNames().clear();
		testTestAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testTestAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestAction#getSupportLevel}.
	 */
	public void testTestActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		TestAction testTestAction = generator.builderForTestActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testTestAction.getSupportLevels())));
		testTestAction.getSupportLevels().clear();
		testTestAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testTestAction.getSupportLevels())));
	}
}
