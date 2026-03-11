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
import org.spdx.library.model.v3.supplychain.AssemblyProcess.AssemblyProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class AssemblyProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testAssemblyProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.AssemblyProcess", testAssemblyProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#Element(org.spdx.library.model.v3.supplychain.AssemblyProcess.AssemblyProcessBuilder)}.
	 */
	public void testAssemblyProcessAssemblyProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
		AssemblyProcess test2AssemblyProcess = generator.builderForAssemblyProcessTests("https://testObject2").build();
		assertTrue(testAssemblyProcess.equivalent(test2AssemblyProcess));
		assertTrue(test2AssemblyProcess.equivalent(testAssemblyProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#setSuppliedBy}.
	 */
	public void testAssemblyProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testAssemblyProcess.getSuppliedBy());
//		testAssemblyProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testAssemblyProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#setExtension}.
	 */
	public void testAssemblyProcesssetExtension() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testAssemblyProcess.getExtension());
//		testAssemblyProcess.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testAssemblyProcess.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#setCreationInfo}.
	 */
	public void testAssemblyProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testAssemblyProcess.getCreationInfo());
//		testAssemblyProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testAssemblyProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#setProcessReadiness}.
	 */
	public void testAssemblyProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testAssemblyProcess.getProcessReadiness());
		testAssemblyProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testAssemblyProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#setIntendedUse}.
	 */
	public void testAssemblyProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testAssemblyProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testAssemblyProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#setDescription}.
	 */
	public void testAssemblyProcesssetDescription() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testAssemblyProcess.getDescription());
		String newStringValue = "new description value";
		testAssemblyProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#setBuiltTime}.
	 */
	public void testAssemblyProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testAssemblyProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testAssemblyProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#setComment}.
	 */
	public void testAssemblyProcesssetComment() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testAssemblyProcess.getComment());
		String newStringValue = "new comment value";
		testAssemblyProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#setProcessVersion}.
	 */
	public void testAssemblyProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testAssemblyProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testAssemblyProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testAssemblyProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#setValidUntilTime}.
	 */
	public void testAssemblyProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testAssemblyProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testAssemblyProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#setReleaseTime}.
	 */
	public void testAssemblyProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testAssemblyProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testAssemblyProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#setProcessRationale}.
	 */
	public void testAssemblyProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testAssemblyProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testAssemblyProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#setName}.
	 */
	public void testAssemblyProcesssetName() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testAssemblyProcess.getName());
		String newStringValue = "new name value";
		testAssemblyProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#setSummary}.
	 */
	public void testAssemblyProcesssetSummary() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testAssemblyProcess.getSummary());
		String newStringValue = "new summary value";
		testAssemblyProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testAssemblyProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#getVerifiedUsing}.
	 */
	public void testAssemblyProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAssemblyProcess.getVerifiedUsings())));
//		testAssemblyProcess.getVerifiedUsings().clear();
//		testAssemblyProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAssemblyProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#getExternalRef}.
	 */
	public void testAssemblyProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAssemblyProcess.getExternalRefs())));
//		testAssemblyProcess.getExternalRefs().clear();
//		testAssemblyProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAssemblyProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#getOriginatedBy}.
	 */
	public void testAssemblyProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAssemblyProcess.getOriginatedBys())));
//		testAssemblyProcess.getOriginatedBys().clear();
//		testAssemblyProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAssemblyProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#getExternalIdentifier}.
	 */
	public void testAssemblyProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testAssemblyProcess.getExternalIdentifiers())));
//		testAssemblyProcess.getExternalIdentifiers().clear();
//		testAssemblyProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testAssemblyProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#getStandardNames}.
	 */
	public void testAssemblyProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testAssemblyProcess.getStandardNames())));
		testAssemblyProcess.getStandardNames().clear();
		testAssemblyProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testAssemblyProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.AssemblyProcess#getSupportLevel}.
	 */
	public void testAssemblyProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		AssemblyProcess testAssemblyProcess = generator.builderForAssemblyProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testAssemblyProcess.getSupportLevels())));
		testAssemblyProcess.getSupportLevels().clear();
		testAssemblyProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testAssemblyProcess.getSupportLevels())));
	}
}
