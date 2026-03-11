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
import org.spdx.library.model.v3.core.Action;
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
import org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction.ResponsibilityChangeActionBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ResponsibilityChangeActionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
		List<String> result = testResponsibilityChangeAction.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.ResponsibilityChangeAction", testResponsibilityChangeAction.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#Element(org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction.ResponsibilityChangeActionBuilder)}.
	 */
	public void testResponsibilityChangeActionResponsibilityChangeActionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
		ResponsibilityChangeAction test2ResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests("https://testObject2").build();
		assertTrue(testResponsibilityChangeAction.equivalent(test2ResponsibilityChangeAction));
		assertTrue(test2ResponsibilityChangeAction.equivalent(testResponsibilityChangeAction));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#setCurrent}.
	 */
	public void testResponsibilityChangeActionsetCurrent() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testResponsibilityChangeAction.getCurrent());
//		testResponsibilityChangeAction.setCurrent(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testResponsibilityChangeAction.getCurrent());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#setSuppliedBy}.
	 */
	public void testResponsibilityChangeActionsetSuppliedBy() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testResponsibilityChangeAction.getSuppliedBy());
//		testResponsibilityChangeAction.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testResponsibilityChangeAction.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#setPrevious}.
	 */
	public void testResponsibilityChangeActionsetPrevious() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testResponsibilityChangeAction.getPrevious());
//		testResponsibilityChangeAction.setPrevious(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testResponsibilityChangeAction.getPrevious());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#setExtension}.
	 */
	public void testResponsibilityChangeActionsetExtension() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testResponsibilityChangeAction.getExtension());
//		testResponsibilityChangeAction.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testResponsibilityChangeAction.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#setCreationInfo}.
	 */
	public void testResponsibilityChangeActionsetCreationInfo() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testResponsibilityChangeAction.getCreationInfo());
//		testResponsibilityChangeAction.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testResponsibilityChangeAction.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#setResponsibilityCategory}.
	 */
	public void testResponsibilityChangeActionsetResponsibilityCategory() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.RESPONSIBILITY_CATEGORY_TEST_VALUE1, testResponsibilityChangeAction.getResponsibilityCategory());
		testResponsibilityChangeAction.setResponsibilityCategory(TestValuesGenerator.RESPONSIBILITY_CATEGORY_TEST_VALUE2);
		assertEquals(TestValuesGenerator.RESPONSIBILITY_CATEGORY_TEST_VALUE2, testResponsibilityChangeAction.getResponsibilityCategory());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#setIntendedUse}.
	 */
	public void testResponsibilityChangeActionsetIntendedUse() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testResponsibilityChangeAction.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testResponsibilityChangeAction.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeAction.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#setDescription}.
	 */
	public void testResponsibilityChangeActionsetDescription() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testResponsibilityChangeAction.getDescription());
		String newStringValue = "new description value";
		testResponsibilityChangeAction.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeAction.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#setBuiltTime}.
	 */
	public void testResponsibilityChangeActionsetBuiltTime() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testResponsibilityChangeAction.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testResponsibilityChangeAction.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeAction.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#setActionEndTime}.
	 */
	public void testResponsibilityChangeActionsetActionEndTime() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_END_TIME_TEST_VALUE), testResponsibilityChangeAction.getActionEndTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testResponsibilityChangeAction.setActionEndTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeAction.getActionEndTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#setComment}.
	 */
	public void testResponsibilityChangeActionsetComment() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testResponsibilityChangeAction.getComment());
		String newStringValue = "new comment value";
		testResponsibilityChangeAction.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeAction.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#setValidUntilTime}.
	 */
	public void testResponsibilityChangeActionsetValidUntilTime() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testResponsibilityChangeAction.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testResponsibilityChangeAction.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeAction.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#setName}.
	 */
	public void testResponsibilityChangeActionsetName() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testResponsibilityChangeAction.getName());
		String newStringValue = "new name value";
		testResponsibilityChangeAction.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeAction.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#setReleaseTime}.
	 */
	public void testResponsibilityChangeActionsetReleaseTime() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testResponsibilityChangeAction.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testResponsibilityChangeAction.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeAction.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#setSummary}.
	 */
	public void testResponsibilityChangeActionsetSummary() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testResponsibilityChangeAction.getSummary());
		String newStringValue = "new summary value";
		testResponsibilityChangeAction.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeAction.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#setActionStartTime}.
	 */
	public void testResponsibilityChangeActionsetActionStartTime() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ACTION_START_TIME_TEST_VALUE), testResponsibilityChangeAction.getActionStartTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testResponsibilityChangeAction.setActionStartTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeAction.getActionStartTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#getActionLocation}.
	 */
	public void testResponsibilityChangeActiongetActionLocations() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResponsibilityChangeAction.getActionLocations())));
//		testResponsibilityChangeAction.getActionLocations().clear();
//		testResponsibilityChangeAction.getActionLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResponsibilityChangeAction.getActionLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#getExternalRef}.
	 */
	public void testResponsibilityChangeActiongetExternalRefs() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResponsibilityChangeAction.getExternalRefs())));
//		testResponsibilityChangeAction.getExternalRefs().clear();
//		testResponsibilityChangeAction.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResponsibilityChangeAction.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#getResponsibilityChangedOn}.
	 */
	public void testResponsibilityChangeActiongetResponsibilityChangedOns() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResponsibilityChangeAction.getResponsibilityChangedOns())));
//		testResponsibilityChangeAction.getResponsibilityChangedOns().clear();
//		testResponsibilityChangeAction.getResponsibilityChangedOns().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResponsibilityChangeAction.getResponsibilityChangedOns())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#getVerifiedUsing}.
	 */
	public void testResponsibilityChangeActiongetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResponsibilityChangeAction.getVerifiedUsings())));
//		testResponsibilityChangeAction.getVerifiedUsings().clear();
//		testResponsibilityChangeAction.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResponsibilityChangeAction.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#getOriginatedBy}.
	 */
	public void testResponsibilityChangeActiongetOriginatedBys() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResponsibilityChangeAction.getOriginatedBys())));
//		testResponsibilityChangeAction.getOriginatedBys().clear();
//		testResponsibilityChangeAction.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResponsibilityChangeAction.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#getExternalIdentifier}.
	 */
	public void testResponsibilityChangeActiongetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResponsibilityChangeAction.getExternalIdentifiers())));
//		testResponsibilityChangeAction.getExternalIdentifiers().clear();
//		testResponsibilityChangeAction.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResponsibilityChangeAction.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#getAdditionalInformation}.
	 */
	public void testResponsibilityChangeActiongetAdditionalInformations() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResponsibilityChangeAction.getAdditionalInformations())));
//		testResponsibilityChangeAction.getAdditionalInformations().clear();
//		testResponsibilityChangeAction.getAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResponsibilityChangeAction.getAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#getStandardNames}.
	 */
	public void testResponsibilityChangeActiongetStandardNames() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testResponsibilityChangeAction.getStandardNames())));
		testResponsibilityChangeAction.getStandardNames().clear();
		testResponsibilityChangeAction.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testResponsibilityChangeAction.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ResponsibilityChangeAction#getSupportLevel}.
	 */
	public void testResponsibilityChangeActiongetSupportLevels() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeAction testResponsibilityChangeAction = generator.builderForResponsibilityChangeActionTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testResponsibilityChangeAction.getSupportLevels())));
		testResponsibilityChangeAction.getSupportLevels().clear();
		testResponsibilityChangeAction.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testResponsibilityChangeAction.getSupportLevels())));
	}
}
