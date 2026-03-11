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
import org.spdx.library.model.v3_1.core.DefinedProcess;
import org.spdx.library.model.v3_1.core.Element;
import org.spdx.library.model.v3_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_1.core.ExternalRef;
import org.spdx.library.model.v3_1.core.IntegrityMethod;
import org.spdx.library.model.v3_1.core.ProcessReadinessType;
import org.spdx.library.model.v3_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_1.core.SupportType;
import org.spdx.library.model.v3_1.extension.Extension;
import org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess.ResponsibilityChangeProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ResponsibilityChangeProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testResponsibilityChangeProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.ResponsibilityChangeProcess", testResponsibilityChangeProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#Element(org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess.ResponsibilityChangeProcessBuilder)}.
	 */
	public void testResponsibilityChangeProcessResponsibilityChangeProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
		ResponsibilityChangeProcess test2ResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests("https://testObject2").build();
		assertTrue(testResponsibilityChangeProcess.equivalent(test2ResponsibilityChangeProcess));
		assertTrue(test2ResponsibilityChangeProcess.equivalent(testResponsibilityChangeProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#setSuppliedBy}.
	 */
	public void testResponsibilityChangeProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testResponsibilityChangeProcess.getSuppliedBy());
//		testResponsibilityChangeProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testResponsibilityChangeProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#setPlannedPrevious}.
	 */
	public void testResponsibilityChangeProcesssetPlannedPrevious() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testResponsibilityChangeProcess.getPlannedPrevious());
//		testResponsibilityChangeProcess.setPlannedPrevious(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testResponsibilityChangeProcess.getPlannedPrevious());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#setPlannedCurrent}.
	 */
	public void testResponsibilityChangeProcesssetPlannedCurrent() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testResponsibilityChangeProcess.getPlannedCurrent());
//		testResponsibilityChangeProcess.setPlannedCurrent(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testResponsibilityChangeProcess.getPlannedCurrent());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#setExtension}.
	 */
	public void testResponsibilityChangeProcesssetExtension() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testResponsibilityChangeProcess.getExtension());
//		testResponsibilityChangeProcess.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testResponsibilityChangeProcess.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#setCreationInfo}.
	 */
	public void testResponsibilityChangeProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testResponsibilityChangeProcess.getCreationInfo());
//		testResponsibilityChangeProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testResponsibilityChangeProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#setProcessReadiness}.
	 */
	public void testResponsibilityChangeProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testResponsibilityChangeProcess.getProcessReadiness());
		testResponsibilityChangeProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testResponsibilityChangeProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#setResponsibilityCategory}.
	 */
	public void testResponsibilityChangeProcesssetResponsibilityCategory() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.RESPONSIBILITY_CATEGORY_TEST_VALUE1, testResponsibilityChangeProcess.getResponsibilityCategory());
		testResponsibilityChangeProcess.setResponsibilityCategory(TestValuesGenerator.RESPONSIBILITY_CATEGORY_TEST_VALUE2);
		assertEquals(TestValuesGenerator.RESPONSIBILITY_CATEGORY_TEST_VALUE2, testResponsibilityChangeProcess.getResponsibilityCategory());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#setIntendedUse}.
	 */
	public void testResponsibilityChangeProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testResponsibilityChangeProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testResponsibilityChangeProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#setDescription}.
	 */
	public void testResponsibilityChangeProcesssetDescription() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testResponsibilityChangeProcess.getDescription());
		String newStringValue = "new description value";
		testResponsibilityChangeProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#setBuiltTime}.
	 */
	public void testResponsibilityChangeProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testResponsibilityChangeProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testResponsibilityChangeProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#setComment}.
	 */
	public void testResponsibilityChangeProcesssetComment() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testResponsibilityChangeProcess.getComment());
		String newStringValue = "new comment value";
		testResponsibilityChangeProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#setProcessVersion}.
	 */
	public void testResponsibilityChangeProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testResponsibilityChangeProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testResponsibilityChangeProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testResponsibilityChangeProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#setValidUntilTime}.
	 */
	public void testResponsibilityChangeProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testResponsibilityChangeProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testResponsibilityChangeProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#setName}.
	 */
	public void testResponsibilityChangeProcesssetName() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testResponsibilityChangeProcess.getName());
		String newStringValue = "new name value";
		testResponsibilityChangeProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#setReleaseTime}.
	 */
	public void testResponsibilityChangeProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testResponsibilityChangeProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testResponsibilityChangeProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#setProcessRationale}.
	 */
	public void testResponsibilityChangeProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testResponsibilityChangeProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testResponsibilityChangeProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#setSummary}.
	 */
	public void testResponsibilityChangeProcesssetSummary() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testResponsibilityChangeProcess.getSummary());
		String newStringValue = "new summary value";
		testResponsibilityChangeProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testResponsibilityChangeProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#getPlannedProductOfResponsibilityChange}.
	 */
	public void testResponsibilityChangeProcessgetPlannedProductOfResponsibilityChanges() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResponsibilityChangeProcess.getPlannedProductOfResponsibilityChanges())));
//		testResponsibilityChangeProcess.getPlannedProductOfResponsibilityChanges().clear();
//		testResponsibilityChangeProcess.getPlannedProductOfResponsibilityChanges().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResponsibilityChangeProcess.getPlannedProductOfResponsibilityChanges())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#getExternalRef}.
	 */
	public void testResponsibilityChangeProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResponsibilityChangeProcess.getExternalRefs())));
//		testResponsibilityChangeProcess.getExternalRefs().clear();
//		testResponsibilityChangeProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResponsibilityChangeProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#getVerifiedUsing}.
	 */
	public void testResponsibilityChangeProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResponsibilityChangeProcess.getVerifiedUsings())));
//		testResponsibilityChangeProcess.getVerifiedUsings().clear();
//		testResponsibilityChangeProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResponsibilityChangeProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#getOriginatedBy}.
	 */
	public void testResponsibilityChangeProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResponsibilityChangeProcess.getOriginatedBys())));
//		testResponsibilityChangeProcess.getOriginatedBys().clear();
//		testResponsibilityChangeProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResponsibilityChangeProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#getExternalIdentifier}.
	 */
	public void testResponsibilityChangeProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testResponsibilityChangeProcess.getExternalIdentifiers())));
//		testResponsibilityChangeProcess.getExternalIdentifiers().clear();
//		testResponsibilityChangeProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testResponsibilityChangeProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#getStandardNames}.
	 */
	public void testResponsibilityChangeProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testResponsibilityChangeProcess.getStandardNames())));
		testResponsibilityChangeProcess.getStandardNames().clear();
		testResponsibilityChangeProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testResponsibilityChangeProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ResponsibilityChangeProcess#getSupportLevel}.
	 */
	public void testResponsibilityChangeProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		ResponsibilityChangeProcess testResponsibilityChangeProcess = generator.builderForResponsibilityChangeProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testResponsibilityChangeProcess.getSupportLevels())));
		testResponsibilityChangeProcess.getSupportLevels().clear();
		testResponsibilityChangeProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testResponsibilityChangeProcess.getSupportLevels())));
	}
}
