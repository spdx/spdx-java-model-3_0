/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.supplychain;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3_1.ModelObjectV3;
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
import org.spdx.library.model.v3_1.MockCopyManager;
import org.spdx.library.model.v3_1.MockModelStore;
import org.spdx.library.model.v3_1.SpdxConstantsV3;
import org.spdx.library.model.v3_1.SpdxModelInfoV3_0;
import org.spdx.library.model.v3_1.TestValuesGenerator;
import org.spdx.library.model.v3_1.UnitTestHelper;
import org.spdx.library.model.v3_1.core.Action;
import org.spdx.library.model.v3_1.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_1.core.Agent;
import org.spdx.library.model.v3_1.core.CreationInfo;
import org.spdx.library.model.v3_1.core.DictionaryEntry;
import org.spdx.library.model.v3_1.core.Element;
import org.spdx.library.model.v3_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_1.core.ExternalRef;
import org.spdx.library.model.v3_1.core.IntegrityMethod;
import org.spdx.library.model.v3_1.core.Location;
import org.spdx.library.model.v3_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_1.core.SupportType;
import org.spdx.library.model.v3_1.extension.Extension;
import org.spdx.library.model.v3_1.supplychain.ModifyAction.ModifyActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ModifyActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
		List<String> result = testModifyAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.ModifyAction", testModifyAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#Element(org.spdx.library.model.v3_1.supplychain.ModifyAction.ModifyActionBuilder)}.
	 */
	public void testModifyActionModifyActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
		ModifyAction test2ModifyAction = generator.builderForModifyActionTests("https://testObject2").build();
		assertTrue(testModifyAction.equivalent(test2ModifyAction));
		assertTrue(test2ModifyAction.equivalent(testModifyAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#setSuppliedBy}.
	 */
	public void testModifyActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testModifyAction.getSuppliedBy());
//		testModifyAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testModifyAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#setExtension}.
	 */
	public void testModifyActionsetExtension() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testModifyAction.getExtension());
//		testModifyAction.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testModifyAction.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#setCreationInfo}.
	 */
	public void testModifyActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testModifyAction.getCreationInfo());
//		testModifyAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testModifyAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#setIntendedUse}.
	 */
	public void testModifyActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testModifyAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testModifyAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#setDescription}.
	 */
	public void testModifyActionsetDescription() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testModifyAction.getDescription());
		String newStringValue = "new description value";
		testModifyAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#setBuiltTime}.
	 */
	public void testModifyActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testModifyAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testModifyAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#setActionEndTime}.
	 */
	public void testModifyActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testModifyAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testModifyAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#setComment}.
	 */
	public void testModifyActionsetComment() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testModifyAction.getComment());
		String newStringValue = "new comment value";
		testModifyAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#setValidUntilTime}.
	 */
	public void testModifyActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testModifyAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testModifyAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#setReleaseTime}.
	 */
	public void testModifyActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testModifyAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testModifyAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#setName}.
	 */
	public void testModifyActionsetName() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testModifyAction.getName());
		String newStringValue = "new name value";
		testModifyAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#setSummary}.
	 */
	public void testModifyActionsetSummary() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testModifyAction.getSummary());
		String newStringValue = "new summary value";
		testModifyAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#setActionStartTime}.
	 */
	public void testModifyActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testModifyAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testModifyAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#getActionLocation}.
	 */
	public void testModifyActiongetActionLocations() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testModifyAction.getActionLocations())));
//		testModifyAction.getActionLocations().clear();
//		testModifyAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testModifyAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#getVerifiedUsing}.
	 */
	public void testModifyActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testModifyAction.getVerifiedUsings())));
//		testModifyAction.getVerifiedUsings().clear();
//		testModifyAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testModifyAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#getExternalRef}.
	 */
	public void testModifyActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testModifyAction.getExternalRefs())));
//		testModifyAction.getExternalRefs().clear();
//		testModifyAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testModifyAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#getOriginatedBy}.
	 */
	public void testModifyActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testModifyAction.getOriginatedBys())));
//		testModifyAction.getOriginatedBys().clear();
//		testModifyAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testModifyAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#getExternalIdentifier}.
	 */
	public void testModifyActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testModifyAction.getExternalIdentifiers())));
//		testModifyAction.getExternalIdentifiers().clear();
//		testModifyAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testModifyAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#getAdditionalInformation}.
	 */
	public void testModifyActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testModifyAction.getAdditionalInformations())));
//		testModifyAction.getAdditionalInformations().clear();
//		testModifyAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testModifyAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#getStandardNames}.
	 */
	public void testModifyActiongetStandardNames() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testModifyAction.getStandardNames())));
		testModifyAction.getStandardNames().clear();
		testModifyAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testModifyAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ModifyAction#getSupportLevel}.
	 */
	public void testModifyActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		ModifyAction testModifyAction = generator.builderForModifyActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testModifyAction.getSupportLevels())));
		testModifyAction.getSupportLevels().clear();
		testModifyAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testModifyAction.getSupportLevels())));
	}
}
