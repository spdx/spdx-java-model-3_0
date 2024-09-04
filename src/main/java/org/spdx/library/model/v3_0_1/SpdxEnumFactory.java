/**
 * Copyright (c)  Source Auditor Inc.
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
 
package org.spdx.library.model.v3_0_1;
 
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.spdx.library.model.v3_0_1.ai.EnergyUnitType;
import org.spdx.library.model.v3_0_1.ai.SafetyRiskAssessmentType;
import org.spdx.library.model.v3_0_1.core.AnnotationType;
import org.spdx.library.model.v3_0_1.core.ExternalIdentifierType;
import org.spdx.library.model.v3_0_1.core.ExternalRefType;
import org.spdx.library.model.v3_0_1.core.HashAlgorithm;
import org.spdx.library.model.v3_0_1.core.LifecycleScopeType;
import org.spdx.library.model.v3_0_1.core.PresenceType;
import org.spdx.library.model.v3_0_1.core.ProfileIdentifierType;
import org.spdx.library.model.v3_0_1.core.RelationshipCompleteness;
import org.spdx.library.model.v3_0_1.core.RelationshipType;
import org.spdx.library.model.v3_0_1.core.SupportType;
import org.spdx.library.model.v3_0_1.dataset.ConfidentialityLevelType;
import org.spdx.library.model.v3_0_1.dataset.DatasetAvailabilityType;
import org.spdx.library.model.v3_0_1.dataset.DatasetType;
import org.spdx.library.model.v3_0_1.security.CvssSeverityType;
import org.spdx.library.model.v3_0_1.security.ExploitCatalogType;
import org.spdx.library.model.v3_0_1.security.SsvcDecisionType;
import org.spdx.library.model.v3_0_1.security.VexJustificationType;
import org.spdx.library.model.v3_0_1.software.ContentIdentifierType;
import org.spdx.library.model.v3_0_1.software.FileKindType;
import org.spdx.library.model.v3_0_1.software.SbomType;
import org.spdx.library.model.v3_0_1.software.SoftwarePurpose;
 
/**
 * *** DO NOT EDIT ***
 * This class is generated by the Model to Java utility
 *
 * This is a static class used to translate a URI into a Java enum class
 * It is a static class with a single public static field <code>uriToEnum</code> which maps the URI to the enum class
 */
public class SpdxEnumFactory {
 	/**
	 * Map of enum URI's to their Enum values
	 */
	public static Map<String, Enum<?>> uriToEnum;
	
	static {
		Map<String, Enum<?>> map = new HashMap<>();
		
		for (ExternalIdentifierType enumVal:ExternalIdentifierType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (EnergyUnitType enumVal:EnergyUnitType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (VexJustificationType enumVal:VexJustificationType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (DatasetAvailabilityType enumVal:DatasetAvailabilityType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (HashAlgorithm enumVal:HashAlgorithm.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (CvssSeverityType enumVal:CvssSeverityType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (PresenceType enumVal:PresenceType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (ExploitCatalogType enumVal:ExploitCatalogType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (SafetyRiskAssessmentType enumVal:SafetyRiskAssessmentType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (FileKindType enumVal:FileKindType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (ContentIdentifierType enumVal:ContentIdentifierType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (RelationshipCompleteness enumVal:RelationshipCompleteness.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (ExternalRefType enumVal:ExternalRefType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (LifecycleScopeType enumVal:LifecycleScopeType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (SoftwarePurpose enumVal:SoftwarePurpose.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (SbomType enumVal:SbomType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (SsvcDecisionType enumVal:SsvcDecisionType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (RelationshipType enumVal:RelationshipType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (DatasetType enumVal:DatasetType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (ConfidentialityLevelType enumVal:ConfidentialityLevelType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (SupportType enumVal:SupportType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (ProfileIdentifierType enumVal:ProfileIdentifierType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		
		for (AnnotationType enumVal:AnnotationType.values()) {
			map.put(enumVal.getIndividualURI(), enumVal);
		}
		uriToEnum = Collections.unmodifiableMap(map);
	}

	private SpdxEnumFactory() {
		// this is only a static class
	}
}