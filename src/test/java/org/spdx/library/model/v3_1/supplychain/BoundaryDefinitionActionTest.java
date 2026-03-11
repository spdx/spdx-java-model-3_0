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
import org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction.BoundaryDefinitionActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class BoundaryDefinitionActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
		List<String> result = testBoundaryDefinitionAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.BoundaryDefinitionAction", testBoundaryDefinitionAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#Element(org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction.BoundaryDefinitionActionBuilder)}.
	 */
	public void testBoundaryDefinitionActionBoundaryDefinitionActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
		BoundaryDefinitionAction test2BoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests("https://testObject2").build();
		assertTrue(testBoundaryDefinitionAction.equivalent(test2BoundaryDefinitionAction));
		assertTrue(test2BoundaryDefinitionAction.equivalent(testBoundaryDefinitionAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#setSuppliedBy}.
	 */
	public void testBoundaryDefinitionActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testBoundaryDefinitionAction.getSuppliedBy());
//		testBoundaryDefinitionAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testBoundaryDefinitionAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#setExtension}.
	 */
	public void testBoundaryDefinitionActionsetExtension() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testBoundaryDefinitionAction.getExtension());
//		testBoundaryDefinitionAction.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testBoundaryDefinitionAction.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#setCreationInfo}.
	 */
	public void testBoundaryDefinitionActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testBoundaryDefinitionAction.getCreationInfo());
//		testBoundaryDefinitionAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testBoundaryDefinitionAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#setIntendedUse}.
	 */
	public void testBoundaryDefinitionActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testBoundaryDefinitionAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testBoundaryDefinitionAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#setDescription}.
	 */
	public void testBoundaryDefinitionActionsetDescription() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testBoundaryDefinitionAction.getDescription());
		String newStringValue = "new description value";
		testBoundaryDefinitionAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#setBuiltTime}.
	 */
	public void testBoundaryDefinitionActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testBoundaryDefinitionAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBoundaryDefinitionAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#setActionEndTime}.
	 */
	public void testBoundaryDefinitionActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testBoundaryDefinitionAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBoundaryDefinitionAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#setComment}.
	 */
	public void testBoundaryDefinitionActionsetComment() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testBoundaryDefinitionAction.getComment());
		String newStringValue = "new comment value";
		testBoundaryDefinitionAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#setValidUntilTime}.
	 */
	public void testBoundaryDefinitionActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testBoundaryDefinitionAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBoundaryDefinitionAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#setReleaseTime}.
	 */
	public void testBoundaryDefinitionActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testBoundaryDefinitionAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBoundaryDefinitionAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#setName}.
	 */
	public void testBoundaryDefinitionActionsetName() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testBoundaryDefinitionAction.getName());
		String newStringValue = "new name value";
		testBoundaryDefinitionAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#setSummary}.
	 */
	public void testBoundaryDefinitionActionsetSummary() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testBoundaryDefinitionAction.getSummary());
		String newStringValue = "new summary value";
		testBoundaryDefinitionAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#setActionStartTime}.
	 */
	public void testBoundaryDefinitionActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testBoundaryDefinitionAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBoundaryDefinitionAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#getActionLocation}.
	 */
	public void testBoundaryDefinitionActiongetActionLocations() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryDefinitionAction.getActionLocations())));
//		testBoundaryDefinitionAction.getActionLocations().clear();
//		testBoundaryDefinitionAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryDefinitionAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#getVerifiedUsing}.
	 */
	public void testBoundaryDefinitionActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryDefinitionAction.getVerifiedUsings())));
//		testBoundaryDefinitionAction.getVerifiedUsings().clear();
//		testBoundaryDefinitionAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryDefinitionAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#getExternalRef}.
	 */
	public void testBoundaryDefinitionActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryDefinitionAction.getExternalRefs())));
//		testBoundaryDefinitionAction.getExternalRefs().clear();
//		testBoundaryDefinitionAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryDefinitionAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#getOriginatedBy}.
	 */
	public void testBoundaryDefinitionActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryDefinitionAction.getOriginatedBys())));
//		testBoundaryDefinitionAction.getOriginatedBys().clear();
//		testBoundaryDefinitionAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryDefinitionAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#getBoundaryParameter}.
	 */
	public void testBoundaryDefinitionActiongetBoundaryParameters() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryDefinitionAction.getBoundaryParameters())));
//		testBoundaryDefinitionAction.getBoundaryParameters().clear();
//		testBoundaryDefinitionAction.getBoundaryParameters().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryDefinitionAction.getBoundaryParameters())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#getExternalIdentifier}.
	 */
	public void testBoundaryDefinitionActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryDefinitionAction.getExternalIdentifiers())));
//		testBoundaryDefinitionAction.getExternalIdentifiers().clear();
//		testBoundaryDefinitionAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryDefinitionAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#getAdditionalInformation}.
	 */
	public void testBoundaryDefinitionActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryDefinitionAction.getAdditionalInformations())));
//		testBoundaryDefinitionAction.getAdditionalInformations().clear();
//		testBoundaryDefinitionAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryDefinitionAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#getStandardNames}.
	 */
	public void testBoundaryDefinitionActiongetStandardNames() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testBoundaryDefinitionAction.getStandardNames())));
		testBoundaryDefinitionAction.getStandardNames().clear();
		testBoundaryDefinitionAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testBoundaryDefinitionAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.BoundaryDefinitionAction#getSupportLevel}.
	 */
	public void testBoundaryDefinitionActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionAction testBoundaryDefinitionAction = generator.builderForBoundaryDefinitionActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testBoundaryDefinitionAction.getSupportLevels())));
		testBoundaryDefinitionAction.getSupportLevels().clear();
		testBoundaryDefinitionAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testBoundaryDefinitionAction.getSupportLevels())));
	}
}
