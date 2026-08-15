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
import org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess.InstantiateVirtualHardwareProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class InstantiateVirtualHardwareProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testInstantiateVirtualHardwareProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.InstantiateVirtualHardwareProcess", testInstantiateVirtualHardwareProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#Element(org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess.InstantiateVirtualHardwareProcessBuilder)}.
	 */
	public void testInstantiateVirtualHardwareProcessInstantiateVirtualHardwareProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
		InstantiateVirtualHardwareProcess test2InstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests("https://testObject2").build();
		assertTrue(testInstantiateVirtualHardwareProcess.equivalent(test2InstantiateVirtualHardwareProcess));
		assertTrue(test2InstantiateVirtualHardwareProcess.equivalent(testInstantiateVirtualHardwareProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#setSuppliedBy}.
	 */
	public void testInstantiateVirtualHardwareProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testInstantiateVirtualHardwareProcess.getSuppliedBy());
//		testInstantiateVirtualHardwareProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testInstantiateVirtualHardwareProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#setCreationInfo}.
	 */
	public void testInstantiateVirtualHardwareProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testInstantiateVirtualHardwareProcess.getCreationInfo());
//		testInstantiateVirtualHardwareProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testInstantiateVirtualHardwareProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#setProcessReadiness}.
	 */
	public void testInstantiateVirtualHardwareProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testInstantiateVirtualHardwareProcess.getProcessReadiness());
		testInstantiateVirtualHardwareProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testInstantiateVirtualHardwareProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#setIntendedUse}.
	 */
	public void testInstantiateVirtualHardwareProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testInstantiateVirtualHardwareProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testInstantiateVirtualHardwareProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testInstantiateVirtualHardwareProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#setDescription}.
	 */
	public void testInstantiateVirtualHardwareProcesssetDescription() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testInstantiateVirtualHardwareProcess.getDescription());
		String newStringValue = "new description value";
		testInstantiateVirtualHardwareProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testInstantiateVirtualHardwareProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#setBuiltTime}.
	 */
	public void testInstantiateVirtualHardwareProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testInstantiateVirtualHardwareProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testInstantiateVirtualHardwareProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testInstantiateVirtualHardwareProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#setComment}.
	 */
	public void testInstantiateVirtualHardwareProcesssetComment() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testInstantiateVirtualHardwareProcess.getComment());
		String newStringValue = "new comment value";
		testInstantiateVirtualHardwareProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testInstantiateVirtualHardwareProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#setProcessVersion}.
	 */
	public void testInstantiateVirtualHardwareProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testInstantiateVirtualHardwareProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testInstantiateVirtualHardwareProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testInstantiateVirtualHardwareProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#setValidUntilTime}.
	 */
	public void testInstantiateVirtualHardwareProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testInstantiateVirtualHardwareProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testInstantiateVirtualHardwareProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testInstantiateVirtualHardwareProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#setReleaseTime}.
	 */
	public void testInstantiateVirtualHardwareProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testInstantiateVirtualHardwareProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testInstantiateVirtualHardwareProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testInstantiateVirtualHardwareProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#setProcessRationale}.
	 */
	public void testInstantiateVirtualHardwareProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testInstantiateVirtualHardwareProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testInstantiateVirtualHardwareProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testInstantiateVirtualHardwareProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#setName}.
	 */
	public void testInstantiateVirtualHardwareProcesssetName() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testInstantiateVirtualHardwareProcess.getName());
		String newStringValue = "new name value";
		testInstantiateVirtualHardwareProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testInstantiateVirtualHardwareProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#setSummary}.
	 */
	public void testInstantiateVirtualHardwareProcesssetSummary() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testInstantiateVirtualHardwareProcess.getSummary());
		String newStringValue = "new summary value";
		testInstantiateVirtualHardwareProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testInstantiateVirtualHardwareProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#getVerifiedUsing}.
	 */
	public void testInstantiateVirtualHardwareProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testInstantiateVirtualHardwareProcess.getVerifiedUsings())));
//		testInstantiateVirtualHardwareProcess.getVerifiedUsings().clear();
//		testInstantiateVirtualHardwareProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testInstantiateVirtualHardwareProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#getExternalRef}.
	 */
	public void testInstantiateVirtualHardwareProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testInstantiateVirtualHardwareProcess.getExternalRefs())));
//		testInstantiateVirtualHardwareProcess.getExternalRefs().clear();
//		testInstantiateVirtualHardwareProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testInstantiateVirtualHardwareProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#getOriginatedBy}.
	 */
	public void testInstantiateVirtualHardwareProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testInstantiateVirtualHardwareProcess.getOriginatedBys())));
//		testInstantiateVirtualHardwareProcess.getOriginatedBys().clear();
//		testInstantiateVirtualHardwareProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testInstantiateVirtualHardwareProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#getExternalIdentifier}.
	 */
	public void testInstantiateVirtualHardwareProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testInstantiateVirtualHardwareProcess.getExternalIdentifiers())));
//		testInstantiateVirtualHardwareProcess.getExternalIdentifiers().clear();
//		testInstantiateVirtualHardwareProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testInstantiateVirtualHardwareProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#getExtension}.
	 */
	public void testInstantiateVirtualHardwareProcessgetExtensions() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testInstantiateVirtualHardwareProcess.getExtensions())));
//		testInstantiateVirtualHardwareProcess.getExtensions().clear();
//		testInstantiateVirtualHardwareProcess.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testInstantiateVirtualHardwareProcess.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#getStandardNames}.
	 */
	public void testInstantiateVirtualHardwareProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testInstantiateVirtualHardwareProcess.getStandardNames())));
		testInstantiateVirtualHardwareProcess.getStandardNames().clear();
		testInstantiateVirtualHardwareProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testInstantiateVirtualHardwareProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.InstantiateVirtualHardwareProcess#getSupportLevel}.
	 */
	public void testInstantiateVirtualHardwareProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		InstantiateVirtualHardwareProcess testInstantiateVirtualHardwareProcess = generator.builderForInstantiateVirtualHardwareProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testInstantiateVirtualHardwareProcess.getSupportLevels())));
		testInstantiateVirtualHardwareProcess.getSupportLevels().clear();
		testInstantiateVirtualHardwareProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testInstantiateVirtualHardwareProcess.getSupportLevels())));
	}
}
