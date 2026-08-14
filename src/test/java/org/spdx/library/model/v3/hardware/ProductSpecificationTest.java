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
import org.spdx.library.model.v3.TestValuesGenerator;
import org.spdx.library.model.v3.UnitTestHelper;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.Agent;
import org.spdx.library.model.v3.core.CreationInfo;
import org.spdx.library.model.v3.core.DefinedType;
import org.spdx.library.model.v3.core.Element;
import org.spdx.library.model.v3.core.ExternalIdentifier;
import org.spdx.library.model.v3.core.ExternalRef;
import org.spdx.library.model.v3.core.IntegrityMethod;
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.core.Specification;
import org.spdx.library.model.v3.core.SpecificationType;
import org.spdx.library.model.v3.core.SupportType;
import org.spdx.library.model.v3.extension.Extension;
import org.spdx.library.model.v3.hardware.ProductSpecification.ProductSpecificationBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ProductSpecificationTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
		List<String> result = testProductSpecification.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals("Hardware.ProductSpecification", testProductSpecification.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#Element(org.spdx.library.model.v3.hardware.ProductSpecification.ProductSpecificationBuilder)}.
	 */
	public void testProductSpecificationProductSpecificationBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
		ProductSpecification test2ProductSpecification = generator.builderForProductSpecificationTests("https://testObject2").build();
		assertTrue(testProductSpecification.equivalent(test2ProductSpecification));
		assertTrue(test2ProductSpecification.equivalent(testProductSpecification));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#setSuppliedBy}.
	 */
	public void testProductSpecificationsetSuppliedBy() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testProductSpecification.getSuppliedBy());
//		testProductSpecification.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testProductSpecification.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#setCreationInfo}.
	 */
	public void testProductSpecificationsetCreationInfo() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testProductSpecification.getCreationInfo());
//		testProductSpecification.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testProductSpecification.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#setSpecType}.
	 */
	public void testProductSpecificationsetSpecType() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SPEC_TYPE_TEST_VALUE1), testProductSpecification.getSpecType());
		testProductSpecification.setSpecType(TestValuesGenerator.SPEC_TYPE_TEST_VALUE2);
		assertEquals(Optional.of(TestValuesGenerator.SPEC_TYPE_TEST_VALUE2), testProductSpecification.getSpecType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#setIntendedUse}.
	 */
	public void testProductSpecificationsetIntendedUse() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testProductSpecification.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testProductSpecification.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testProductSpecification.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#setDescription}.
	 */
	public void testProductSpecificationsetDescription() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testProductSpecification.getDescription());
		String newStringValue = "new description value";
		testProductSpecification.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testProductSpecification.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#setBuiltTime}.
	 */
	public void testProductSpecificationsetBuiltTime() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testProductSpecification.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testProductSpecification.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testProductSpecification.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#setComment}.
	 */
	public void testProductSpecificationsetComment() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testProductSpecification.getComment());
		String newStringValue = "new comment value";
		testProductSpecification.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testProductSpecification.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#setValidUntilTime}.
	 */
	public void testProductSpecificationsetValidUntilTime() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testProductSpecification.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testProductSpecification.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testProductSpecification.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#setReleaseTime}.
	 */
	public void testProductSpecificationsetReleaseTime() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testProductSpecification.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testProductSpecification.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testProductSpecification.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#setName}.
	 */
	public void testProductSpecificationsetName() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testProductSpecification.getName());
		String newStringValue = "new name value";
		testProductSpecification.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testProductSpecification.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#setSummary}.
	 */
	public void testProductSpecificationsetSummary() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testProductSpecification.getSummary());
		String newStringValue = "new summary value";
		testProductSpecification.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testProductSpecification.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#getVerifiedUsing}.
	 */
	public void testProductSpecificationgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testProductSpecification.getVerifiedUsings())));
//		testProductSpecification.getVerifiedUsings().clear();
//		testProductSpecification.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testProductSpecification.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#getExternalRef}.
	 */
	public void testProductSpecificationgetExternalRefs() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testProductSpecification.getExternalRefs())));
//		testProductSpecification.getExternalRefs().clear();
//		testProductSpecification.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testProductSpecification.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#getOriginatedBy}.
	 */
	public void testProductSpecificationgetOriginatedBys() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testProductSpecification.getOriginatedBys())));
//		testProductSpecification.getOriginatedBys().clear();
//		testProductSpecification.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testProductSpecification.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#getExternalIdentifier}.
	 */
	public void testProductSpecificationgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testProductSpecification.getExternalIdentifiers())));
//		testProductSpecification.getExternalIdentifiers().clear();
//		testProductSpecification.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testProductSpecification.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#getExtension}.
	 */
	public void testProductSpecificationgetExtensions() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testProductSpecification.getExtensions())));
//		testProductSpecification.getExtensions().clear();
//		testProductSpecification.getExtensions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testProductSpecification.getExtensions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#getHazard}.
	 */
	public void testProductSpecificationgetHazards() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testProductSpecification.getHazards())));
//		testProductSpecification.getHazards().clear();
//		testProductSpecification.getHazards().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testProductSpecification.getHazards())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#getPartNumbers}.
	 */
	public void testProductSpecificationgetPartNumbers() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PART_NUMBER_TEST_LIST1, new ArrayList<>(testProductSpecification.getPartNumbers())));
		testProductSpecification.getPartNumbers().clear();
		testProductSpecification.getPartNumbers().addAll(TestValuesGenerator.PART_NUMBER_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PART_NUMBER_TEST_LIST2, new ArrayList<>(testProductSpecification.getPartNumbers())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#getStandardNames}.
	 */
	public void testProductSpecificationgetStandardNames() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testProductSpecification.getStandardNames())));
		testProductSpecification.getStandardNames().clear();
		testProductSpecification.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testProductSpecification.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#getItemVersions}.
	 */
	public void testProductSpecificationgetItemVersions() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ITEM_VERSION_TEST_LIST1, new ArrayList<>(testProductSpecification.getItemVersions())));
		testProductSpecification.getItemVersions().clear();
		testProductSpecification.getItemVersions().addAll(TestValuesGenerator.ITEM_VERSION_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.ITEM_VERSION_TEST_LIST2, new ArrayList<>(testProductSpecification.getItemVersions())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.hardware.ProductSpecification#getSupportLevel}.
	 */
	public void testProductSpecificationgetSupportLevels() throws InvalidSPDXAnalysisException {
		ProductSpecification testProductSpecification = generator.builderForProductSpecificationTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testProductSpecification.getSupportLevels())));
		testProductSpecification.getSupportLevels().clear();
		testProductSpecification.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testProductSpecification.getSupportLevels())));
	}
}
