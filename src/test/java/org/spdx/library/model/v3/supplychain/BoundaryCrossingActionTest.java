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
import org.spdx.library.model.v3.supplychain.BoundaryCrossingAction.BoundaryCrossingActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class BoundaryCrossingActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
		List<String> result = testBoundaryCrossingAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.BoundaryCrossingAction", testBoundaryCrossingAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#Element(org.spdx.library.model.v3.supplychain.BoundaryCrossingAction.BoundaryCrossingActionBuilder)}.
	 */
	public void testBoundaryCrossingActionBoundaryCrossingActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
		BoundaryCrossingAction test2BoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests("https://testObject2").build();
		assertTrue(testBoundaryCrossingAction.equivalent(test2BoundaryCrossingAction));
		assertTrue(test2BoundaryCrossingAction.equivalent(testBoundaryCrossingAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#setSuppliedBy}.
	 */
	public void testBoundaryCrossingActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testBoundaryCrossingAction.getSuppliedBy());
//		testBoundaryCrossingAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testBoundaryCrossingAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#setExtension}.
	 */
	public void testBoundaryCrossingActionsetExtension() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testBoundaryCrossingAction.getExtension());
//		testBoundaryCrossingAction.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testBoundaryCrossingAction.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#setCreationInfo}.
	 */
	public void testBoundaryCrossingActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testBoundaryCrossingAction.getCreationInfo());
//		testBoundaryCrossingAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testBoundaryCrossingAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#setIntendedUse}.
	 */
	public void testBoundaryCrossingActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testBoundaryCrossingAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testBoundaryCrossingAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryCrossingAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#setDescription}.
	 */
	public void testBoundaryCrossingActionsetDescription() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testBoundaryCrossingAction.getDescription());
		String newStringValue = "new description value";
		testBoundaryCrossingAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryCrossingAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#setBuiltTime}.
	 */
	public void testBoundaryCrossingActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testBoundaryCrossingAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBoundaryCrossingAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryCrossingAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#setActionEndTime}.
	 */
	public void testBoundaryCrossingActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testBoundaryCrossingAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBoundaryCrossingAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryCrossingAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#setComment}.
	 */
	public void testBoundaryCrossingActionsetComment() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testBoundaryCrossingAction.getComment());
		String newStringValue = "new comment value";
		testBoundaryCrossingAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryCrossingAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#setValidUntilTime}.
	 */
	public void testBoundaryCrossingActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testBoundaryCrossingAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBoundaryCrossingAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryCrossingAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#setReleaseTime}.
	 */
	public void testBoundaryCrossingActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testBoundaryCrossingAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBoundaryCrossingAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryCrossingAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#setName}.
	 */
	public void testBoundaryCrossingActionsetName() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testBoundaryCrossingAction.getName());
		String newStringValue = "new name value";
		testBoundaryCrossingAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryCrossingAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#setSummary}.
	 */
	public void testBoundaryCrossingActionsetSummary() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testBoundaryCrossingAction.getSummary());
		String newStringValue = "new summary value";
		testBoundaryCrossingAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryCrossingAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#setActionStartTime}.
	 */
	public void testBoundaryCrossingActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testBoundaryCrossingAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBoundaryCrossingAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryCrossingAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#getActionLocation}.
	 */
	public void testBoundaryCrossingActiongetActionLocations() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryCrossingAction.getActionLocations())));
//		testBoundaryCrossingAction.getActionLocations().clear();
//		testBoundaryCrossingAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryCrossingAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#getVerifiedUsing}.
	 */
	public void testBoundaryCrossingActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryCrossingAction.getVerifiedUsings())));
//		testBoundaryCrossingAction.getVerifiedUsings().clear();
//		testBoundaryCrossingAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryCrossingAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#getExternalRef}.
	 */
	public void testBoundaryCrossingActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryCrossingAction.getExternalRefs())));
//		testBoundaryCrossingAction.getExternalRefs().clear();
//		testBoundaryCrossingAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryCrossingAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#getOriginatedBy}.
	 */
	public void testBoundaryCrossingActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryCrossingAction.getOriginatedBys())));
//		testBoundaryCrossingAction.getOriginatedBys().clear();
//		testBoundaryCrossingAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryCrossingAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#getExternalIdentifier}.
	 */
	public void testBoundaryCrossingActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryCrossingAction.getExternalIdentifiers())));
//		testBoundaryCrossingAction.getExternalIdentifiers().clear();
//		testBoundaryCrossingAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryCrossingAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#getAdditionalInformation}.
	 */
	public void testBoundaryCrossingActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryCrossingAction.getAdditionalInformations())));
//		testBoundaryCrossingAction.getAdditionalInformations().clear();
//		testBoundaryCrossingAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryCrossingAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#getStandardNames}.
	 */
	public void testBoundaryCrossingActiongetStandardNames() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testBoundaryCrossingAction.getStandardNames())));
		testBoundaryCrossingAction.getStandardNames().clear();
		testBoundaryCrossingAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testBoundaryCrossingAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryCrossingAction#getSupportLevel}.
	 */
	public void testBoundaryCrossingActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		BoundaryCrossingAction testBoundaryCrossingAction = generator.builderForBoundaryCrossingActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testBoundaryCrossingAction.getSupportLevels())));
		testBoundaryCrossingAction.getSupportLevels().clear();
		testBoundaryCrossingAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testBoundaryCrossingAction.getSupportLevels())));
	}
}
