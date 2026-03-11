/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.hardware;

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
import org.spdx.library.model.v3.core.DefinedType;
import org.spdx.library.model.v3.core.DictionaryEntry;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.core.Specification;
import org.spdx.library.model.v3.core.SupportType;
import org.spdx.library.model.v3.extension.Extension;
import org.spdx.library.model.v3.hardware.VirtualHardware.VirtualHardwareBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class VirtualHardwareTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		List<String> result = testVirtualHardware.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		assertEquals("Hardware.VirtualHardware", testVirtualHardware.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#Element(org.spdx.library.model.v3.hardware.VirtualHardware.VirtualHardwareBuilder)}.
	 */
	public void testVirtualHardwareVirtualHardwareBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		VirtualHardware test2VirtualHardware = generator.builderForVirtualHardwareTests("https://testObject2").build();
		assertTrue(testVirtualHardware.equivalent(test2VirtualHardware));
		assertTrue(test2VirtualHardware.equivalent(testVirtualHardware));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setProductAgent}.
	 */
	public void testVirtualHardwaresetProductAgent() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testVirtualHardware.getProductAgent());
//		testVirtualHardware.setProductAgent(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testVirtualHardware.getProductAgent());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setSuppliedBy}.
	 */
	public void testVirtualHardwaresetSuppliedBy() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testVirtualHardware.getSuppliedBy());
//		testVirtualHardware.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testVirtualHardware.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setExtension}.
	 */
	public void testVirtualHardwaresetExtension() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testVirtualHardware.getExtension());
//		testVirtualHardware.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testVirtualHardware.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setCreationInfo}.
	 */
	public void testVirtualHardwaresetCreationInfo() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testVirtualHardware.getCreationInfo());
//		testVirtualHardware.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testVirtualHardware.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setVirtualHardwareModel}.
	 */
	public void testVirtualHardwaresetVirtualHardwareModel() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VIRTUAL_HARDWARE_MODEL_TEST_VALUE1), testVirtualHardware.getVirtualHardwareModel());
		testVirtualHardware.setVirtualHardwareModel(TestValuesGenerator.VIRTUAL_HARDWARE_MODEL_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.VIRTUAL_HARDWARE_MODEL_TEST_VALUE2), testVirtualHardware.getVirtualHardwareModel());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setBatchNumber}.
	 */
	public void testVirtualHardwaresetBatchNumber() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BATCH_NUMBER_TEST_VALUE), testVirtualHardware.getBatchNumber());
		String newStringValue = "new batchNumber value";
		testVirtualHardware.setBatchNumber(newStringValue);
		assertEquals(Optional.of(newStringValue), testVirtualHardware.getBatchNumber());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setSerialNumber}.
	 */
	public void testVirtualHardwaresetSerialNumber() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SERIAL_NUMBER_TEST_VALUE), testVirtualHardware.getSerialNumber());
		String newStringValue = "new serialNumber value";
		testVirtualHardware.setSerialNumber(newStringValue);
		assertEquals(Optional.of(newStringValue), testVirtualHardware.getSerialNumber());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setIntendedUse}.
	 */
	public void testVirtualHardwaresetIntendedUse() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testVirtualHardware.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testVirtualHardware.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testVirtualHardware.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setDescription}.
	 */
	public void testVirtualHardwaresetDescription() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testVirtualHardware.getDescription());
		String newStringValue = "new description value";
		testVirtualHardware.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testVirtualHardware.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setBuiltTime}.
	 */
	public void testVirtualHardwaresetBuiltTime() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testVirtualHardware.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVirtualHardware.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVirtualHardware.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setPartNumber}.
	 */
	public void testVirtualHardwaresetPartNumber() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PART_NUMBER_TEST_VALUE, testVirtualHardware.getPartNumber());
		String newStringValue = "new partNumber value";
		testVirtualHardware.setPartNumber(newStringValue);
		assertEquals(newStringValue, testVirtualHardware.getPartNumber());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setComment}.
	 */
	public void testVirtualHardwaresetComment() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testVirtualHardware.getComment());
		String newStringValue = "new comment value";
		testVirtualHardware.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testVirtualHardware.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setValidUntilTime}.
	 */
	public void testVirtualHardwaresetValidUntilTime() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testVirtualHardware.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVirtualHardware.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVirtualHardware.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setReleaseDate}.
	 */
	public void testVirtualHardwaresetReleaseDate() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_DATE_TEST_VALUE), testVirtualHardware.getReleaseDate());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVirtualHardware.setReleaseDate(newStringValue);
		assertEquals(Optional.of(newStringValue), testVirtualHardware.getReleaseDate());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setName}.
	 */
	public void testVirtualHardwaresetName() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testVirtualHardware.getName());
		String newStringValue = "new name value";
		testVirtualHardware.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testVirtualHardware.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setHardwareVersion}.
	 */
	public void testVirtualHardwaresetHardwareVersion() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.HARDWARE_VERSION_TEST_VALUE), testVirtualHardware.getHardwareVersion());
		String newStringValue = "new hardwareVersion value";
		testVirtualHardware.setHardwareVersion(newStringValue);
		assertEquals(Optional.of(newStringValue), testVirtualHardware.getHardwareVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setReleaseTime}.
	 */
	public void testVirtualHardwaresetReleaseTime() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testVirtualHardware.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testVirtualHardware.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testVirtualHardware.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#setSummary}.
	 */
	public void testVirtualHardwaresetSummary() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testVirtualHardware.getSummary());
		String newStringValue = "new summary value";
		testVirtualHardware.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testVirtualHardware.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#getExternalRef}.
	 */
	public void testVirtualHardwaregetExternalRefs() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVirtualHardware.getExternalRefs())));
