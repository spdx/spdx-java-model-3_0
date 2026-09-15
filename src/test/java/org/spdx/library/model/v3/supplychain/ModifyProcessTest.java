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
import org.spdx.library.model.v3.core.DefinedProcess;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.ProcessReadinessType;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.core.SupportType;
import org.spdx.library.model.v3.extension.Extension;
import org.spdx.library.model.v3.supplychain.ModifyProcess.ModifyProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ModifyProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testModifyProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.ModifyProcess", testModifyProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#Element(org.spdx.library.model.v3.supplychain.ModifyProcess.ModifyProcessBuilder)}.
	 */
	public void testModifyProcessModifyProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
		ModifyProcess test2ModifyProcess = generator.builderForModifyProcessTests("https://testObject2").build();
		assertTrue(testModifyProcess.equivalent(test2ModifyProcess));
		assertTrue(test2ModifyProcess.equivalent(testModifyProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#setSuppliedBy}.
	 */
	public void testModifyProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testModifyProcess.getSuppliedBy());
//		testModifyProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testModifyProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#setCreationInfo}.
	 */
	public void testModifyProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testModifyProcess.getCreationInfo());
//		testModifyProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testModifyProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#setProcessReadiness}.
	 */
	public void testModifyProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testModifyProcess.getProcessReadiness());
		testModifyProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testModifyProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#setIntendedUse}.
	 */
	public void testModifyProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testModifyProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testModifyProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#setDescription}.
	 */
	public void testModifyProcesssetDescription() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testModifyProcess.getDescription());
		String newStringValue = "new description value";
		testModifyProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#setBuiltTime}.
	 */
	public void testModifyProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testModifyProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testModifyProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#setComment}.
	 */
	public void testModifyProcesssetComment() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testModifyProcess.getComment());
		String newStringValue = "new comment value";
		testModifyProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#setProcessVersion}.
	 */
	public void testModifyProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testModifyProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testModifyProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testModifyProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#setValidUntilTime}.
	 */
	public void testModifyProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testModifyProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testModifyProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#setReleaseTime}.
	 */
	public void testModifyProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testModifyProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testModifyProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#setProcessRationale}.
	 */
	public void testModifyProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testModifyProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testModifyProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#setName}.
	 */
	public void testModifyProcesssetName() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testModifyProcess.getName());
		String newStringValue = "new name value";
		testModifyProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#setSummary}.
	 */
	public void testModifyProcesssetSummary() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testModifyProcess.getSummary());
		String newStringValue = "new summary value";
		testModifyProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testModifyProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#getVerifiedUsing}.
	 */
	public void testModifyProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testModifyProcess.getVerifiedUsings())));
//		testModifyProcess.getVerifiedUsings().clear();
//		testModifyProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testModifyProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#getExternalRef}.
	 */
	public void testModifyProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testModifyProcess.getExternalRefs())));
//		testModifyProcess.getExternalRefs().clear();
//		testModifyProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testModifyProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#getOriginatedBy}.
	 */
	public void testModifyProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testModifyProcess.getOriginatedBys())));
//		testModifyProcess.getOriginatedBys().clear();
//		testModifyProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testModifyProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#getExternalIdentifier}.
	 */
	public void testModifyProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testModifyProcess.getExternalIdentifiers())));
//		testModifyProcess.getExternalIdentifiers().clear();
//		testModifyProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testModifyProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#getExtension}.
	 */
	public void testModifyProcessgetExtensions() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testModifyProcess.getExtensions())));
//		testModifyProcess.getExtensions().clear();
//		testModifyProcess.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testModifyProcess.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#getStandardNames}.
	 */
	public void testModifyProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testModifyProcess.getStandardNames())));
		testModifyProcess.getStandardNames().clear();
		testModifyProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testModifyProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ModifyProcess#getSupportLevel}.
	 */
	public void testModifyProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		ModifyProcess testModifyProcess = generator.builderForModifyProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testModifyProcess.getSupportLevels())));
		testModifyProcess.getSupportLevels().clear();
		testModifyProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testModifyProcess.getSupportLevels())));
	}
}
