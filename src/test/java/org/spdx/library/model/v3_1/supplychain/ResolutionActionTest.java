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
import org.spdx.library.model.v3_1.supplychain.ResolutionAction.ResolutionActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ResolutionActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
		List<String> result = testResolutionAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.ResolutionAction", testResolutionAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#Element(org.spdx.library.model.v3_1.supplychain.ResolutionAction.ResolutionActionBuilder)}.
	 */
	public void testResolutionActionResolutionActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
		ResolutionAction test2ResolutionAction = generator.builderForResolutionActionTests("https://testObject2").build();
		assertTrue(testResolutionAction.equivalent(test2ResolutionAction));
		assertTrue(test2ResolutionAction.equivalent(testResolutionAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#setSuppliedBy}.
	 */
	public void testResolutionActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testResolutionAction.getSuppliedBy());
//		testResolutionAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testResolutionAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#setExtension}.
	 */
	public void testResolutionActionsetExtension() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testResolutionAction.getExtension());
//		testResolutionAction.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testResolutionAction.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#setCreationInfo}.
	 */
	public void testResolutionActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testResolutionAction.getCreationInfo());
//		testResolutionAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testResolutionAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#setIntendedUse}.
	 */
	public void testResolutionActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testResolutionAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testResolutionAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testResolutionAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#setDescription}.
	 */
	public void testResolutionActionsetDescription() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testResolutionAction.getDescription());
		String newStringValue = "new description value";
		testResolutionAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testResolutionAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#setBuiltTime}.
	 */
	public void testResolutionActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testResolutionAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testResolutionAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testResolutionAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#setActionEndTime}.
	 */
	public void testResolutionActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testResolutionAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testResolutionAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testResolutionAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#setComment}.
	 */
	public void testResolutionActionsetComment() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testResolutionAction.getComment());
		String newStringValue = "new comment value";
		testResolutionAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testResolutionAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#setValidUntilTime}.
	 */
	public void testResolutionActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testResolutionAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testResolutionAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testResolutionAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#setReleaseTime}.
	 */
	public void testResolutionActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testResolutionAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testResolutionAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testResolutionAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#setName}.
	 */
	public void testResolutionActionsetName() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testResolutionAction.getName());
		String newStringValue = "new name value";
		testResolutionAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testResolutionAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#setSummary}.
	 */
	public void testResolutionActionsetSummary() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testResolutionAction.getSummary());
		String newStringValue = "new summary value";
		testResolutionAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testResolutionAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#setActionStartTime}.
	 */
	public void testResolutionActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testResolutionAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testResolutionAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testResolutionAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#getActionLocation}.
	 */
	public void testResolutionActiongetActionLocations() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResolutionAction.getActionLocations())));
//		testResolutionAction.getActionLocations().clear();
//		testResolutionAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResolutionAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#getVerifiedUsing}.
	 */
	public void testResolutionActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResolutionAction.getVerifiedUsings())));
//		testResolutionAction.getVerifiedUsings().clear();
//		testResolutionAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResolutionAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#getExternalRef}.
	 */
	public void testResolutionActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResolutionAction.getExternalRefs())));
//		testResolutionAction.getExternalRefs().clear();
//		testResolutionAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResolutionAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#getOriginatedBy}.
	 */
	public void testResolutionActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResolutionAction.getOriginatedBys())));
//		testResolutionAction.getOriginatedBys().clear();
//		testResolutionAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResolutionAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#getExternalIdentifier}.
	 */
	public void testResolutionActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResolutionAction.getExternalIdentifiers())));
//		testResolutionAction.getExternalIdentifiers().clear();
//		testResolutionAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResolutionAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#getAdditionalInformation}.
	 */
	public void testResolutionActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResolutionAction.getAdditionalInformations())));
//		testResolutionAction.getAdditionalInformations().clear();
//		testResolutionAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResolutionAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#getStandardNames}.
	 */
	public void testResolutionActiongetStandardNames() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testResolutionAction.getStandardNames())));
		testResolutionAction.getStandardNames().clear();
		testResolutionAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testResolutionAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResolutionAction#getSupportLevel}.
	 */
	public void testResolutionActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		ResolutionAction testResolutionAction = generator.builderForResolutionActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testResolutionAction.getSupportLevels())));
		testResolutionAction.getSupportLevels().clear();
		testResolutionAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testResolutionAction.getSupportLevels())));
	}
}
