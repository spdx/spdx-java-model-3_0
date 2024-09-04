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
 
package org.spdx.library.model.v3_0_1.ai;

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
import org.spdx.library.model.v3_0_1.ai.EnergyConsumption.EnergyConsumptionBuilder;
import org.spdx.library.model.v3_0_1.core.Agent.AgentBuilder;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;

/**
 * GENERATED FILE - DO NOT MODIFY
**/

public class EnergyConsumptionTest extends TestCase {

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
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.EnergyConsumption#verify()}.
	 * @throws InvalidSPDXAnalysisException on errors
	 */
	public void testVerify() throws InvalidSPDXAnalysisException {
		EnergyConsumption testEnergyConsumption = generator.builderForEnergyConsumptionTests(TEST_OBJECT_URI).build();
		List<String> result = testEnergyConsumption.verify();
		assertTrue(result.isEmpty());
		// TODO - add negative tests
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.EnergyConsumption#getType()}.
	 */
	public void testGetType() throws InvalidSPDXAnalysisException {
		EnergyConsumption testEnergyConsumption = generator.builderForEnergyConsumptionTests(TEST_OBJECT_URI).build();
		assertEquals("AI.EnergyConsumption", testEnergyConsumption.getType());
	}

	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.EnergyConsumption#Element(org.spdx.library.model.v3_0_1.ai.EnergyConsumption.EnergyConsumptionBuilder)}.
	 */
	public void testEnergyConsumptionEnergyConsumptionBuilder() throws InvalidSPDXAnalysisException {
		generator.builderForEnergyConsumptionTests(TEST_OBJECT_URI).build();
	}
	
	public void testEquivalent() throws InvalidSPDXAnalysisException {
		EnergyConsumption testEnergyConsumption = generator.builderForEnergyConsumptionTests(TEST_OBJECT_URI).build();
		EnergyConsumption test2EnergyConsumption = generator.builderForEnergyConsumptionTests("https://testObject2").build();
		assertTrue(testEnergyConsumption.equivalent(test2EnergyConsumption));
		assertTrue(test2EnergyConsumption.equivalent(testEnergyConsumption));
		// TODO change some parameters for negative tests
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.EnergyConsumption#getTrainingEnergyConsumption}.
	 */
	public void testEnergyConsumptiongetTrainingEnergyConsumptions() throws InvalidSPDXAnalysisException {
		EnergyConsumption testEnergyConsumption = generator.builderForEnergyConsumptionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testEnergyConsumption.getTrainingEnergyConsumptions())));
//		testEnergyConsumption.getTrainingEnergyConsumptions().clear();
//		testEnergyConsumption.getTrainingEnergyConsumptions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testEnergyConsumption.getTrainingEnergyConsumptions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.EnergyConsumption#getFinetuningEnergyConsumption}.
	 */
	public void testEnergyConsumptiongetFinetuningEnergyConsumptions() throws InvalidSPDXAnalysisException {
		EnergyConsumption testEnergyConsumption = generator.builderForEnergyConsumptionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testEnergyConsumption.getFinetuningEnergyConsumptions())));
//		testEnergyConsumption.getFinetuningEnergyConsumptions().clear();
//		testEnergyConsumption.getFinetuningEnergyConsumptions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testEnergyConsumption.getFinetuningEnergyConsumptions())));
		//TODO: Implement
	}
	
	/**
	 * Test method for {@link org.spdx.library.model.v3_0_1.ai.EnergyConsumption#getInferenceEnergyConsumption}.
	 */
	public void testEnergyConsumptiongetInferenceEnergyConsumptions() throws InvalidSPDXAnalysisException {
		EnergyConsumption testEnergyConsumption = generator.builderForEnergyConsumptionTests(TEST_OBJECT_URI).build();
//		assertTrue(UnitTestHelper.isListsEquivalent(TEST_VALUE, new ArrayList<>(testEnergyConsumption.getInferenceEnergyConsumptions())));
//		testEnergyConsumption.getInferenceEnergyConsumptions().clear();
//		testEnergyConsumption.getInferenceEnergyConsumptions().addAll(NEW_TEST_VALUE);
//		assertTrue(UnitTestHelper.isListsEquivalent(NEW_TEST_VALUE, new ArrayList<>(testEnergyConsumption.getInferenceEnergyConsumptions())));
		//TODO: Implement
	}
}