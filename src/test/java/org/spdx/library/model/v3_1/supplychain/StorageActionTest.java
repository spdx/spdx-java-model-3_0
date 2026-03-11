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
import org.spdx.library.model.v3_1.supplychain.StorageAction.StorageActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class StorageActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
		List<String> result = testStorageAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.StorageAction", testStorageAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#Element(org.spdx.library.model.v3_1.supplychain.StorageAction.StorageActionBuilder)}.
	 */
	public void testStorageActionStorageActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
		StorageAction test2StorageAction = generator.builderForStorageActionTests("https://testObject2").build();
		assertTrue(testStorageAction.equivalent(test2StorageAction));
		assertTrue(test2StorageAction.equivalent(testStorageAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#setSuppliedBy}.
	 */
	public void testStorageActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testStorageAction.getSuppliedBy());
//		testStorageAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testStorageAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#setExtension}.
	 */
	public void testStorageActionsetExtension() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testStorageAction.getExtension());
//		testStorageAction.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testStorageAction.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#setCreationInfo}.
	 */
	public void testStorageActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testStorageAction.getCreationInfo());
//		testStorageAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testStorageAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#setIntendedUse}.
	 */
	public void testStorageActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testStorageAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testStorageAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#setDescription}.
	 */
	public void testStorageActionsetDescription() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testStorageAction.getDescription());
		String newStringValue = "new description value";
		testStorageAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#setBuiltTime}.
	 */
	public void testStorageActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testStorageAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testStorageAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#setActionEndTime}.
	 */
	public void testStorageActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testStorageAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testStorageAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#setComment}.
	 */
	public void testStorageActionsetComment() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testStorageAction.getComment());
		String newStringValue = "new comment value";
		testStorageAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#setValidUntilTime}.
	 */
	public void testStorageActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testStorageAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testStorageAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#setReleaseTime}.
	 */
	public void testStorageActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testStorageAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testStorageAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#setName}.
	 */
	public void testStorageActionsetName() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testStorageAction.getName());
		String newStringValue = "new name value";
		testStorageAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#setSummary}.
	 */
	public void testStorageActionsetSummary() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testStorageAction.getSummary());
		String newStringValue = "new summary value";
		testStorageAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#setActionStartTime}.
	 */
	public void testStorageActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testStorageAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testStorageAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#getActionLocation}.
	 */
	public void testStorageActiongetActionLocations() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStorageAction.getActionLocations())));
//		testStorageAction.getActionLocations().clear();
//		testStorageAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStorageAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#getVerifiedUsing}.
	 */
	public void testStorageActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStorageAction.getVerifiedUsings())));
//		testStorageAction.getVerifiedUsings().clear();
//		testStorageAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStorageAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#getExternalRef}.
	 */
	public void testStorageActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStorageAction.getExternalRefs())));
//		testStorageAction.getExternalRefs().clear();
//		testStorageAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStorageAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#getOriginatedBy}.
	 */
	public void testStorageActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStorageAction.getOriginatedBys())));
//		testStorageAction.getOriginatedBys().clear();
//		testStorageAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStorageAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#getExternalIdentifier}.
	 */
	public void testStorageActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStorageAction.getExternalIdentifiers())));
//		testStorageAction.getExternalIdentifiers().clear();
//		testStorageAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStorageAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#getAdditionalInformation}.
	 */
	public void testStorageActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStorageAction.getAdditionalInformations())));
//		testStorageAction.getAdditionalInformations().clear();
//		testStorageAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStorageAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#getStandardNames}.
	 */
	public void testStorageActiongetStandardNames() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testStorageAction.getStandardNames())));
		testStorageAction.getStandardNames().clear();
		testStorageAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testStorageAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.StorageAction#getSupportLevel}.
	 */
	public void testStorageActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		StorageAction testStorageAction = generator.builderForStorageActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testStorageAction.getSupportLevels())));
		testStorageAction.getSupportLevels().clear();
		testStorageAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testStorageAction.getSupportLevels())));
	}
}