//		testVirtualHardware.getExternalRefs().clear();
//		testVirtualHardware.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVirtualHardware.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#getHardwareAdditionalInformation}.
	 */
	public void testVirtualHardwaregetHardwareAdditionalInformations() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVirtualHardware.getHardwareAdditionalInformations())));
//		testVirtualHardware.getHardwareAdditionalInformations().clear();
//		testVirtualHardware.getHardwareAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVirtualHardware.getHardwareAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#getAdditionalInformationSpecification}.
	 */
	public void testVirtualHardwaregetAdditionalInformationSpecifications() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVirtualHardware.getAdditionalInformationSpecifications())));
//		testVirtualHardware.getAdditionalInformationSpecifications().clear();
//		testVirtualHardware.getAdditionalInformationSpecifications().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVirtualHardware.getAdditionalInformationSpecifications())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#getHazard}.
	 */
	public void testVirtualHardwaregetHazards() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVirtualHardware.getHazards())));
//		testVirtualHardware.getHazards().clear();
//		testVirtualHardware.getHazards().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVirtualHardware.getHazards())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#getCategory}.
	 */
	public void testVirtualHardwaregetCategorys() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVirtualHardware.getCategorys())));
//		testVirtualHardware.getCategorys().clear();
//		testVirtualHardware.getCategorys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVirtualHardware.getCategorys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#getVerifiedUsing}.
	 */
	public void testVirtualHardwaregetVerifiedUsings() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVirtualHardware.getVerifiedUsings())));
//		testVirtualHardware.getVerifiedUsings().clear();
//		testVirtualHardware.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVirtualHardware.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#getOriginatedBy}.
	 */
	public void testVirtualHardwaregetOriginatedBys() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVirtualHardware.getOriginatedBys())));
//		testVirtualHardware.getOriginatedBys().clear();
//		testVirtualHardware.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVirtualHardware.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#getExternalIdentifier}.
	 */
	public void testVirtualHardwaregetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testVirtualHardware.getExternalIdentifiers())));
//		testVirtualHardware.getExternalIdentifiers().clear();
//		testVirtualHardware.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testVirtualHardware.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#getStandardNames}.
	 */
	public void testVirtualHardwaregetStandardNames() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testVirtualHardware.getStandardNames())));
		testVirtualHardware.getStandardNames().clear();
		testVirtualHardware.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testVirtualHardware.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.VirtualHardware#getSupportLevel}.
	 */
	public void testVirtualHardwaregetSupportLevels() throws InvalidSPDXAnalysisException {
		VirtualHardware testVirtualHardware = generator.builderForVirtualHardwareTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testVirtualHardware.getSupportLevels())));
		testVirtualHardware.getSupportLevels().clear();
		testVirtualHardware.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testVirtualHardware.getSupportLevels())));
	}
}
