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
import org.spdx.library.model.v3.supplychain.UseAction.UseActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class UseActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
		List<String> result = testUseAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.UseAction", testUseAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#Element(org.spdx.library.model.v3.supplychain.UseAction.UseActionBuilder)}.
	 */
	public void testUseActionUseActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForUseActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
		UseAction test2UseAction = generator.builderForUseActionTests("https://testObject2").build();
		assertTrue(testUseAction.equivalent(test2UseAction));
		assertTrue(test2UseAction.equivalent(testUseAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#setSuppliedBy}.
	 */
	public void testUseActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testUseAction.getSuppliedBy());
//		testUseAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testUseAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#setCreationInfo}.
	 */
	public void testUseActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testUseAction.getCreationInfo());
//		testUseAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testUseAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#setIntendedUse}.
	 */
	public void testUseActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testUseAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testUseAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#setDescription}.
	 */
	public void testUseActionsetDescription() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testUseAction.getDescription());
		String newStringValue = "new description value";
		testUseAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#setBuiltTime}.
	 */
	public void testUseActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testUseAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testUseAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#setActionEndTime}.
	 */
	public void testUseActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testUseAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testUseAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#setComment}.
	 */
	public void testUseActionsetComment() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testUseAction.getComment());
		String newStringValue = "new comment value";
		testUseAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#setValidUntilTime}.
	 */
	public void testUseActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testUseAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testUseAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#setReleaseTime}.
	 */
	public void testUseActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testUseAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testUseAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#setName}.
	 */
	public void testUseActionsetName() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testUseAction.getName());
		String newStringValue = "new name value";
		testUseAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#setSummary}.
	 */
	public void testUseActionsetSummary() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testUseAction.getSummary());
		String newStringValue = "new summary value";
		testUseAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#setActionStartTime}.
	 */
	public void testUseActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testUseAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testUseAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#getActionLocation}.
	 */
	public void testUseActiongetActionLocations() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testUseAction.getActionLocations())));
//		testUseAction.getActionLocations().clear();
//		testUseAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testUseAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#getVerifiedUsing}.
	 */
	public void testUseActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testUseAction.getVerifiedUsings())));
//		testUseAction.getVerifiedUsings().clear();
//		testUseAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testUseAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#getExternalRef}.
	 */
	public void testUseActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testUseAction.getExternalRefs())));
//		testUseAction.getExternalRefs().clear();
//		testUseAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testUseAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#getOriginatedBy}.
	 */
	public void testUseActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testUseAction.getOriginatedBys())));
//		testUseAction.getOriginatedBys().clear();
//		testUseAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testUseAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#getExternalIdentifier}.
	 */
	public void testUseActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testUseAction.getExternalIdentifiers())));
//		testUseAction.getExternalIdentifiers().clear();
//		testUseAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testUseAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#getAdditionalInformation}.
	 */
	public void testUseActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testUseAction.getAdditionalInformations())));
//		testUseAction.getAdditionalInformations().clear();
//		testUseAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testUseAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#getExtension}.
	 */
	public void testUseActiongetExtensions() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testUseAction.getExtensions())));
//		testUseAction.getExtensions().clear();
//		testUseAction.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testUseAction.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#getStandardNames}.
	 */
	public void testUseActiongetStandardNames() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testUseAction.getStandardNames())));
		testUseAction.getStandardNames().clear();
		testUseAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testUseAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseAction#getSupportLevel}.
	 */
	public void testUseActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		UseAction testUseAction = generator.builderForUseActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testUseAction.getSupportLevels())));
		testUseAction.getSupportLevels().clear();
		testUseAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testUseAction.getSupportLevels())));
	}
}
