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
import org.spdx.library.model.v3.supplychain.ChangeAction.ChangeActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ChangeActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
		List<String> result = testChangeAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.ChangeAction", testChangeAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#Element(org.spdx.library.model.v3.supplychain.ChangeAction.ChangeActionBuilder)}.
	 */
	public void testChangeActionChangeActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
		ChangeAction test2ChangeAction = generator.builderForChangeActionTests("https://testObject2").build();
		assertTrue(testChangeAction.equivalent(test2ChangeAction));
		assertTrue(test2ChangeAction.equivalent(testChangeAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#setSuppliedBy}.
	 */
	public void testChangeActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testChangeAction.getSuppliedBy());
//		testChangeAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testChangeAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#setCreationInfo}.
	 */
	public void testChangeActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testChangeAction.getCreationInfo());
//		testChangeAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testChangeAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#setIntendedUse}.
	 */
	public void testChangeActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testChangeAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testChangeAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#setDescription}.
	 */
	public void testChangeActionsetDescription() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testChangeAction.getDescription());
		String newStringValue = "new description value";
		testChangeAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#setBuiltTime}.
	 */
	public void testChangeActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testChangeAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testChangeAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#setActionEndTime}.
	 */
	public void testChangeActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testChangeAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testChangeAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#setComment}.
	 */
	public void testChangeActionsetComment() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testChangeAction.getComment());
		String newStringValue = "new comment value";
		testChangeAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#setValidUntilTime}.
	 */
	public void testChangeActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testChangeAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testChangeAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#setReleaseTime}.
	 */
	public void testChangeActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testChangeAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testChangeAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#setName}.
	 */
	public void testChangeActionsetName() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testChangeAction.getName());
		String newStringValue = "new name value";
		testChangeAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#setSummary}.
	 */
	public void testChangeActionsetSummary() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testChangeAction.getSummary());
		String newStringValue = "new summary value";
		testChangeAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#setActionStartTime}.
	 */
	public void testChangeActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testChangeAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testChangeAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#getActionLocation}.
	 */
	public void testChangeActiongetActionLocations() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testChangeAction.getActionLocations())));
//		testChangeAction.getActionLocations().clear();
//		testChangeAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testChangeAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#getVerifiedUsing}.
	 */
	public void testChangeActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testChangeAction.getVerifiedUsings())));
//		testChangeAction.getVerifiedUsings().clear();
//		testChangeAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testChangeAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#getExternalRef}.
	 */
	public void testChangeActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testChangeAction.getExternalRefs())));
//		testChangeAction.getExternalRefs().clear();
//		testChangeAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testChangeAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#getOriginatedBy}.
	 */
	public void testChangeActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testChangeAction.getOriginatedBys())));
//		testChangeAction.getOriginatedBys().clear();
//		testChangeAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testChangeAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#getExternalIdentifier}.
	 */
	public void testChangeActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testChangeAction.getExternalIdentifiers())));
//		testChangeAction.getExternalIdentifiers().clear();
//		testChangeAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testChangeAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#getAdditionalInformation}.
	 */
	public void testChangeActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testChangeAction.getAdditionalInformations())));
//		testChangeAction.getAdditionalInformations().clear();
//		testChangeAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testChangeAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#getExtension}.
	 */
	public void testChangeActiongetExtensions() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testChangeAction.getExtensions())));
//		testChangeAction.getExtensions().clear();
//		testChangeAction.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testChangeAction.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#getStandardNames}.
	 */
	public void testChangeActiongetStandardNames() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testChangeAction.getStandardNames())));
		testChangeAction.getStandardNames().clear();
		testChangeAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testChangeAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ChangeAction#getSupportLevel}.
	 */
	public void testChangeActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		ChangeAction testChangeAction = generator.builderForChangeActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testChangeAction.getSupportLevels())));
		testChangeAction.getSupportLevels().clear();
		testChangeAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testChangeAction.getSupportLevels())));
	}
}
