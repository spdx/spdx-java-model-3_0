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
import org.spdx.library.model.v3.supplychain.PlanAction.PlanActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class PlanActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
		List<String> result = testPlanAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.PlanAction", testPlanAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#Element(org.spdx.library.model.v3.supplychain.PlanAction.PlanActionBuilder)}.
	 */
	public void testPlanActionPlanActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
		PlanAction test2PlanAction = generator.builderForPlanActionTests("https://testObject2").build();
		assertTrue(testPlanAction.equivalent(test2PlanAction));
		assertTrue(test2PlanAction.equivalent(testPlanAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#setSuppliedBy}.
	 */
	public void testPlanActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testPlanAction.getSuppliedBy());
//		testPlanAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testPlanAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#setExtension}.
	 */
	public void testPlanActionsetExtension() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testPlanAction.getExtension());
//		testPlanAction.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testPlanAction.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#setCreationInfo}.
	 */
	public void testPlanActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testPlanAction.getCreationInfo());
//		testPlanAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testPlanAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#setIntendedUse}.
	 */
	public void testPlanActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testPlanAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testPlanAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#setDescription}.
	 */
	public void testPlanActionsetDescription() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testPlanAction.getDescription());
		String newStringValue = "new description value";
		testPlanAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#setBuiltTime}.
	 */
	public void testPlanActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testPlanAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testPlanAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#setActionEndTime}.
	 */
	public void testPlanActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testPlanAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testPlanAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#setComment}.
	 */
	public void testPlanActionsetComment() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testPlanAction.getComment());
		String newStringValue = "new comment value";
		testPlanAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#setValidUntilTime}.
	 */
	public void testPlanActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testPlanAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testPlanAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#setReleaseTime}.
	 */
	public void testPlanActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testPlanAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testPlanAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#setName}.
	 */
	public void testPlanActionsetName() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testPlanAction.getName());
		String newStringValue = "new name value";
		testPlanAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#setSummary}.
	 */
	public void testPlanActionsetSummary() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testPlanAction.getSummary());
		String newStringValue = "new summary value";
		testPlanAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#setActionStartTime}.
	 */
	public void testPlanActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testPlanAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testPlanAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#getActionLocation}.
	 */
	public void testPlanActiongetActionLocations() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPlanAction.getActionLocations())));
//		testPlanAction.getActionLocations().clear();
//		testPlanAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPlanAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#getVerifiedUsing}.
	 */
	public void testPlanActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPlanAction.getVerifiedUsings())));
//		testPlanAction.getVerifiedUsings().clear();
//		testPlanAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPlanAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#getExternalRef}.
	 */
	public void testPlanActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPlanAction.getExternalRefs())));
//		testPlanAction.getExternalRefs().clear();
//		testPlanAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPlanAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#getOriginatedBy}.
	 */
	public void testPlanActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPlanAction.getOriginatedBys())));
//		testPlanAction.getOriginatedBys().clear();
//		testPlanAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPlanAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#getExternalIdentifier}.
	 */
	public void testPlanActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPlanAction.getExternalIdentifiers())));
//		testPlanAction.getExternalIdentifiers().clear();
//		testPlanAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPlanAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#getAdditionalInformation}.
	 */
	public void testPlanActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPlanAction.getAdditionalInformations())));
//		testPlanAction.getAdditionalInformations().clear();
//		testPlanAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPlanAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#getStandardNames}.
	 */
	public void testPlanActiongetStandardNames() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testPlanAction.getStandardNames())));
		testPlanAction.getStandardNames().clear();
		testPlanAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testPlanAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanAction#getSupportLevel}.
	 */
	public void testPlanActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		PlanAction testPlanAction = generator.builderForPlanActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testPlanAction.getSupportLevels())));
		testPlanAction.getSupportLevels().clear();
		testPlanAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testPlanAction.getSupportLevels())));
	}
}
