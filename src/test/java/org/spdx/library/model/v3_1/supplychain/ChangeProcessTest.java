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
import org.spdx.library.model.v3_1.core.Element;
import org.spdx.library.model.v3_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_1.core.ExternalRef;
import org.spdx.library.model.v3_1.core.IntegrityMethod;
import org.spdx.library.model.v3_1.core.ProcessReadinessType;
import org.spdx.library.model.v3_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_1.core.SupportType;
import org.spdx.library.model.v3_1.extension.Extension;
import org.spdx.library.model.v3_1.supplychain.ChangeProcess.ChangeProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ChangeProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testChangeProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.ChangeProcess", testChangeProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#Element(org.spdx.library.model.v3_1.supplychain.ChangeProcess.ChangeProcessBuilder)}.
	 */
	public void testChangeProcessChangeProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
		ChangeProcess test2ChangeProcess = generator.builderForChangeProcessTests("https://testObject2").build();
		assertTrue(testChangeProcess.equivalent(test2ChangeProcess));
		assertTrue(test2ChangeProcess.equivalent(testChangeProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#setSuppliedBy}.
	 */
	public void testChangeProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testChangeProcess.getSuppliedBy());
//		testChangeProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testChangeProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#setExtension}.
	 */
	public void testChangeProcesssetExtension() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testChangeProcess.getExtension());
//		testChangeProcess.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testChangeProcess.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#setCreationInfo}.
	 */
	public void testChangeProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testChangeProcess.getCreationInfo());
//		testChangeProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testChangeProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#setProcessReadiness}.
	 */
	public void testChangeProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testChangeProcess.getProcessReadiness());
		testChangeProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testChangeProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#setIntendedUse}.
	 */
	public void testChangeProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testChangeProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testChangeProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#setDescription}.
	 */
	public void testChangeProcesssetDescription() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testChangeProcess.getDescription());
		String newStringValue = "new description value";
		testChangeProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#setBuiltTime}.
	 */
	public void testChangeProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testChangeProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testChangeProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#setComment}.
	 */
	public void testChangeProcesssetComment() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testChangeProcess.getComment());
		String newStringValue = "new comment value";
		testChangeProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#setProcessVersion}.
	 */
	public void testChangeProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testChangeProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testChangeProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testChangeProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#setValidUntilTime}.
	 */
	public void testChangeProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testChangeProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testChangeProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#setReleaseTime}.
	 */
	public void testChangeProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testChangeProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testChangeProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#setProcessRationale}.
	 */
	public void testChangeProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testChangeProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testChangeProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#setName}.
	 */
	public void testChangeProcesssetName() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testChangeProcess.getName());
		String newStringValue = "new name value";
		testChangeProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#setSummary}.
	 */
	public void testChangeProcesssetSummary() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testChangeProcess.getSummary());
		String newStringValue = "new summary value";
		testChangeProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testChangeProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#getVerifiedUsing}.
	 */
	public void testChangeProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testChangeProcess.getVerifiedUsings())));
//		testChangeProcess.getVerifiedUsings().clear();
//		testChangeProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testChangeProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#getExternalRef}.
	 */
	public void testChangeProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testChangeProcess.getExternalRefs())));
//		testChangeProcess.getExternalRefs().clear();
//		testChangeProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testChangeProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#getOriginatedBy}.
	 */
	public void testChangeProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testChangeProcess.getOriginatedBys())));
//		testChangeProcess.getOriginatedBys().clear();
//		testChangeProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testChangeProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#getExternalIdentifier}.
	 */
	public void testChangeProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testChangeProcess.getExternalIdentifiers())));
//		testChangeProcess.getExternalIdentifiers().clear();
//		testChangeProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testChangeProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#getStandardNames}.
	 */
	public void testChangeProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testChangeProcess.getStandardNames())));
		testChangeProcess.getStandardNames().clear();
		testChangeProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testChangeProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.ChangeProcess#getSupportLevel}.
	 */
	public void testChangeProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		ChangeProcess testChangeProcess = generator.builderForChangeProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testChangeProcess.getSupportLevels())));
		testChangeProcess.getSupportLevels().clear();
		testChangeProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testChangeProcess.getSupportLevels())));
	}
}
