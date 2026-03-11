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
import org.spdx.library.model.v3.core.Action;
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
import org.spdx.library.model.v3.supplychain.CreateAction.CreateActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class CreateActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
		List<String> result = testCreateAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.CreateAction", testCreateAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#Element(org.spdx.library.model.v3.supplychain.CreateAction.CreateActionBuilder)}.
	 */
	public void testCreateActionCreateActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
		CreateAction test2CreateAction = generator.builderForCreateActionTests("https://testObject2").build();
		assertTrue(testCreateAction.equivalent(test2CreateAction));
		assertTrue(test2CreateAction.equivalent(testCreateAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#setSuppliedBy}.
	 */
	public void testCreateActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testCreateAction.getSuppliedBy());
//		testCreateAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testCreateAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#setExtension}.
	 */
	public void testCreateActionsetExtension() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testCreateAction.getExtension());
//		testCreateAction.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testCreateAction.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#setCreationInfo}.
	 */
	public void testCreateActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testCreateAction.getCreationInfo());
//		testCreateAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testCreateAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#setIntendedUse}.
	 */
	public void testCreateActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testCreateAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testCreateAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#setDescription}.
	 */
	public void testCreateActionsetDescription() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testCreateAction.getDescription());
		String newStringValue = "new description value";
		testCreateAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#setBuiltTime}.
	 */
	public void testCreateActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testCreateAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCreateAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#setActionEndTime}.
	 */
	public void testCreateActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testCreateAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCreateAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#setComment}.
	 */
	public void testCreateActionsetComment() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testCreateAction.getComment());
		String newStringValue = "new comment value";
		testCreateAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#setValidUntilTime}.
	 */
	public void testCreateActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testCreateAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCreateAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#setReleaseTime}.
	 */
	public void testCreateActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testCreateAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCreateAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#setName}.
	 */
	public void testCreateActionsetName() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testCreateAction.getName());
		String newStringValue = "new name value";
		testCreateAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#setSummary}.
	 */
	public void testCreateActionsetSummary() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testCreateAction.getSummary());
		String newStringValue = "new summary value";
		testCreateAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#setActionStartTime}.
	 */
	public void testCreateActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testCreateAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCreateAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#getActionLocation}.
	 */
	public void testCreateActiongetActionLocations() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCreateAction.getActionLocations())));
//		testCreateAction.getActionLocations().clear();
//		testCreateAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCreateAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#getVerifiedUsing}.
	 */
	public void testCreateActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCreateAction.getVerifiedUsings())));
//		testCreateAction.getVerifiedUsings().clear();
//		testCreateAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCreateAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#getExternalRef}.
	 */
	public void testCreateActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCreateAction.getExternalRefs())));
//		testCreateAction.getExternalRefs().clear();
//		testCreateAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCreateAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#getOriginatedBy}.
	 */
	public void testCreateActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCreateAction.getOriginatedBys())));
//		testCreateAction.getOriginatedBys().clear();
//		testCreateAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCreateAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#getExternalIdentifier}.
	 */
	public void testCreateActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCreateAction.getExternalIdentifiers())));
//		testCreateAction.getExternalIdentifiers().clear();
//		testCreateAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCreateAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#getAdditionalInformation}.
	 */
	public void testCreateActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCreateAction.getAdditionalInformations())));
//		testCreateAction.getAdditionalInformations().clear();
//		testCreateAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCreateAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#getStandardNames}.
	 */
	public void testCreateActiongetStandardNames() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testCreateAction.getStandardNames())));
		testCreateAction.getStandardNames().clear();
		testCreateAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testCreateAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateAction#getSupportLevel}.
	 */
	public void testCreateActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		CreateAction testCreateAction = generator.builderForCreateActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testCreateAction.getSupportLevels())));
		testCreateAction.getSupportLevels().clear();
		testCreateAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testCreateAction.getSupportLevels())));
	}
}
