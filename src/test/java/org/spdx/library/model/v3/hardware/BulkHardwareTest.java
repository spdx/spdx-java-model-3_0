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
import org.spdx.library.model.v3.core.UnitOfMeasure;
import org.spdx.library.model.v3.extension.Extension;
import org.spdx.library.model.v3.hardware.BulkHardware.BulkHardwareBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class BulkHardwareTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		List<String> result = testBulkHardware.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		assertEquals("Hardware.BulkHardware", testBulkHardware.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#Element(org.spdx.library.model.v3.hardware.BulkHardware.BulkHardwareBuilder)}.
	 */
	public void testBulkHardwareBulkHardwareBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		BulkHardware test2BulkHardware = generator.builderForBulkHardwareTests("https://testObject2").build();
		assertTrue(testBulkHardware.equivalent(test2BulkHardware));
		assertTrue(test2BulkHardware.equivalent(testBulkHardware));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setProductAgent}.
	 */
	public void testBulkHardwaresetProductAgent() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testBulkHardware.getProductAgent());
//		testBulkHardware.setProductAgent(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testBulkHardware.getProductAgent());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setSuppliedBy}.
	 */
	public void testBulkHardwaresetSuppliedBy() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testBulkHardware.getSuppliedBy());
//		testBulkHardware.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testBulkHardware.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setBulkQuantity}.
	 */
	public void testBulkHardwaresetBulkQuantity() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testBulkHardware.getBulkQuantity());
//		testBulkHardware.setBulkQuantity(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testBulkHardware.getBulkQuantity());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setExtension}.
	 */
	public void testBulkHardwaresetExtension() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testBulkHardware.getExtension());
//		testBulkHardware.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testBulkHardware.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setCreationInfo}.
	 */
	public void testBulkHardwaresetCreationInfo() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testBulkHardware.getCreationInfo());
//		testBulkHardware.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testBulkHardware.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setBatchNumber}.
	 */
	public void testBulkHardwaresetBatchNumber() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BATCH_NUMBER_TEST_VALUE), testBulkHardware.getBatchNumber());
		String newStringValue = "new batchNumber value";
		testBulkHardware.setBatchNumber(newStringValue);
		assertEquals(Optional.of(newStringValue), testBulkHardware.getBatchNumber());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setSerialNumber}.
	 */
	public void testBulkHardwaresetSerialNumber() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SERIAL_NUMBER_TEST_VALUE), testBulkHardware.getSerialNumber());
		String newStringValue = "new serialNumber value";
		testBulkHardware.setSerialNumber(newStringValue);
		assertEquals(Optional.of(newStringValue), testBulkHardware.getSerialNumber());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setIntendedUse}.
	 */
	public void testBulkHardwaresetIntendedUse() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testBulkHardware.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testBulkHardware.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testBulkHardware.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setDescription}.
	 */
	public void testBulkHardwaresetDescription() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testBulkHardware.getDescription());
		String newStringValue = "new description value";
		testBulkHardware.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testBulkHardware.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setBuiltTime}.
	 */
	public void testBulkHardwaresetBuiltTime() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testBulkHardware.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBulkHardware.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBulkHardware.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setPartNumber}.
	 */
	public void testBulkHardwaresetPartNumber() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.PART_NUMBER_TEST_VALUE, testBulkHardware.getPartNumber());
		String newStringValue = "new partNumber value";
		testBulkHardware.setPartNumber(newStringValue);
		assertEquals(newStringValue, testBulkHardware.getPartNumber());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setComment}.
	 */
	public void testBulkHardwaresetComment() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testBulkHardware.getComment());
		String newStringValue = "new comment value";
		testBulkHardware.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testBulkHardware.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setValidUntilTime}.
	 */
	public void testBulkHardwaresetValidUntilTime() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testBulkHardware.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBulkHardware.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBulkHardware.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setReleaseDate}.
	 */
	public void testBulkHardwaresetReleaseDate() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_DATE_TEST_VALUE), testBulkHardware.getReleaseDate());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBulkHardware.setReleaseDate(newStringValue);
		assertEquals(Optional.of(newStringValue), testBulkHardware.getReleaseDate());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setName}.
	 */
	public void testBulkHardwaresetName() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testBulkHardware.getName());
		String newStringValue = "new name value";
		testBulkHardware.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testBulkHardware.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setHardwareVersion}.
	 */
	public void testBulkHardwaresetHardwareVersion() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.HARDWARE_VERSION_TEST_VALUE), testBulkHardware.getHardwareVersion());
		String newStringValue = "new hardwareVersion value";
		testBulkHardware.setHardwareVersion(newStringValue);
		assertEquals(Optional.of(newStringValue), testBulkHardware.getHardwareVersion());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setReleaseTime}.
	 */
	public void testBulkHardwaresetReleaseTime() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testBulkHardware.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testBulkHardware.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testBulkHardware.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#setSummary}.
	 */
	public void testBulkHardwaresetSummary() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testBulkHardware.getSummary());
		String newStringValue = "new summary value";
		testBulkHardware.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testBulkHardware.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#getExternalRef}.
	 */
	public void testBulkHardwaregetExternalRefs() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBulkHardware.getExternalRefs())));
