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
import org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess.BoundaryDefinitionProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class BoundaryDefinitionProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testBoundaryDefinitionProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.BoundaryDefinitionProcess", testBoundaryDefinitionProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#Element(org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess.BoundaryDefinitionProcessBuilder)}.
	 */
	public void testBoundaryDefinitionProcessBoundaryDefinitionProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
		BoundaryDefinitionProcess test2BoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests("https://testObject2").build();
		assertTrue(testBoundaryDefinitionProcess.equivalent(test2BoundaryDefinitionProcess));
		assertTrue(test2BoundaryDefinitionProcess.equivalent(testBoundaryDefinitionProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#setSuppliedBy}.
	 */
	public void testBoundaryDefinitionProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testBoundaryDefinitionProcess.getSuppliedBy());
//		testBoundaryDefinitionProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testBoundaryDefinitionProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#setCreationInfo}.
	 */
	public void testBoundaryDefinitionProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testBoundaryDefinitionProcess.getCreationInfo());
//		testBoundaryDefinitionProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testBoundaryDefinitionProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#setProcessReadiness}.
	 */
	public void testBoundaryDefinitionProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testBoundaryDefinitionProcess.getProcessReadiness());
		testBoundaryDefinitionProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testBoundaryDefinitionProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#setIntendedUse}.
	 */
	public void testBoundaryDefinitionProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testBoundaryDefinitionProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testBoundaryDefinitionProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#setDescription}.
	 */
	public void testBoundaryDefinitionProcesssetDescription() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testBoundaryDefinitionProcess.getDescription());
		String newStringValue = "new description value";
		testBoundaryDefinitionProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#setBuiltTime}.
	 */
	public void testBoundaryDefinitionProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testBoundaryDefinitionProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBoundaryDefinitionProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#setComment}.
	 */
	public void testBoundaryDefinitionProcesssetComment() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testBoundaryDefinitionProcess.getComment());
		String newStringValue = "new comment value";
		testBoundaryDefinitionProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#setProcessVersion}.
	 */
	public void testBoundaryDefinitionProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testBoundaryDefinitionProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testBoundaryDefinitionProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testBoundaryDefinitionProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#setValidUntilTime}.
	 */
	public void testBoundaryDefinitionProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testBoundaryDefinitionProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBoundaryDefinitionProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#setReleaseTime}.
	 */
	public void testBoundaryDefinitionProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testBoundaryDefinitionProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBoundaryDefinitionProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#setProcessRationale}.
	 */
	public void testBoundaryDefinitionProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testBoundaryDefinitionProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testBoundaryDefinitionProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#setName}.
	 */
	public void testBoundaryDefinitionProcesssetName() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testBoundaryDefinitionProcess.getName());
		String newStringValue = "new name value";
		testBoundaryDefinitionProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#setSummary}.
	 */
	public void testBoundaryDefinitionProcesssetSummary() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testBoundaryDefinitionProcess.getSummary());
		String newStringValue = "new summary value";
		testBoundaryDefinitionProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testBoundaryDefinitionProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#getVerifiedUsing}.
	 */
	public void testBoundaryDefinitionProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryDefinitionProcess.getVerifiedUsings())));
//		testBoundaryDefinitionProcess.getVerifiedUsings().clear();
//		testBoundaryDefinitionProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryDefinitionProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#getExternalRef}.
	 */
	public void testBoundaryDefinitionProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryDefinitionProcess.getExternalRefs())));
//		testBoundaryDefinitionProcess.getExternalRefs().clear();
//		testBoundaryDefinitionProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryDefinitionProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#getOriginatedBy}.
	 */
	public void testBoundaryDefinitionProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryDefinitionProcess.getOriginatedBys())));
//		testBoundaryDefinitionProcess.getOriginatedBys().clear();
//		testBoundaryDefinitionProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryDefinitionProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#getExternalIdentifier}.
	 */
	public void testBoundaryDefinitionProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryDefinitionProcess.getExternalIdentifiers())));
//		testBoundaryDefinitionProcess.getExternalIdentifiers().clear();
//		testBoundaryDefinitionProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryDefinitionProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#getExtension}.
	 */
	public void testBoundaryDefinitionProcessgetExtensions() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBoundaryDefinitionProcess.getExtensions())));
//		testBoundaryDefinitionProcess.getExtensions().clear();
//		testBoundaryDefinitionProcess.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBoundaryDefinitionProcess.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#getStandardNames}.
	 */
	public void testBoundaryDefinitionProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testBoundaryDefinitionProcess.getStandardNames())));
		testBoundaryDefinitionProcess.getStandardNames().clear();
		testBoundaryDefinitionProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testBoundaryDefinitionProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.BoundaryDefinitionProcess#getSupportLevel}.
	 */
	public void testBoundaryDefinitionProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		BoundaryDefinitionProcess testBoundaryDefinitionProcess = generator.builderForBoundaryDefinitionProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testBoundaryDefinitionProcess.getSupportLevels())));
		testBoundaryDefinitionProcess.getSupportLevels().clear();
		testBoundaryDefinitionProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testBoundaryDefinitionProcess.getSupportLevels())));
	}
}
