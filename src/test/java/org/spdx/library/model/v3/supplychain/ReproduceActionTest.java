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
import org.spdx.library.model.v3.supplychain.ReproduceAction.ReproduceActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ReproduceActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
		List<String> result = testReproduceAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.ReproduceAction", testReproduceAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#Element(org.spdx.library.model.v3.supplychain.ReproduceAction.ReproduceActionBuilder)}.
	 */
	public void testReproduceActionReproduceActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
		ReproduceAction test2ReproduceAction = generator.builderForReproduceActionTests("https://testObject2").build();
		assertTrue(testReproduceAction.equivalent(test2ReproduceAction));
		assertTrue(test2ReproduceAction.equivalent(testReproduceAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#setSuppliedBy}.
	 */
	public void testReproduceActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testReproduceAction.getSuppliedBy());
//		testReproduceAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testReproduceAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#setCreationInfo}.
	 */
	public void testReproduceActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testReproduceAction.getCreationInfo());
//		testReproduceAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testReproduceAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#setIntendedUse}.
	 */
	public void testReproduceActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testReproduceAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testReproduceAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#setDescription}.
	 */
	public void testReproduceActionsetDescription() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testReproduceAction.getDescription());
		String newStringValue = "new description value";
		testReproduceAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#setBuiltTime}.
	 */
	public void testReproduceActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testReproduceAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testReproduceAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#setActionEndTime}.
	 */
	public void testReproduceActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testReproduceAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testReproduceAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#setComment}.
	 */
	public void testReproduceActionsetComment() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testReproduceAction.getComment());
		String newStringValue = "new comment value";
		testReproduceAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#setValidUntilTime}.
	 */
	public void testReproduceActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testReproduceAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testReproduceAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#setReleaseTime}.
	 */
	public void testReproduceActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testReproduceAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testReproduceAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#setName}.
	 */
	public void testReproduceActionsetName() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testReproduceAction.getName());
		String newStringValue = "new name value";
		testReproduceAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#setSummary}.
	 */
	public void testReproduceActionsetSummary() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testReproduceAction.getSummary());
		String newStringValue = "new summary value";
		testReproduceAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#setActionStartTime}.
	 */
	public void testReproduceActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testReproduceAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testReproduceAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#getActionLocation}.
	 */
	public void testReproduceActiongetActionLocations() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testReproduceAction.getActionLocations())));
//		testReproduceAction.getActionLocations().clear();
//		testReproduceAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testReproduceAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#getVerifiedUsing}.
	 */
	public void testReproduceActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testReproduceAction.getVerifiedUsings())));
//		testReproduceAction.getVerifiedUsings().clear();
//		testReproduceAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testReproduceAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#getExternalRef}.
	 */
	public void testReproduceActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testReproduceAction.getExternalRefs())));
//		testReproduceAction.getExternalRefs().clear();
//		testReproduceAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testReproduceAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#getOriginatedBy}.
	 */
	public void testReproduceActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testReproduceAction.getOriginatedBys())));
//		testReproduceAction.getOriginatedBys().clear();
//		testReproduceAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testReproduceAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#getExternalIdentifier}.
	 */
	public void testReproduceActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testReproduceAction.getExternalIdentifiers())));
//		testReproduceAction.getExternalIdentifiers().clear();
//		testReproduceAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testReproduceAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#getAdditionalInformation}.
	 */
	public void testReproduceActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testReproduceAction.getAdditionalInformations())));
//		testReproduceAction.getAdditionalInformations().clear();
//		testReproduceAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testReproduceAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#getExtension}.
	 */
	public void testReproduceActiongetExtensions() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testReproduceAction.getExtensions())));
//		testReproduceAction.getExtensions().clear();
//		testReproduceAction.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testReproduceAction.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#getStandardNames}.
	 */
	public void testReproduceActiongetStandardNames() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testReproduceAction.getStandardNames())));
		testReproduceAction.getStandardNames().clear();
		testReproduceAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testReproduceAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceAction#getSupportLevel}.
	 */
	public void testReproduceActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		ReproduceAction testReproduceAction = generator.builderForReproduceActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testReproduceAction.getSupportLevels())));
		testReproduceAction.getSupportLevels().clear();
		testReproduceAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testReproduceAction.getSupportLevels())));
	}
}
