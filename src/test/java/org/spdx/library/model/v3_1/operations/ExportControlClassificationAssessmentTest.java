/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3_1.operations;

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
import org.spdx.library.model.v3_1.core.Artifact;
import org.spdx.library.model.v3_1.core.CreationInfo;
import org.spdx.library.model.v3_1.core.Element;
import org.spdx.library.model.v3_1.core.ExternalIdentifier;
import org.spdx.library.model.v3_1.core.ExternalRef;
import org.spdx.library.model.v3_1.core.IntegrityMethod;
import org.spdx.library.model.v3_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_1.core.SupportType;
import org.spdx.library.model.v3_1.extension.Extension;
import org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment.ExportControlClassificationAssessmentBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class ExportControlClassificationAssessmentTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
		List<String> result = testExportControlClassificationAssessment.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
		assertEquals("Operations.ExportControlClassificationAssessment", testExportControlClassificationAssessment.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#Element(org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment.ExportControlClassificationAssessmentBuilder)}.
	 */
	public void testExportControlClassificationAssessmentExportControlClassificationAssessmentBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
		ExportControlClassificationAssessment test2ExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests("https://testObject2").build();
		assertTrue(testExportControlClassificationAssessment.equivalent(test2ExportControlClassificationAssessment));
		assertTrue(test2ExportControlClassificationAssessment.equivalent(testExportControlClassificationAssessment));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#setAssessedElement}.
	 */
	public void testExportControlClassificationAssessmentsetAssessedElement() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testExportControlClassificationAssessment.getAssessedElement());
//		testExportControlClassificationAssessment.setAssessedElement(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testExportControlClassificationAssessment.getAssessedElement());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#setAssessmentContext}.
	 */
	public void testExportControlClassificationAssessmentsetAssessmentContext() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testExportControlClassificationAssessment.getAssessmentContext());
//		testExportControlClassificationAssessment.setAssessmentContext(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testExportControlClassificationAssessment.getAssessmentContext());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#setAssessor}.
	 */
	public void testExportControlClassificationAssessmentsetAssessor() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testExportControlClassificationAssessment.getAssessor());
//		testExportControlClassificationAssessment.setAssessor(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testExportControlClassificationAssessment.getAssessor());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#setSuppliedBy}.
	 */
	public void testExportControlClassificationAssessmentsetSuppliedBy() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testExportControlClassificationAssessment.getSuppliedBy());
//		testExportControlClassificationAssessment.setSuppliedBy(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testExportControlClassificationAssessment.getSuppliedBy());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#setExtension}.
	 */
	public void testExportControlClassificationAssessmentsetExtension() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
//		assertEquals(Optional.of(TEST_VALUE), testExportControlClassificationAssessment.getExtension());
//		testExportControlClassificationAssessment.setExtension(NEW_TEST_VALUE);
//		assertEquals(Optional.of(NEW_TEST_VALUE), testExportControlClassificationAssessment.getExtension());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#setCreationInfo}.
	 */
	public void testExportControlClassificationAssessmentsetCreationInfo() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
