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
import org.spdx.library.model.v3_1.core.DefinedProcess;
import org.spdx.library.model.v3_1.core.Element;
import org.spdx.library.model.v3_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_1.core.ExternalRef;
import org.spdx.library.model.v3_1.core.IntegrityMethod;
import org.spdx.library.model.v3_1.core.ProcessReadinessType;
import org.spdx.library.model.v3_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_1.core.SupportType;
import org.spdx.library.model.v3_1.extension.Extension;
import org.spdx.library.model.v3_1.supplychain.DestroyProcess.DestroyProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class DestroyProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testDestroyProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.DestroyProcess", testDestroyProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#Element(org.spdx.library.model.v3_1.supplychain.DestroyProcess.DestroyProcessBuilder)}.
	 */
	public void testDestroyProcessDestroyProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
		DestroyProcess test2DestroyProcess = generator.builderForDestroyProcessTests("https://testObject2").build();
		assertTrue(testDestroyProcess.equivalent(test2DestroyProcess));
		assertTrue(test2DestroyProcess.equivalent(testDestroyProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#setSuppliedBy}.
	 */
	public void testDestroyProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testDestroyProcess.getSuppliedBy());
//		testDestroyProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testDestroyProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#setExtension}.
	 */
	public void testDestroyProcesssetExtension() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testDestroyProcess.getExtension());
//		testDestroyProcess.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testDestroyProcess.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#setCreationInfo}.
	 */
	public void testDestroyProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testDestroyProcess.getCreationInfo());
//		testDestroyProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testDestroyProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#setProcessReadiness}.
	 */
	public void testDestroyProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testDestroyProcess.getProcessReadiness());
		testDestroyProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testDestroyProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#setIntendedUse}.
	 */
	public void testDestroyProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testDestroyProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testDestroyProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#setDescription}.
	 */
	public void testDestroyProcesssetDescription() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testDestroyProcess.getDescription());
		String newStringValue = "new description value";
		testDestroyProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#setBuiltTime}.
	 */
	public void testDestroyProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testDestroyProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testDestroyProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#setComment}.
	 */
	public void testDestroyProcesssetComment() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testDestroyProcess.getComment());
		String newStringValue = "new comment value";
		testDestroyProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#setProcessVersion}.
	 */
	public void testDestroyProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testDestroyProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testDestroyProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testDestroyProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#setValidUntilTime}.
	 */
	public void testDestroyProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testDestroyProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testDestroyProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#setReleaseTime}.
	 */
	public void testDestroyProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testDestroyProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testDestroyProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#setProcessRationale}.
	 */
	public void testDestroyProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testDestroyProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testDestroyProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#setName}.
	 */
	public void testDestroyProcesssetName() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testDestroyProcess.getName());
		String newStringValue = "new name value";
		testDestroyProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#setSummary}.
	 */
	public void testDestroyProcesssetSummary() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testDestroyProcess.getSummary());
		String newStringValue = "new summary value";
		testDestroyProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testDestroyProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#getVerifiedUsing}.
	 */
	public void testDestroyProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDestroyProcess.getVerifiedUsings())));
//		testDestroyProcess.getVerifiedUsings().clear();
//		testDestroyProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDestroyProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#getExternalRef}.
	 */
	public void testDestroyProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDestroyProcess.getExternalRefs())));
//		testDestroyProcess.getExternalRefs().clear();
//		testDestroyProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDestroyProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#getOriginatedBy}.
	 */
	public void testDestroyProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDestroyProcess.getOriginatedBys())));
//		testDestroyProcess.getOriginatedBys().clear();
//		testDestroyProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDestroyProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#getExternalIdentifier}.
	 */
	public void testDestroyProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testDestroyProcess.getExternalIdentifiers())));
//		testDestroyProcess.getExternalIdentifiers().clear();
//		testDestroyProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testDestroyProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#getStandardNames}.
	 */
	public void testDestroyProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testDestroyProcess.getStandardNames())));
		testDestroyProcess.getStandardNames().clear();
		testDestroyProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testDestroyProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.supplychain.DestroyProcess#getSupportLevel}.
	 */
	public void testDestroyProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		DestroyProcess testDestroyProcess = generator.builderForDestroyProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testDestroyProcess.getSupportLevels())));
		testDestroyProcess.getSupportLevels().clear();
		testDestroyProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testDestroyProcess.getSupportLevels())));
	}
}
