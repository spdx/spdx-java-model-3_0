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
 
package org.spdx.library.model.v3_0_1.software;

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
import org.spdx.library.model.v3_0_1.core.IntegrityMethod;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0_1.software.ContentIdentifier.ContentIdentifierBuilder;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class ContentIdentifierTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.ContentIdentifier#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		ContentIdentifier testContentIdentifier = generator.builderForContentIdentifierTests(TEST_OBJECT_URI).build();
		List<String> result = testContentIdentifier.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.ContentIdentifier#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		ContentIdentifier testContentIdentifier = generator.builderForContentIdentifierTests(TEST_OBJECT_URI).build();
		assertEquals("Software.ContentIdentifier", testContentIdentifier.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.ContentIdentifier#Element(org.spdx.library.model.v3_0_1.software.ContentIdentifier.ContentIdentifierBuilder)}.
	 */
	public void testContentIdentifierContentIdentifierBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForContentIdentifierTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		ContentIdentifier testContentIdentifier = generator.builderForContentIdentifierTests(TEST_OBJECT_URI).build();
		ContentIdentifier test2ContentIdentifier = generator.builderForContentIdentifierTests("https://testObject2").build();
		assertTrue(testContentIdentifier.equivalent(test2ContentIdentifier));
		assertTrue(test2ContentIdentifier.equivalent(testContentIdentifier));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.ContentIdentifier#setContentIdentifierType}.
	 */
	public void testContentIdentifiersetContentIdentifierType() throws InvalidSPDXAnalysisException {
		ContentIdentifier testContentIdentifier = generator.builderForContentIdentifierTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.CONTENT_IDENTIFIER_TYPE_TEST_VALUE1, testContentIdentifier.getContentIdentifierType());
		testContentIdentifier.setContentIdentifierType(TestValuesGenerator.CONTENT_IDENTIFIER_TYPE_TEST_VALUE2);
		assertEquals(TestValuesGenerator.CONTENT_IDENTIFIER_TYPE_TEST_VALUE2, testContentIdentifier.getContentIdentifierType());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.ContentIdentifier#setComment}.
	 */
	public void testContentIdentifiersetComment() throws InvalidSPDXAnalysisException {
		ContentIdentifier testContentIdentifier = generator.builderForContentIdentifierTests(TEST_OBJECT_URI).build();
		assertEquals(Optional.of(TestValuesGenerator.COMMENT_TEST_VALUE), testContentIdentifier.getComment());
		String newStringValue = "new comment value";
		testContentIdentifier.setComment(newStringValue);
		assertEquals(Optional.of(newStringValue), testContentIdentifier.getComment());
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.software.ContentIdentifier#setContentIdentifierValue}.
	 */
	public void testContentIdentifiersetContentIdentifierValue() throws InvalidSPDXAnalysisException {
		ContentIdentifier testContentIdentifier = generator.builderForContentIdentifierTests(TEST_OBJECT_URI).build();
		assertEquals(TestValuesGenerator.CONTENT_IDENTIFIER_VALUE_TEST_VALUE, testContentIdentifier.getContentIdentifierValue());
		String newStringValue = "new contentIdentifierValue value";
		testContentIdentifier.setContentIdentifierValue(newStringValue);
		assertEquals(newStringValue, testContentIdentifier.getContentIdentifierValue());
	}
}