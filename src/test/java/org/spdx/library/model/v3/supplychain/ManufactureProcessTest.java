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
import org.spdx.library.model.v3.supplychain.ManufactureProcess.ManufactureProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ManufactureProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testManufactureProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.ManufactureProcess", testManufactureProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#Element(org.spdx.library.model.v3.supplychain.ManufactureProcess.ManufactureProcessBuilder)}.
	 */
	public void testManufactureProcessManufactureProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
		ManufactureProcess test2ManufactureProcess = generator.builderForManufactureProcessTests("https://testObject2").build();
		assertTrue(testManufactureProcess.equivalent(test2ManufactureProcess));
		assertTrue(test2ManufactureProcess.equivalent(testManufactureProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#setSuppliedBy}.
	 */
	public void testManufactureProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testManufactureProcess.getSuppliedBy());
//		testManufactureProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testManufactureProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#setCreationInfo}.
	 */
	public void testManufactureProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testManufactureProcess.getCreationInfo());
//		testManufactureProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testManufactureProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#setProcessReadiness}.
	 */
	public void testManufactureProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testManufactureProcess.getProcessReadiness());
		testManufactureProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testManufactureProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#setIntendedUse}.
	 */
	public void testManufactureProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testManufactureProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testManufactureProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#setDescription}.
	 */
	public void testManufactureProcesssetDescription() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testManufactureProcess.getDescription());
		String newStringValue = "new description value";
		testManufactureProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#setBuiltTime}.
	 */
	public void testManufactureProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testManufactureProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testManufactureProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#setComment}.
	 */
	public void testManufactureProcesssetComment() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testManufactureProcess.getComment());
		String newStringValue = "new comment value";
		testManufactureProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#setProcessVersion}.
	 */
	public void testManufactureProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testManufactureProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testManufactureProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testManufactureProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#setValidUntilTime}.
	 */
	public void testManufactureProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testManufactureProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testManufactureProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#setReleaseTime}.
	 */
	public void testManufactureProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testManufactureProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testManufactureProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#setProcessRationale}.
	 */
	public void testManufactureProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testManufactureProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testManufactureProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#setName}.
	 */
	public void testManufactureProcesssetName() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testManufactureProcess.getName());
		String newStringValue = "new name value";
		testManufactureProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#setSummary}.
	 */
	public void testManufactureProcesssetSummary() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testManufactureProcess.getSummary());
		String newStringValue = "new summary value";
		testManufactureProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testManufactureProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#getVerifiedUsing}.
	 */
	public void testManufactureProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testManufactureProcess.getVerifiedUsings())));
//		testManufactureProcess.getVerifiedUsings().clear();
//		testManufactureProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testManufactureProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#getExternalRef}.
	 */
	public void testManufactureProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testManufactureProcess.getExternalRefs())));
//		testManufactureProcess.getExternalRefs().clear();
//		testManufactureProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testManufactureProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#getOriginatedBy}.
	 */
	public void testManufactureProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testManufactureProcess.getOriginatedBys())));
//		testManufactureProcess.getOriginatedBys().clear();
//		testManufactureProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testManufactureProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#getExternalIdentifier}.
	 */
	public void testManufactureProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testManufactureProcess.getExternalIdentifiers())));
//		testManufactureProcess.getExternalIdentifiers().clear();
//		testManufactureProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testManufactureProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#getExtension}.
	 */
	public void testManufactureProcessgetExtensions() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testManufactureProcess.getExtensions())));
//		testManufactureProcess.getExtensions().clear();
//		testManufactureProcess.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testManufactureProcess.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#getStandardNames}.
	 */
	public void testManufactureProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testManufactureProcess.getStandardNames())));
		testManufactureProcess.getStandardNames().clear();
		testManufactureProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testManufactureProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.ManufactureProcess#getSupportLevel}.
	 */
	public void testManufactureProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		ManufactureProcess testManufactureProcess = generator.builderForManufactureProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testManufactureProcess.getSupportLevels())));
		testManufactureProcess.getSupportLevels().clear();
		testManufactureProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testManufactureProcess.getSupportLevels())));
	}
}
