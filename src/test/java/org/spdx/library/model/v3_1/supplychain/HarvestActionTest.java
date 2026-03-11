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
import org.spdx.library.model.v3_1.supplychain.HarvestAction.HarvestActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class HarvestActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
		List<String> result = testHarvestAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.HarvestAction", testHarvestAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#Element(org.spdx.library.model.v3_1.supplychain.HarvestAction.HarvestActionBuilder)}.
	 */
	public void testHarvestActionHarvestActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
		HarvestAction test2HarvestAction = generator.builderForHarvestActionTests("https://testObject2").build();
		assertTrue(testHarvestAction.equivalent(test2HarvestAction));
		assertTrue(test2HarvestAction.equivalent(testHarvestAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#setSuppliedBy}.
	 */
	public void testHarvestActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testHarvestAction.getSuppliedBy());
//		testHarvestAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testHarvestAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#setExtension}.
	 */
	public void testHarvestActionsetExtension() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testHarvestAction.getExtension());
//		testHarvestAction.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testHarvestAction.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#setCreationInfo}.
	 */
	public void testHarvestActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testHarvestAction.getCreationInfo());
//		testHarvestAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testHarvestAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#setIntendedUse}.
	 */
	public void testHarvestActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testHarvestAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testHarvestAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#setDescription}.
	 */
	public void testHarvestActionsetDescription() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testHarvestAction.getDescription());
		String newStringValue = "new description value";
		testHarvestAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#setBuiltTime}.
	 */
	public void testHarvestActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testHarvestAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testHarvestAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#setActionEndTime}.
	 */
	public void testHarvestActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testHarvestAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testHarvestAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#setComment}.
	 */
	public void testHarvestActionsetComment() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testHarvestAction.getComment());
		String newStringValue = "new comment value";
		testHarvestAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#setValidUntilTime}.
	 */
	public void testHarvestActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testHarvestAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testHarvestAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#setReleaseTime}.
	 */
	public void testHarvestActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testHarvestAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testHarvestAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#setName}.
	 */
	public void testHarvestActionsetName() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testHarvestAction.getName());
		String newStringValue = "new name value";
		testHarvestAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#setSummary}.
	 */
	public void testHarvestActionsetSummary() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testHarvestAction.getSummary());
		String newStringValue = "new summary value";
		testHarvestAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#setActionStartTime}.
	 */
	public void testHarvestActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testHarvestAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testHarvestAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#getActionLocation}.
	 */
	public void testHarvestActiongetActionLocations() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testHarvestAction.getActionLocations())));
//		testHarvestAction.getActionLocations().clear();
//		testHarvestAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testHarvestAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#getVerifiedUsing}.
	 */
	public void testHarvestActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testHarvestAction.getVerifiedUsings())));
//		testHarvestAction.getVerifiedUsings().clear();
//		testHarvestAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testHarvestAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#getExternalRef}.
	 */
	public void testHarvestActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testHarvestAction.getExternalRefs())));
//		testHarvestAction.getExternalRefs().clear();
//		testHarvestAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testHarvestAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#getOriginatedBy}.
	 */
	public void testHarvestActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testHarvestAction.getOriginatedBys())));
//		testHarvestAction.getOriginatedBys().clear();
//		testHarvestAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testHarvestAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#getExternalIdentifier}.
	 */
	public void testHarvestActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testHarvestAction.getExternalIdentifiers())));
//		testHarvestAction.getExternalIdentifiers().clear();
//		testHarvestAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testHarvestAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#getAdditionalInformation}.
	 */
	public void testHarvestActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testHarvestAction.getAdditionalInformations())));
//		testHarvestAction.getAdditionalInformations().clear();
//		testHarvestAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testHarvestAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#getStandardNames}.
	 */
	public void testHarvestActiongetStandardNames() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testHarvestAction.getStandardNames())));
		testHarvestAction.getStandardNames().clear();
		testHarvestAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testHarvestAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.HarvestAction#getSupportLevel}.
	 */
	public void testHarvestActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		HarvestAction testHarvestAction = generator.builderForHarvestActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testHarvestAction.getSupportLevels())));
		testHarvestAction.getSupportLevels().clear();
		testHarvestAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testHarvestAction.getSupportLevels())));
	}
}
