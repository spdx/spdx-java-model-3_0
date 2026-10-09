/**
 * SPDX-FileCopyrightText: Copyright (c) 2026 Source Auditor Inc.
 * SPDX-FileType: SOURCE
 * SPDX-License-Identifier: Apache-2.0
 */
package org.spdx.library.model.v3.core;

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
import junit.framework.TestCase;
import org.spdx.core.ModelRegistry;
import org.spdx.library.model.v3.MockCopyManager;
import org.spdx.library.model.v3.MockModelStore;
import org.spdx.library.model.v3.SpdxConstantsV3;
import org.spdx.library.model.v3.TestValuesGenerator;
import org.spdx.library.model.v3.UnitTestHelper;
import org.spdx.library.model.v3.core.Agent.AgentBuilder;
import org.spdx.library.model.v3.core.PackageVerificationCode.PackageVerificationCodeBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
 */
public class PackageVerificationCodeTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3.core.PackageVerificationCode#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		PackageVerificationCode testPackageVerificationCode = generator.builderForPackageVerificationCodeTests(TEST_OBJECT_URI).build();
		List<String> result = testPackageVerificationCode.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.PackageVerificationCode#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		PackageVerificationCode testPackageVerificationCode = generator.builderForPackageVerificationCodeTests(TEST_OBJECT_URI).build();
		assertEquals("Core.PackageVerificationCode", testPackageVerificationCode.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3.core.PackageVerificationCode#Element(org.spdx.library.model.v3.core.PackageVerificationCode.PackageVerificationCodeBuilder)}.
	 */
	public void testPackageVerificationCodePackageVerificationCodeBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForPackageVerificationCodeTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		PackageVerificationCode testPackageVerificationCode = generator.builderForPackageVerificationCodeTests(TEST_OBJECT_URI).build();
		PackageVerificationCode test2PackageVerificationCode = generator.builderForPackageVerificationCodeTests("https://testObject2").build();
		assertTrue(testPackageVerificationCode.equivalent(test2PackageVerificationCode));
		assertTrue(test2PackageVerificationCode.equivalent(testPackageVerificationCode));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.PackageVerificationCode#setAlgorithm}.
	 */
	public void testPackageVerificationCodesetAlgorithm() throws InvalidSPDXAnalysisException {
		PackageVerificationCode testPackageVerificationCode = generator.builderForPackageVerificationCodeTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.ALGORITHM_TEST_VALUE1, testPackageVerificationCode.getAlgorithm());
		testPackageVerificationCode.setAlgorithm(TestValuesGenerator.ALGORITHM_TEST_VALUE2);
		assertEquals(TestValuesGenerator.ALGORITHM_TEST_VALUE2, testPackageVerificationCode.getAlgorithm());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.PackageVerificationCode#setHashValue}.
	 */
	public void testPackageVerificationCodesetHashValue() throws InvalidSPDXAnalysisException {
		PackageVerificationCode testPackageVerificationCode = generator.builderForPackageVerificationCodeTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.HASH_VALUE_TEST_VALUE, testPackageVerificationCode.getHashValue());
		String newStringValue = "new hashValue value";
		testPackageVerificationCode.setHashValue(newStringValue);
		assertEquals(newStringValue, testPackageVerificationCode.getHashValue());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.PackageVerificationCode#setComment}.
	 */
	public void testPackageVerificationCodesetComment() throws InvalidSPDXAnalysisException {
		PackageVerificationCode testPackageVerificationCode = generator.builderForPackageVerificationCodeTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testPackageVerificationCode.getComment());
		String newStringValue = "new comment value";
		testPackageVerificationCode.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testPackageVerificationCode.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3.core.PackageVerificationCode#getPackageVerificationCodeExcludedFiles}.
	 */
	public void testPackageVerificationCodegetPackageVerificationCodeExcludedFiles() throws InvalidSPDXAnalysisException {
		PackageVerificationCode testPackageVerificationCode = generator.builderForPackageVerificationCodeTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_LIST1, new ArrayList<>(testPackageVerificationCode.getPackageVerificationCodeExcludedFiles())));
		testPackageVerificationCode.getPackageVerificationCodeExcludedFiles().clear();
		testPackageVerificationCode.getPackageVerificationCodeExcludedFiles().addAll(TestValuesGenerator.PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_LIST2, new ArrayList<>(testPackageVerificationCode.getPackageVerificationCodeExcludedFiles())));
	}
}
