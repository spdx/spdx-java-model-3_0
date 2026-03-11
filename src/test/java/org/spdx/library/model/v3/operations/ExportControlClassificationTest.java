/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.operations;

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
import org.spdx.library.model.v3.core.ProfileIdentifierType;
import org.spdx.library.model.v3.core.Specification;
import org.spdx.library.model.v3.operations.ExportControlClassification.ExportControlClassificationBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ExportControlClassificationTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.operations.ExportControlClassification#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ExportControlClassification testExportControlClassification = generator.builderForExportControlClassificationTests(TEST_OBJECT_URI).build();
		List<String> result = testExportControlClassification.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.ExportControlClassification#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ExportControlClassification testExportControlClassification = generator.builderForExportControlClassificationTests(TEST_OBJECT_URI).build();
		assertEquals("Operations.ExportControlClassification", testExportControlClassification.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.ExportControlClassification#Element(org.spdx.library.model.v3.operations.ExportControlClassification.ExportControlClassificationBuilder)}.
	 */
	public void testExportControlClassificationExportControlClassificationBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForExportControlClassificationTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ExportControlClassification testExportControlClassification = generator.builderForExportControlClassificationTests(TEST_OBJECT_URI).build();
		ExportControlClassification test2ExportControlClassification = generator.builderForExportControlClassificationTests("https://testObject2").build();
		assertTrue(testExportControlClassification.equivalent(test2ExportControlClassification));
		assertTrue(test2ExportControlClassification.equivalent(testExportControlClassification));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.ExportControlClassification#setExportControlSpecification}.
	 */
	public void testExportControlClassificationsetExportControlSpecification() throws InvalidSPDXAnalysisException {
		ExportControlClassification testExportControlClassification = generator.builderForExportControlClassificationTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testExportControlClassification.getExportControlSpecification());
//		testExportControlClassification.setExportControlSpecification(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testExportControlClassification.getExportControlSpecification());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.ExportControlClassification#setWeight}.
	 */
	public void testExportControlClassificationsetWeight() throws InvalidSPDXAnalysisException {
		ExportControlClassification testExportControlClassification = generator.builderForExportControlClassificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.WEIGHT_TEST_VALUE), testExportControlClassification.getWeight());
		testExportControlClassification.setWeight(new Integer(653));
		assertEquals(Optional.of(new Integer(653)), testExportControlClassification.getWeight());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.ExportControlClassification#setExportClassification}.
	 */
	public void testExportControlClassificationsetExportClassification() throws InvalidSPDXAnalysisException {
		ExportControlClassification testExportControlClassification = generator.builderForExportControlClassificationTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.EXPORT_CLASSIFICATION_TEST_VALUE, testExportControlClassification.getExportClassification());
		String newStringValue = "new exportClassification value";
		testExportControlClassification.setExportClassification(newStringValue);
		assertEquals(newStringValue, testExportControlClassification.getExportClassification());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.ExportControlClassification#setComment}.
	 */
	public void testExportControlClassificationsetComment() throws InvalidSPDXAnalysisException {
		ExportControlClassification testExportControlClassification = generator.builderForExportControlClassificationTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testExportControlClassification.getComment());
		String newStringValue = "new comment value";
		testExportControlClassification.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testExportControlClassification.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.operations.ExportControlClassification#setExportingCountry}.
	 */
	public void testExportControlClassificationsetExportingCountry() throws InvalidSPDXAnalysisException {
		ExportControlClassification testExportControlClassification = generator.builderForExportControlClassificationTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.EXPORTING_COUNTRY_TEST_VALUE, testExportControlClassification.getExportingCountry());
		String newStringValue = UnitTestHelper.genRandPattern("^[A-Z]{3}$");
		testExportControlClassification.setExportingCountry(newStringValue);
		assertEquals(newStringValue, testExportControlClassification.getExportingCountry());
	}
}