//		testBulkHardware.getExternalRefs().clear();
//		testBulkHardware.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBulkHardware.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#getHardwareAdditionalInformation}.
	 */
	public void testBulkHardwaregetHardwareAdditionalInformations() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBulkHardware.getHardwareAdditionalInformations())));
//		testBulkHardware.getHardwareAdditionalInformations().clear();
//		testBulkHardware.getHardwareAdditionalInformations().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBulkHardware.getHardwareAdditionalInformations())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#getAdditionalInformationSpecification}.
	 */
	public void testBulkHardwaregetAdditionalInformationSpecifications() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBulkHardware.getAdditionalInformationSpecifications())));
//		testBulkHardware.getAdditionalInformationSpecifications().clear();
//		testBulkHardware.getAdditionalInformationSpecifications().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBulkHardware.getAdditionalInformationSpecifications())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#getHazard}.
	 */
	public void testBulkHardwaregetHazards() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBulkHardware.getHazards())));
//		testBulkHardware.getHazards().clear();
//		testBulkHardware.getHazards().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBulkHardware.getHazards())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#getCategory}.
	 */
	public void testBulkHardwaregetCategorys() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBulkHardware.getCategorys())));
//		testBulkHardware.getCategorys().clear();
//		testBulkHardware.getCategorys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBulkHardware.getCategorys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#getVerifiedUsing}.
	 */
	public void testBulkHardwaregetVerifiedUsings() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBulkHardware.getVerifiedUsings())));
//		testBulkHardware.getVerifiedUsings().clear();
//		testBulkHardware.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBulkHardware.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#getOriginatedBy}.
	 */
	public void testBulkHardwaregetOriginatedBys() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBulkHardware.getOriginatedBys())));
//		testBulkHardware.getOriginatedBys().clear();
//		testBulkHardware.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBulkHardware.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#getExternalIdentifier}.
	 */
	public void testBulkHardwaregetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testBulkHardware.getExternalIdentifiers())));
//		testBulkHardware.getExternalIdentifiers().clear();
//		testBulkHardware.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testBulkHardware.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#getStandardNames}.
	 */
	public void testBulkHardwaregetStandardNames() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testBulkHardware.getStandardNames())));
		testBulkHardware.getStandardNames().clear();
		testBulkHardware.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testBulkHardware.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.BulkHardware#getSupportLevel}.
	 */
	public void testBulkHardwaregetSupportLevels() throws InvalidSPDXAnalysisException {
		BulkHardware testBulkHardware = generator.builderForBulkHardwareTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testBulkHardware.getSupportLevels())));
		testBulkHardware.getSupportLevels().clear();
		testBulkHardware.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testBulkHardware.getSupportLevels())));
	}
}
