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
import org.spdx.library.model.v3_1.supplychain.ManufactureAction.ManufactureActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ManufactureActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
		List<String> result = testManufactureAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.ManufactureAction", testManufactureAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#Element(org.spdx.library.model.v3_1.supplychain.ManufactureAction.ManufactureActionBuilder)}.
	 */
	public void testManufactureActionManufactureActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
		ManufactureAction test2ManufactureAction = generator.builderForManufactureActionTests("https://testObject2").build();
		assertTrue(testManufactureAction.equivalent(test2ManufactureAction));
		assertTrue(test2ManufactureAction.equivalent(testManufactureAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#setSuppliedBy}.
	 */
	public void testManufactureActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testManufactureAction.getSuppliedBy());
//		testManufactureAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testManufactureAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#setExtension}.
	 */
	public void testManufactureActionsetExtension() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testManufactureAction.getExtension());
//		testManufactureAction.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testManufactureAction.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#setCreationInfo}.
	 */
	public void testManufactureActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testManufactureAction.getCreationInfo());
//		testManufactureAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testManufactureAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#setIntendedUse}.
	 */
	public void testManufactureActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testManufactureAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testManufactureAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#setDescription}.
	 */
	public void testManufactureActionsetDescription() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testManufactureAction.getDescription());
		String newStringValue = "new description value";
		testManufactureAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#setBuiltTime}.
	 */
	public void testManufactureActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testManufactureAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testManufactureAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#setActionEndTime}.
	 */
	public void testManufactureActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testManufactureAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testManufactureAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#setComment}.
	 */
	public void testManufactureActionsetComment() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testManufactureAction.getComment());
		String newStringValue = "new comment value";
		testManufactureAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#setValidUntilTime}.
	 */
	public void testManufactureActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testManufactureAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testManufactureAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#setReleaseTime}.
	 */
	public void testManufactureActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testManufactureAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testManufactureAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#setName}.
	 */
	public void testManufactureActionsetName() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testManufactureAction.getName());
		String newStringValue = "new name value";
		testManufactureAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#setSummary}.
	 */
	public void testManufactureActionsetSummary() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testManufactureAction.getSummary());
		String newStringValue = "new summary value";
		testManufactureAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#setActionStartTime}.
	 */
	public void testManufactureActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testManufactureAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testManufactureAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#getActionLocation}.
	 */
	public void testManufactureActiongetActionLocations() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testManufactureAction.getActionLocations())));
//		testManufactureAction.getActionLocations().clear();
//		testManufactureAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testManufactureAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#getVerifiedUsing}.
	 */
	public void testManufactureActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testManufactureAction.getVerifiedUsings())));
//		testManufactureAction.getVerifiedUsings().clear();
//		testManufactureAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testManufactureAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#getExternalRef}.
	 */
	public void testManufactureActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testManufactureAction.getExternalRefs())));
//		testManufactureAction.getExternalRefs().clear();
//		testManufactureAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testManufactureAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#getOriginatedBy}.
	 */
	public void testManufactureActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testManufactureAction.getOriginatedBys())));
//		testManufactureAction.getOriginatedBys().clear();
//		testManufactureAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testManufactureAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#getExternalIdentifier}.
	 */
	public void testManufactureActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testManufactureAction.getExternalIdentifiers())));
//		testManufactureAction.getExternalIdentifiers().clear();
//		testManufactureAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testManufactureAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#getAdditionalInformation}.
	 */
	public void testManufactureActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testManufactureAction.getAdditionalInformations())));
//		testManufactureAction.getAdditionalInformations().clear();
//		testManufactureAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testManufactureAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#getStandardNames}.
	 */
	public void testManufactureActiongetStandardNames() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testManufactureAction.getStandardNames())));
		testManufactureAction.getStandardNames().clear();
		testManufactureAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testManufactureAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ManufactureAction#getSupportLevel}.
	 */
	public void testManufactureActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		ManufactureAction testManufactureAction = generator.builderForManufactureActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testManufactureAction.getSupportLevels())));
		testManufactureAction.getSupportLevels().clear();
		testManufactureAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testManufactureAction.getSupportLevels())));
	}
}
