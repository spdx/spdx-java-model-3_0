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
import org.spdx.library.model.v3.supplychain.HarvestProcess.HarvestProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class HarvestProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testHarvestProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.HarvestProcess", testHarvestProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#Element(org.spdx.library.model.v3.supplychain.HarvestProcess.HarvestProcessBuilder)}.
	 */
	public void testHarvestProcessHarvestProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
		HarvestProcess test2HarvestProcess = generator.builderForHarvestProcessTests("https://testObject2").build();
		assertTrue(testHarvestProcess.equivalent(test2HarvestProcess));
		assertTrue(test2HarvestProcess.equivalent(testHarvestProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#setSuppliedBy}.
	 */
	public void testHarvestProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testHarvestProcess.getSuppliedBy());
//		testHarvestProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testHarvestProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#setCreationInfo}.
	 */
	public void testHarvestProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testHarvestProcess.getCreationInfo());
//		testHarvestProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testHarvestProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#setProcessReadiness}.
	 */
	public void testHarvestProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testHarvestProcess.getProcessReadiness());
		testHarvestProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testHarvestProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#setIntendedUse}.
	 */
	public void testHarvestProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testHarvestProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testHarvestProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#setDescription}.
	 */
	public void testHarvestProcesssetDescription() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testHarvestProcess.getDescription());
		String newStringValue = "new description value";
		testHarvestProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#setBuiltTime}.
	 */
	public void testHarvestProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testHarvestProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testHarvestProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#setComment}.
	 */
	public void testHarvestProcesssetComment() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testHarvestProcess.getComment());
		String newStringValue = "new comment value";
		testHarvestProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#setProcessVersion}.
	 */
	public void testHarvestProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testHarvestProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testHarvestProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testHarvestProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#setValidUntilTime}.
	 */
	public void testHarvestProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testHarvestProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testHarvestProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#setReleaseTime}.
	 */
	public void testHarvestProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testHarvestProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testHarvestProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#setProcessRationale}.
	 */
	public void testHarvestProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testHarvestProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testHarvestProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#setName}.
	 */
	public void testHarvestProcesssetName() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testHarvestProcess.getName());
		String newStringValue = "new name value";
		testHarvestProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#setSummary}.
	 */
	public void testHarvestProcesssetSummary() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testHarvestProcess.getSummary());
		String newStringValue = "new summary value";
		testHarvestProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testHarvestProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#getVerifiedUsing}.
	 */
	public void testHarvestProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testHarvestProcess.getVerifiedUsings())));
//		testHarvestProcess.getVerifiedUsings().clear();
//		testHarvestProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testHarvestProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#getExternalRef}.
	 */
	public void testHarvestProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testHarvestProcess.getExternalRefs())));
//		testHarvestProcess.getExternalRefs().clear();
//		testHarvestProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testHarvestProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#getOriginatedBy}.
	 */
	public void testHarvestProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testHarvestProcess.getOriginatedBys())));
//		testHarvestProcess.getOriginatedBys().clear();
//		testHarvestProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testHarvestProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#getExternalIdentifier}.
	 */
	public void testHarvestProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testHarvestProcess.getExternalIdentifiers())));
//		testHarvestProcess.getExternalIdentifiers().clear();
//		testHarvestProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testHarvestProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#getExtension}.
	 */
	public void testHarvestProcessgetExtensions() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testHarvestProcess.getExtensions())));
//		testHarvestProcess.getExtensions().clear();
//		testHarvestProcess.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testHarvestProcess.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#getStandardNames}.
	 */
	public void testHarvestProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testHarvestProcess.getStandardNames())));
		testHarvestProcess.getStandardNames().clear();
		testHarvestProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testHarvestProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.HarvestProcess#getSupportLevel}.
	 */
	public void testHarvestProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		HarvestProcess testHarvestProcess = generator.builderForHarvestProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testHarvestProcess.getSupportLevels())));
		testHarvestProcess.getSupportLevels().clear();
		testHarvestProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testHarvestProcess.getSupportLevels())));
	}
}
