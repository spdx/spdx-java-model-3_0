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
import org.spdx.library.model.v3_1.supplychain.DestroyAction.DestroyActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class DestroyActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
		List<String> result = testDestroyAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.DestroyAction", testDestroyAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#Element(org.spdx.library.model.v3_1.supplychain.DestroyAction.DestroyActionBuilder)}.
	 */
	public void testDestroyActionDestroyActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
		DestroyAction test2DestroyAction = generator.builderForDestroyActionTests("https://testObject2").build();
		assertTrue(testDestroyAction.equivalent(test2DestroyAction));
		assertTrue(test2DestroyAction.equivalent(testDestroyAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#setSuppliedBy}.
	 */
	public void testDestroyActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testDestroyAction.getSuppliedBy());
//		testDestroyAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testDestroyAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#setExtension}.
	 */
	public void testDestroyActionsetExtension() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testDestroyAction.getExtension());
//		testDestroyAction.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testDestroyAction.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#setCreationInfo}.
	 */
	public void testDestroyActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testDestroyAction.getCreationInfo());
//		testDestroyAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testDestroyAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#setIntendedUse}.
	 */
	public void testDestroyActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testDestroyAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testDestroyAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#setDescription}.
	 */
	public void testDestroyActionsetDescription() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testDestroyAction.getDescription());
		String newStringValue = "new description value";
		testDestroyAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#setBuiltTime}.
	 */
	public void testDestroyActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testDestroyAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testDestroyAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#setActionEndTime}.
	 */
	public void testDestroyActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testDestroyAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testDestroyAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#setComment}.
	 */
	public void testDestroyActionsetComment() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testDestroyAction.getComment());
		String newStringValue = "new comment value";
		testDestroyAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#setValidUntilTime}.
	 */
	public void testDestroyActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testDestroyAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testDestroyAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#setReleaseTime}.
	 */
	public void testDestroyActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testDestroyAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testDestroyAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#setName}.
	 */
	public void testDestroyActionsetName() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testDestroyAction.getName());
		String newStringValue = "new name value";
		testDestroyAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#setSummary}.
	 */
	public void testDestroyActionsetSummary() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testDestroyAction.getSummary());
		String newStringValue = "new summary value";
		testDestroyAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#setActionStartTime}.
	 */
	public void testDestroyActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testDestroyAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testDestroyAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#getActionLocation}.
	 */
	public void testDestroyActiongetActionLocations() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDestroyAction.getActionLocations())));
//		testDestroyAction.getActionLocations().clear();
//		testDestroyAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDestroyAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#getVerifiedUsing}.
	 */
	public void testDestroyActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDestroyAction.getVerifiedUsings())));
//		testDestroyAction.getVerifiedUsings().clear();
//		testDestroyAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDestroyAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#getExternalRef}.
	 */
	public void testDestroyActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDestroyAction.getExternalRefs())));
//		testDestroyAction.getExternalRefs().clear();
//		testDestroyAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDestroyAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#getOriginatedBy}.
	 */
	public void testDestroyActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDestroyAction.getOriginatedBys())));
//		testDestroyAction.getOriginatedBys().clear();
//		testDestroyAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDestroyAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#getExternalIdentifier}.
	 */
	public void testDestroyActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDestroyAction.getExternalIdentifiers())));
//		testDestroyAction.getExternalIdentifiers().clear();
//		testDestroyAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDestroyAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#getAdditionalInformation}.
	 */
	public void testDestroyActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDestroyAction.getAdditionalInformations())));
//		testDestroyAction.getAdditionalInformations().clear();
//		testDestroyAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDestroyAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#getDestructionPerformedBy}.
	 */
	public void testDestroyActiongetDestructionPerformedBys() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDestroyAction.getDestructionPerformedBys())));
//		testDestroyAction.getDestructionPerformedBys().clear();
//		testDestroyAction.getDestructionPerformedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDestroyAction.getDestructionPerformedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#getStandardNames}.
	 */
	public void testDestroyActiongetStandardNames() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testDestroyAction.getStandardNames())));
		testDestroyAction.getStandardNames().clear();
		testDestroyAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testDestroyAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyAction#getSupportLevel}.
	 */
	public void testDestroyActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		DestroyAction testDestroyAction = generator.builderForDestroyActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testDestroyAction.getSupportLevels())));
		testDestroyAction.getSupportLevels().clear();
		testDestroyAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testDestroyAction.getSupportLevels())));
	}
}
