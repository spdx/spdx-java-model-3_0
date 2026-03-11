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
import org.spdx.library.model.v3.supplychain.TestProcess.TestProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class TestProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testTestProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.TestProcess", testTestProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#Element(org.spdx.library.model.v3.supplychain.TestProcess.TestProcessBuilder)}.
	 */
	public void testTestProcessTestProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
		TestProcess test2TestProcess = generator.builderForTestProcessTests("https://testObject2").build();
		assertTrue(testTestProcess.equivalent(test2TestProcess));
		assertTrue(test2TestProcess.equivalent(testTestProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#setSuppliedBy}.
	 */
	public void testTestProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testTestProcess.getSuppliedBy());
//		testTestProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testTestProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#setExtension}.
	 */
	public void testTestProcesssetExtension() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testTestProcess.getExtension());
//		testTestProcess.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testTestProcess.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#setCreationInfo}.
	 */
	public void testTestProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testTestProcess.getCreationInfo());
//		testTestProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testTestProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#setProcessReadiness}.
	 */
	public void testTestProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testTestProcess.getProcessReadiness());
		testTestProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testTestProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#setIntendedUse}.
	 */
	public void testTestProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testTestProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testTestProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#setDescription}.
	 */
	public void testTestProcesssetDescription() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testTestProcess.getDescription());
		String newStringValue = "new description value";
		testTestProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#setBuiltTime}.
	 */
	public void testTestProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testTestProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testTestProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#setComment}.
	 */
	public void testTestProcesssetComment() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testTestProcess.getComment());
		String newStringValue = "new comment value";
		testTestProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#setProcessVersion}.
	 */
	public void testTestProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testTestProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testTestProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testTestProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#setValidUntilTime}.
	 */
	public void testTestProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testTestProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testTestProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#setReleaseTime}.
	 */
	public void testTestProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testTestProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testTestProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#setProcessRationale}.
	 */
	public void testTestProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testTestProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testTestProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#setName}.
	 */
	public void testTestProcesssetName() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testTestProcess.getName());
		String newStringValue = "new name value";
		testTestProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#setSummary}.
	 */
	public void testTestProcesssetSummary() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testTestProcess.getSummary());
		String newStringValue = "new summary value";
		testTestProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testTestProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#getVerifiedUsing}.
	 */
	public void testTestProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTestProcess.getVerifiedUsings())));
//		testTestProcess.getVerifiedUsings().clear();
//		testTestProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTestProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#getExternalRef}.
	 */
	public void testTestProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTestProcess.getExternalRefs())));
//		testTestProcess.getExternalRefs().clear();
//		testTestProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTestProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#getOriginatedBy}.
	 */
	public void testTestProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTestProcess.getOriginatedBys())));
//		testTestProcess.getOriginatedBys().clear();
//		testTestProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTestProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#getExternalIdentifier}.
	 */
	public void testTestProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testTestProcess.getExternalIdentifiers())));
//		testTestProcess.getExternalIdentifiers().clear();
//		testTestProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testTestProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#getStandardNames}.
	 */
	public void testTestProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testTestProcess.getStandardNames())));
		testTestProcess.getStandardNames().clear();
		testTestProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testTestProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.TestProcess#getSupportLevel}.
	 */
	public void testTestProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		TestProcess testTestProcess = generator.builderForTestProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testTestProcess.getSupportLevels())));
		testTestProcess.getSupportLevels().clear();
		testTestProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testTestProcess.getSupportLevels())));
	}
}
