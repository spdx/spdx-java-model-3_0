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
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.ProcessReadinessType;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.core.SupportType;
import org.spdx.library.model.v3.extension.Extension;
import org.spdx.library.model.v3.supplychain.PlanProcess.PlanProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class PlanProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testPlanProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.PlanProcess", testPlanProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#Element(org.spdx.library.model.v3.supplychain.PlanProcess.PlanProcessBuilder)}.
	 */
	public void testPlanProcessPlanProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
		PlanProcess test2PlanProcess = generator.builderForPlanProcessTests("https://testObject2").build();
		assertTrue(testPlanProcess.equivalent(test2PlanProcess));
		assertTrue(test2PlanProcess.equivalent(testPlanProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#setSuppliedBy}.
	 */
	public void testPlanProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testPlanProcess.getSuppliedBy());
//		testPlanProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testPlanProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#setCreationInfo}.
	 */
	public void testPlanProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testPlanProcess.getCreationInfo());
//		testPlanProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testPlanProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#setProcessReadiness}.
	 */
	public void testPlanProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testPlanProcess.getProcessReadiness());
		testPlanProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testPlanProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#setIntendedUse}.
	 */
	public void testPlanProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testPlanProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testPlanProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#setDescription}.
	 */
	public void testPlanProcesssetDescription() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testPlanProcess.getDescription());
		String newStringValue = "new description value";
		testPlanProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#setBuiltTime}.
	 */
	public void testPlanProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testPlanProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testPlanProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#setComment}.
	 */
	public void testPlanProcesssetComment() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testPlanProcess.getComment());
		String newStringValue = "new comment value";
		testPlanProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#setProcessVersion}.
	 */
	public void testPlanProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testPlanProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testPlanProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testPlanProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#setValidUntilTime}.
	 */
	public void testPlanProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testPlanProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testPlanProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#setReleaseTime}.
	 */
	public void testPlanProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testPlanProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testPlanProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#setProcessRationale}.
	 */
	public void testPlanProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testPlanProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testPlanProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#setName}.
	 */
	public void testPlanProcesssetName() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testPlanProcess.getName());
		String newStringValue = "new name value";
		testPlanProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#setSummary}.
	 */
	public void testPlanProcesssetSummary() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testPlanProcess.getSummary());
		String newStringValue = "new summary value";
		testPlanProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testPlanProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#getVerifiedUsing}.
	 */
	public void testPlanProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPlanProcess.getVerifiedUsings())));
//		testPlanProcess.getVerifiedUsings().clear();
//		testPlanProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPlanProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#getExternalRef}.
	 */
	public void testPlanProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPlanProcess.getExternalRefs())));
//		testPlanProcess.getExternalRefs().clear();
//		testPlanProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPlanProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#getOriginatedBy}.
	 */
	public void testPlanProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPlanProcess.getOriginatedBys())));
//		testPlanProcess.getOriginatedBys().clear();
//		testPlanProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPlanProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#getExternalIdentifier}.
	 */
	public void testPlanProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPlanProcess.getExternalIdentifiers())));
//		testPlanProcess.getExternalIdentifiers().clear();
//		testPlanProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPlanProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#getExtension}.
	 */
	public void testPlanProcessgetExtensions() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testPlanProcess.getExtensions())));
//		testPlanProcess.getExtensions().clear();
//		testPlanProcess.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testPlanProcess.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#getStandardNames}.
	 */
	public void testPlanProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testPlanProcess.getStandardNames())));
		testPlanProcess.getStandardNames().clear();
		testPlanProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testPlanProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.PlanProcess#getSupportLevel}.
	 */
	public void testPlanProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		PlanProcess testPlanProcess = generator.builderForPlanProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testPlanProcess.getSupportLevels())));
		testPlanProcess.getSupportLevels().clear();
		testPlanProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testPlanProcess.getSupportLevels())));
	}
}
