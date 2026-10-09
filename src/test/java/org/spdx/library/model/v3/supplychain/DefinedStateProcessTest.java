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
import org.spdx.library.model.v3.supplychain.DefinedStateProcess.DefinedStateProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class DefinedStateProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testDefinedStateProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.DefinedStateProcess", testDefinedStateProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#Element(org.spdx.library.model.v3.supplychain.DefinedStateProcess.DefinedStateProcessBuilder)}.
	 */
	public void testDefinedStateProcessDefinedStateProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
		DefinedStateProcess test2DefinedStateProcess = generator.builderForDefinedStateProcessTests("https://testObject2").build();
		assertTrue(testDefinedStateProcess.equivalent(test2DefinedStateProcess));
		assertTrue(test2DefinedStateProcess.equivalent(testDefinedStateProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#setSuppliedBy}.
	 */
	public void testDefinedStateProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testDefinedStateProcess.getSuppliedBy());
//		testDefinedStateProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testDefinedStateProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#setCreationInfo}.
	 */
	public void testDefinedStateProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testDefinedStateProcess.getCreationInfo());
//		testDefinedStateProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testDefinedStateProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#setProcessReadiness}.
	 */
	public void testDefinedStateProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testDefinedStateProcess.getProcessReadiness());
		testDefinedStateProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testDefinedStateProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#setIntendedUse}.
	 */
	public void testDefinedStateProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testDefinedStateProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testDefinedStateProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testDefinedStateProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#setDescription}.
	 */
	public void testDefinedStateProcesssetDescription() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testDefinedStateProcess.getDescription());
		String newStringValue = "new description value";
		testDefinedStateProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testDefinedStateProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#setBuiltTime}.
	 */
	public void testDefinedStateProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testDefinedStateProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testDefinedStateProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testDefinedStateProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#setComment}.
	 */
	public void testDefinedStateProcesssetComment() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testDefinedStateProcess.getComment());
		String newStringValue = "new comment value";
		testDefinedStateProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testDefinedStateProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#setProcessVersion}.
	 */
	public void testDefinedStateProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testDefinedStateProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testDefinedStateProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testDefinedStateProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#setValidUntilTime}.
	 */
	public void testDefinedStateProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testDefinedStateProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testDefinedStateProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testDefinedStateProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#setReleaseTime}.
	 */
	public void testDefinedStateProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testDefinedStateProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testDefinedStateProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testDefinedStateProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#setProcessRationale}.
	 */
	public void testDefinedStateProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testDefinedStateProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testDefinedStateProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testDefinedStateProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#setName}.
	 */
	public void testDefinedStateProcesssetName() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testDefinedStateProcess.getName());
		String newStringValue = "new name value";
		testDefinedStateProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testDefinedStateProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#setSummary}.
	 */
	public void testDefinedStateProcesssetSummary() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testDefinedStateProcess.getSummary());
		String newStringValue = "new summary value";
		testDefinedStateProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testDefinedStateProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#getVerifiedUsing}.
	 */
	public void testDefinedStateProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDefinedStateProcess.getVerifiedUsings())));
//		testDefinedStateProcess.getVerifiedUsings().clear();
//		testDefinedStateProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDefinedStateProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#getExternalRef}.
	 */
	public void testDefinedStateProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDefinedStateProcess.getExternalRefs())));
//		testDefinedStateProcess.getExternalRefs().clear();
//		testDefinedStateProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDefinedStateProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#getOriginatedBy}.
	 */
	public void testDefinedStateProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDefinedStateProcess.getOriginatedBys())));
//		testDefinedStateProcess.getOriginatedBys().clear();
//		testDefinedStateProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDefinedStateProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#getExternalIdentifier}.
	 */
	public void testDefinedStateProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDefinedStateProcess.getExternalIdentifiers())));
//		testDefinedStateProcess.getExternalIdentifiers().clear();
//		testDefinedStateProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDefinedStateProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#getValidState}.
	 */
	public void testDefinedStateProcessgetValidStates() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDefinedStateProcess.getValidStates())));
//		testDefinedStateProcess.getValidStates().clear();
//		testDefinedStateProcess.getValidStates().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDefinedStateProcess.getValidStates())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#getExtension}.
	 */
	public void testDefinedStateProcessgetExtensions() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDefinedStateProcess.getExtensions())));
//		testDefinedStateProcess.getExtensions().clear();
//		testDefinedStateProcess.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDefinedStateProcess.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#getStandardNames}.
	 */
	public void testDefinedStateProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testDefinedStateProcess.getStandardNames())));
		testDefinedStateProcess.getStandardNames().clear();
		testDefinedStateProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testDefinedStateProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.DefinedStateProcess#getSupportLevel}.
	 */
	public void testDefinedStateProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		DefinedStateProcess testDefinedStateProcess = generator.builderForDefinedStateProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testDefinedStateProcess.getSupportLevels())));
		testDefinedStateProcess.getSupportLevels().clear();
		testDefinedStateProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testDefinedStateProcess.getSupportLevels())));
	}
}
