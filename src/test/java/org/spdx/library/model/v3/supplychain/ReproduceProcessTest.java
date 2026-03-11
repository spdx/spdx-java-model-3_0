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
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.ProcessReadinessType;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.core.SupportType;
import org.spdx.library.model.v3.extension.Extension;
import org.spdx.library.model.v3.supplychain.ReproduceProcess.ReproduceProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ReproduceProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testReproduceProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.ReproduceProcess", testReproduceProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#Element(org.spdx.library.model.v3.supplychain.ReproduceProcess.ReproduceProcessBuilder)}.
	 */
	public void testReproduceProcessReproduceProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
		ReproduceProcess test2ReproduceProcess = generator.builderForReproduceProcessTests("https://testObject2").build();
		assertTrue(testReproduceProcess.equivalent(test2ReproduceProcess));
		assertTrue(test2ReproduceProcess.equivalent(testReproduceProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#setSuppliedBy}.
	 */
	public void testReproduceProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testReproduceProcess.getSuppliedBy());
//		testReproduceProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testReproduceProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#setExtension}.
	 */
	public void testReproduceProcesssetExtension() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testReproduceProcess.getExtension());
//		testReproduceProcess.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testReproduceProcess.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#setCreationInfo}.
	 */
	public void testReproduceProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testReproduceProcess.getCreationInfo());
//		testReproduceProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testReproduceProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#setProcessReadiness}.
	 */
	public void testReproduceProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testReproduceProcess.getProcessReadiness());
		testReproduceProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testReproduceProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#setIntendedUse}.
	 */
	public void testReproduceProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testReproduceProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testReproduceProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#setDescription}.
	 */
	public void testReproduceProcesssetDescription() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testReproduceProcess.getDescription());
		String newStringValue = "new description value";
		testReproduceProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#setBuiltTime}.
	 */
	public void testReproduceProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testReproduceProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testReproduceProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#setComment}.
	 */
	public void testReproduceProcesssetComment() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testReproduceProcess.getComment());
		String newStringValue = "new comment value";
		testReproduceProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#setProcessVersion}.
	 */
	public void testReproduceProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testReproduceProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testReproduceProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testReproduceProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#setValidUntilTime}.
	 */
	public void testReproduceProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testReproduceProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testReproduceProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#setReleaseTime}.
	 */
	public void testReproduceProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testReproduceProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testReproduceProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#setProcessRationale}.
	 */
	public void testReproduceProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testReproduceProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testReproduceProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#setName}.
	 */
	public void testReproduceProcesssetName() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testReproduceProcess.getName());
		String newStringValue = "new name value";
		testReproduceProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#setSummary}.
	 */
	public void testReproduceProcesssetSummary() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testReproduceProcess.getSummary());
		String newStringValue = "new summary value";
		testReproduceProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testReproduceProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#getVerifiedUsing}.
	 */
	public void testReproduceProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testReproduceProcess.getVerifiedUsings())));
//		testReproduceProcess.getVerifiedUsings().clear();
//		testReproduceProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testReproduceProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#getExternalRef}.
	 */
	public void testReproduceProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testReproduceProcess.getExternalRefs())));
//		testReproduceProcess.getExternalRefs().clear();
//		testReproduceProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testReproduceProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#getOriginatedBy}.
	 */
	public void testReproduceProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testReproduceProcess.getOriginatedBys())));
//		testReproduceProcess.getOriginatedBys().clear();
//		testReproduceProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testReproduceProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#getExternalIdentifier}.
	 */
	public void testReproduceProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testReproduceProcess.getExternalIdentifiers())));
//		testReproduceProcess.getExternalIdentifiers().clear();
//		testReproduceProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testReproduceProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#getStandardNames}.
	 */
	public void testReproduceProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testReproduceProcess.getStandardNames())));
		testReproduceProcess.getStandardNames().clear();
		testReproduceProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testReproduceProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ReproduceProcess#getSupportLevel}.
	 */
	public void testReproduceProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		ReproduceProcess testReproduceProcess = generator.builderForReproduceProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testReproduceProcess.getSupportLevels())));
		testReproduceProcess.getSupportLevels().clear();
		testReproduceProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testReproduceProcess.getSupportLevels())));
	}
}
