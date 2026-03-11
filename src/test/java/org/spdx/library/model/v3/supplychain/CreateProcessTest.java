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
import org.spdx.library.model.v3.core.DefinedProcess;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.ProcessReadinessType;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.core.SupportType;
import org.spdx.library.model.v3.extension.Extension;
import org.spdx.library.model.v3.supplychain.CreateProcess.CreateProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class CreateProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testCreateProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.CreateProcess", testCreateProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#Element(org.spdx.library.model.v3.supplychain.CreateProcess.CreateProcessBuilder)}.
	 */
	public void testCreateProcessCreateProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
		CreateProcess test2CreateProcess = generator.builderForCreateProcessTests("https://testObject2").build();
		assertTrue(testCreateProcess.equivalent(test2CreateProcess));
		assertTrue(test2CreateProcess.equivalent(testCreateProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#setSuppliedBy}.
	 */
	public void testCreateProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testCreateProcess.getSuppliedBy());
//		testCreateProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testCreateProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#setExtension}.
	 */
	public void testCreateProcesssetExtension() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testCreateProcess.getExtension());
//		testCreateProcess.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testCreateProcess.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#setCreationInfo}.
	 */
	public void testCreateProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testCreateProcess.getCreationInfo());
//		testCreateProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testCreateProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#setProcessReadiness}.
	 */
	public void testCreateProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testCreateProcess.getProcessReadiness());
		testCreateProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testCreateProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#setIntendedUse}.
	 */
	public void testCreateProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testCreateProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testCreateProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#setDescription}.
	 */
	public void testCreateProcesssetDescription() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testCreateProcess.getDescription());
		String newStringValue = "new description value";
		testCreateProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#setBuiltTime}.
	 */
	public void testCreateProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testCreateProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCreateProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#setComment}.
	 */
	public void testCreateProcesssetComment() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testCreateProcess.getComment());
		String newStringValue = "new comment value";
		testCreateProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#setProcessVersion}.
	 */
	public void testCreateProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testCreateProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testCreateProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testCreateProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#setValidUntilTime}.
	 */
	public void testCreateProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testCreateProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCreateProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#setReleaseTime}.
	 */
	public void testCreateProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testCreateProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testCreateProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#setProcessRationale}.
	 */
	public void testCreateProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testCreateProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testCreateProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#setName}.
	 */
	public void testCreateProcesssetName() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testCreateProcess.getName());
		String newStringValue = "new name value";
		testCreateProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#setSummary}.
	 */
	public void testCreateProcesssetSummary() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testCreateProcess.getSummary());
		String newStringValue = "new summary value";
		testCreateProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testCreateProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#getVerifiedUsing}.
	 */
	public void testCreateProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCreateProcess.getVerifiedUsings())));
//		testCreateProcess.getVerifiedUsings().clear();
//		testCreateProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCreateProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#getExternalRef}.
	 */
	public void testCreateProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCreateProcess.getExternalRefs())));
//		testCreateProcess.getExternalRefs().clear();
//		testCreateProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCreateProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#getOriginatedBy}.
	 */
	public void testCreateProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCreateProcess.getOriginatedBys())));
//		testCreateProcess.getOriginatedBys().clear();
//		testCreateProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCreateProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#getExternalIdentifier}.
	 */
	public void testCreateProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testCreateProcess.getExternalIdentifiers())));
//		testCreateProcess.getExternalIdentifiers().clear();
//		testCreateProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testCreateProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#getStandardNames}.
	 */
	public void testCreateProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testCreateProcess.getStandardNames())));
		testCreateProcess.getStandardNames().clear();
		testCreateProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testCreateProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.CreateProcess#getSupportLevel}.
	 */
	public void testCreateProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		CreateProcess testCreateProcess = generator.builderForCreateProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testCreateProcess.getSupportLevels())));
		testCreateProcess.getSupportLevels().clear();
		testCreateProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testCreateProcess.getSupportLevels())));
	}
}
