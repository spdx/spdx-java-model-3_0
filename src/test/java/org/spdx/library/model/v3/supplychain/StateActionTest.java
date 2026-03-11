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
import org.spdx.library.model.v3.supplychain.StateAction.StateActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class StateActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
		List<String> result = testStateAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.StateAction", testStateAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#Element(org.spdx.library.model.v3.supplychain.StateAction.StateActionBuilder)}.
	 */
	public void testStateActionStateActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForStateActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
		StateAction test2StateAction = generator.builderForStateActionTests("https://testObject2").build();
		assertTrue(testStateAction.equivalent(test2StateAction));
		assertTrue(test2StateAction.equivalent(testStateAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#setSuppliedBy}.
	 */
	public void testStateActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testStateAction.getSuppliedBy());
//		testStateAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testStateAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#setDecisionProcess}.
	 */
	public void testStateActionsetDecisionProcess() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testStateAction.getDecisionProcess());
//		testStateAction.setDecisionProcess(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testStateAction.getDecisionProcess());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#setCurrentState}.
	 */
	public void testStateActionsetCurrentState() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testStateAction.getCurrentState());
//		testStateAction.setCurrentState(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testStateAction.getCurrentState());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#setExtension}.
	 */
	public void testStateActionsetExtension() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testStateAction.getExtension());
//		testStateAction.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testStateAction.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#setCreationInfo}.
	 */
	public void testStateActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testStateAction.getCreationInfo());
//		testStateAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testStateAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#setIntendedUse}.
	 */
	public void testStateActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testStateAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testStateAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testStateAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#setDescription}.
	 */
	public void testStateActionsetDescription() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testStateAction.getDescription());
		String newStringValue = "new description value";
		testStateAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testStateAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#setBuiltTime}.
	 */
	public void testStateActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testStateAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testStateAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testStateAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#setActionEndTime}.
	 */
	public void testStateActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testStateAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testStateAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testStateAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#setComment}.
	 */
	public void testStateActionsetComment() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testStateAction.getComment());
		String newStringValue = "new comment value";
		testStateAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testStateAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#setValidUntilTime}.
	 */
	public void testStateActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testStateAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testStateAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testStateAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#setReleaseTime}.
	 */
	public void testStateActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testStateAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testStateAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testStateAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#setName}.
	 */
	public void testStateActionsetName() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testStateAction.getName());
		String newStringValue = "new name value";
		testStateAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testStateAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#setSummary}.
	 */
	public void testStateActionsetSummary() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testStateAction.getSummary());
		String newStringValue = "new summary value";
		testStateAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testStateAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#setActionStartTime}.
	 */
	public void testStateActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testStateAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testStateAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testStateAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#getActionLocation}.
	 */
	public void testStateActiongetActionLocations() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStateAction.getActionLocations())));
//		testStateAction.getActionLocations().clear();
//		testStateAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStateAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#getVerifiedUsing}.
	 */
	public void testStateActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStateAction.getVerifiedUsings())));
//		testStateAction.getVerifiedUsings().clear();
//		testStateAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStateAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#getExternalRef}.
	 */
	public void testStateActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStateAction.getExternalRefs())));
//		testStateAction.getExternalRefs().clear();
//		testStateAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStateAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#getOriginatedBy}.
	 */
	public void testStateActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStateAction.getOriginatedBys())));
//		testStateAction.getOriginatedBys().clear();
//		testStateAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStateAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#getExternalIdentifier}.
	 */
	public void testStateActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStateAction.getExternalIdentifiers())));
//		testStateAction.getExternalIdentifiers().clear();
//		testStateAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStateAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#getAdditionalInformation}.
	 */
	public void testStateActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStateAction.getAdditionalInformations())));
//		testStateAction.getAdditionalInformations().clear();
//		testStateAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStateAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#getStandardNames}.
	 */
	public void testStateActiongetStandardNames() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testStateAction.getStandardNames())));
		testStateAction.getStandardNames().clear();
		testStateAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testStateAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StateAction#getSupportLevel}.
	 */
	public void testStateActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		StateAction testStateAction = generator.builderForStateActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testStateAction.getSupportLevels())));
		testStateAction.getSupportLevels().clear();
		testStateAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testStateAction.getSupportLevels())));
	}
}
