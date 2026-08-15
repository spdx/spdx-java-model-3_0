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
import org.spdx.library.model.v3.supplychain.AssemblyAction.AssemblyActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class AssemblyActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
		List<String> result = testAssemblyAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.AssemblyAction", testAssemblyAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#Element(org.spdx.library.model.v3.supplychain.AssemblyAction.AssemblyActionBuilder)}.
	 */
	public void testAssemblyActionAssemblyActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
		AssemblyAction test2AssemblyAction = generator.builderForAssemblyActionTests("https://testObject2").build();
		assertTrue(testAssemblyAction.equivalent(test2AssemblyAction));
		assertTrue(test2AssemblyAction.equivalent(testAssemblyAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#setSuppliedBy}.
	 */
	public void testAssemblyActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testAssemblyAction.getSuppliedBy());
//		testAssemblyAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testAssemblyAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#setCreationInfo}.
	 */
	public void testAssemblyActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testAssemblyAction.getCreationInfo());
//		testAssemblyAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testAssemblyAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#setIntendedUse}.
	 */
	public void testAssemblyActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testAssemblyAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testAssemblyAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#setDescription}.
	 */
	public void testAssemblyActionsetDescription() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testAssemblyAction.getDescription());
		String newStringValue = "new description value";
		testAssemblyAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#setBuiltTime}.
	 */
	public void testAssemblyActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testAssemblyAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testAssemblyAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#setActionEndTime}.
	 */
	public void testAssemblyActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testAssemblyAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testAssemblyAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#setComment}.
	 */
	public void testAssemblyActionsetComment() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testAssemblyAction.getComment());
		String newStringValue = "new comment value";
		testAssemblyAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#setValidUntilTime}.
	 */
	public void testAssemblyActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testAssemblyAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testAssemblyAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#setReleaseTime}.
	 */
	public void testAssemblyActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testAssemblyAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testAssemblyAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#setName}.
	 */
	public void testAssemblyActionsetName() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testAssemblyAction.getName());
		String newStringValue = "new name value";
		testAssemblyAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#setSummary}.
	 */
	public void testAssemblyActionsetSummary() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testAssemblyAction.getSummary());
		String newStringValue = "new summary value";
		testAssemblyAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#setActionStartTime}.
	 */
	public void testAssemblyActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testAssemblyAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testAssemblyAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#getActionLocation}.
	 */
	public void testAssemblyActiongetActionLocations() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAssemblyAction.getActionLocations())));
//		testAssemblyAction.getActionLocations().clear();
//		testAssemblyAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAssemblyAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#getVerifiedUsing}.
	 */
	public void testAssemblyActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAssemblyAction.getVerifiedUsings())));
//		testAssemblyAction.getVerifiedUsings().clear();
//		testAssemblyAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAssemblyAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#getExternalRef}.
	 */
	public void testAssemblyActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAssemblyAction.getExternalRefs())));
//		testAssemblyAction.getExternalRefs().clear();
//		testAssemblyAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAssemblyAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#getOriginatedBy}.
	 */
	public void testAssemblyActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAssemblyAction.getOriginatedBys())));
//		testAssemblyAction.getOriginatedBys().clear();
//		testAssemblyAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAssemblyAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#getExternalIdentifier}.
	 */
	public void testAssemblyActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAssemblyAction.getExternalIdentifiers())));
//		testAssemblyAction.getExternalIdentifiers().clear();
//		testAssemblyAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAssemblyAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#getAdditionalInformation}.
	 */
	public void testAssemblyActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAssemblyAction.getAdditionalInformations())));
//		testAssemblyAction.getAdditionalInformations().clear();
//		testAssemblyAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAssemblyAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#getExtension}.
	 */
	public void testAssemblyActiongetExtensions() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAssemblyAction.getExtensions())));
//		testAssemblyAction.getExtensions().clear();
//		testAssemblyAction.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAssemblyAction.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#getStandardNames}.
	 */
	public void testAssemblyActiongetStandardNames() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testAssemblyAction.getStandardNames())));
		testAssemblyAction.getStandardNames().clear();
		testAssemblyAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testAssemblyAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyAction#getSupportLevel}.
	 */
	public void testAssemblyActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		AssemblyAction testAssemblyAction = generator.builderForAssemblyActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testAssemblyAction.getSupportLevels())));
		testAssemblyAction.getSupportLevels().clear();
		testAssemblyAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testAssemblyAction.getSupportLevels())));
	}
}