//		assertEquals(TEST_VALUE, testExportControlClassificationAssessment.getCreationInfo());
//		testExportControlClassificationAssessment.setCreationInfo(NEW_TEST_VALUE);
//		assertEquals(NEW_TEST_VALUE, testExportControlClassificationAssessment.getCreationInfo());
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#setIntendedUse}.
	 */
	public void testExportControlClassificationAssessmentsetIntendedUse() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.INTENDED_USE_TEST_VALUE), testExportControlClassificationAssessment.getIntendedUse());
		String newStringValue = "new intendedUse value";
		testExportControlClassificationAssessment.setIntendedUse(newStringValue);
		assertEquals(Optional.of(newStringValue), testExportControlClassificationAssessment.getIntendedUse());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#setDescription}.
	 */
	public void testExportControlClassificationAssessmentsetDescription() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.DESCRIPTION_TEST_VALUE), testExportControlClassificationAssessment.getDescription());
		String newStringValue = "new description value";
		testExportControlClassificationAssessment.setDescription(newStringValue);
		assertEquals(Optional.of(newStringValue), testExportControlClassificationAssessment.getDescription());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#setBuiltTime}.
	 */
	public void testExportControlClassificationAssessmentsetBuiltTime() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.BUILT_TIME_TEST_VALUE), testExportControlClassificationAssessment.getBuiltTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testExportControlClassificationAssessment.setBuiltTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testExportControlClassificationAssessment.getBuiltTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#setAssessmentTimestamp}.
	 */
	public void testExportControlClassificationAssessmentsetAssessmentTimestamp() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.ASSESSMENT_TIMESTAMP_TEST_VALUE), testExportControlClassificationAssessment.getAssessmentTimestamp());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testExportControlClassificationAssessment.setAssessmentTimestamp(newStringValue);
		assertEquals(Optional.of(newStringValue), testExportControlClassificationAssessment.getAssessmentTimestamp());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#setComment}.
	 */
	public void testExportControlClassificationAssessmentsetComment() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testExportControlClassificationAssessment.getComment());
		String newStringValue = "new comment value";
		testExportControlClassificationAssessment.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testExportControlClassificationAssessment.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#setValidUntilTime}.
	 */
	public void testExportControlClassificationAssessmentsetValidUntilTime() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.VALID_UNTIL_TIME_TEST_VALUE), testExportControlClassificationAssessment.getValidUntilTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testExportControlClassificationAssessment.setValidUntilTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testExportControlClassificationAssessment.getValidUntilTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#setReleaseTime}.
	 */
	public void testExportControlClassificationAssessmentsetReleaseTime() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.RELEASE_TIME_TEST_VALUE), testExportControlClassificationAssessment.getReleaseTime());
		String newStringValue = UnitTestHelper.genRandPattern("^\\d\\d\\d\\d-\\d\\d-\\d\\dT\\d\\d:\\d\\d:\\d\\dZ$");
		testExportControlClassificationAssessment.setReleaseTime(newStringValue);
		assertEquals(Optional.of(newStringValue), testExportControlClassificationAssessment.getReleaseTime());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#setName}.
	 */
	public void testExportControlClassificationAssessmentsetName() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.NAME_TEST_VALUE), testExportControlClassificationAssessment.getName());
		String newStringValue = "new name value";
		testExportControlClassificationAssessment.setName(newStringValue);
		assertEquals(Optional.of(newStringValue), testExportControlClassificationAssessment.getName());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#setSummary}.
	 */
	public void testExportControlClassificationAssessmentsetSummary() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.SUMMARY_TEST_VALUE), testExportControlClassificationAssessment.getSummary());
		String newStringValue = "new summary value";
		testExportControlClassificationAssessment.setSummary(newStringValue);
		assertEquals(Optional.of(newStringValue), testExportControlClassificationAssessment.getSummary());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#getAssessmentResult}.
	 */
	public void testExportControlClassificationAssessmentgetAssessmentResults() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testExportControlClassificationAssessment.getAssessmentResults())));
//		testExportControlClassificationAssessment.getAssessmentResults().clear();
//		testExportControlClassificationAssessment.getAssessmentResults().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testExportControlClassificationAssessment.getAssessmentResults())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#getVerifiedUsing}.
	 */
	public void testExportControlClassificationAssessmentgetVerifiedUsings() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testExportControlClassificationAssessment.getVerifiedUsings())));
//		testExportControlClassificationAssessment.getVerifiedUsings().clear();
//		testExportControlClassificationAssessment.getVerifiedUsings().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testExportControlClassificationAssessment.getVerifiedUsings())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#getExternalRef}.
	 */
	public void testExportControlClassificationAssessmentgetExternalRefs() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testExportControlClassificationAssessment.getExternalRefs())));
//		testExportControlClassificationAssessment.getExternalRefs().clear();
//		testExportControlClassificationAssessment.getExternalRefs().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testExportControlClassificationAssessment.getExternalRefs())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#getOriginatedBy}.
	 */
	public void testExportControlClassificationAssessmentgetOriginatedBys() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testExportControlClassificationAssessment.getOriginatedBys())));
//		testExportControlClassificationAssessment.getOriginatedBys().clear();
//		testExportControlClassificationAssessment.getOriginatedBys().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testExportControlClassificationAssessment.getOriginatedBys())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#getExternalIdentifier}.
	 */
	public void testExportControlClassificationAssessmentgetExternalIdentifiers() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testExportControlClassificationAssessment.getExternalIdentifiers())));
//		testExportControlClassificationAssessment.getExternalIdentifiers().clear();
//		testExportControlClassificationAssessment.getExternalIdentifiers().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testExportControlClassificationAssessment.getExternalIdentifiers())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#getStandardNames}.
	 */
	public void testExportControlClassificationAssessmentgetStandardNames() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST1, new ArrayList<>(testExportControlClassificationAssessment.getStandardNames())));
		testExportControlClassificationAssessment.getStandardNames().clear();
		testExportControlClassificationAssessment.getStandardNames().addAll(TestValuesGenerator.STANDARD_NAME_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.STANDARD_NAME_TEST_LIST2, new ArrayList<>(testExportControlClassificationAssessment.getStandardNames())));
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_1.operations.ExportControlClassificationAssessment#getSupportLevel}.
	 */
	public void testExportControlClassificationAssessmentgetSupportLevels() throws InvalidSPDXAnalysisException {
		ExportControlClassificationAssessment testExportControlClassificationAssessment = generator.builderForExportControlClassificationAssessmentTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST1, new ArrayList<>(testExportControlClassificationAssessment.getSupportLevels())));
		testExportControlClassificationAssessment.getSupportLevels().clear();
		testExportControlClassificationAssessment.getSupportLevels().addAll(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.SUPPORT_LEVEL_TEST_LIST2, new ArrayList<>(testExportControlClassificationAssessment.getSupportLevels())));
	}
}
