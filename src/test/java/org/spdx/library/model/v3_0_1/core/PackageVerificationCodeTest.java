/**
 * Copyright (c) 2024 Source Auditor Inc.
 *
 * SPDX-License-Identifier: Apache-2.0
 * 
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 */
 
package org.spdx.library.model.v3_0_1.core;

import javax.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.spdx.core.CoreModelObject;
import org.spdx.core.DefaultModelStore;
import org.spdx.core.InvalidSPDXAnalysisException;
import org.spdx.core.IModelCopyManager;
import org.spdx.core.IndividualUriValue;
import org.spdx.library.model.v3_0_1.ModelObjectV3;
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
import org.spdx.library.model.v3_0_1.MockCopyManager;
import org.spdx.library.model.v3_0_1.MockModelStore;
import org.spdx.library.model.v3_0_1.SpdxConstantsV3;
import org.spdx.library.model.v3_0_1.SpdxModelInfoV3_0;
import org.spdx.library.model.v3_0_1.TestValuesGenerator;
import org.spdx.library.model.v3_0_1.UnitTestHelper;
import org.spdx.library.model.v3_0_1.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_0_1.core.PackageVerificationCode.PackageVerificationCodeBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.PackageVerificationCode#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		PackageVerificationCode testPackageVerificationCode = generator.builderForPackageVerificationCodeTests(TEST_OBJECT_URI).build();
		List<String> result = testPackageVerificationCode.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.PackageVerificationCode#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		PackageVerificationCode testPackageVerificationCode = generator.builderForPackageVerificationCodeTests(TEST_OBJECT_URI).build();
		assertEquals("Core.PackageVerificationCode", testPackageVerificationCode.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.PackageVerificationCode#Element(org.spdx.library.model.v3_0_1.core.PackageVerificationCode.PackageVerificationCodeBuilder)}.
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
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.PackageVerificationCode#setAlgorithm}.
	 */
	public void testPackageVerificationCodesetAlgorithm() throws InvalidSPDXAnalysisException {
		PackageVerificationCode testPackageVerificationCode = generator.builderForPackageVerificationCodeTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.ALGORITHM_TEST_VALUE1, testPackageVerificationCode.getAlgorithm());
		testPackageVerificationCode.setAlgorithm(TestValuesGenerator.ALGORITHM_TEST_VALUE2);
		assertEquals(TestValuesGenerator.ALGORITHM_TEST_VALUE2, testPackageVerificationCode.getAlgorithm());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.PackageVerificationCode#setHashValue}.
	 */
	public void testPackageVerificationCodesetHashValue() throws InvalidSPDXAnalysisException {
		PackageVerificationCode testPackageVerificationCode = generator.builderForPackageVerificationCodeTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.HASH_VALUE_TEST_VALUE, testPackageVerificationCode.getHashValue());
		String newStringValue = "new hashValue value";
		testPackageVerificationCode.setHashValue(newStringValue);
		assertEquals(newStringValue, testPackageVerificationCode.getHashValue());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.PackageVerificationCode#setComment}.
	 */
	public void testPackageVerificationCodesetComment() throws InvalidSPDXAnalysisException {
		PackageVerificationCode testPackageVerificationCode = generator.builderForPackageVerificationCodeTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testPackageVerificationCode.getComment());
		String newStringValue = "new comment value";
		testPackageVerificationCode.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testPackageVerificationCode.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.core.PackageVerificationCode#getPackageVerificationCodeExcludedFiles}.
	 */
	public void testPackageVerificationCodegetPackageVerificationCodeExcludedFiles() throws InvalidSPDXAnalysisException {
		PackageVerificationCode testPackageVerificationCode = generator.builderForPackageVerificationCodeTests(TEST_OBJECT_URI).build();
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_LIST1, new ArrayList<>(testPackageVerificationCode.getPackageVerificationCodeExcludedFiles())));
		testPackageVerificationCode.getPackageVerificationCodeExcludedFiles().clear();
		testPackageVerificationCode.getPackageVerificationCodeExcludedFiles().addAll(TestValuesGenerator.PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_LIST2);
		assertTrue(UnitTestHelper.isListsEqual(TestValuesGenerator.PACKAGE_VERIFICATION_CODE_EXCLUDED_FILE_TEST_LIST2, new ArrayList<>(testPackageVerificationCode.getPackageVerificationCodeExcludedFiles())));
	}
}