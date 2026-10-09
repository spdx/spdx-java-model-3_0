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
import org.spdx.library.model.v3.supplychain.UseProcess.UseProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class UseProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testUseProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.UseProcess", testUseProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#Element(org.spdx.library.model.v3.supplychain.UseProcess.UseProcessBuilder)}.
	 */
	public void testUseProcessUseProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
		UseProcess test2UseProcess = generator.builderForUseProcessTests("https://testObject2").build();
		assertTrue(testUseProcess.equivalent(test2UseProcess));
		assertTrue(test2UseProcess.equivalent(testUseProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#setSuppliedBy}.
	 */
	public void testUseProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testUseProcess.getSuppliedBy());
//		testUseProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testUseProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#setCreationInfo}.
	 */
	public void testUseProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testUseProcess.getCreationInfo());
//		testUseProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testUseProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#setProcessReadiness}.
	 */
	public void testUseProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testUseProcess.getProcessReadiness());
		testUseProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testUseProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#setIntendedUse}.
	 */
	public void testUseProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testUseProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testUseProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#setDescription}.
	 */
	public void testUseProcesssetDescription() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testUseProcess.getDescription());
		String newStringValue = "new description value";
		testUseProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#setBuiltTime}.
	 */
	public void testUseProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testUseProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testUseProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#setComment}.
	 */
	public void testUseProcesssetComment() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testUseProcess.getComment());
		String newStringValue = "new comment value";
		testUseProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#setProcessVersion}.
	 */
	public void testUseProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testUseProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testUseProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testUseProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#setValidUntilTime}.
	 */
	public void testUseProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testUseProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testUseProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#setReleaseTime}.
	 */
	public void testUseProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testUseProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testUseProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#setProcessRationale}.
	 */
	public void testUseProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testUseProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testUseProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#setName}.
	 */
	public void testUseProcesssetName() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testUseProcess.getName());
		String newStringValue = "new name value";
		testUseProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#setSummary}.
	 */
	public void testUseProcesssetSummary() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testUseProcess.getSummary());
		String newStringValue = "new summary value";
		testUseProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testUseProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#getVerifiedUsing}.
	 */
	public void testUseProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testUseProcess.getVerifiedUsings())));
//		testUseProcess.getVerifiedUsings().clear();
//		testUseProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testUseProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#getExternalRef}.
	 */
	public void testUseProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testUseProcess.getExternalRefs())));
//		testUseProcess.getExternalRefs().clear();
//		testUseProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testUseProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#getOriginatedBy}.
	 */
	public void testUseProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testUseProcess.getOriginatedBys())));
//		testUseProcess.getOriginatedBys().clear();
//		testUseProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testUseProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#getExternalIdentifier}.
	 */
	public void testUseProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testUseProcess.getExternalIdentifiers())));
//		testUseProcess.getExternalIdentifiers().clear();
//		testUseProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testUseProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#getExtension}.
	 */
	public void testUseProcessgetExtensions() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testUseProcess.getExtensions())));
//		testUseProcess.getExtensions().clear();
//		testUseProcess.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testUseProcess.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#getStandardNames}.
	 */
	public void testUseProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testUseProcess.getStandardNames())));
		testUseProcess.getStandardNames().clear();
		testUseProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testUseProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.UseProcess#getSupportLevel}.
	 */
	public void testUseProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		UseProcess testUseProcess = generator.builderForUseProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testUseProcess.getSupportLevels())));
		testUseProcess.getSupportLevels().clear();
		testUseProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testUseProcess.getSupportLevels())));
	}
}
