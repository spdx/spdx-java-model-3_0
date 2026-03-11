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
import org.spdx.library.model.v3.supplychain.OutOfSpecAction.OutOfSpecActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class OutOfSpecActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
		List<String> result = testOutOfSpecAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.OutOfSpecAction", testOutOfSpecAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#Element(org.spdx.library.model.v3.supplychain.OutOfSpecAction.OutOfSpecActionBuilder)}.
	 */
	public void testOutOfSpecActionOutOfSpecActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
		OutOfSpecAction test2OutOfSpecAction = generator.builderForOutOfSpecActionTests("https://testObject2").build();
		assertTrue(testOutOfSpecAction.equivalent(test2OutOfSpecAction));
		assertTrue(test2OutOfSpecAction.equivalent(testOutOfSpecAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#setSuppliedBy}.
	 */
	public void testOutOfSpecActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testOutOfSpecAction.getSuppliedBy());
//		testOutOfSpecAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testOutOfSpecAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#setExtension}.
	 */
	public void testOutOfSpecActionsetExtension() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testOutOfSpecAction.getExtension());
//		testOutOfSpecAction.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testOutOfSpecAction.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#setCreationInfo}.
	 */
	public void testOutOfSpecActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testOutOfSpecAction.getCreationInfo());
//		testOutOfSpecAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testOutOfSpecAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#setIntendedUse}.
	 */
	public void testOutOfSpecActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testOutOfSpecAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testOutOfSpecAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testOutOfSpecAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#setDescription}.
	 */
	public void testOutOfSpecActionsetDescription() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testOutOfSpecAction.getDescription());
		String newStringValue = "new description value";
		testOutOfSpecAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testOutOfSpecAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#setBuiltTime}.
	 */
	public void testOutOfSpecActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testOutOfSpecAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testOutOfSpecAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testOutOfSpecAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#setActionEndTime}.
	 */
	public void testOutOfSpecActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testOutOfSpecAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testOutOfSpecAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testOutOfSpecAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#setComment}.
	 */
	public void testOutOfSpecActionsetComment() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testOutOfSpecAction.getComment());
		String newStringValue = "new comment value";
		testOutOfSpecAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testOutOfSpecAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#setValidUntilTime}.
	 */
	public void testOutOfSpecActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testOutOfSpecAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testOutOfSpecAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testOutOfSpecAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#setReleaseTime}.
	 */
	public void testOutOfSpecActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testOutOfSpecAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testOutOfSpecAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testOutOfSpecAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#setName}.
	 */
	public void testOutOfSpecActionsetName() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testOutOfSpecAction.getName());
		String newStringValue = "new name value";
		testOutOfSpecAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testOutOfSpecAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#setSummary}.
	 */
	public void testOutOfSpecActionsetSummary() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testOutOfSpecAction.getSummary());
		String newStringValue = "new summary value";
		testOutOfSpecAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testOutOfSpecAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#setActionStartTime}.
	 */
	public void testOutOfSpecActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testOutOfSpecAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testOutOfSpecAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testOutOfSpecAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#getActionLocation}.
	 */
	public void testOutOfSpecActiongetActionLocations() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testOutOfSpecAction.getActionLocations())));
//		testOutOfSpecAction.getActionLocations().clear();
//		testOutOfSpecAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testOutOfSpecAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#getVerifiedUsing}.
	 */
	public void testOutOfSpecActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testOutOfSpecAction.getVerifiedUsings())));
//		testOutOfSpecAction.getVerifiedUsings().clear();
//		testOutOfSpecAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testOutOfSpecAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#getExternalRef}.
	 */
	public void testOutOfSpecActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testOutOfSpecAction.getExternalRefs())));
//		testOutOfSpecAction.getExternalRefs().clear();
//		testOutOfSpecAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testOutOfSpecAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#getOriginatedBy}.
	 */
	public void testOutOfSpecActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testOutOfSpecAction.getOriginatedBys())));
//		testOutOfSpecAction.getOriginatedBys().clear();
//		testOutOfSpecAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testOutOfSpecAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#getExternalIdentifier}.
	 */
	public void testOutOfSpecActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testOutOfSpecAction.getExternalIdentifiers())));
//		testOutOfSpecAction.getExternalIdentifiers().clear();
//		testOutOfSpecAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testOutOfSpecAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#getAdditionalInformation}.
	 */
	public void testOutOfSpecActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testOutOfSpecAction.getAdditionalInformations())));
//		testOutOfSpecAction.getAdditionalInformations().clear();
//		testOutOfSpecAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testOutOfSpecAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#getStandardNames}.
	 */
	public void testOutOfSpecActiongetStandardNames() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testOutOfSpecAction.getStandardNames())));
		testOutOfSpecAction.getStandardNames().clear();
		testOutOfSpecAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testOutOfSpecAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.OutOfSpecAction#getSupportLevel}.
	 */
	public void testOutOfSpecActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		OutOfSpecAction testOutOfSpecAction = generator.builderForOutOfSpecActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testOutOfSpecAction.getSupportLevels())));
		testOutOfSpecAction.getSupportLevels().clear();
		testOutOfSpecAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testOutOfSpecAction.getSupportLevels())));
	}
}
