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
import org.spdx.library.model.v3.supplychain.InspectionAction.InspectionActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class InspectionActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
		List<String> result = testInspectionAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.InspectionAction", testInspectionAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#Element(org.spdx.library.model.v3.supplychain.InspectionAction.InspectionActionBuilder)}.
	 */
	public void testInspectionActionInspectionActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
		InspectionAction test2InspectionAction = generator.builderForInspectionActionTests("https://testObject2").build();
		assertTrue(testInspectionAction.equivalent(test2InspectionAction));
		assertTrue(test2InspectionAction.equivalent(testInspectionAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#setSuppliedBy}.
	 */
	public void testInspectionActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testInspectionAction.getSuppliedBy());
//		testInspectionAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testInspectionAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#setCreationInfo}.
	 */
	public void testInspectionActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testInspectionAction.getCreationInfo());
//		testInspectionAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testInspectionAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#setIntendedUse}.
	 */
	public void testInspectionActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testInspectionAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testInspectionAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#setDescription}.
	 */
	public void testInspectionActionsetDescription() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testInspectionAction.getDescription());
		String newStringValue = "new description value";
		testInspectionAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#setBuiltTime}.
	 */
	public void testInspectionActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testInspectionAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testInspectionAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#setActionEndTime}.
	 */
	public void testInspectionActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testInspectionAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testInspectionAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#setComment}.
	 */
	public void testInspectionActionsetComment() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testInspectionAction.getComment());
		String newStringValue = "new comment value";
		testInspectionAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#setValidUntilTime}.
	 */
	public void testInspectionActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testInspectionAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testInspectionAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#setReleaseTime}.
	 */
	public void testInspectionActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testInspectionAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testInspectionAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#setName}.
	 */
	public void testInspectionActionsetName() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testInspectionAction.getName());
		String newStringValue = "new name value";
		testInspectionAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#setSummary}.
	 */
	public void testInspectionActionsetSummary() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testInspectionAction.getSummary());
		String newStringValue = "new summary value";
		testInspectionAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#setActionStartTime}.
	 */
	public void testInspectionActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testInspectionAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testInspectionAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testInspectionAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#getActionLocation}.
	 */
	public void testInspectionActiongetActionLocations() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testInspectionAction.getActionLocations())));
//		testInspectionAction.getActionLocations().clear();
//		testInspectionAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testInspectionAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#getVerifiedUsing}.
	 */
	public void testInspectionActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testInspectionAction.getVerifiedUsings())));
//		testInspectionAction.getVerifiedUsings().clear();
//		testInspectionAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testInspectionAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#getExternalRef}.
	 */
	public void testInspectionActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testInspectionAction.getExternalRefs())));
//		testInspectionAction.getExternalRefs().clear();
//		testInspectionAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testInspectionAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#getOriginatedBy}.
	 */
	public void testInspectionActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testInspectionAction.getOriginatedBys())));
//		testInspectionAction.getOriginatedBys().clear();
//		testInspectionAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testInspectionAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#getExternalIdentifier}.
	 */
	public void testInspectionActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testInspectionAction.getExternalIdentifiers())));
//		testInspectionAction.getExternalIdentifiers().clear();
//		testInspectionAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testInspectionAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#getAdditionalInformation}.
	 */
	public void testInspectionActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testInspectionAction.getAdditionalInformations())));
//		testInspectionAction.getAdditionalInformations().clear();
//		testInspectionAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testInspectionAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#getExtension}.
	 */
	public void testInspectionActiongetExtensions() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testInspectionAction.getExtensions())));
//		testInspectionAction.getExtensions().clear();
//		testInspectionAction.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testInspectionAction.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#getStandardNames}.
	 */
	public void testInspectionActiongetStandardNames() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testInspectionAction.getStandardNames())));
		testInspectionAction.getStandardNames().clear();
		testInspectionAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testInspectionAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InspectionAction#getSupportLevel}.
	 */
	public void testInspectionActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		InspectionAction testInspectionAction = generator.builderForInspectionActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testInspectionAction.getSupportLevels())));
		testInspectionAction.getSupportLevels().clear();
		testInspectionAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testInspectionAction.getSupportLevels())));
	}
}
