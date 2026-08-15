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
import org.spdx.library.model.v3.core.Location;
import org.spdx.library.model.v3.core.ProcessReadinessType;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.core.SupportType;
import org.spdx.library.model.v3.extension.Extension;
import org.spdx.library.model.v3.supplychain.StorageProcess.StorageProcessBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class StorageProcessTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
		List<String> result = testStorageProcess.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
		assertEquals("SupplyChain.StorageProcess", testStorageProcess.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#Element(org.spdx.library.model.v3.supplychain.StorageProcess.StorageProcessBuilder)}.
	 */
	public void testStorageProcessStorageProcessBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
		StorageProcess test2StorageProcess = generator.builderForStorageProcessTests("https://testObject2").build();
		assertTrue(testStorageProcess.equivalent(test2StorageProcess));
		assertTrue(test2StorageProcess.equivalent(testStorageProcess));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#setSuppliedBy}.
	 */
	public void testStorageProcesssetSuppliedBy() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testStorageProcess.getSuppliedBy());
//		testStorageProcess.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testStorageProcess.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#setCreationInfo}.
	 */
	public void testStorageProcesssetCreationInfo() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testStorageProcess.getCreationInfo());
//		testStorageProcess.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testStorageProcess.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#setProcessReadiness}.
	 */
	public void testStorageProcesssetProcessReadiness() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE1), testStorageProcess.getProcessReadiness());
		testStorageProcess.setProcessReadiness(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_READINESS_TEST_VALUE2), testStorageProcess.getProcessReadiness());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#setIntendedUse}.
	 */
	public void testStorageProcesssetIntendedUse() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testStorageProcess.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testStorageProcess.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageProcess.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#setDescription}.
	 */
	public void testStorageProcesssetDescription() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testStorageProcess.getDescription());
		String newStringValue = "new description value";
		testStorageProcess.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageProcess.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#setBuiltTime}.
	 */
	public void testStorageProcesssetBuiltTime() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testStorageProcess.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testStorageProcess.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageProcess.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#setComment}.
	 */
	public void testStorageProcesssetComment() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testStorageProcess.getComment());
		String newStringValue = "new comment value";
		testStorageProcess.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageProcess.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#setProcessVersion}.
	 */
	public void testStorageProcesssetProcessVersion() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PROCESS_VERSION_TEST_VALUE, testStorageProcess.getProcessVersion());
		String newStringValue = "new processVersion value";
		testStorageProcess.setProcessVersion(newStringValue);
		assertEquals(newStringValue, testStorageProcess.getProcessVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#setValidUntilTime}.
	 */
	public void testStorageProcesssetValidUntilTime() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testStorageProcess.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testStorageProcess.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageProcess.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#setReleaseTime}.
	 */
	public void testStorageProcesssetReleaseTime() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testStorageProcess.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testStorageProcess.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageProcess.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#setProcessRationale}.
	 */
	public void testStorageProcesssetProcessRationale() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.PROCESS_RATIONALE_TEST_VALUE), testStorageProcess.getProcessRationale());
		String newStringValue = "new processRationale value";
		testStorageProcess.setProcessRationale(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageProcess.getProcessRationale());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#setName}.
	 */
	public void testStorageProcesssetName() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testStorageProcess.getName());
		String newStringValue = "new name value";
		testStorageProcess.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageProcess.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#setSummary}.
	 */
	public void testStorageProcesssetSummary() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testStorageProcess.getSummary());
		String newStringValue = "new summary value";
		testStorageProcess.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testStorageProcess.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#getPlannedStorageLocation}.
	 */
	public void testStorageProcessgetPlannedStorageLocations() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStorageProcess.getPlannedStorageLocations())));
//		testStorageProcess.getPlannedStorageLocations().clear();
//		testStorageProcess.getPlannedStorageLocations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStorageProcess.getPlannedStorageLocations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#getVerifiedUsing}.
	 */
	public void testStorageProcessgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStorageProcess.getVerifiedUsings())));
//		testStorageProcess.getVerifiedUsings().clear();
//		testStorageProcess.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStorageProcess.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#getExternalRef}.
	 */
	public void testStorageProcessgetExternalRefs() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStorageProcess.getExternalRefs())));
//		testStorageProcess.getExternalRefs().clear();
//		testStorageProcess.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStorageProcess.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#getOriginatedBy}.
	 */
	public void testStorageProcessgetOriginatedBys() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStorageProcess.getOriginatedBys())));
//		testStorageProcess.getOriginatedBys().clear();
//		testStorageProcess.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStorageProcess.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#getExternalIdentifier}.
	 */
	public void testStorageProcessgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStorageProcess.getExternalIdentifiers())));
//		testStorageProcess.getExternalIdentifiers().clear();
//		testStorageProcess.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStorageProcess.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#getExtension}.
	 */
	public void testStorageProcessgetExtensions() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testStorageProcess.getExtensions())));
//		testStorageProcess.getExtensions().clear();
//		testStorageProcess.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testStorageProcess.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#getStandardNames}.
	 */
	public void testStorageProcessgetStandardNames() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testStorageProcess.getStandardNames())));
		testStorageProcess.getStandardNames().clear();
		testStorageProcess.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testStorageProcess.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.supplychain.StorageProcess#getSupportLevel}.
	 */
	public void testStorageProcessgetSupportLevels() throws InvalidSPDXAnalysisException {
		StorageProcess testStorageProcess = generator.builderForStorageProcessTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testStorageProcess.getSupportLevels())));
		testStorageProcess.getSupportLevels().clear();
		testStorageProcess.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testStorageProcess.getSupportLevels())));
	}
}
